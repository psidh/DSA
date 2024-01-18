package Java;

public class StringMethods {

  public static void main(String[] args) {
    string_thing("Name");
  }

  static void string_thing(String str){

    int length = str.length();
    System.out.println(length);

    String first_name  = "Philkhana";
    String last_name = " Sidharth";

    String full_name = first_name.concat(last_name);
    System.out.println(full_name);

    char character = full_name.charAt(1);

    String first_name_extraction = full_name.substring(0, 10);
    
    System.out.println(first_name_extraction);
    System.out.println(character);

    int checkIndex = full_name.indexOf('P');
    System.out.println(checkIndex);

    System.out.println(first_name.equals(last_name));

    String sidharth = "sidharth";
    String sidharth2 = "SIDHARTH";

    System.out.println(sidharth.equalsIgnoreCase(sidharth2));

    System.out.println("Does sidharth starts with 'dh': " + sidharth.startsWith("dh"));
    System.out.println("Does sidharth ends with 'h': " + sidharth.endsWith("h"));

    String uppername = str.toUpperCase();
    String lowercase = str.toLowerCase();
    System.out.println(uppername);
    System.out.println(lowercase);
  }

}
