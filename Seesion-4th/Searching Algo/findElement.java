public class FindElement{
    public static boolean binarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] == target){
                return true;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10};
        int target = 7;

        boolean result = binarySearch(arr, target);
        System.out.println(result);
    }
}