package M05_03;

public class CelsToFar implements ConverterTemperature{

    @Override
    public double convert(double celsius) {
        return celsius * 1.8 + 32;
    }
}
