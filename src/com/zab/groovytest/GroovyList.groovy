package com.zab.groovytest

//定义集合
def list = [1,2,3,4,5]
println list.class
println list.size()

//定义数组
def array = [1,2,3,4,5] as int[]
println array.class
println array.size()

//列表的使用
//添加元素
list.add(6)
println list
list.leftShift(7)
println list
list << 8
println list
def newList = list + 9
println newList

//按照索引删除元素
newList.remove(0)
println newList

//按照元素删除元素
newList.remove((Object)8)
println newList
newList.removeElement(4)
println newList

//按照条件删除元素
newList.removeAll({it % 2 == 0})
newList.removeIf({it > 5})
println newList
def newList1 = newList - [3, 5]
println newList1

//排序
newList = [1,-3,5,2,-4]
newList.sort()
println newList
//按照绝对值排序
newList.sort({Math.abs(it)})
println newList
//按照长度排序
def listStr = ["abc","ddef","12f3","45ddd6"]
listStr.sort({it.length()})
println listStr

//查找
println newList.findAll({it > 0})
println newList.find({it > 0})
//判断是否存在
println newList.any({it > 0})
//判断是否全部满足
println newList.every({it > 0})
//统计
println newList.count({it > 0})