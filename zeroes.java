public class zeroes {

    static int s =0;
    static void z(int n, int count){
        if (n > 0){
            if(n%10 == 0){
                s += 1;
                z(n/10, count+1);

            } else {
                z(n/10, count);
            }
        } else {
            return;

        }

    }

    public static void main(String[] args) {
        z(10000010, 0);
        System.out.println(s);
    }
}
