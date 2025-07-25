import java.util.*;

public class Mergesort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of.elements: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<arr.length; i++){
            System.out.print("Enter the elements: ");
            arr[i] = sc.nextInt();
        }
        //sorting-logic : DIVIDE AND CONQUER algorithm --recurisve function usage
        mergeSort(arr);
        for (int a: arr){
            System.out.print(a + " ");
        }
        
    }
    static void mergeSort(int[] array){
        if (array.length <= 1){
            return;
        }
        int mid = array.length / 2;
        int[] leftarray = Arrays.copyOfRange(array, 0, mid);
        int[] rightarray = Arrays.copyOfRange(array, mid, array.length);
        mergeSort(leftarray);
        mergeSort(rightarray);
        
        int lp =0;
        int rp =0;          //index pointers for the created arrays- left and right
        int ap =0;          //index pointer for the original array
        
        while (rightarray.length > rp && leftarray.length > lp){
            if (leftarray[lp] < rightarray[rp]){
                array[ap] = leftarray[lp];
                lp++;
                ap++;
            }
            else{
                array[ap] = rightarray[rp];
                rp++;
                ap++;
            }
        }
        while(lp < leftarray.length){
            array[ap] = leftarray[lp];
            lp++;
            ap++;
        }
        while(rp < rightarray.length){
            array[ap] = rightarray[rp];
            rp++;
            ap++;
        }
    }
}
