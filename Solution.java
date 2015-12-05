class Solution {
    public int solution(int[] A)
    {
        int[] sum = new int[A.length];
        for(int i = 0; i< A.length; i++)
        {
            if(i==0) sum[i] = A[i];
            else sum[i] = sum[i-1] + A[i];
        }                             
        
        for(int i = 0; i<sum.length; i++)
        {
            if(sum[i]- A[i] == (sum[sum.length-1] -sum[i])) return i;
             //sum[i] - A[i] are all the numbers from A[0] to A[i] added up, not including A[i] and sum[sum.length-1] -sum[i] is the sum all all the numbers in A[i] not including the ones before i
        }
        return -1;
    }
}
