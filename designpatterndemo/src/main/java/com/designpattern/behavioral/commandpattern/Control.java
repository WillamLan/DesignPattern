/**  
 * 工程: designpatterndemo <br>
 * 标题: Control.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午10:24:26 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.commandpattern;


/**
 * 类: Control <br>
 * 描述: 遥控器类（命令的调用者） <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午10:24:26
 */
class Control {
	private Command onCommand,offCommand,changeChannel;//维持几个抽象命令对象的引用
	
	public Control(Command on)
	{
		this.onCommand=on;
	}
	public Control(Command on,Command off)
	{
		this.onCommand=on;
		this.offCommand=off;
	}
	
	public Control(Command on,Command off,Command channel)
	{
		this.onCommand=on;
		this.offCommand=off;
		this.changeChannel=channel;
	}
         public void turnOn(){
        	 onCommand.execute();
         }
         public void turnOff(){
        	 offCommand.execute();
         }
         public void changeChannel(){
        	 changeChannel.execute();
         }
}
