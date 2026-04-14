import java.util.Arrays;
import java.util.Scanner;

public class TestProgram {
   static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    
    //    int [] numbers = inputputArray();
    //    long result = sum(numbers);
    //    System.out.println("sum = " + result);
    //    System.out.println("avarage = " + average(numbers));
//----------------------------------------------------------------------

// int [] numbers = inputputArray();
// System.out.println("enter the number u want to find occarences in the array : ");
// int num = input.nextInt();
// int count = noOfOccurrences(numbers , num);
// System.out.println("Occurrences of  " + num + " = " + count);
//----------------------------------------------------------------------
// int [] numbers = inputputArray();
// int max = findMax(numbers);
// int min = findMin(numbers);
// System.out.println("minimun number in the array is " + min);
// System.out.println("maximum number in the array is " + max);
//---------------------------------------------------------------------
// int [] arr = inputputArray();
// System.out.println(isSorted(arr));
//-------------------------------------------------------------------
// int[] arr = inputputArray();
// reverse(arr);
// System.out.println(Arrays.toString(arr));
//------------------------------------------------------------------
// int [] num = inputputArray();
// boolean isPalin = isPalindrome(num);
// System.out.println(isPalin);
//-----------------------------------------------------------------
//   int [] arr1 = inputputArray();
//   int [] arr2 = inputputArray();
//   int [] merged =  merge(arr1, arr2) ;
//   System.out.println(Arrays.toString(merged));
//------------------------------------------------------------------
// int [][]arr = input2DArray();
// System.out.println("now enter the number you want to search :  ");
// int num = input.nextInt();
// boolean isFound = searchNumIn2dArray(arr, num);
//    if(isFound) System.out.println("yes the num is there in the array");
//    else System.out.println("sorry, the number is not there in the array");
//--------------------------------------------
// for (int [] row : arr){
//     System.out.println(Arrays.toString(row));
// }
//-----------------------------------------------------------------
// int [] [] arr = input2DArray();
// long sum = sum(arr);
// double avg = average2D(arr);
// System.out.println("the sum of the array is " + sum );
// System.out.println("the average of the array is " + avg);
//-----------------------------------------------------------
//  System.out.println("PLEASE ENTER YOUR FIRST NUMBER :");
//  int num1 = input . nextInt();

//  System.out.println("PLEASE ENTER YOUR SECOND NUMBER :");
//  int num2 = input.nextInt();
//  int graterNumber ;

//   if  (num1 > num2){
//     graterNumber = num1;
 
//   }else {
//     graterNumber = num2;

//   }
//   System.out.println("greater number is " + graterNumber);
//---------------------------------------------------------------
// System.out.println("PLEASE ENTER YOUR FIRST NUMBER :");
//  int num1 = input . nextInt();
 
//  System.out.println("PLEASE ENTER YOUR SECOND NUMBER :");
//  int num2 = input.nextInt();
//  int graterNumber = num1 > num2 ? num1 : num2;

//  System.out.println("greater number is " + graterNumber + " .thank you visit again");
 //--------------------------------------------------------------------------------
// System.out.println("welcome to the day of the week detecter");
// System.out.println("Enter your day in number :");
// int day = input .nextInt();

// switch (day) {
//     case 1: System.out.println("Monday");
//         break;
//     case 2: System.out.println("Tuesday");
//         break;
//     case 3:System.out.println("Wednesday");
//         break;
//     case 4:System.out.println("Thrusday");
//         break;
//     case 5:System.out.println("Friday");
//         break;
//     case 6:System.out.println("saturday");
//         break;
//     case 7:System.out.println("sunday");
//         break;
//     default:System.out.println("invalid day");
//         break;
// }
//-------------------------------------------------------------------------
// System.out.println("welcome to the day of the week detecter");
// System.out.println("Enter your day in number :");
// int day = input .nextInt();
//     String DayStr = switch (day){
//     case 1 -> "Monday";
//     case 2 -> "Tuesday";
//     case 3 -> "Wednesday";
//     case 4 -> "Thrusday";
//     case 5 -> "friday";
//     case 6 -> "saturday";
//     case 7 -> "Sunday";
//     default -> "Invalid day";
//     };
//     System.out.println(DayStr);
//------------------------------------------------------------------
// System.out.print("Enter the first number  : ");
// int a = input.nextInt();

// System.out.print("Enter the last number  : ");
// int b = input.nextInt();

// TestProgram obj = new TestProgram();
// int min = obj.min(a, b); 
// System.out.println("The minimum is : " + min);
//--------------------------------------------------------------
// System.out.print("Enter the number  : ");
// int num = input.nextInt();
// TestProgram obj = new TestProgram();
// String result = obj.oddEven(num);
// System.out.println("This number is  " + result);
// --------------------------------------------------------------
// System.out.println("Enter the number : ");
// int num = input.nextInt();
// TestProgram obj = new TestProgram();
// int absoluteVal = obj.absoluteValue(num);
// System.out.println("Absolute value is  " +absoluteVal);
//------------------------------------------------------------------
// System.out.println("Enter your mark in math : ");
// int mark = input.nextInt();
// String grade = (mark >= 90 ? "A" :
//                (mark >= 80 ? "B" :
//                (mark >= 70 ? "C" :
//                (mark >= 60 ? "D" :
//                (mark >= 50 ? "E" :"F")))));
// System.out.println("Your grade is " + grade);
//-----------------------------------------------------------------
// System.out.println("Enter the number of the month  : ");
// int monthNum = input.nextInt();
// TestProgram obj = new TestProgram();
// String month = obj.monthName(monthNum);
// System.out.println("your month name is " + month);
//-----------------------------------------------------------------
// System.out.println("Enter num1 : ");
// int num1 = input.nextInt();
// System.out.println("Enter num2 : ");
// int num2 = input.nextInt();
// System.out.println("NOW ENTER WHICH OPERATION YOU WANT TO PERFORM >>[+-*/]");
// char oparation = input.next().charAt(0);


// switch (oparation) {
//     case '+': 
//         System.out.println("Result : " + (num1 + num2));
//         break;
//     case '-': 
//         System.out.println("Result : " + (num1 - num2));
//         break;
//     case '*': 
//         System.out.println("Result : " + (num1 * num2));
//         break;
//     case '/':
//         if(num2 != 0) {
//             System.out.println("Result : " + (num1 / num2));
//         }else {
//             System.out.println("Error: Division by zero is not allowed.");
//         }
//         break;
//     default: System.out.println("Invalid operation entered");
//         return;
//     }
//------------------------------------------------------------------------
// int age ;
// do {
//     System.out.println("Enter your age : ");
//      age = input.nextInt();

// } while (age > 100 || age < 0) ; 
//      System.out.println("You age is  " + age);
//----------------------------------------------------------------------
// int Age;
// System.out.println("Enter your age : ");
// Age = input.nextInt();

// while (age > 100 || age < 0) {
//     System.out.println("Enter your age : ");
//     Age = input.nextInt();
// }

// System.out.println("Your age is " + Age);
//---------------------------------------------------------------------------
// for (int i = 1 ; i <=100 ; i++){
//     System.out.print(i + " | ");
// }
//----------------------------------------------------------------------------
// String [] nameArr = new String[]{
//     "ram", "iron man" , "bruce banner" , "steve rogers" , "scott Lanng" , "null" , null , "Natasha",
// };
// System.out.println(Arrays.toString(nameArr));

// for (int i = 0 ; i < nameArr.length ; i++) {
//     System.out.println(nameArr[i]);
// }
//-----------------------------------------------------------------------------------------
// String [] nameArr = new String[]{
//     "ram", "iron man" , "bruce banner" , "steve rogers" , "scott Lanng" , "null" , null , "Natasha", "Black Panther"
// };
// for (String n : nameArr) {
//     System.out.println(n);
// }
//-------------------------------------------------------------------------------------
// System.out.println(factorial(10));
// System.out.println(factorialR(5));
//------------------------------------------------------------------------------------
// isValidPassword();
//--------------------------------------------
// guessTheNumGame();
//----------------------------------------------
// multiplicationTable(6,10);
//--------------------------------------------------
// System.out.println(isPrime(2));
//--------------------------------------------
// int [] arr = inputputArray();
// int max = arr[0];
// for(int i = 1 ; i < arr.length ; i++){
//     if(arr[i] > max){
//         max = arr[i];
//     }
// }
// System.out.println("Maximum value is  " + max);
//---------------------------------------------------
// int [] arr = inputputArray();
// if (arr.length == 0){
//         System.out.println("Array is empty , cannot find maximum value");
// }else {
//         int max = arr[0];
//         for (int i : arr) {
//             if( i > max) {
//             max = i ;
//             }
//         }
// System.out.println("hey , buddy your maximum value is "+ max);
// }
//---------------------------------------------------------------------------
// int [] arr = inputputArray();
// if (arr.length == 0){
//         System.out.println("Array is empty , cannot find maximum value");
// }else {
//         int max = Integer.MIN_VALUE;
//         for (int i : arr) {
//             if( i > max) {
//             max = i ;
//             }
//         }
// System.out.println("hey , buddy your maximum value is "+ max);
// }
//--------------------------------------------------------------------------
// int [] arr = inputputArray();
// System.out.println("Now enter the number you wwant to find occurrences");
// int num = input.nextInt();

// if(arr.length == 0)  {
//     System.out.println("Array is empty , cannot find occurrences");
// } else {
//     int occ = 0;
//     for(int i : arr){
//         if(i == num){
//             occ ++;
//         }
//     }
//     System.out.println("Number " + num + " occurs " + occ + " times in the array.");
// }
//-----------------------------------------------------------------------------
// System.out.println("started");
// exitOnExit();
// System.out.println("ended");
//-------------------------------------------------------------------------------
// positiveSum();
//--------------------------------------------------------------------
onlyPrintEven();



//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   
}//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

