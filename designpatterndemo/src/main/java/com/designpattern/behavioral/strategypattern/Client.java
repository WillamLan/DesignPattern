/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:36:18 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.strategypattern;

import com.designpattern.util.XMLUtil;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:36:18
 */
class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-29 下午7:36:18
	 * @param args
	 */
	public static void main(String[] args) {
		 MovieTicket mt = new MovieTicket();  
	        double originalPrice = 60.0;  
	        double currentPrice;  
	          
	        mt.setPrice(originalPrice);  
	        System.out.println("原始价为：" + originalPrice);  
	        System.out.println("---------------------------------");  
	              
	        Discount discount;  
	        discount = (Discount)XMLUtil.getBean("bs"); //读取配置文件并反射生成具体折扣对象  
	        mt.setDiscount(discount); //注入折扣对象  
	          
	        currentPrice = mt.getPrice();  
	        System.out.println("折后价为：" + currentPrice);  
	    }  
	}

