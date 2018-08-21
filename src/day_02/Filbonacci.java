package day_02;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */

public class Filbonacci {

    /**
     * 不要用递归；性能低
     * 用循环性能高
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        int num0=0;
        int num1=1;
        int result=0;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        for(int i=2;i<=n;i++){
            result=num0+num1;
            num0=num1;
            num1=result;
        }
        return result;
    }
}
