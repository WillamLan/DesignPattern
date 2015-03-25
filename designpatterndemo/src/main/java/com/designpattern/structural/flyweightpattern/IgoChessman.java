/**  
 * 工程: designpatterndemo <br>
 * 标题: IgoChessman.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午1:43:44 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.flyweightpattern;

/**
 * 类: IgoChessman <br>
 * 描述: 围棋棋子类：抽象享元类   <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午1:43:44
 */
abstract class IgoChessman {
	 public abstract String getColor();  
	  
	 public void display(Coordinates coord){  
	        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY() );    
	    }  
}
