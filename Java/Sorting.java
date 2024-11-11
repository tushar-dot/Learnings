import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
    int [] unsortedArray = {9,8,7,6,5,4,3,2,1};
    bubble(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
    static void bubble(int[] arr){
        //run these steps for n-1 times
        for (int i = 0; i < arr.length; i++) {

            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
