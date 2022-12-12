package practice.hospital;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        float[] patientsTemperature = new float[patientsCount];

        for (int i = 0; i < patientsCount; i++) {
            patientsTemperature[i] = Math.round(((float) (Math.random() * 8) +
                    32) * 100) / (float) 100.0;
            System.out.println(patientsTemperature[i]);
        }

        return patientsTemperature;
    }

    public static String getReport ( float[] temperatureData) {

        int count = 0;
        int healthy = 1;
        StringBuilder patients = new StringBuilder();
        float temp = 0;
        double middleTemperature;
        for (int i = 0; i < temperatureData.length; i++) {
            patients.append(temperatureData[i]).append(" ");
            temp += temperatureData[i];
            if (temperatureData[i] >= 36.2 && temperatureData[i] <= 36.9) {
                healthy++;
            }
            count++;
        }
        double d = temp /count;
        middleTemperature = Math.rint(100.0 * d) / 100.0;

        String patientsTemperatures;

        String report =
                "Температуры пациентов: " + patients.toString().trim() +
                        "\nСредняя температура: " + middleTemperature +
                        "\nКоличество здоровых: " + healthy;

        return report;

    }
}
/*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */
