public class Student {
    String name ;
    String fathersName;
    String mothersName;
    int studentClass;
    int rollNumber;
    int age ;


    public Student (String name , String fathersName , String mothersName ,int studentClass ,  int rollNumber , int age){
        this.name = name ;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.studentClass = studentClass;
        this.rollNumber = rollNumber;
        this.age = age;

        
        
            
    
    }

    @Override
    public String toString() {
        return "Name: " + name +
               ", Father: " + fathersName +
               ", Mother: " + mothersName +
               ", Class: " + studentClass +
               ", Roll No: " + rollNumber +
               ", Age: " + age;
    }
    

    public static void main(String[] args)
     {
        Student stu = new Student("chat GPT" , "Dibaakar" , "open AI" , 1 , 1 , 4 );
        System.out.println(stu);



    }
        
    
        
    }


