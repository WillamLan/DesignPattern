/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午10:53:42 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.commandpattern;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午10:53:42
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-25 下午10:53:42
	 * @param args
	 */
	public static void main(String[] args) {
		// 命令接收者
		 Tv myTv = new Tv();
		 // 开机命令
		  CommandOn on = new CommandOn(myTv);
		  // 关机命令
		  CommandOff off = new CommandOff(myTv);
	// 频道切换命令
		CommandChange channel = new CommandChange(myTv, 2);
		 // 命令控制对象
		Control control = new Control(on, off, channel);

		  // 开机
		 control.turnOn();
		 // 切换频道
		control.changeChannel();
		 // 关机
		control.turnOff();
		System.out.println("----******----");
		//命令队列
		CommandQueue cq= new CommandQueue();
		cq.addCommand(on);
		cq.addCommand(channel);
		cq.addCommand(off);
		
		//面向命令队列编程的控制器
		Control_1 c_1= new Control_1(cq);
		c_1.call();
	}

}
