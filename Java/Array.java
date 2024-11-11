import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void arrayReverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static String findmax(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return max +" "+min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] arr = {1,2,3,4,5};
        System.out.println(findmax(arr));
       // swap(arr,0,4 );
        //i want to swap the index0 with index4
        ArrayList<ArrayList<Integer>> arrayList2d = new ArrayList<>();
        for (int i = 0; i <3; i++) {
            arrayList2d.add(new ArrayList<>());
        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//               arrayList2d.get(i).add(sc.nextInt());
//            }
//        }


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.size();

//        for (int i = 0; i < 9; i++) {
//            stringArrayList.add(sc.nextLine());
//        }
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(34);

        arrayList.set(6, 100);
        //System.out.println(stringArrayList.toString());
        //System.out.println(arrayList2d.toString());
        //System.out.println(stringArrayList.get(0));  //to access an element we pass the index here
        arrayReverse(arr);
    }
}
