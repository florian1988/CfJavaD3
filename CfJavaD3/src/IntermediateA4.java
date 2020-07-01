// import a package that allows me to take a value from the terminal
import java.util.Scanner;


public class IntermediateA4 {

    //the method A4
    public static void A4(){

        /*
          The Scanner takes the value from the terminal
         */
        Scanner ScannerNumber = new Scanner(System.in);

        /*
        in this area the program is questioning for the two values
         */
        System.out.print("write the first number: ");
        int FNumber = ScannerNumber.nextInt();
        System.out.print("write the second number: ");
        int SNumber = ScannerNumber.nextInt();

        /*
        this part decides witch value is the bigger one
         */
        if ( FNumber > SNumber) {
            System.out.print(" The max Number is the fist Number: " + FNumber);
        } else if(FNumber == SNumber){
            System.out.print("The Numbers are equal!");
        } else {
           System.out.print("The max Number is the second Number: " + SNumber);
        }
    }

    public static void main(String[] args) {
        A4();
    }
}
