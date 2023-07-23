package com.zab.groovytest
//groovy的switch非常灵活
def a = 10

switch (a){
    case Integer:
        println "a is Integer"
        break
    case "abc":
        println "a is abc"
        break
    case [100,10]:
        println "a in 10,100"
        break
    case 1.1:
        println "a is 1.1"
        break
    case 1..100:
        println "a in 1-100"
        break
    default:
        println "a is nothing"
        break
}
//普通范围
println "--------普通范围循环--------"
for (i in 0..5) {
    println i
}
println "--------普通范围小于--------"
for (i in 0..<5) {
    println i
}
println "--------列表循环--------"
for (i in [10,20,30,40,50]) {
    println i
}
println "--------map循环--------"
for (i in [10:"hh",20:"jj",30:"kk"]) {
    println i
    println i.value
}

