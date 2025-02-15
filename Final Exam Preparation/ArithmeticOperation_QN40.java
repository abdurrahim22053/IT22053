import java.util.Scanner;
public class ArithmeticOperation_QN40{
    public static void main( String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            int a,b;
            System.out.println("Enter your Interger:");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Sum:"+(a+b));
            System.out.println("Difference:"+Math.abs(a-b));
            System.out.println("Product:"+(a*b));
            System.out.println("Quotient:"+(a/b));
            sc.close();
        } catch(Exception e){
            System.out.println("Exception:"+e);
            System.out.println("You must enter integer.try again");
        }
        
    }
}