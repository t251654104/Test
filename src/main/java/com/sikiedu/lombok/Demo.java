package com.sikiedu.lombok;

import lombok.val;
import lombok.var;


import java.util.ArrayList;

/**
 * @author jianggang
 * @date 2019/6/28 14:09:26
 * @description
 */


public class Demo {

//    private val a = "";

    public static void main(String[] args) {
        val testVal = new ArrayList<String>();
        testVal.add("hello");
        System.out.println(testVal);
        var testVar = new ArrayList<String>();
        testVar.add("Hello");
        System.out.println(testVar);
        Model model = new Model();
        model.getAge();
        model.setAge(1);
//        for(val i = 0 ; i< 10 ; i ++){
//
//        }
    }

//    public static void test(val a){
//
//    }
}
