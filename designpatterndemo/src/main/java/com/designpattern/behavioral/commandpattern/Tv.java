/**  
 * 工程: designpatterndemo <br>
 * 标题: Tv.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午10:41:02 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.commandpattern;

/**
 * 类: Tv <br>
 * 描述: 电视机是遥控的命令的接收者 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午10:41:02
 */
class Tv {
public int currentChannel=0;

public void turnOn(){
	System.out.println("The television is on.");
}

public void turnOff(){
	System.out.println("The televison is off");
}
 public void changeChannel(int channel)
 {
	 this.currentChannel=channel;
	 System.out.println("Now TV channel is:"+channel);
 }
}
