import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] reverseArray(int arr[]) {
        // code here
        int i = 0;
        while( i <= arr.length - i - 1){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1]; 
            arr[arr.length - i - 1] = temp;
            i++;
        }
        return arr;
    }
}
