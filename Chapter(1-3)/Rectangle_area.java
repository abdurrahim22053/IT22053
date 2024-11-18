import java.util.Scanner;
public class Rectangle_area{
    public static void main( String[] args){
        Scanner input=new Scanner(System.in);
        double width,height;
        System.out.println("Enter width and height:");
        width=input.nextDouble();
        height=input.nextDouble();
      double area=width*height;
      System.out.println("\nArea:"+area);
       
    }
}