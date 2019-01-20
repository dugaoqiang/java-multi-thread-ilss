package io.ilss.part7.thread_group_2;

/**
 * className MyThreadGroup
 * description MyThreadGroup
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 19:11
 */
public class MyThreadGroup extends ThreadGroup {

    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        this.interrupt();
    }
}
