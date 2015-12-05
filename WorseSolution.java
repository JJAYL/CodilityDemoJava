// you can also use imports, for example:
import java.util.*;

class Solution
{
    private int lowSum;
    private int highSum;
    public int solution(int[] A)
    {
        lowSum = 0;
        highSum = 0;
        for(int i = 0; i< A.length; i++)
        {
            for(int j = 0; j < A.length; j++)
            { 
                if(j < i)
                {
                    lowSum+= A[j];
                } else if(j > i) {
                        highSum+= A[j];
                    }
            }
            if(highSum == lowSum) return i;
            lowSum = 0;
            highSum = 0; //don't be an idiot like me and forget to do this
         }
        return -1;
    }
}
