/**  
 * 工程: designpatterndemo <br>
 * 标题: DistanceNode.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-28 下午9:39:38 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.interpretorpattern;

/**
 * 类: DistanceNode <br>
 * 描述: 距离解释：终结符表达式 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-28 下午9:39:38
 */
class DistanceNode extends AbstractNode {
	private String distance;
	
	public DistanceNode(String distance) {
		this.distance = distance;
	}
	
//距离表达式的解释操作
	public String interpret() {
		return this.distance;
	}	
}