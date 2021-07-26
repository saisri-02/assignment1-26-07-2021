class Solution {
    public int countPrimes(int n) {
        int i,j,count=0;
        for(i=0;i<=n;i++)
        {
            count=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
        }
            return count;
     }
}

output:

Your input  10
Output      4
Expected    4