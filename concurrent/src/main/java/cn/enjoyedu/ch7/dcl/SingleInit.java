package cn.enjoyedu.ch7.dcl;

/**
 * 懒汉式-延迟初始化占位类模式
 */

// 通过虚拟机的类加载-线程安全； 没有使用任何锁机制！！！
public class SingleInit {
    private SingleInit(){}

    private static class InstanceHolder{
        private static SingleInit instance = new SingleInit();
    }

    public static SingleInit getInstance(){
        return InstanceHolder.instance;
    }

}