public static void onlyPrintEven(){
    int [] numArr = inputputArray();
    for ( int i : numArr) {
        if ( i % 2 != 0){
            continue;
        }else {
            System.out.print( i + " , ");
        }

    }

}




//--------------------------------------------------------------
public static void positiveSum(){
    int [] numArr = inputputArray();
    int sum = 0 ;
    for (int i : numArr){
        if ( i < 0){
            continue;
        }
        sum = sum +  i ;
    }
    System.out.println("The sum of positive numbers is : " + sum);
}
//---------------------------------------------------------------------
public static void exitOnExit(){

do {
    System.out.println("tell me what you want to say");
     String said = input.nextLine();
    
    if (said.equalsIgnoreCase("exit")){
        break;
    }
}while (true);
System.out.println("program ended.");

}
//-----------------------------------------------------------------
public static boolean isPrime (int num){
    if(num <= 1) return false;
    for(int i = 2 ; i < num ; i++){
        if(num % i == 0 ){
            return false;
        }
    }
    return true;
}
//--------------------------------------------------------------------
public static void multiplicationTable (int num , int limit){
    for(int i = 1 ;  i <= limit ; i++){
        System.out.println(num + " X " + i + " = " + (num*i) );
    }
}
//---------------------------------------------------------------
public static void guessTheNumGame (){
    int num;
    do{
        System.out.println("Guess a number here :");
        num = input.nextInt();
    }while(num != 101);
    System.out.println("You gussed it ! Game over.");
}
//---------------------------------------------------------------------
public static void isValidPassword(){
    String password ;
    do {
        System.out.println("Please enter your password ");
         password = input.next();
    } while(!CheckPasswordStrength(password));
    System.out.println("Thanks for entering a valid password .....");
}

