import java.util.Random;


public class BasicA3 {

     int answer = 5;

    public static void A3(){

        Random d = new Random();
        int answer = d.nextInt(7) +1;
        System.out.println("Random number: " + answer);

        if( answer == 1 ){
            System.out.println("Today is Monday");
        }else if( answer == 2 ){
            System.out.println("Today is Tuesday");
        }else if( answer == 3 ){
            System.out.println("Today is Wednesday");
        }else if( answer == 4 ){
            System.out.println("Today is Thursday");
        }else if( answer == 5 ){
            System.out.println("Today is Friday");
        }else if( answer == 6 ){
            System.out.println("Today is Saturday");
        }else {
            System.out.println("Today is Sunday");
        }
    }

    public static void A3b(){

        Random d = new Random();
        int answer = d.nextInt(7) +1;
        System.out.println("Random number: " + answer);

        switch (answer) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Not Possible");

        }

    }




    public static void main(String[] args) {
        System.out.println("if statement:");
        A3();
        System.out.println(" ");
        System.out.println("switch statement:");
        A3b();
    }
}
