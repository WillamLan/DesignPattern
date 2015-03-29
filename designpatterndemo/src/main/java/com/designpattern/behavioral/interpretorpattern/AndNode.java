/**  
 * 工程: designpatterndemo <br>
 * 标题: AndNode.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-28 下午9:34:25 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.interpretorpattern;

/**
 * 类: AndNode <br>
 * 描述: And解释：非终结符表达式 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-28 下午9:34:25
 */
class AndNode extends AbstractNode {
	private AbstractNode left; //And的左表达式
	private AbstractNode right; //And的右表达式

	public AndNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}
    
    //And表达式解释操作
	public String interpret() {
		return left.interpret() + "再" + right.interpret();
	}
}
