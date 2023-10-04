package M05_03;

public class CelsToKel implements ConverterTemperature{

    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}
