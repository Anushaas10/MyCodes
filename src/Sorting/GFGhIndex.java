package Sorting;

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
