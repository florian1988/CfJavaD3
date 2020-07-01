// import a package that allows me to take a value from the terminal
import java.util.Scanner;


public class BasicA1 {

    //declare the method A1
    static void A1() {

        /*
        this int is for the correct input value from the terminal
         */
        int MyNumber;

        /*
          The Scanner takes the value from the terminal
         */
        Scanner ScannerNumber = new Scanner(System.in);

        // request to give a number
        System.out.print("Enter a Number: ");

        /*
         nextInt() check's if the input is an Int,
         if not a fail message will appear
         */
        MyNumber = ScannerNumber.nextInt();

        /*
        if statement to giv the correct output according to the input value
         */
        if (MyNumber < 0 ){
            System.out.print("Number is Negativ");
        } else {
            System.out.print("Number is Positiv");
        }
    }

    //main method
    public static void main(String[] args) {
        A1();
    }
}
