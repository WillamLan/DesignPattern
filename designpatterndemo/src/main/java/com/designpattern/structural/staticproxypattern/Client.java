/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 上午11:22:22 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.staticproxypattern;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 上午11:22:22
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: 客户端类的主方法 <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-25 上午11:22:22
	 * @param args
	 */
	public static void main(String[] args) {
		CountImpl countImpl = new CountImpl();  
        CountProxy countProxy = new CountProxy(countImpl);  
        countProxy.updateCount();  
        countProxy.queryCount();
	}

}
