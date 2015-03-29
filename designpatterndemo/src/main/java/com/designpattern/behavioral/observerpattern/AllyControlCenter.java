/**  
 * 工程: designpatterndemo <br>
 * 标题: AllyControlCenter.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午5:50:51 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.observerpattern;

import java.util.ArrayList;

/**
 * 类: AllyControlCenter <br>
 * 描述: 战队控制中心类：目标类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午5:50:51
 */
abstract class AllyControlCenter {
	protected String allyName; //战队名称  
    protected ArrayList<Observer> players = new ArrayList<Observer>(); //定义一个集合用于存储战队成员  
      
    public void setAllyName(String allyName) {  
        this.allyName = allyName;  
    }  
      
    public String getAllyName() {  
        return this.allyName;  
    }  
      
    //注册方法  
    public void join(Observer obs) {  
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");  
        players.add(obs);  
    }  
      
    //注销方法  
    public void quit(Observer obs) {  
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");  
        players.remove(obs);  
    }  
      
    //声明抽象通知方法  
    public abstract void notifyObserver(String name);  
}
