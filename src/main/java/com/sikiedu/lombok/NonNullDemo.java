package com.sikiedu.lombok;

import lombok.NonNull;

/**
 * @author jianggang
 * @date 2019/6/28 14:24:23
 * @description
 */
public class NonNullDemo {

    public static void main(String[] args) {
        test(null);
    }

    public static void test(@NonNull String name){

    }


//    public static void test(@NonNull String name) {
//        if (name == null) throw new NullPointerException("name is marked @NonNull but is null");
//    }
}
