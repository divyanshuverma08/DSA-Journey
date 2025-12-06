package concepts.basics.switchcase;

public class Main {
    public static void main(String[] args) {
        int num = 2;


        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }

        switch (num) {
            case 1 -> System.out.println("Games");
            case 2 -> {
                System.out.println("Study");
                switch (num) {
                    case 1 -> System.out.println("Party");
                    default -> System.out.println("dfasdf");
                }
            }   
            default -> System.out.println("Enter correct input");
        }
    }
}
