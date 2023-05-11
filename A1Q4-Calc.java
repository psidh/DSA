import java.util.Scanner;

public class a1q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        double p = in.nextDouble();
        System.out.println("Enter the second number");
        double t = in.nextDouble();
        System.out.println("Enter the operator");
        String op = in.next();

        if (op.equals("+")) {
            System.out.println(p+t);
        } else if (op.equals("-")) {
            System.out.println(p-t);
        } else if  (op.equals("*")) {
            System.out.println(p*t);
        } else if (op.equals("/")) {
            if (t == 0){
                System.out.println("Divided by zero !");
            } else{
                System.out.println(p/t);
            }
        }
    }
}
