import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_text9 {
}
class Solution813 {
    public double largestSumOfAverages(int[] nums, int k) {
        int n = nums.length;
        double[] prefix = new double[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        double[] dp = new double[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = prefix[i] / i;
        }
        for (int j = 2; j <= k; j++) {
            for (int i = n; i >= j; i--) {
                for (int x = j - 1; x < i; x++) {
                    dp[i] = Math.max(dp[i], dp[x] + (prefix[i] - prefix[x]) / (i - x));
                }
            }
        }
        return dp[n];
    }
}

class Solution849 {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length, ans = 0, last = -1;   // last记录上一个有人的位置
        for (int i = 0; i < n; ++i) {
            if (seats[i] == 1) {
                if (last != -1) ans = Math.max(ans, (i - last) / 2);    // 求d
                else ans = Math.max(ans, i);        // 出现了第一个有人的位置
                last = i;
            }
        }
        return Math.max(ans, n - 1 - last);         // 计算放在最后一个位置时的距离
    }
}
class Solution890{
    public List<String> findAndReplacePattern(String[] ws, String pe) {
        List<String> ans = new ArrayList<>();
        int[] map = new int[26], vis = new int[26];
        for (String s : ws) {
            Arrays.fill(map, -1);
            Arrays.fill(vis, 0);
            boolean ok = true;
            for (int i = 0; i < pe.length() && ok; i++) {
                int c1 = s.charAt(i) - 'a', c2 = pe.charAt(i) - 'a';
                if (map[c1] == -1 && vis[c2] == 0) {
                    map[c1] = c2; vis[c2] = 1;
                } else if (map[c1] != c2) ok = false;
            }
            if (ok) ans.add(s);
        }
        return ans;
    }
}

