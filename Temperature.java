import java.util.Scanner;
public class Temperature {
        public static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
        public static double celsiusToKelvin(double celsius) {
            return celsius + 273.15;
        }
        public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
        public static double fahrenheitToKelvin(double fahrenheit) {
            return fahrenheitToCelsius(fahrenheit) + 273.15;
        }
        public static double kelvinToCelsius(double kelvin) {
            return kelvin - 273.15;
        }
        public static double kelvinToFahrenheit(double kelvin) {
            return celsiusToFahrenheit(kelvinToCelsius(kelvin));
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the temperature: ");
            double temperature = scanner.nextDouble();
            System.out.println("Enter the scale of the given temperature (C for Celsius, F for Fahrenheit, K for Kelvin): ");
            char scale = scanner.next().toUpperCase().charAt(0);
            System.out.println("Converted Temperatures:");
            switch (scale) {
                case 'C': // From Celsius
                    System.out.printf("Fahrenheit: %.2f°F\n", celsiusToFahrenheit(temperature));
                    System.out.printf("Kelvin: %.2fK\n", celsiusToKelvin(temperature));
                    break;
                case 'F': // From Fahrenheit
                    System.out.printf("Celsius: %.2f°C\n", fahrenheitToCelsius(temperature));
                    System.out.printf("Kelvin: %.2fK\n", fahrenheitToKelvin(temperature));
                    break;
                case 'K': // From Kelvin
                    System.out.printf("Celsius: %.2f°C\n", kelvinToCelsius(temperature));
                    System.out.printf("Fahrenheit: %.2f°F\n", kelvinToFahrenheit(temperature));
                    break;
                default:
                    System.out.println("Invalid scale entered. Please enter C, F, or K.");
                    break;
            }
            scanner.close();
        }
    }

