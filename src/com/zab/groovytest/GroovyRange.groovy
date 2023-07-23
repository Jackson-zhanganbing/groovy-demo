package com.zab.groovytest

//定义范围
def r = 2..5
println r.class

def r1 = 3..<8
println r1.size()

//范围的基本操作，实际上范围就是一个列表的实现
println r.contains(3)
println r.from
println r.to

//范围的遍历
for (i in r) {
    println i
}
r1.each {println it}

//范围的转换
def list = r.toList()