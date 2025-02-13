
import java.util.*;

public class pallindrome_QN_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String r ="";
        for (int i = s.length()-1; i>=0; i--) {
            r+=s.charAt(i);
        }
        boolean check=true;
        for (int i = 0;i<s.length(); i++) {
            if(s.charAt(i)!=r.charAt(i)){
                check=false;
                break;
            }
        }
        if(check) System.out.println("Pallindrome");
        else System.out.println("Not Pallindrome");
        sc.close();
    }
}
