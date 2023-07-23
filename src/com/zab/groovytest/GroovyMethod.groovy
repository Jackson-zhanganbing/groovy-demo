package com.zab.groovytest

//方法定义
def sayHello(){
    println "hello world"
}
//方法调用
sayHello()
//有参方法定义
def sayHello2(String name, int age){
    println "hello ${name} ---- ${age}"
}
//有参方法调用，如果方法只有一个参数，可以省略括号
sayHello2("zhangsan", 10)
sayHello2 "lisi", 20

//如果方法参数是闭包
def sayHello3(GroovyClosure c){
    println "hello closure"
}
sayHello3({ String name -> println name} as GroovyClosure)


