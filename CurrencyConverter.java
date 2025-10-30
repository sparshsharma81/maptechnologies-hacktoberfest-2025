import java.util.Scanner;
import java.util.HashMap;

public class CurrencyConverter {
    private static final HashMap<String, Double> exchangeRates = new HashMap<>();

    static {
        // Sample exchange rates (1 USD to others)
        exchangeRates.put("INR", 83.25);
        exchangeRates.put("EUR", 0.94);
        exchangeRates.put("GBP", 0.82);
        exchangeRates.put("JPY", 151.12);
        exchangeRates.put("USD", 1.0); // Base
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🌍 Welcome to the Currency Converter!");
        System.out.print("Enter amount in USD: ");
        double amount = scanner.nextDouble();

        System.out.print("Convert to (INR, EUR, GBP, JPY): ");
        String targetCurrency = scanner.next().toUpperCase();

        if (exchangeRates.containsKey(targetCurrency)) {
            double converted = amount * exchangeRates.get(targetCurrency);
            System.out.printf("%.2f USD = %.2f %s%n", amount, converted, targetCurrency);
        } else {
            System.out.println("❌ Unsupported currency.");
        }

        scanner.close();
    }
}
