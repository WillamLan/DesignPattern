/**  
 * 工程: designpatterndemo <br>
 * 标题: EmployeeList.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:28:53 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.visitorpattern;

import java.util.ArrayList;

/**
 * 类: EmployeeList <br>
 * 描述: 员工列表类：对象结构 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:28:53
 */
class EmployeeList {
	// 定义一个集合用于存储员工对象
	private ArrayList<Employee> list = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		list.add(employee);
	}

	// 遍历访问员工集合中的每一个员工对象
	public void accept(Department handler) {
		for (Object obj : list) {
			((Employee) obj).accept(handler);
		}
	}
}
