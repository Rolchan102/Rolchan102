import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.*;

public class CustomerStorage {
    private static Logger logger;
    private static final Marker ERROR_MARKER = MarkerManager.getMarker("Error");

    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        logger = LogManager.getRootLogger();

        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");

        if (components.length != 4) {
            logger.error(ERROR_MARKER, "Не корректный ввод данных!");
            throw new IllegalArgumentException("Не корректный ввод данных. " +
                    "\nКорректный ввод: \nadd Василий Петров vasily.petrov@gmail.com +79215637722");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        String email = components[INDEX_EMAIL];
        if (!emailIsCorrect(email)) {
            logger.error(ERROR_MARKER, "Не корректный ввод E-mail!");
            throw new RuntimeException("Не корректный ввод E-mail");
        }
        storage.put(name, new Customer(name, phoneNumberFormat(components[INDEX_PHONE]), email));
    }

        private String phoneNumberFormat(String phone) {
            String format = "[^0-9]+";
            String checkNumber = phone.replaceAll(format, "");
            if (checkNumber.charAt(0) == '8') {
                checkNumber = "7" + checkNumber.substring(1);
            }
            if (checkNumber.length() == 11 && checkNumber.charAt(0) == '7') {
                return "+".concat(checkNumber);
            } else if (checkNumber.length() == 10) {
                return "+7".concat(checkNumber);
            } else {
                logger.error(ERROR_MARKER, "Неврный формат номера телефона!");
                throw new RuntimeException("Неврный формат номера телефона");
            }
        }

        private boolean emailIsCorrect(String email) {
            Pattern pattern = Pattern.compile("[\\w|\\d]+@.+\\.\\w{2,}");
            Matcher matcher = pattern.matcher(email);
            if (!matcher.matches()) {
                return false;
            }
            return true;
        }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}