/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:52:08 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.statepattern;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:52:08
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-29 下午6:52:08
	 * @param args
	 */
	public static void main(String[] args) {
		 Account acc = new Account("曹胜兰",0.0);  
	        acc.deposit(1000);  
	        acc.withdraw(2000);  
	        acc.deposit(3000);  
	        acc.withdraw(4000);  
	        acc.withdraw(1000);  
	        acc.computeInterest();  
	}

}
