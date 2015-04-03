/**  
 * 工程: designpatterndemo <br>
 * 标题: FADepartment.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:26:24 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.visitorpattern;

/**
 * 类: FADepartment <br>
 * 描述: 财务部类：具体访问者类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:26:24
 */
public class FADepartment extends Department {
	// 实现财务部对全职员工的访问
	public void visit(FulltimeEmployee employee) {
		int workTime = employee.getWorkTime();
		double weekWage = employee.getWeeklyWage();
		if (workTime > 40) {
			weekWage = weekWage + (workTime - 40) * 100;
		} else if (workTime < 40) {
			weekWage = weekWage - (40 - workTime) * 80;
			if (weekWage < 0) {
				weekWage = 0;
			}
		}
		System.out.println("正式员工" + employee.getName() + "实际工资为：" + weekWage
				+ "元。");
	}

	// 实现财务部对兼职员工的访问
	public void visit(ParttimeEmployee employee) {
		int workTime = employee.getWorkTime();
		double hourWage = employee.getHourWage();
		System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime
				* hourWage + "元。");
	}
}