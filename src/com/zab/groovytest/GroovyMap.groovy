package com.zab.groovytest
//定义map
def map = ['张三':18, '李四':20, '王五':22]
println map.class
println map

//添加元素
map.put('赵六', 24)
println map
map['田七'] = 26
println map
map.'newMap' = ['x':1, 'y':2]
println map
//map单引号可以不写
def map2 = [张三:18, 李四:20, 王五:22]
println map2
println map2.getClass()


//遍历map
println "--------遍历map--------"
for (i in map2) {
    println i
    println i.key
    println i.value
}
map2.each{
    println it
    println it.key
    println it.value
}
//带下标的遍历
println "--------带下标的遍历--------"
map2.eachWithIndex{ key,value,index ->
    println key
    println value
    println index
}

//查找map3
println "--------查找map3--------"
def map3 = [
        张三:['score':88,'sex':'男'],
        李四:['score':78,'sex':'女'],
        王五:['score':68,'sex':'女'],
        赵六:['score':58,'sex':'男']
]
//查找score大于60的
println map3.findAll{it.value.score > 60}
println map3.find{it.value.score > 60}
//查找score大于60的，sex为女的数量
println map3.count{it.value.score > 60 && it.value.sex == '女'}
//分组，低于60分的为不及格，60-80为中等，80以上为优秀
println map3.groupBy{
    if (it.value.score < 60) {
        '不及格'
    } else if (it.value.score < 80) {
        '中等'
    } else {
        '优秀'
    }
}
//排序，按照成绩从高到低
println map3.sort{it.value.score}
//排序，按照成绩从低到高
println map3.sort{it.value.score}.reverse()
