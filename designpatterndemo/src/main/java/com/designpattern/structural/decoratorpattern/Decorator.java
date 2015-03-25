/**  
 * 工程: designpatterndemo <br>
 * 标题: Decorator.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:46:25 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.decoratorpattern;

/**
 * 类: Decorator <br>
 * 描述: 定义装饰者  <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:46:25
 */
abstract class Decorator implements Human {  
    private Human human;  
  
    public Decorator(Human human) {  
        this.human = human;  
    }  
  
    public void wearClothes() {  
        human.wearClothes();  
    }  
  
    public void walkToWhere() {  
        human.walkToWhere();  
    }  
}  
