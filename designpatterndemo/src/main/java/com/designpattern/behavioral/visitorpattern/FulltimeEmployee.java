/**  
 * 工程: designpatterndemo <br>
 * 标题: FulltimeEmployee.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:23:23 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.visitorpattern;

/**
 * 类: FulltimeEmployee <br>
 * 描述: 全职员工类：具体元素类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:23:23
 */
class FulltimeEmployee implements Employee{
	private String name;
	private double weeklyWage;
	private int workTime;

	public FulltimeEmployee(String name,double weeklyWage,int workTime)
	{
		this.name = name;
		this.weeklyWage = weeklyWage;
		this.workTime = workTime;
	}	

	public void setName(String name) 
    {
		this.name = name; 
	}

	public void setWeeklyWage(double weeklyWage) 
    {
		this.weeklyWage = weeklyWage; 
	}

	public void setWorkTime(int workTime) 
    {
		this.workTime = workTime; 
	}

	public String getName() 
    {
		return (this.name); 
	}

	public double getWeeklyWage() 
    {
		return (this.weeklyWage); 
	}

	public int getWorkTime() 
    {
		return (this.workTime); 
	}

	public void accept(Department handler)
    {
		handler.visit(this); //调用访问者的访问方法
	}
}
