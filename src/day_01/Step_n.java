package day_01;

public class Step_n {
    /**
     * 斐波拉契数列
     * 跳台阶问题
     * 若可以跳1、2、3阶，则return cal(step-1)+cal(step-2)+cal(step-3)
     */
    private final static int i = 10;

    /**
     * 法一：递归，简单但性能差
     * @param step
     * @return
     */
    private static long cal(int step) {
        if (step <= 0) {
            return 0;
        }
        if (step == 1) {
            return 1;
        }
        if (step == 2) {
            return 2;
        }
        return cal(step - 1) + cal(step - 2);
    }


    public static void main(String args[]) {
        System.out.println("一共有" + cal(i) + "种方法");
    }
}
