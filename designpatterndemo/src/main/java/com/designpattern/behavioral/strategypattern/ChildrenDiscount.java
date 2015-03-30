/**  
 * 工程: designpatterndemo <br>
 * 标题: ChildrenDiscount.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:31:43 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.strategypattern;

/**
 * 类: ChildrenDiscount <br>
 * 描述: 儿童票折扣类：具体策略类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:31:43
 */
public class ChildrenDiscount implements Discount{
	 public double calculate(double price) {  
	        System.out.println("儿童票：");  
	        return price - 10;  
	    }  
}
