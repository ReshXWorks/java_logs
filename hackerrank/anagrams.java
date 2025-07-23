import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        char[] arra = a.toLowerCase().toCharArray();
        char[] arrb = b.toLowerCase().toCharArray();
        sort(arra);
        sort(arrb);
        //System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        if (arra.length == 0 || arrb.length==0){
            return false;
        }
        if (arra.length == arrb.length){
            for(int i=0, j=0; i<arra.length && j<arrb.length; i++, j++){
                if (arra[i]==arrb[j]){
                    //System.out.println(arra[i] + " " + arrb[j]);
                    continue;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
        
    }
    
    static void sort(char[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
