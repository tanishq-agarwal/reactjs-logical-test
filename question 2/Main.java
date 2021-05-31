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
        int count = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count = 0;
            }
            else {
                count +=1;
                result = Math.max(result,count);
            }
        }
        System.out.println("Max num of consecutive 1's is: " + result);
    }
}