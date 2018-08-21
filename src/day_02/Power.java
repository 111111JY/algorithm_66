package day_02;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 */
public class Power {
    public double Power(double base, int exponent) {
        if (exponent > 0) {
            if (exponent == 1)
                return base;
            if (exponent % 2 == 0)
                return Power(base, exponent / 2) * Power(base, exponent / 2);
            else
                return Power(base, exponent / 2) * Power(base, exponent / 2 + 1);
        } else if (exponent == 0) {
            return 1;
        } else {
            return 1 / Power(base, 0 - exponent);
        }
    }
}
