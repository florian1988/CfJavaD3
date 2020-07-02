import java.util.Scanner;

public class AdvancedA7 {

    public static void A7(){

        int FNumber;
        int SNumber;
        int TNumber;

        Scanner ScannerNumber = new Scanner(System.in);

        System.out.println("Enter the first Number:");
        FNumber = ScannerNumber.nextInt();
        System.out.println("Enter the secont Number:");
        SNumber = ScannerNumber.nextInt();
        System.out.println("Enter the third Number:");
        TNumber = ScannerNumber.nextInt();


        if(FNumber > SNumber){
            if (FNumber > TNumber){
               System.out.println(FNumber + " is the max");
            } else {
                //System.out.print(TNumber + "is the max");
            }

        }else{


        }

    }


    public static void main(String[] args) {
        A7();
    }
}
