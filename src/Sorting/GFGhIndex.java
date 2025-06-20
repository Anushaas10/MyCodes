package Sorting;
//Counting sort is an algorithm for sorting a collection of objects according to keys that are small positive integers. It operates by counting the number of objects that have each distinct key value, and using arithmetic on those counts to determine the positions of each key.
// The algorithm works by first counting the number of occurrences of each key, then using prefix sums to determine the positions where each key should be placed in the output array.
// Counting sort is not a comparison sort; it uses key values as indexes into an array.
//Counting sort is particularly efficient when the range of input values is small compared to the number of elements to be sorted.
public class GFGhIndex {
    public static void main(String[] args) {
        int[] citations = {5, 1, 2, 4, 1};
        System.out.println("H-Index: " + hIndex(citations));
    }

    static int hIndex(int[] citations) {
        // code here
        int n=citations.length;
        int[] freq=new int[n+1];
        for(int i=0;i<n; i++){
            if(citations[i]>=n){
                freq[n]+=1;
            }
            else{
                freq[citations[i]]+=1;
            }
        }
        int idx=n;
        int s=freq[n];
        while(s<idx){
            idx--;
            s+=freq[idx];
        }
        return idx;
    }
}
