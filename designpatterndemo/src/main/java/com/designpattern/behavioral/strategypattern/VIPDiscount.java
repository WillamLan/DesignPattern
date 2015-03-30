/**  
 * 工程: designpatterndemo <br>
 * 标题: VIPDiscount.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:32:13 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.strategypattern;

/**
 * 类: VIPDiscount <br>
 * 描述: VIP会员票折扣类：具体策略类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:32:13
 */
public class VIPDiscount implements Discount{
	public double calculate(double price) {  
        System.out.println("VIP票：");  
        System.out.println("增加积分！");  
        return price * 0.5;  
    }  
}
