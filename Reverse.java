public class Reverse {

    static int sum = 0;
    static void rev(int n){
        if (n ==0){
            return;
        }else {
            int rem = n%10;
            sum = sum*10 +rem;
            rev(n/10);
        }
    }
    public static void main(String[] args) {

        rev(5123);
        System.out.println(sum);


    }


}
