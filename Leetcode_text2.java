import java.util.Arrays;
public class Leetcode_text2 {
}
//leetcode 2008
class Solution4 {
    public long maxTaxiEarnings(int n, int[][] rides) {
        long[] dp = new long[n+1];
        Arrays.sort(rides, (a,b) -> a[1]-b[1]);
        int end = 1;

        for (int[] ride:rides) {
            for (; end <= ride[1]; end++) {
                dp[end] = Math.max(dp[end], dp[end-1]);
            }
            dp[ride[1]] = Math.max(dp[ride[1]], dp[ride[0]] + ride[2] + ride[1] - ride[0]);
        }
        long res = 0;
        for (int i = 0; i <= n; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
//leetcode 2048
class Solution5 {
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;;i++)
        {
            if(sum_text(i))
            {
                return i;
            }
        }
    }
    private boolean sum_text(int n1){
        int[] sum=new int[10];

        while(n1!=0)
        {

            sum[n1%10]++;
            n1/=10;
        }
        for(int i=0;i<=9;i++)
        {
            if(sum[i]!=i&&sum[i]!=0)
            {
                return false;
            }

        }
        return true;
    }
}//leetcode 2520
class Solution7 {
    public int countDigits(int num) {
        int[] sum=new int[10];
        int i=0;
        int tum=num;
        while(num!=0)
        {
            sum[i]=num%10;
            num/=10;
            i++;
        }
        int j=0;
        for(int k=0;k<i;k++)
        {

            if(tum%sum[k]==0)
            {
                j++;
            }

        }
        return j;
    }
}
//leetcode 2136
class Solution8 {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        Integer[] idxx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idxx[i] = i;
        }
        Arrays.sort(idxx, (i, j) -> growTime[j] - growTime[i]);
        int ans = 0, t = 0;
        for (int i : idxx) {
            t += plantTime[i];
            ans = Math.max(ans, t + growTime[i]);
        }
        return ans;
    }
}

