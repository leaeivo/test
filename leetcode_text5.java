public class leetcode_text5 {
        }
//leetcode LCR 074
class Solution_LCR_074 {
        public TreeNode074 pruneTree(TreeNode074 root) {
                if(root==null){
                        return null;
                }
                root.left=pruneTree(root.left);
                root.right=pruneTree(root.right);
                if(root.right==null&&root.left==null&&root.val==0){
                        return null;

                }
                return root;
        }
}
//leetcode 2586
class Solution2658 {
        private final static int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        private int[][] grid;

        public int findMaxFish(int[][] grid) {
                this.grid = grid;
                int m = grid.length, n = grid[0].length, ans = 0;
                for (int i = 0; i < m; ++i)
                        for (int j = 0; j < n; ++j)
                                ans = Math.max(ans, dfs(i, j));
                return ans;
        }

        private int dfs(int x, int y) {
                int m = grid.length, n = grid[0].length;
                if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0)
                        return 0;
                int sum = grid[x][y];
                grid[x][y] = 0; // 标记成访问过
                for (var d : DIRS) // 四方向移动
                        sum += dfs(x + d[0], y + d[1]);
                return sum;
        }
}
//leetcode 2672
class Solution2672 {
        public int[] colorTheArray(int n, int[][] queries) {
                int q = queries.length, cnt = 0;
                int[] ans = new int[q], a = new int[n + 2]; // 避免讨论下标出界的情况
                for (int qi = 0; qi < q; qi++) {
                        int i = queries[qi][0] + 1, c = queries[qi][1]; // 下标改成从 1 开始
                        if (a[i] > 0)
                                cnt -= (a[i] == a[i - 1] ? 1 : 0) + (a[i] == a[i + 1] ? 1 : 0);
                        a[i] = c;
                        cnt += (a[i] == a[i - 1] ? 1 : 0) + (a[i] == a[i + 1] ? 1 : 0);
                        ans[qi] = cnt;
                }
                return ans;
        }
}

