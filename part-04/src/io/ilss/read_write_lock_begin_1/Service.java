package io.ilss.read_write_lock_begin_1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:35
 */
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁" + Thread.currentThread().getName()
                        + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
