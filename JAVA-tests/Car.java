public  class Car {

 int noOfWheels ;
 int noOfDoors;
 int maxSpeed;
 String name;
 String model;
 String company;

 public  Car (int noOfWheels , int noOfDoors , int maxSpeed , String name , String model ,String company) {

     this.noOfWheels = noOfWheels ;
     this.noOfDoors = noOfDoors;
     this.maxSpeed = maxSpeed;
     this.name = name;
     this.model = model;
     this.company = company;

 }
 
 @Override
public String toString() {
    return "Car: " + name + ", Model: " + model + ", Company: " + company +
           ", Speed: " + maxSpeed;
}



 public static void main(String[] args) {
    Car swift = new Car (4 , 4 , 125 , "swift" , "sw86" , "suzuki") ;
    
    // System.out.print(swift.toString());

     System.out.print(swift);


 }
 



}