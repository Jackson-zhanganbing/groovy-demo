package com.zab.groovytest

//本质上闭包就是一个代码块，可以把闭包理解为一个匿名函数
//闭包的定义
def closure = {
    println "hello closure"
}
//闭包的调用
closure()
closure.call()

//闭包的参数
def closure2 = {String name ->
    println "hello ${name}"
}
closure2("")
closure2.call("lisi")

def closure3 = {String name, int i ->
    println "hello ${name} ${i}"
}
closure3("lisi", 10)

//闭包的默认参数, it
def closure4 = {
    println "hello ${it}"
}
closure4("lisi")

//闭包的返回值
def closure5 = {
    return "hello closure"
}
println closure5()

//闭包的循环，直接点进去看源码
1.upto(10, closure4)
//这种写法也可以
1.upto(10){println it}

//从1加到100，闭包的循环
def sum = 0
1.upto(100, {sum += it})
println sum

//downto的使用
10.downto(1, {println it})

//times 的使用，指定次数循环
10.times({println it})

def s = "hello groovy 2023"
//each的使用
s.each({println it})
//find的使用
println s.find({it.isNumber()})
//findAll的使用
println s.findAll({it.isNumber()})
//any的使用
println s.any({it.isNumber()})
println s.any {it.isNumber()}
//every的使用
println s.every({it.isNumber()})
//collect的使用
println s.collect({it.toUpperCase()})

//闭包的参数：this,owner,delegate
//this:指向当前闭包
//owner:指向当前闭包所属的对象
//delegate:指向当前闭包所属的对象，但是可以被修改
def closure6 = {
    println "this: ${this}"
    println "owner: ${owner}"
    println "delegate: ${delegate}"
}
closure6()
//一般这三个参数都是一样的，只有当闭包中包含闭包的时候，不一样
/**
 * c1 this: com.zab.groovytest.GroovyClosure@162be91c
 * c1 owner: com.zab.groovytest.GroovyClosure@162be91c
 * c1 delegate: com.zab.groovytest.GroovyClosure@162be91c
 * c2 this:com.zab.groovytest.GroovyClosure@162be91c
 * c2 owner:com.zab.groovytest.GroovyClosure$_run_closure18@31e3250d
 * c2 delegate:xxx
 */
def c1 = {
    println "c1 this: ${this}"
    println "c1 owner: ${owner}"
    println "c1 delegate: ${delegate}"
    def c2 = {
        println "c2 this:"+ this
        println "c2 owner:"+ owner
        println "c2 delegate:"+ delegate
    }
    c2.delegate = "xxx"
    c2()
}
c1.call()


