package Sep09;
import java.util.Scanner;

public class Prob1_10_09_26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        withInbuiltFunction(s);
        withoutInbuiltFunction(s);
    }
    public static void withInbuiltFunction(String[] s){
        
		float Present = 0;
		int Absent = 0;
		for(int i=0;i<s.length;i++)
		{
		    if(s[i] == "1"){
		        Present++;
		    }
		    else
		    {
		        Absent++;
		    }
		}
		int Att = (int)(Math.round((Present * 100.00) / (float)s.length)); 
		System.out.printf("Present: %d, Absent: %d, Att: %d%%",(int)Present, Absent, Att);
        System.out.println();
    }
    public static void withoutInbuiltFunction(String[] s){
        
		float Present = 0;
		int Absent = 0;
		for(int i=0;i<s.length;i++)
		{
		    if(s[i] == "1"){
		        Present++;
		    }
		    else
		    {
		        Absent++;
		    }
		}
		int decimalPoint = ((int)(((Present * 100.00) / (float)s.length) * 10)) / 10;
		int Att = (decimalPoint >= 5) ? ((int)((Present * 100.00) / (float)s.length)) + 1 : (int)((Present * 100.00) / (float)s.length);
		System.out.printf("Present: %d, Absent: %d, Att: %d%%",(int)Present, Absent, Att);
    }
}
