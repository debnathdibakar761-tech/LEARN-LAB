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
  int [] arr1 = inputputArray();
  int [] arr2 = inputputArray();
  int [] merged =  merge(arr1, arr2) ;
  System.out.println(Arrays.toString(merged));







     
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^   
}//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^











//-------------------------------------------------------------------------


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
