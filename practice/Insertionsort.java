public class Insertionsort{
	public static void main(String[] args){
		int[] arr = {6,5,7,2,8,4};
		for (int i = 1; i<arr.length; i++){   //loop's for unsorted array --i is first of unsorted
		    int curr = arr[i];                  //temporary variable to store the first index of unsorted element
		    int j = i-1;                        //isn't always zero-- j stands for last index of the sorted array
		    while(j>=0 && arr[j]>curr){          //once j reaches 0, it becomes the start of the array!
		        arr[j+1] = arr[j];                            //arr[j] > curr --once false, it identifies the smaller element
		        j--;                    //make sure j index goes front, else it keeps checking the same index and says its true!
		    }                              //while loop has only swapped and not inserted the right element (curr) 
		    arr[j+1] = curr;      //inserted!!
		}
		for(int a: arr){
		    System.out.print(a + " ");
		}
	}
}
