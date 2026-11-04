package class2b;

class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        setCelsius(celsius);
    }

    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Error: Temperature below absolute zero (-273.15 C) is invalid.");
        }
    }

    public double getCelsius() {
        return this.celsius;
    }

    public double getFahrenheit() {
        return (this.celsius * 9 / 5) + 32;
    }
}

public class PracticeB_Task3 {
    public static void main(String[] args) {
        Temperature temp = new Temperature(25.0);

        System.out.println("Celsius: " + temp.getCelsius() + " C");
        System.out.println("Fahrenheit: " + temp.getFahrenheit() + " F");

        // Test invalid value below absolute zero
        temp.setCelsius(-300.0);
    }
}