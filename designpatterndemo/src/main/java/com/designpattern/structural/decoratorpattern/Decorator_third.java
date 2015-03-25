/**  
 * 工程: designpatterndemo <br>
 * 标题: Decorator_third.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:53:42 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.decoratorpattern;

/**
 * 类: Decorator_third <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:53:42
 */
class Decorator_third extends Decorator {  
  
    public Decorator_third(Human human) {  
        super(human);  
    }  
  
    public void findClothes() {  
        System.out.println("找到一件D&G。。");  
    }  
  
    public void findTheTarget() {  
        System.out.println("在Map上找到神秘花园和城堡。。");  
    }  
  
    @Override  
    public void wearClothes() {  
        super.wearClothes();  
        findClothes();  
    }  
  
    @Override  
    public void walkToWhere() {  
        super.walkToWhere();  
        findTheTarget();  
    }  
}  
