/**  
 * 工程: designpatterndemo <br>
 * 标题: HRDepartment.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:27:53 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.visitorpattern;

/**
 * 类: HRDepartment <br>
 * 描述: 人力资源部类：具体访问者类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:27:53
 */
public class HRDepartment extends Department {
	// 实现人力资源部对全职员工的访问
	public void visit(FulltimeEmployee employee) {
		int workTime = employee.getWorkTime();
		System.out.println("正式员工" + employee.getName() + "实际工作时间为：" + workTime
				+ "小时。");
		if (workTime > 40) {
			System.out.println("正式员工" + employee.getName() + "加班时间为："
					+ (workTime - 40) + "小时。");
		} else if (workTime < 40) {
			System.out.println("正式员工" + employee.getName() + "请假时间为："
					+ (40 - workTime) + "小时。");
		}
	}

	// 实现人力资源部对兼职员工的访问
	public void visit(ParttimeEmployee employee) {
		int workTime = employee.getWorkTime();
		System.out.println("临时工" + employee.getName() + "实际工作时间为：" + workTime
				+ "小时。");
	}
}
