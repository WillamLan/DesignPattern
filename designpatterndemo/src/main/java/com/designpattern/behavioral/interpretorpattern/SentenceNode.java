/**  
 * 工程: designpatterndemo <br>
 * 标题: SentenceNode.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-28 下午9:35:50 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.interpretorpattern;

/**
 * 类: SentenceNode <br>
 * 描述: 简单句子解释：非终结符表达式<br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-28 下午9:35:50
 */
class SentenceNode extends AbstractNode {
	private AbstractNode direction;
	private AbstractNode action;
	private AbstractNode distance;

	public SentenceNode(AbstractNode direction,AbstractNode action,AbstractNode distance) {
		this.direction = direction;
		this.action = action;
		this.distance = distance;
	}
    
    //简单句子的解释操作
	public String interpret() {
		return direction.interpret() + action.interpret() + distance.interpret();
	}	
}