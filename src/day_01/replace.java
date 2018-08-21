package day_01;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * String类是不可变类，任何对String的改变都 会引发新的String对象的生成；
 * StringBuffer则是可变类，任何对它所指代的字符串的改变都不会产生新的对象。
 * StringBuffer支持并发操作，线性安全的，适 合多线程中使用。StringBuilder
 * 不支持并发操作，线性不安全的，不适合多线程中使用。新引入的StringBuilder
 * 类不是线程安全的，但其在单线程中的性能比StringBuffer高。
 */
public class replace {
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        StringBuilder newStr=new StringBuilder() ;//不考虑线程安全问题，只考虑性能问题
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            } else {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
}
