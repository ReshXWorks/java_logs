import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,2,7,3,8,1};
        quicksort(array, 0, array.length-1);
        for(int a: array){
            System.out.print(a + " ");
        }
    }
    public static void quicksort(int[] arr, int low, int high){
        if (low>=high){
            return;
        }
        //hoare's algorithm: two pointers: i,j -take w.r.t passed parameters: low, high
        int i = low-1;
        int j = high+1;
        int pivot = arr[low];
        while(true){    ////pointer-movement
            do{
                i++;
            }while(i <= high && arr[i]<pivot);
            do{
                j--;
            }while(j >= low && arr[j]>pivot);
            
            if(i>=j){
                break;
            }
            //swap logic
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        quicksort(arr, low, j);
        quicksort(arr, j+1, high);
    }
}
