import java.util.Scanner;

public class Circle {
 static Scanner input = new Scanner(System.in);


 double radiusInMm ;


 public Circle (double radiusInMm){
    this.radiusInMm = radiusInMm ;
 }
 
 double getCircumference () {
     return 2 * Math.PI * radiusInMm ;

 }

 double getArea () {
    return Math.PI * Math.pow(radiusInMm, 2 );
 }

 @Override
 public String toString (){
    return "Circle props : Radius in mm: " + radiusInMm + "  , Circumference in mm :  " + getCircumference () + " , Area in mm2:  " + getArea()  ;
 }

public static void main(String[] args) {
System.out.println("Enter radius :  ");
double radius = input .nextDouble ();

if (radius <= 0) {
    System.out.println("Radius must be positive");
    return;
}

Circle cir = new Circle(radius);
System.out.println(cir);
    
}





}
