package com.zab.groovytest

//定义类的方法
//无参构造
def zhangsan = new Student(name: "zhangsan", age: 10)
def lisi = new Student(name: "lisi")

//有参构造
def wangwu = new Student("wangwu", 20)
def zhaoliu = [name: "zhaoliu", age: 30] as Student
Student tianqi = ["tianqi", 20]

//属性的取值
println "名字：${zhangsan.name}, 年龄：${zhangsan.age}"
println "名字：${zhangsan.getName()}, 年龄：${zhangsan.getAge()}"

tianqi.sayHelloo()

