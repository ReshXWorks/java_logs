import java.util.*;

public class Quicksort1{
    public static void main(String[] args){
        int[] array = {2,6,1,8,3,4};
        quicksort(array, 0, array.length-1);
        for (int a: array){
            System.out.println(a);
        }
    }
    public static void quicksort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }
        int pivot = arr[low];
         //hoare principle, two pointers: i,j -take w.r.t passed parameters: low, high
        int i = low;
        int j = high;
        while (true){   //pointer-movement
            while (arr[i]<pivot){ 
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }
            if (i>=j){
                break;
            }
            int temp = arr[i];  //swap logic
            arr[i]=arr[j];
            arr[j]=temp;
        }
        quicksort(arr, low, j); 
        quicksort(arr, j+1, high);
    }
}
