/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:30:12 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.visitorpattern;

import com.designpattern.util.XMLUtil;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:30:12
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-30 下午10:30:12
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeList list = new EmployeeList();
		Employee fte1,fte2,fte3,pte1,pte2;

		fte1 = new FulltimeEmployee("张无忌",3200.00,45);
		fte2 = new FulltimeEmployee("杨过",2000.00,40);
		fte3 = new FulltimeEmployee("段誉",2400.00,38);
		pte1 = new ParttimeEmployee("洪七公",80.00,20);
		pte2 = new ParttimeEmployee("郭靖",60.00,18);

		list.addEmployee(fte1);
		list.addEmployee(fte2);
		list.addEmployee(fte3);
		list.addEmployee(pte1);
		list.addEmployee(pte2);

		Department dep;
		dep = (Department)XMLUtil.getBean("HR");
		list.accept(dep);
	}

}
