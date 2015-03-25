/**  
 * 工程: designpatterndemo <br>
 * 标题: Decorator_first.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:49:53 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.decoratorpattern;

/**
 * 类: Decorator_first <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:49:53
 */
class Decorator_first extends Decorator {  
  
    public Decorator_first(Human human) {  
        super(human);  
    }  
  
    public void goHome() {  
        System.out.println("进房子。。");  
    }  
  
    public void findMap() {  
        System.out.println("书房找找Map。。");  
    }  
  
    @Override  
    public void wearClothes() {  
        super.wearClothes();  
        goHome();  
    }  
  
    @Override  
    public void walkToWhere() {  
        super.walkToWhere();  
        findMap();  
    }  
}  
  