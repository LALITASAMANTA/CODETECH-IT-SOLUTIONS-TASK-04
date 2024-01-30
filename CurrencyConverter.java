import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        //currency selection
        
        System.out.println("Enter the base currency code in : (BHD)" );
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Enter the target currency code in : (KWD)" );
        String targetCurrency = scanner.nextLine().toUpperCase();


        //currency rates
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == -1) {
            System.out.println("unable to the Currency of fetch exchange rates. Exits.");
        }
            //amount i/p
            System.out.println("Enter the amount in " + baseCurrency+  " :" );
            double amountToconvert = scanner.nextDouble();

            double convertedAmount = amountToconvert * exchangeRate;

            System.out.println("Converted Amount :" +convertedAmount + " " + targetCurrency);
            scanner.close();

        }

        //to fetch real-time exchange rates
        private static double getExchangeRate(String baseCurrency, String targetCurrency) {
            if(baseCurrency.equals("BHD") && targetCurrency.equals("KWD")) {
                return 220.23 ;  //1 BHD to KWD rates
            }
            else if(baseCurrency.equals("BHD") && targetCurrency.equals("USD")) {
                return 2.65;  //1 BHD  to USD rates
            } else {
                return -1;
            }
        }

    }
