package com.zab.groovytest

class Student {
    String name;
    Integer age;

    Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    Student(){

    }

    //方法的定义
    def sayHello(){
        println "hello ${name}"
    }
    //默认返回最后一行
    def sayHello2(param1, param2){
        "hello ${param1} ----- ${param2}"
    }

    //静态方法
    static def sayHello3(){
        println "hello static"
    }

    //默认方法，当调用方法不存在时，会调用该方法
    //有该方法就不会调用 invokeMethod
    def methodMissing(String name, args){
        println "method missing ${name}"
    }

    //invokeMethod的使用，当methodMissing方法不存在时，会调用该方法
    @Override
    def invokeMethod(String name, args){
        println "invokeMethod ${name}"
    }
}
