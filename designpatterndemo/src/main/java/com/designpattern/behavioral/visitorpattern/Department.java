/**  
 * 工程: designpatterndemo <br>
 * 标题: Department.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:25:36 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.visitorpattern;

/**
 * 类: Department <br>
 * 描述: 部门类：抽象访问者类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午10:25:36
 */
abstract class Department {
	//声明一组重载的访问方法，用于访问不同类型的具体元素
		public abstract void visit(FulltimeEmployee employee);
		public abstract void visit(ParttimeEmployee employee);	
}
