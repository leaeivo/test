public class leetcode_text12 {
}
class Solution2660 {
    public int isWinner(int[] player1, int[] player2) {
        int s1 = score(player1);
        int s2 = score(player2);
        return s1 == s2 ? 0 : s1 > s2 ? 1 : 2;
    }

    public int score(int[] player) {
        int res = 0;
        for (int i = 0; i < player.length; i++) {
            if ((i > 0 && player[i - 1] == 10) || (i > 1 && player[i - 2] >= 10)) {
                res += 2 * player[i];
            } else {
                res += player[i];
            }
        }
        return res;
    }
}

class Solution2749{
    public int makeTheIntegerZero(int num1, int num2) {
        for (long k = 1; k <= num1 - num2 * k; k++)
            if (k >= Long.bitCount(num1 - num2 * k))
                return (int) k;
        return -1;
    }
}
class Solution2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int num : hours) {
            if (num >= target) {
                count++;
            }
        }
        return count;
    }
}
