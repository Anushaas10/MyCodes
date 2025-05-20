package BinarySearch;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr= {1, 2, 4, 6, 7, 9, 13, 16, 20, 22, 25, 29, 37, 39, 50, 56, 59, 80, 90, 111, 150, 152, 156};
        int target= 13;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
            int temp= end +1;
            end= end+ (end-start +1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            } else
            if(arr[mid]>target){
                end =mid-1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}

