package com.sikiedu.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author jianggang
 * @date 2019/6/28 15:27:46
 * @description
 */
@ToString
@Builder
public class BuilderDemo {

    private String name;

    private Integer age;

//    public static BuilderDemoBuilder builder() {
//        return new BuilderDemoBuilder();
//    }
//
//    BuilderDemo(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public static class BuilderDemoBuilder {
//        private String name;
//
//        public BuilderDemoBuilder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        private Integer age;
//
//        public BuilderDemoBuilder age(Integer age) {
//            this.age = age;
//            return this;
//        }
//
//        public BuilderDemo build() {
//            return new BuilderDemo(this.name, this.age);
//        }
//
//        @Override
//        public String toString() {
//            return "BuilderDemo.BuilderDemoBuilder(name=" + this.name + ", age=" + this.age + ")";
//        }
//    }
}

class test{
    public static void main(String[] args) {
        BuilderDemo test = BuilderDemo.builder()
                .name("test")
                .build();
        System.out.println(test);
    }
}


