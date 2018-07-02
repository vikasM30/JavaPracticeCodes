import java.util.Arrays;

public class ReverseAString {

    public static String reverseString(String str) {
        String rev = " ";
        for (int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        return rev.toString();

    }

    public static void main(String[] args) {
        String str = "batman";
        System.out.println(reverseString(str));
    }

}
