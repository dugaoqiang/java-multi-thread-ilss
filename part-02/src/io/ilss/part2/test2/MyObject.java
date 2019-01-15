package io.ilss.part2.test2;

/**
 * className MyObject
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:30
 */
public class MyObject {
    synchronized public void speedPrintString() {
        System.out.println("speedPrintString __getLock time = " + System.currentTimeMillis() + " Run thread name " + Thread.currentThread().getName());
        System.out.println("------------------------------------------------");
        System.out.println("speedPrintString releaseLock time = " + System.currentTimeMillis() + " Run thread name " + Thread.currentThread().getName());

    }
}
