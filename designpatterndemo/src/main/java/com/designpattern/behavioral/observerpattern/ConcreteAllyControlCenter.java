/**  
 * 工程: designpatterndemo <br>
 * 标题: ConcreteAllyControlCenter.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午5:51:40 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.observerpattern;

/**
 * 类: ConcreteAllyControlCenter <br>
 * 描述: 具体战队控制中心类：具体目标类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午5:51:40
 */
class ConcreteAllyControlCenter extends AllyControlCenter {  
    public ConcreteAllyControlCenter(String allyName) {  
        System.out.println(allyName + "战队组建成功！");  
        System.out.println("----------------------------");  
        this.allyName = allyName;  
    }  
      
    //实现通知方法  
    public void notifyObserver(String name) {  
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");  
        //遍历观察者集合，调用每一个盟友（自己除外）的支援方法  
        for(Object obs : players) {  
            if (!((Observer)obs).getName().equalsIgnoreCase(name)) {  
                ((Observer)obs).help();  
            }  
        }         
    }  
}
