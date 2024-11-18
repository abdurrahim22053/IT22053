import java.util.Scanner;
public class Print_table{
    public static void main( String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter any integer number:");
        n=input.nextInt();
        System.out.println("a\t a^2\t a^3");
        for(int i=1;i<=n;i++){
            System.out.println(i +"\t"+i*i +"\t"+ i*i*i );
        }
    }
}