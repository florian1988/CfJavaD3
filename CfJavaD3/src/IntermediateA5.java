import java.util.Scanner;

public class IntermediateA5 {


    public static void A5(){

        // variable for the input value
        int Number;

        //Scanner generator
        Scanner ScannerNumber = new Scanner(System.in);

        System.out.println("Enter a Number:");

        //this line takes the value from the terminal
        Number = ScannerNumber.nextInt();

        /*
        thanks to modulo (%) witch i searched a lot
        i finally get the reminder of the Number value
         */
        int remainder = Number % 2;

        // this area defines an even or odd number
        if ( remainder == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");

    }

    public static void main(String[] args) {
        A5();
    }
}
