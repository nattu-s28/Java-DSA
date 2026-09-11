package Sep11;
import java.util.Scanner;

public class twopointer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 0;
        int r = s.length()-1;
        char[] charr = s.toCharArray();

        while(l < r)
        {
            char temp = charr[l];
            charr[l] = charr[r];
            charr[r] = temp;
            l++;
            r--;
        }
        System.out.println(charr);
    }
}
