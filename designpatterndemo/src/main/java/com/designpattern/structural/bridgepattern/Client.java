package com.designpattern.structural.bridgepattern;
import com.designpattern.util.*;

class Client {  
    public static void main(String args[]) {  
        Image image;  
        ImageImp imp;  
        image = (Image)XMLUtil.getBean("image"); //通过传递的参数不同来判断反射生成的实例类。
        imp = (ImageImp)XMLUtil.getBean("os");  //通过传递的参数不同来判断反射生成的实例类。
        image.setImageImp(imp);  
        image.parseFile("小龙女");  
    }  
}  