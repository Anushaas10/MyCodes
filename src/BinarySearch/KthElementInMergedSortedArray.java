package BinarySearch;

public class KthElementInMergedSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;
        int[] arr= sorting(arr1, arr2);
        System.out.println(arr[k-1]);// k is 1-based index
    }
    static int[] sorting(int[] a, int[] b){
        int n= a.length;
        int m= b.length;
        int[] arr= new int[n+m];
        int i=0, j=0, k=0;
        while(i<n && j<m){
            arr[k++]= a[i]<b[j]? a[i++]: b[j++];
        }
        while(i<n){
            arr[k++]=a[i++];
        }
        while(j<m){
            arr[k++]= b[j++];
        }
        return arr;
    }
}
