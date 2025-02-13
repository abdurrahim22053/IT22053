
import java.util.*;

public class Array_sum_QN05 {
    public static int array_sum(int[] array){
        int sum=0;
        for(int num: array){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int result=array_sum(a);
        System.out.println("The sum of the array is : "+result);
        sc.close();
    }
    
    
}