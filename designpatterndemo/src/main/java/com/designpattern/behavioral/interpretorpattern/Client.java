/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-28 下午9:45:33 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.interpretorpattern;

/**
 * 类: Client <br>
 * 描述: 本实例对机器人控制指令的输出结果进行模拟，将英文指令翻译为中文指令
 * ，实际情况是调用不同的控制程序进行机器人的控制，包括对移动方向、方式和距离的控制等<br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-28 下午9:45:33
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-28 下午9:45:33
	 * @param args
	 */
	public static void main(String[] args) {
		String instruction = "up move 5 and down run 10 and left move 5";
		InstructionHandler handler = new InstructionHandler();
		handler.handle(instruction);
		String outString;
		outString = handler.output();
		System.out.println(outString);
	}

}
