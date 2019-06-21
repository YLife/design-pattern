package com.yl.pattern.templateMethod;

public class TaskProcessImpl extends AbstractProcessImpl {

    @Override
    protected void doSomething() {
        System.out.println("do something...");
    }

    public static void main(String[] args) throws Exception {
        TaskProcessImpl taskProcess = new TaskProcessImpl();
        taskProcess.process();
    }
}
