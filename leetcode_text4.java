import java.util.Arrays;

public class leetcode_text4 {
}
//leetcode 1671
class Solution1671 {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] dpIncrease = new int[n];
        int[] dpDecrease = new int[n];
        Arrays.fill(dpIncrease, 1);
        Arrays.fill(dpDecrease, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dpIncrease[i] = Math.max(dpIncrease[i], dpIncrease[j] + 1);
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[i] > nums[j]) {
                    dpDecrease[i] = Math.max(dpDecrease[i], dpDecrease[j] + 1);
                }
            }
        }
        int minRemovals = n;
        for (int i = 1; i < n - 1; i++) {
            if (dpIncrease[i] > 1 && dpDecrease[i] > 1) {
                int mountainLength = dpIncrease[i] + dpDecrease[i] - 1;
                int removals = n - mountainLength;
                minRemovals = Math.min(minRemovals, removals);
            }
        }
        return minRemovals;
    }
}

//leetcode 274
class Solution274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0, i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }
}

//leetcode 1334
class Solution1334 {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[] ans = {Integer.MAX_VALUE / 2, -1};
        int[][] dis = new int[n][n];
        boolean[][] vis = new boolean[n][n];
        int[][] mp = new int[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(dis[i], Integer.MAX_VALUE / 2);
            Arrays.fill(mp[i], Integer.MAX_VALUE / 2);
        }
        for (int[] eg : edges) {
            int from = eg[0], to = eg[1], weight = eg[2];
            mp[from][to] = mp[to][from] = weight;
        }
        for (int i = 0; i < n; ++i) {
            dis[i][i] = 0;
            for (int j = 0; j < n; ++j) {
                int t = -1;
                for (int k = 0; k < n; ++k) {
                    if (!vis[i][k] && (t == -1 || dis[i][k] < dis[i][t])) {
                        t = k;
                    }
                }
                for (int k = 0; k < n; ++k) {
                    dis[i][k] = Math.min(dis[i][k], dis[i][t] + mp[t][k]);
                }
                vis[i][t] = true;
            }
        }
        for (int i = 0; i < n; ++i) {
            int cnt = 0;
            for (int j = 0; j < n; ++j) {
                if (dis[i][j] <= distanceThreshold) {
                    cnt++;
                }
            }
            if (cnt <= ans[0]) {
                ans[0] = cnt;
                ans[1] = i;
            }
        }
        return ans[1];
    }
}
