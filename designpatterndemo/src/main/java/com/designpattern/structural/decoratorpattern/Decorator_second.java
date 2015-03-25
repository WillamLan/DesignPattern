/**  
 * 工程: designpatterndemo <br>
 * 标题: Decorator_second.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:51:40 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.decoratorpattern;

/**
 * 类: Decorator_second <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:51:40
 */
class Decorator_second extends Decorator {  
  
    public Decorator_second(Human human) {  
        super(human);  
    }  
  
    public void goClothespress() {  
        System.out.println("去衣柜找找看。。");  
    }  
  
    public void findPlaceOnMap() {  
        System.out.println("在Map上找找。。");  
    }  
  
    @Override  
    public void wearClothes() {  
        super.wearClothes();  
        goClothespress();  
    }  
  
    @Override  
    public void walkToWhere() {  
        super.walkToWhere();  
        findPlaceOnMap();  
    }  
}  
