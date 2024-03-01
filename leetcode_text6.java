import java.awt.*;
import java.util.Arrays;

//leetcode 817
class Solution817 {
    public int numComponents(ListNode817 head, int[] nums) {
        ListNode817 p=head;
        int[] n1=new int[10000];
        int[] n2=new int[10000];
        int k=0;
        while(p!=null){
            n1[k++]=p.val;
            p=p.next;
        }
        int cout=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<k;j++){
                if(nums[i]==n1[j]){
                    n2[j]=1;
                }

            }

        }
        for(int i=0;i<k;i++){
            if(i==0&&n2[i]==1){
                cout++;
            }
            else if(i!=0&&n2[i-1]==0&&n2[i]==1){
                cout++;
            }
        }
        return cout;
    }
}
//leetcode 860
class Solution860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}



class Solution826 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int N = difficulty.length;
        Point[] jobs = new Point[N];
        for (int i = 0; i < N; ++i)
            jobs[i] = new Point(difficulty[i], profit[i]);
        Arrays.sort(jobs, (a, b) -> a.x - b.x);
        Arrays.sort(worker);

        int ans = 0, i = 0, best = 0;
        for (int skill: worker) {
            while (i < N && skill >= jobs[i].x)
                best = Math.max(best, jobs[i++].y);
            ans += best;
        }

        return ans;
    }
}

