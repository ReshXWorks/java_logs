public class Selectionsort{
	public static void main(String[] args) {
	    int[] arr = {64,7,2,9,1,8,6};
	    for(int j=0; j<arr.length-1; j++){
	        int min_index = j;            
        	for (int i=j+1; i<arr.length; i++){
        	    if (arr[min_index] > arr[i]){
        	        min_index = i;            //don't swap right away, select the min element's index first
        	    }
        	}
        	int temp = arr[min_index];      //and then have the swap logic-correct implementation of "selection" sort: select it and then swap it
            arr[min_index]=arr[j];
            arr[j]=temp;
	    }
        	
	    for(int a: arr){
	        System.out.println(a);
	    }
	}
}
