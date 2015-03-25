/**  
 * 工程: designpatterndemo <br>
 * 标题: Person.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:55:37 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.decoratorpattern;

/**
 * 类: Person <br>
 * 描述: 定义被装饰者，被装饰者初始状态有些自己的装饰 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:55:37
 */
class Person implements Human {  
  
    public void wearClothes() {  
        System.out.println("穿什么呢...");  
    }  
  
    public void walkToWhere() {  
        System.out.println("去哪里呢...");  
    }  
}  
