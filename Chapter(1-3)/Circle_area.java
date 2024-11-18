import java.util.Scanner;
public class Circle_area{
    public static void main( String[] args){
        Scanner input=new Scanner(System.in);
        double radius;
        System.out.println("Enter radius:");
        radius=input.nextDouble();
      double perimeter=2*radius*3.1416;
      double area=radius*radius*3.1416;
      System.out.println("Perimeter:"+perimeter+"\nArea:"+area);
       
    }
}