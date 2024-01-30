# CODETECH-IT-SOLUTIONS-TASK-04
Imports the Scanner class from the java.util package to take input from the user.Creates a Scanner object to read input from the user.
Prompts the user to enter the base and target currency codes, converting them to uppercase for case-insensitive comparison.
Calls the getExchangeRate method to fetch the exchange rate for the specified currencies. If the rate is -1, it indicates that the currency pair is not supported.
If exchange rates are successfully fetched, prompts the user to enter the amount in the base currency, converts it to the target currency using the exchange rate, and displays the result.
Closes the Scanner to release resources.
A private method that takes the base and target currency codes and returns the corresponding exchange rate. it supports BHD to KWD and BHD to USD pairs, returning -1 for unsupported pairs.
