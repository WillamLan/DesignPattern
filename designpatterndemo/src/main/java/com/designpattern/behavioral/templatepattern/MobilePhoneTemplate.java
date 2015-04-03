/**  
 * 工程: designpatterndemo <br>
 * 标题: AbstractTemplatemethod.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午9:08:51 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.templatepattern;

/**
 * 类: MobilePhoneTemplate <br>
 * 描述: 制作手机模板类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午9:08:51
 */
abstract class MobilePhoneTemplate {
	 //定义一个模板方法来控制生产手机的流程

    public void makeMobile(){//TemplateMethod

       //首先生产手机体（模板方法自己完成）

       System.out.println("生产了一个手机body");

       this.makeFunction();

       this.makeColor();

       this.makeType();

       System.out.println("一部手机制作完成");

       //以上模板已经规定好了

    }

    //定义抽象的方法来完成不同的生产细节(不同功能的手机)

    protected abstract void makeFunction();

    //定义抽象的方法来完成不同的生产细节(不同颜色的手机)

    protected abstract void makeColor();

    //定义抽象的方法来完成不同的生产细节(不同类型的手机)

    protected abstract void makeType();
}
