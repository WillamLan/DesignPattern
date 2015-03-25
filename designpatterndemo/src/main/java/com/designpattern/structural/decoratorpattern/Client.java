/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:57:59 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.decoratorpattern;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午7:57:59
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-24 下午7:57:59
	 * @param args
	 */
	public static void main(String[] args) {
		 Human person = new Person();  
	        Decorator decorator = new Decorator_third(new Decorator_second(  
	                new Decorator_first(person)));  
	        decorator.wearClothes();  
	        decorator.walkToWhere();
	}

}

/*关键点：
1、Decorator抽象类中，持有Human接口，方法全部委托给该接口调用，目的是交给该接口的实现类即子类进行调用。
2、Decorator抽象类的子类（具体装饰者），里面都有一个构造方法调用super(human),这一句就体现了抽象类依赖于子类实现即抽象依赖于实现的原则。
因为构造里面参数都是Human接口，只要是该Human的实现类都可以传递进去，
即表现出Decorator dt = new Decorator_third(new Decorator_second(new Decorator_first(person)));
这种结构的样子。所以当调用dt.wearClothes();dt.walkToWhere()的时 候，又因为每个具体装饰者类中，
都先调用super.wearClothes和super.walkToWhere()方法，
而该super已经由构造传 递并指向了具体的某一个装饰者类（这个可以根据需要调换顺序），那么调用的即为装饰类的方法，
然后才调用自身的装饰方法，即表现出一种装饰、链式的类似于 过滤的行为。
3、具体被装饰者类，可以定义初始的状态或者初始的自己的装饰，后面的装饰行为都在此基础上一步一步进行点缀、装饰。
4、装饰者模式的设计原则为：对扩展开放、对修改关闭，这句话体现在我如果想扩展被装饰者类的行为，无须修改装饰者抽象类，
只需继承装饰者抽象类，实现额 外的一些装饰或者叫行为即可对被装饰者进行包装。
所以：扩展体现在继承、修改体现在子类中，而不是具体的抽象类，这充分体现了依赖倒置原则。*/