//linear search
// [0, 1, 9, 16, 100]

//no conditon like array should be sorted
//t.c: O(n)

//pseudo-code
// int n = arr.length;
// for(int i=0; i<arr.length; i++){
//     if (arr[i] == target)  return i;
// }


//binary search 

// array should be sorted
// follows the D&C approach
// O(log n)

// example:
[10, 20, 30, 40, 51, 90, 115]

target=115
// two pointers like start, end
// start=0, end=n-1

while(start <= end){
    int mid = (start + end)/2;

    if(arr[mid]==target){
        return mid;
    }
    else if(arr[mid] < target){
        start = mid+1;
    }else{
        end = mid-1;
    }
}








