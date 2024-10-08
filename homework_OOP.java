import java.util.Scanner;

public class homework_OOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter num a and num b;");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("pls choose  +;-;*;/");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        switch (s) {
            case "+":
                plus(a, b);
                break;
            case "-":
                tru(a,b);
                break;
                case "*":
                    nhan(a,b);
                    break;
                    case "/":
                        chia(a,b);
                        break;
                 default:
                     System.out.println("invalid input");
                     break;
        }


    }

    public static void plus(int a, int b) {
        int defaul = a + b;
        System.out.println(defaul);

    }

    public static void tru(int a, int b) {
        int defaul = a - b;
        System.out.println(defaul);


    }

    public static void nhan(int a, int b) {
        int defaul = a * b;
        System.out.println(defaul);
    }

    public static void chia(int a, int b) {
        int defaul = a / b;
        System.out.println(defaul);

    }
}

