// Find the Index of First Element Greater Than Target


// INPUT: 
// arr = [10, 13, 50, 70]
// target = 50

// OUTPUT: 3

public class FindGreaterElement{
    public static boolean upperBound(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        int answer = -1;

        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] > target){
                answer = mid; //potential answer
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] arr = {1, 3,5, 7};
        int target = 5;

        int result = upperBound(arr, target);
        System.out.println(result);
    }
}

