/**  
 * 工程: designpatterndemo <br>
 * 标题: RedVideoPhoneTemplate.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午9:32:55 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.templatepattern;

/**
 * 类: RedVideoPhoneTemplate <br>
 * 描述: 制作红色视频翻盖手机模板方法类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午9:32:55
 */
public class RedVideoPhoneTemplate extends MobilePhoneTemplate{

    //实现父类中的抽象的方法

    protected void makeColor() {

       System.out.println("给该手机的颜色涂成红色");

    }

    protected void makeFunction() {

       System.out.println("给该手机实现看MP4的功能");

    }

    protected void makeType() {

        System.out.println("给该手机制作成直板的");   

    }
}
