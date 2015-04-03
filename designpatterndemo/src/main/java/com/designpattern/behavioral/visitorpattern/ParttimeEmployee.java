/**  
 * 工程: designpatterndemo <br>
 * 标题: ParttimeEmployee.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:24:10 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.visitorpattern;

/**
 * 类: ParttimeEmployee <br>
 * 描述: 兼职员工类：具体元素类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:24:10
 */
class ParttimeEmployee implements Employee
{
	private String name;
	private double hourWage;
	private int workTime;

	public ParttimeEmployee(String name,double hourWage,int workTime)
	{
		this.name = name;
		this.hourWage = hourWage;
		this.workTime = workTime;
	}	

	public void setName(String name) 
    {
		this.name = name; 
	}

	public void setHourWage(double hourWage) 
    {
		this.hourWage = hourWage; 
	}

	public void setWorkTime(int workTime) 
    {
		this.workTime = workTime; 
	}

	public String getName() 
    {
		return (this.name); 
	}

	public double getHourWage() 
    {
		return (this.hourWage); 
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
