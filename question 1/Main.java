import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");  
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of an array");  
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Even Numbers:");  
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
              System.out.println(arr[i]);
            }
        }
    }
}