package com.zab.groovytest

//动态为Student添加方法
Student.metaClass.sayHello4 = {
    println "hello4"
}

//动态为Student添加静态方法
Student.metaClass.static.sayHello5 = {
    println "hello5"
}

//动态为Student添加属性
Student.metaClass.sex = "女"

def student = new Student("zhangsan", 18)

//调用动态添加的方法
student.sayHello4()
Student.sayHello5()
println student.sex

