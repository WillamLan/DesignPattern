/**  
 * 工程: designpatterndemo <br>
 * 标题: MovieTicket.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:29:31 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.strategypattern;

/**
 * 类: MovieTicket <br>
 * 描述: 电影票类：环境类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:29:31
 */
class MovieTicket {
	 private double price;  
	    private Discount discount; //维持一个对抽象折扣类的引用  
	  
	    public void setPrice(double price) {  
	        this.price = price;  
	    }  
	  
	    //注入一个折扣类对象  
	    public void setDiscount(Discount discount) {  
	        this.discount = discount;  
	    }  
	  
	    public double getPrice() {  
	        //调用折扣类的折扣价计算方法  
	        return discount.calculate(this.price);  
	    }  
}
