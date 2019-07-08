package cn.enjoyedu.ch7.dcl;

/**
 * 饿汉式
 * 枚举
 */
public class SingleEHan {
    private SingleEHan(){}
//  静态私有变量
    private static SingleEHan singleDcl = new SingleEHan();

    public static SingleEHan getSingleDcl() {
        return singleDcl;
    }

}
