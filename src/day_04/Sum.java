package day_04;


/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等
 * 关键字及条件判断语句（A?B:C）。
 * <p>
 * 解题思路：
 * 1.需利用逻辑与的短路特性实现递归终止。
 * 2.当n==0时，(n>0)&&((sum+=Sum_Solution(n-1))>0)只执行前面的判断，为false，然后直接返回0；
 * 3.当n>0时，执行sum+=Sum_Solution(n-1)，实现递归计算Sum_Solution(n)。
 */
public class Sum {
    /**
     * 法一
     *
     * @param n
     * @return
     */
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }

    /**
     * 法二
     */
    public int Sum_Solution_m2(int n) {
        int sum = (int) (Math.pow(n, 2) + n);
        return sum >> 1;
    }
    /**
     * 法二计算验证
     * n=3;3^3+3=12
     * 0000 1100=12
     * 右移1位
     * 0000 0110=6
     * n=2;2^2+2=6
     * 0000 0110=6
     * 右移1位
     * 0000 0011=3
     */
}
