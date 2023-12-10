import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String username = "Myminimarket";
        String password = "estucantik";
        int captcha = random.nextInt(999999);

        boolean loggedIn = false;

        while (!loggedIn) {
            try {
                System.out.println("CAPTCHA: " + captcha);

                System.out.print("Enter Username              : ");
                String inputUsername = scanner.nextLine();

                System.out.print("Enter Password              : ");
                String inputPassword = scanner.nextLine();

                System.out.print("Enter Captcha               : ");
                int inputCaptcha = scanner.nextInt();
                scanner.nextLine();

                if (username.equalsIgnoreCase(inputUsername) && password.equals(inputPassword)
                        && captcha == inputCaptcha) {
                    System.out.println("Login Successful!");
                    loggedIn = true;
                } else {
                    System.out.println("Invalid username, password, or captcha. Login failed.");
                    captcha = random.nextInt(999999);
                }
            } catch (Exception e) {
                System.out.println("Something is wrong    : " + e.getMessage());
            }
        }

        try {

            System.out.print("Enter the Invoice Number : ");
            String invoiceNumber = scanner.nextLine();

            System.out.print("Enter the Product Code   : ");
            String productCode = scanner.nextLine();

            System.out.print("Enter the Customer Name  : ");
            String customerName = scanner.nextLine();

            System.out.print("Enter the Address        : ");
            String customerAddress = scanner.nextLine();

            System.out.print("Enter the Number Phone   : ");
            String numberPhone = scanner.nextLine();

            System.out.print("Enter the Product Name   : ");
            String productName = scanner.nextLine();

            System.out.print("Enter the Product Price  : ");
            double productPrice = scanner.nextDouble();

            System.out.print("Enter the Quantity       : ");
            int quantity = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter the Cashier's Name : ");
            String cashierName = scanner.nextLine();

            Pembelian purchase = new Pembelian(invoiceNumber, productCode, customerName, customerAddress, numberPhone,
                    productName,
                    productPrice, quantity, cashierName);

            purchase.displayInfo();
        } catch (Exception e) {
            System.out.println("Something is wrong: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}