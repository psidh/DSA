import java.util.Arrays;

public class StringLinearSearch{
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
        // output is : [K, u, n, a, l]

    }
    static boolean search (String str, char target){
    if (str. length () == 0) {
        return false;
    }

    for(int i = 0; i < str.length() ; i++) {

        if (target == str.charAt(i)) {
            return true;
            }

        }
    return false;
    }
}


