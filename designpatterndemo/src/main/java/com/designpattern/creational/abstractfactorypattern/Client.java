package com.designpattern.creational.abstractfactorypattern;
import com.designpattern.util.*;

class Client {  
    public static void main(String args[]) {  
        //使用抽象层定义  
        SkinFactory factory;  
        Button bt;  
        TextField tf;  
        ComboBox cb;  
        factory = (SkinFactory)XMLUtil.getBean("ssf");  
        bt = factory.createButton();  
        tf = factory.createTextField();  
        cb = factory.createComboBox();  
        bt.display();  
        tf.display();  
        cb.display();  
    }  
}  
