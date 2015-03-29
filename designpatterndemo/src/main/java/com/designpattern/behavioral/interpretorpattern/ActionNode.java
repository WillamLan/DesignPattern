/**  
 * 工程: designpatterndemo <br>
 * 标题: ActionNode.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-28 下午9:38:19 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.interpretorpattern;

/**
 * 类: ActionNode <br>
 * 描述: 动作解释：终结符表达式<br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-28 下午9:38:19
 */
class ActionNode extends AbstractNode {
	private String action;
	
	public ActionNode(String action) {
		this.action = action;
	}
	
    //动作（移动方式）表达式的解释操作
	public String interpret() {
		if (action.equalsIgnoreCase("move")) {
			return "移动";
		}
		else if (action.equalsIgnoreCase("run")) {
			return "快速移动";
		}
		else {
			return "无效指令";
		}
	}
}
