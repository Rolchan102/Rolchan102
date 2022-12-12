import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        LocalDateTime dateNow = LocalDateTime.now();
        List<Terminal> terminals = Airport.getInstance().getTerminals();
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream())
                .filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE))
                .filter(flight -> flight.getDate().toInstant().isBefore(Instant.now().plusSeconds(7200)))
                .filter(flight -> flight.getDate().toInstant().isAfter(Instant.now())).collect(Collectors.toList());
    }
}