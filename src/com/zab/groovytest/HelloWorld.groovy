package com.zab.groovytest

int a = 111
println a.class

double b = 1.1
println b.class

def c = 200
println c.class
//弱类型定义，后续可更改类型
def d = 1.122
println d.class
d = 1
println d.class

//单引号定义字符串，格式需要自己用转义字符定义
def s1 = 'za\nb1'
println s1
println s1.class

//双引号定义字符串，用于可扩展字符串
def s2 = "zab2"
def s22 = "zab2${s2}"
def s222 = "zab2${100+100}"
println s2
println s2.class
println s22.class
println s222.class

//三引号定义字符串，格式直接换行都行，加个反斜杠输出就和实际一致，不加会多一个空行
def s3 = '''\
za
b3'''
println s3
println s3.class

def s4 = "higroovy"
println s4.center(12)

println s4.center(12, 'ab')
println s4.padRight(11, 'ab')
println s4.reverse()
//首字母大写
println s4.capitalize()
def s5 = "123"
//转换类型
println s5.toInteger().class

//截取
def s6 = "groovy"
println s6[2]
println s6[2..5]

//字符串减法
def s7 = "groovyhello"
println s7.minus("hello")
println s7 - "groovy"

