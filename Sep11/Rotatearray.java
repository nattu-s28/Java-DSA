import java.util.Scanner;

public class Rotatearray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        rotateArr(arr,d);
    }
    public static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static int[] reverse(int[] arr,int left,int right){
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right]; 
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
