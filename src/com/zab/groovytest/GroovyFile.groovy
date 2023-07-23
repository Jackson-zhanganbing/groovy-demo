package com.zab.groovytest

//读取文件
def file = new File("d://json.txt")
//方式一，readLines
def lines = file.readLines()
println lines

//方式二，eachLine
file.eachLine{
    println it
}
//方式三，getText
println file.getText()

//写入文件
def file2 = new File("d://json2.txt")
file2.write("hello world")

//定义一个方法，参数一是源文件，参数二是复制的文件，实现copy功能
def copyFile(String srcFileStr, String destFileStr){
    //如果目标文件不存在，则创建
    def destFile = new File(destFileStr)
    if(!destFile.exists()){
        destFile.createNewFile()
    }
    //读取源文件
    def srcFile = new File(srcFileStr)
    def lines = srcFile.readLines()
    //写入目标文件
    destFile.write(lines.join("\n"))
}

copyFile("d://json.txt", "d://json3.txt")

//读取文件部分
def file3 = new File("d://json.txt")
file3.withReader { reader ->
    char[] buffer = new char[9]
    reader.read(buffer, 0, 9)
    println buffer
}