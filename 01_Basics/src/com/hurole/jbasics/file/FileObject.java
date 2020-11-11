package com.hurole.jbasics.file;

import java.io.File;
import java.io.IOException;

public class FileObject {
    public static void main(String[] args) throws IOException {
        File file = new File(".\\book");

        System.out.println(file);
//        返回构造方法中传入的路径
        System.out.println("构造方法传入路径" + file.getPath());
//      返回绝对路径
        System.out.println("绝对路径" + file.getAbsolutePath());
//      返回规范后的路径 （规范路径会把 . 和 ..转换成标准路径）
        System.out.println("规范路径" + file.getCanonicalPath());
//      判断file对象是不是已存在的文件
        System.out.println("是否为文件：" + file.isFile());
//      判断FIle对象是不是已存在的目录
        System.out.println("是否为目录：" + file.isDirectory());
//      文件大小
        System.out.println("文件大小（字节Byte）：" + file.length());
//      文件权限 读 写
        System.out.println("读：" + file.canRead());
        System.out.println("写：" + file.canWrite());
        System.out.println("执行：" + file.canExecute());
//      创建文件
        File file2 = new File(".\\phone.txt");
        Boolean res = file2.createNewFile();
        if (res) {
            System.out.println("创建文件phone.txt成功");
        } else {
            if (file2.isFile()) {
                System.out.println("创建文件phone.txt失败。原因：文件已存在");
            } else {
                System.out.println("创建文件phone.txt失败");
            }
        }
//      删除文件
        if(file2.delete()){
            System.out.println("删除文件phone.txt成功");
        }else{
            System.out.println("删除文件phone.txt失败");
        }
    }
}
