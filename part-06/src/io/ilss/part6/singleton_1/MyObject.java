package io.ilss.part6.singleton_1;

/**
 * className MyObject
 * description MyObject
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:28
 */

public class MyObject {
    private static MyObject object;

    public static MyObject getInstance() {
        if (null == object) {
            object = new MyObject();
        }
        return object;
    }
}

