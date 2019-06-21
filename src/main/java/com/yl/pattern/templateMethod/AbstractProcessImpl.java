package com.yl.pattern.templateMethod;

/**
 * @description 模板方法模式
 *  场景：模拟一个流程处理前、中、后场景
 * @version v1.1.0
 * @author yanglun
 * @date  2019/6/20 20:26
 * Modification History:
 *   Date           Author          Version            Description
 *-------------------------------------------------------------
 *    2019/6/20      yanglun            v1.0.0              修改原因
 */
public abstract class AbstractProcessImpl implements IProcess {

    @Override
    public Object process() throws Exception {
        doBefore();
        doSomething();
        doHook();
        return new Object();// 此处只做模拟
    }

    // 前置强校验
    protected void doBefore(){
        System.out.println("do before...");
    }

    // 业务逻辑处理
    protected abstract void doSomething();

    // 钩子，做后置增强
    protected void doHook(){
        // 供子类扩展
        System.out.println("wait sub class extend...");
    }

}
