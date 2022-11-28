import java.util.Scanner;

public class Activity {
    public static void main(String[] args) throws Exception {

        char operator;
        int result;
        int num1, num2;

        System.out.println("Basic Calculator");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        num2 = scan.nextInt();



        System.out.println("Choose an operator " + "(+ , - , / , *)");
      
        System.out.print("Enter operator: ");
        operator = scan.next().charAt(0);


        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result);
                break;
            default:
                System.out.println("INVALID OPERATOR");
                break;
        }
                scan.close();
    }
}
