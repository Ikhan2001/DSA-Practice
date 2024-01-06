import java.util.Arrays;

public class LinerarSearch {

    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length ; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int largestNum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int result = (arr[i] > max) ?
                    max = arr[i]
                    : -1;
        }
        return max;
    }
    public static int secondLargestNum(int arr[]){
        int max_1 = Integer.MIN_VALUE;
        int max_2 = max_1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max_1){
                max_2 = max_1;
                max_1 = arr[i];
            }else if(arr[i] > max_2 && max_2<max_1){
                max_2 = arr[i];
            }
        }
        return max_2;
    }


    public static int[] sortGivenArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        return arr;
    }

    public static int binarySerarch(int arr[], int key){
        int start = 0 ;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end) / 2;
            //comparison
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){//2nd half
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,85,95,500};
        int key = 100;
        int index = linearSearch(numbers,key);
        String result=(index == -1)?"Not found":"Found with index "+index;
        System.out.println(result);
        System.out.println("Largest Number Is: "+largestNum(numbers));
        System.out.println("Second Largest Num Is: "+secondLargestNum(numbers));
        sortGivenArray(numbers);
        for(int x : numbers){
            System.out.print(x + "|");
        }
        System.out.println();
        int key1=500;
        System.out.println(binarySerarch(numbers,key1));

    }
}
