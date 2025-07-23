public class Bubblesort
{
	public static void main(String[] args) {
	    int[] arr = {1,2,3,45,67}; //use separate for loop to get user input for unsorted array if needed
	    for (int i=0; i<arr.length-1; i++){
	        boolean flag = true;
	        for (int j=0; j<arr.length-1; j++){
	            if (arr[j]>arr[j+1]){
	                flag =false;
	                int temp = arr[j];
	                arr[j]= arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	        if (flag){	//if this flag ain't here, that best case complexity of O(n) won't work! why? coz, the for loop still will complete itself;
	            //System.out.println("firstloop!");
	            break; 
	        }
	        //System.out.println("will it print?");
	    }
	    for(int a: arr){
	        System.out.println(a);
	    }
	}
}
