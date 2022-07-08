
import java.security.DrbgParameters.NextBytes;
import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate:");
        float interestRate =(scanner.nextFloat()/100)/MONTHS_IN_YEAR;
        System.out.print("Period(years:)");
        int period = (int) scanner.nextInt() * MONTHS_IN_YEAR;
        
        double mortgage = (double) principal * ( interestRate * Math.pow((1 + interestRate), period)) / ((Math.pow((1 + interestRate), period)) - 1);
        
        System.out.println("Mortgage:" + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