public static boolean CheckPasswordStrength (String password)  {
    
    if (password.length() >= 5) {
        return true;      
    }else{
        return false;
    }
}
//---------------------------------------------------------
public static long factorialR (int num) {
    System.out.println("function called for " + num);
    if (num == 1){
        return 1 ;
    }
    return num * factorialR(num -1);
}
//-----------------------------------------------------------
public static long factorial (int num){
long result = 1 ;
for (int i = 1 ;   i <= num ;   i++){
    result = result * i ;
}
return result;
}
//----------------------------------------------------------------

public  String monthName(int monthNum) {
    return switch (monthNum) {
        case 1 -> "January";
        case 2 -> "February";
        case 3 -> "March";
        case 4 -> "April";
        case 5 -> "May";
        case 6 -> "June";
        case 7 -> "July";
        case 8 -> "August";
        case 9 -> "September";
        case 10 -> "October";
        case 11 -> "November";
        case 12 -> "December";
        default -> "Unknown"; // Required for switch expressions
    };
}
//---------------------------------------------------------------
public int absoluteValue (int num){
    return num >= 0 ? num : -num ;
}
//-----------------------------------------------------------------
public String oddEven (int a ){
    return a % 2 == 0  ? "Even" : "Odd" ;
}

//----------------------------------------------------------------------
public  int min (int num1 , int num2){
    return(num1 > num2) ? num2 :num1 ;

}
//------------------------------------------------------------------------
public static long sum (int [] [] array ){
    long sum = 0 ;
    for (int i = 0 ; i <array.length ; i++){
        for(int j = 0 ; j < array[i].length ; j++){

            sum = sum + array[i] [j];
        }
    }
    return sum;
}

