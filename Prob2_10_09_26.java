import java.util.*;

public class Prob2_10_09_26 {
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
        usingSort(s);
        usingArrayList(s);
        usingHashSet(s);
	}
    public static void usingSort(String[] s)
    {
        Arrays.sort(s);
        for(int i=1;i<s.length;i++){
            if(s[i] == s[i-1])
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void usingArrayList(String[] s)
    {
        List<String> list = new ArrayList<>();
        for(int i=0; i<s.length; i++){
            if(list.contains(s[i]))
            {
                System.out.println("NO");
                return;
            }
            else
            {
                list.add(s[i]);
            }
        }
        System.out.println("YES");
    }
    public static void usingHashSet(String[] s)
    {
        HashSet<String> set = new HashSet<>(Arrays.asList(s));
        if(set.size() == s.length)
        {
            System.out.println("YES");    
        }
        else{
            System.out.println("NO");    
        }
    }
}
