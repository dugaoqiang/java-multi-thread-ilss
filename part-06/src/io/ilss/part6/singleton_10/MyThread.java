package io.ilss.part6.singleton_10;

/**
 * className MyThread
 * description MyThread
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:26
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getConnection().hashCode());
        }
    }
}
