import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //java banking program
        //first I need to declare variables then display menu (balance etc), get and process users choice, show balalce,do deposie, withdraw and exit message
        //our account has balance
        double balance = 0;
        boolean isRunning = true;
        int choice;  //chooses showbalace,deposit.withdraw or exit

        while (isRunning) {
            System.out.println("*********");
            System.out.println("Banking Program");
            System.out.println("*********");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("*********");


            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> {
                    balance = balance - withdraw(balance);
                    System.out.print("Balance left: ");
                    showBalance(balance);
                }
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");


            }
        }
//show balance

        System.out.println("******");
        System.out.println("Thank you");
        System.out.println("******");

        scanner.close();
    }

    static void showBalance(double balance){
        System.out.printf("฿%.2f\n", balance);//f = floating point number
    }
    static double deposit(){

        double amount;

        System.out.print("Enter an amount:");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }






    }
    static double withdraw(double balance){

        double amount;
        System.out.print("Enter an amount:");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }


}

