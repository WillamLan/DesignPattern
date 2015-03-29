/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:22:09 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.observerpattern;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:22:09
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-29 下午6:22:09
	 * @param args
	 */
	public static void main(String[] args) {
		//定义观察目标对象  
		AllyControlCenter acc;  
		        acc = new ConcreteAllyControlCenter("金庸群侠");  
		          
		        //定义四个观察者对象  
		        Observer player1,player2,player3,player4;  
		          
		        player1 = new Player("杨过");  
		        acc.join(player1);  
		          
		        player2 = new Player("令狐冲");  
		        acc.join(player2);  
		          
		        player3 = new Player("张无忌");  
		        acc.join(player3);  
		          
		        player4 = new Player("段誉");  
		        acc.join(player4);  
		          
		        //某成员遭受攻击  
		        player1.beAttacked(acc);  
	}

}
