/**  
 * 工程: designpatterndemo <br>
 * 标题: StudentDiscount.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:31:06 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.strategypattern;

/**
 * 类: StudentDiscount <br>
 * 描述: 学生票折扣类：具体策略类 (注：要工具包中的XMLUtil类访问到需要设置权限为：public 而不是使用默认的只有包类成员才能访问的权限） <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午7:31:06
 */
public class StudentDiscount implements Discount{
	public double calculate(double price) {  
        System.out.println("学生票：");  
        return price * 0.8;  
    }  
}
