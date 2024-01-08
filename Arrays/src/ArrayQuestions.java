import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayQuestions {


    //Reversing the given Array
    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }

    public static void pairsOfAnArray(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+curr+","+j+")");
                count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        Arrays.stream(arr).forEach(num -> System.out.print(num + "|"));
        System.out.println();
        //reverseArray(arr);
        pairsOfAnArray(arr);
        Arrays.stream(arr).forEach(num -> System.out.print(num + "|"));
    }
}