public static double average2D (int [] [] array){
    long sum = sum(array);
    int totalElements = 0 ;
        for(int i = 0 ; i < array.length ; i++){
            totalElements = totalElements + array[i].length;
        }

    double avg = (double) sum / totalElements;

    return avg;
}
//----------------------------------------------------------------------
public static boolean searchNumIn2dArray (int [][] array  , int num){
    for (int i = 0 ; i < array.length ; i++) {
        for (int j = 0 ; j < array[i].length ; j++){
            if (array[i][j] == num) {
                return true;
            }
        }
    }
    return false;
}
//-------------------------------------------------------------------------

public static int [] [] input2DArray() {
 System.out.println("Enter number of rows:  ");
 int rows = input.nextInt();

 System.out.println("Enter number of columns:  ");
 int cols = input.nextInt();

 int [][] arr = new int [rows] [cols];


    for (int i = 0 ;  i < rows;  i++){
        for (int k = 0 ; k < cols ; k++ ) {
             System.out.println("Enter value for row " + (i +1) + " coloum " + (k+1) + " :  ");
            arr[i] [k] = input.nextInt();
    }  
 }
    return arr;
}
//---------------------------------------------------------
public static int[] merge (int[]arr1, int[]arr2){
    int newSize = arr1.length + arr2.length;
    int []newArr = new int [newSize] ;

    int i = 0 ;  
    int j = 0 ;      
    int k = 0 ;

    while(i < arr1.length && j < arr2.length){
          if(arr1[i] < arr2[j]) {
            newArr[k] = arr1[i];
            i++ ;
            k++;
          } else {
            newArr[k] = arr2[j];
            j++;
            k++;
          }
    }

        while (i < arr1.length) {
            newArr[k] = arr1[i];
            k++;
            i++; 
          }

        while (j < arr2.length) {
            newArr[k++] = arr2[j++];        
          }
          return newArr;

}
//----------------------------------------------------------------------
public static boolean isPalindrome (int [] array) {
    int i = 0;
    while ( i < array.length / 2) {
        if (array[i] != array[array.length -1 -i]){
            return false;
        }
        i ++;
    }
    return true ;
}
//-----------------------------------------------------------------------
public static void reverse (int [] array){
   int i = 0 ;
   while ( i < array .length /2){
    int swap = array[i];
    array[i] = array[(array.length -1 )- i];
    array[(array.length -1 )- i] =swap;

    i++;
   }

}
//---------------------------------------------------

public static boolean isSorted (int [] array){
   boolean isInc = isIncreasing(array);
   boolean isDec = isDecreasing(array);
        if(isInc || isDec){         
            return true;
        }else {         
           return false;
}

}


public static boolean isIncreasing (int [] array) {
    for (int i = 1 ; i < array.length ; i++) {
       if(array[i] <= array[i-1]){
        return false;
       }

    }
    return true;
} 

public static boolean isDecreasing (int [] array){
   for (int i = 1 ; i <array.length ; i++){
     if (array[i] >= array[i-1]){
        return false;
     }
   }
    return true;
}
//-----------------------------------------------------------------------
public static int findMin (int [] array) {
   if (array.length == 0){
    throw new IllegalArgumentException("Array is empty");
   }
   int min = array[0];
   for (int i = 0 ;  i < array.length ; i++) {
       if (min > array[i]) {
        min = array[i];
       }
   }
    return min;
}

//-----------------------------------------------------
public static int findMax (int [] array) {
   if (array.length != 0) {
      int max = array[0];
      int i = 1 ;
        while (i < array.length) {
            if (max < array[i]){
                max = array[i];
            }  
         i ++ ; 
        }
        return max;
   }else {
    return Integer.MIN_VALUE;
   }

}

//--------------------------------------------------------------
public static int noOfOccurrences (int [] array , int num) {
  int occ = 0 ;
  int i = 0 ;

  while (i < array.length) {
     if (array[i] == num) {
        occ ++ ;
     } 
    i++;
  }
  return occ;
}

//--------------------------------------------------------------------------

public static double average (int [] array) {
double sum = sum(array) ;
double average =  sum / array.length;
return average;
}

//--------------------------------------------------------

public static long sum (int [] numArray){
long sum = 0 ;
int i = 0 ;
while (i < numArray.length ) {
    sum = sum + numArray[i];
    i ++ ;
}
return sum ;

}

//---------------------------------------------------------------------
 public static int [] inputputArray () {
        System.out.println("Please enter the number of elements");
        int size = input.nextInt();

        int[] nums = new int[size];
        int i = 0 ;
        while (i < size) {

            System.out.println("please enter element no " + (i + 1) + " :  ");
            nums[i] = input.nextInt();
            i++ ;
        }
        return nums;

}

}