public class Quicksort2{
    public static void main(String[] args){
        int[] array = {3,6,1,7,2,9,8};
        for (int a: array){
            System.out.print(a + " ");
        }
        System.out.println();
        quicksort(array, 0, array.length-1);
        for (int a: array){
            System.out.print(a + " ");
        }
    }
    public static void quicksort(int[] arr, int low, int high){
        if (low>=high){
            return;
        }
        //lomuto algorithm: pivot = last element
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j<high; j++){
            /* i'm checking it with j whether it's lower or not and then changing or initializing it with i index in the array by swapping them with arr[j]!
            */
            if (arr[j]<= pivot){
                i++;
                int temp = arr[i];          
                arr[i] = arr[j];
                arr[j] = temp;
            } //when it finds a big element, it'll skip and swap next when it finds a smaller element than pivot.  why? coz, i hasn't moved yet, only j has.
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];       
        //update the array with arr[high] and not pivot, coz you'll reassign the pivot for further, but swapping is the main idea here
        arr[high] = temp;
        //and finnallly you should move the pivot to arr[i+1]--bcoz that index'd be that pivot's position in the array.
        
        quicksort(arr, low, i);
        quicksort(arr, i+2, high); //sorted till i+1
    }   
}

