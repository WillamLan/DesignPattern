/**  
 * 工程: designpatterndemo <br>
 * 标题: Observer.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午5:49:13 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.observerpattern;

/**
 * 类: Observer <br>
 * 描述: 抽象观察类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午5:49:13
 */
interface Observer {
	public String getName();  
    public void setName(String name);  
    public void help(); //声明支援盟友方法  
    public void beAttacked(AllyControlCenter acc); //声明遭受攻击方法
}
