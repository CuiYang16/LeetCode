package easy;

/**
 * @author ：cuiyang
 * @description：左旋转字符串
 *              字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 *              请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * @date ：Created in 2020/3/29 11:29
 */
public class SolutionReverseLeftWords {

    public String reverseLeftWords(String s, int n) {

        String substring = s.substring(0, n);
        String substring1 = s.substring(n);
        return substring1+substring;
    }
}
