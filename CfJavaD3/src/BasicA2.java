import java.util.Scanner;

public class BasicA2 {

    static void A2() {

        /*
        this int is for the correct input value from the terminal
         */
        double MyNumber;

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
        MyNumber = ScannerNumber.nextDouble();

        /*
        if statement to decide witch answer is the right one
        with a nested if statement for the large and small argument
         */
        if (MyNumber == 0 ){
            System.out.print(MyNumber + "Zero!");

        } else if ( MyNumber > 0){

            if ( MyNumber > 1000000){
                System.out.print(MyNumber + "is a large positive number");
            } else if (MyNumber <= 1){
                System.out.print(MyNumber + "is a small positiv number");
            } else {
                System.out.print(MyNumber + "is a positiv number");
            }

        } else {
            System.out.print(MyNumber + " is a negative Number");
        }
    }

    // main method
    public static void main(String[] args) {
        A2();
    }
}
