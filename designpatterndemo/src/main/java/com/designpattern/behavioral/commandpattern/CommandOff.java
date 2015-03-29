/**  
 * 工程: designpatterndemo <br>
 * 标题: CommandOff.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午10:46:54 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.commandpattern;

/**
 * 类: CommandOff <br>
 * 描述: 具体命令：关闭命令 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午10:46:54
 */
class CommandOff implements Command{
	private Tv myTv;//维持对请求接收者的引用
	
	public CommandOff(Tv tv)
	{
		this.myTv=tv;
	}
     public void execute(){
    	 myTv.turnOff();
     }
}
