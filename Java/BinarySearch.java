public class BinarySearch {
    public static void main(String[] args) {
    int[] arr = new int[]{100,99,88,77,4,3,2};
    int [] binArr = new int[]{1,3,5,8,10,11};
    int index = binarySearch(binArr,7);

    int target = 77;
        System.out.println(index);
    }
    static int orderAugisticBinarySearch(int [] arr,int target){
        boolean isAsc = arr[0]<arr[arr.length-1];
        int start = 0;
        int end = arr.length-1;


            while (start<=end){
                int mid = start + (end- start)/2;
                if (target==arr[mid]){
                    return mid;
                }
                if(isAsc){
                if (target>arr[mid]){
                    start = mid+1;
                } else if (target<arr[mid]) {
                    end = mid -1;
                }}else {
                    if (target<arr[mid]){
                        start = mid+1;
                    } else if (target>arr[mid]) {
                        end = mid -1;
                    }
                }
        }

        return -1;
    }

    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (arr[mid]< target){
                start = mid +1;
            }
            if (arr[mid]>target){
                end = mid -1;
            }
        }
        return start;    //for ceiling
        //return end;      //for floor
    }

}
