import java.util.Scanner;
import java.util.Arrays;


public class leetcode_text {

    //leetcode 2744


    public static void main(String[] args) {

        Solution3 s=new Solution3();
        int[] s2={1,4,2};
        //System.out.println(s.maxProfit(s2));
        s.maxProfit(s2);

    }
}


class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        String[] a=new String[100];
        for(int i=0;i<words.length;i++)
        {
            a[i]=new StringBuilder(words[i]).reverse().toString();

        }
        int set=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(a[i].equals(words[j])&&i!=j)
                {
                    set++;
                }
            }
        }
        return (set)/2;
    }
}
//leetcode 2717
class Solution1 {
    public long minimumRemoval(int[] beans) {
        int n = beans.length;
        Arrays.sort(beans);
        long[] sum = new long[n + 1];
        long ans = Long.MAX_VALUE;
        for(int i = 1;i <= n;i++){
            sum[i] = sum[i - 1] + (long)beans[i - 1];
        }
        for(int i = 1;i <= n;i++){
            long x = (long) beans[i - 1];
            long t = sum[i - 1] + (sum[n] - sum[i] - (long)(n - i) * x);
            ans = Math.min(ans,t);
        }
        return ans;
    }
}
//leetcode 122
class Solution3 {
    public int maxProfit(int[] prices) {
        int tum=0;
        int sum=0;
        int foo=0;
        if(prices.length==1)
            return 0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]-prices[i-1]>0)
            {
                foo+=prices[i]-prices[i-1];
            }

        }



        return foo;
    }
}

