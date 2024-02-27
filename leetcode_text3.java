import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode_text3 {
}
class Solution6 {
    public String entityParser(String text) {
        int len = text.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < len){
            char ch = text.charAt(i);
            if(ch == '&'){
                if(i + 4 <= len && text.substring(i,i + 4).equals("&gt;")){
                    sb.append(">");
                    i += 4;
                    continue;
                }else if(i + 4 <= len && text.substring(i,i + 4).equals("&lt;")){
                    sb.append("<");
                    i += 4;
                    continue;
                }else if(i + 5 <= len && text.substring(i,i + 5).equals("&amp;")){
                    sb.append("&");
                    i += 5;
                    continue;
                }else if(i + 6 <= len && text.substring(i,i + 6).equals("&quot;")){
                    sb.append("\"");
                    i += 6;
                    continue;
                }else if(i + 6 <= len && text.substring(i,i + 6).equals("&apos;")){
                    sb.append("'");
                    i += 6;
                    continue;
                }else if(i + 7 <= len && text.substring(i,i + 7).equals("&frasl;")){
                    sb.append("/");
                    i += 7;
                    continue;
                }
            }
            sb.append(ch);
            i++;
        }
        return sb.toString();
    }
}
class Solution9 {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        for(int i=1,f=nums[0];i<nums.length;++i){
            f=Math.max(f,0)+nums[i];
            ans=Math.max(ans,f);
        }
        return ans;

    }

}
class Solution10{
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] minCost = new int[m][n];    // minCost[i][j]表示从(i, j) 到最后一行的最小路径代价
        for (int[] row : minCost) Arrays.fill(row, Integer.MAX_VALUE);    // 初始都为极大值
        for (int j = 0; j < n; j++) {
            // 最后一行的单元格到达最后一行的最小路径代价为单元格的值本身
            minCost[m - 1][j] = grid[m - 1][j];
        }
        for (int i = m - 2; i >= 0; i--) {    // 从倒数第二行开始进行动态规划
            for (int j = 0; j < n; j++) {
                int value = grid[i][j];
                for (int k = 0; k < n; k++) {
                    // (i,j)经过(i+1, k)到达最后一行的最小代价 = (i,j)到(i+1,k)的代价 + (i+1,k)到最后一行的最小代价
                    // (i,j)到最后一行的最小代价 为 所有k情况的最小值
                    minCost[i][j] = Math.min(minCost[i][j], value + moveCost[value][k] + minCost[i + 1][k]);
                }
            }
        }
        int ans = minCost[0][0];
        for (int j = 1; j < n; j++) {
            ans = Math.min(ans, minCost[0][j]);
        }
        // 最终的最小路径代价取首行最小路径代价的最小值
        return ans;
    }
}
//leetcode 2809
/*
*题干
*给你两个长度相等下标从 0 开始的整数数组 nums1 和 nums2 。每一秒，对于所有下标 0 <= i < nums1.length ，nums1[i] 的值都增加 nums2[i] 。
* 操作 完成后 ，你可以进行如下操作：
* 选择任一满足 0 <= i < nums1.length 的下标 i ，并使 nums1[i] = 0 。
* 同时给你一个整数 x
* 请你返回使 nums1 中所有元素之和 小于等于 x 所需要的 最少 时间，如果无法实现，那么返回 -1 。
* */
class Solution11 {
    public int minimumTime(List<Integer> nums1, List<Integer> nums2, int x) {
        int n = nums1.size(), s1 = 0, s2 = 0;
        int[] dp = new int[n + 1];
        List<List<Integer>> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = nums1.get(i), b = nums2.get(i);
            nums.add(Arrays.asList(b, a));
            s1 += a;
            s2 += b;
        }
        Collections.sort(nums, (o1, o2) -> Integer.compare(o1.get(0), o2.get(0)));

        for (int j = 1; j <= n; ++j) {
            int b = nums.get(j - 1).get(0), a = nums.get(j - 1).get(1);
            for (int i = j; i > 0; --i) {
                dp[i] = Math.max(dp[i], dp[i - 1] + i * b + a);
            }
        }
        for (int i = 0; i <= n; i++) {
            if (s2 * i + s1 - dp[i] <= x) {
                return i;
            }
        }
        return -1;
    }
}


