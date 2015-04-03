/**  
 * 工程: designpatterndemo <br>
 * 标题: Employee.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:22:35 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.visitorpattern;

/**
 * 类: Employee <br>
 * 描述: 员工类：抽象元素类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:22:35
 */
interface Employee {
	public void accept(Department handler); //接受一个抽象访问者访问
}
