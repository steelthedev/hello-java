import java.util.Scanner;

public class Controlflow {
    public static void main(String[] args){
        System.out.print("Number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        if (number % 5 == 0)
            System.out.println("Fizz");
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if(number % 5 != 0 && number % 3 != 0)
            System.out.println(number);
    }
}
