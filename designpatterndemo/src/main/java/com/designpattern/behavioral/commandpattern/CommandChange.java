/**  
 * 工程: designpatterndemo <br>
 * 标题: CommandChange.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午10:35:13 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.commandpattern;

/**
 * 类: CommandChange <br>
 * 描述: 具体命令：换台命令<br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午10:35:13
 */
class CommandChange implements Command{
	private Tv myTv;//维持对请求接收者的引用
	
	private int channel;
	
	public CommandChange(Tv tv,int channel)
	{
		this.myTv=tv;
		this.channel=channel;
	}
	public void execute(){
		myTv.changeChannel(channel);
	}

}
