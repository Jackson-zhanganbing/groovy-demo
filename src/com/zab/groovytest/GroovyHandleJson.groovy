package com.zab.groovytest

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

//将json字符串转换为对象
def str = '{"name":"zhangsan", "age":18}'
def student = new JsonSlurper().parseText(str)
println student

//将对象转换为json字符串
def stu = new Student("lisi", 20)
println JsonOutput.prettyPrint(JsonOutput.toJson(stu))