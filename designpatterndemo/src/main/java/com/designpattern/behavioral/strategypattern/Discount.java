/**  
 * 工程: designpatterndemo <br>
 * 标题: Discount.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:30:14 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.strategypattern;

/**
 * 类: Discount <br>
 * 描述: 折扣类：抽象策略类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:30:14
 */
interface Discount {
	 public double calculate(double price);  
}
