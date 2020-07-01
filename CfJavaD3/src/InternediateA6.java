import java.util.Scanner;

public class InternediateA6 {


    public static void A6() {

        int InputNumber;

        Scanner ScannerNumber = new Scanner(System.in);

        System.out.println("Enter a number: ");

        InputNumber = ScannerNumber.nextInt();

        //calculation for fizz and buzz
        int Outcome1 = InputNumber % 3;
        int Outcome2 = InputNumber % 5;


        /*
        if statement with a nested if statement for determinate
        fizz buzz or  FizzBuzz
         */
        if (Outcome1 == 0){

            if( Outcome2 == 0){
                System.out.println("FizzBuzz!!!");
            } else {
                System.out.println("FIZZ");
            }

        }else if (Outcome2 == 0) {

                System.out.println("BUZZ");

        } else {
            System.out.println(InputNumber);
        }

    }

    public static void main(String[] args) {
        A6();
    }

}
