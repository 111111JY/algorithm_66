package day_02;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */

public class NumberOf1 {

    /**
     * 法一：用一位和做减一，与运算，性能高，但不好理解
     * @param n
     * @return
     */
    public int NumberOf1(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }

    /**
     * 法二：将整型转化为二进制字符数组，再for循环遍历字符数组
     * @param n
     * @return
     */
    public int NumberOf1_m2(int n){
        char []Number1=Integer.toBinaryString(n).toCharArray();
        int t=0;
        for(int i=0;i<Number1.length;i++){
            if (Number1[i]=='1'){   //"1"是String型，'1'是Char型
                t++;
            }
        }
        return t;
    }
}
