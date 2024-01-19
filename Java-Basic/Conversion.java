package Java;

public class Conversion {

    public static void main(String[] args) {
        int number = 42;
        String strNumber  = String.valueOf(number);
        String strNumber2 = ""+  number;

        double pi = 3.14;
        String strPi = String.valueOf(pi);

        char s = strNumber.charAt(1); // 42
        System.out.println(s); // 2

        String StringNum = "42";
        int string_to_number  = Integer.parseInt(StringNum);
    }
}
