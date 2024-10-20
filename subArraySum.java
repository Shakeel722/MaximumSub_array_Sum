import java.util.Arrays;

public class subArraySum{

    // using prefix Array to solve the problem of finding the maximum sub array sum
    public static void MaxSubArraySum(int[] arr){
   
  // making a prefix array
  int[] prefix = new int[arr.length];

  prefix[0] = arr[0];

  for(int i=1; i< arr.length;i++){

    prefix[i] = prefix[i-1] + arr[i];


  }
  System.out.println(Arrays.toString(prefix));

  // finding maximum sub array sum using the formula

  int currSum =0;
  int maxSum = Integer.MIN_VALUE;

  for(int i=0; i< arr.length; i++){
    int start =i;

    for(int j=0 ; j< arr.length; j++){
 int end = j;

  currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start - 1];

   if(currSum> maxSum ){

    maxSum= currSum;
   }

    }

    
  }


  System.out.println("the max Sum is :" + maxSum);

    }
    public static void main(String[] args){
   int[] array = { 1, -2, 6, -1, 3};

   // calling my method
   MaxSubArraySum(array);

        
    }
}