package com.yl.pattern.singleton;

/**
 * @description 单例模式
 *
 * @version v1.1.0
 * @author yanglun
 * @date  2019/6/20 20:15
 * Modification History:
 *   Date           Author          Version            Description
 *-------------------------------------------------------------
 *    2019/6/20      yanglun            v1.0.0              修改原因
 */
public class Singleton {

    private static Singleton singleton;
    private static Boolean lock;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton != null) {
            synchronized (lock) {
                if (Boolean.FALSE.equals(lock)) {
                    singleton = new Singleton();
                    lock = Boolean.TRUE;
                }
            }
        }
        return singleton;
    }

    static {
        lock = Boolean.FALSE;
    }

    public static void main(String[] args) {
        getInstance();//
    }
}
