/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午3:35:36 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.mementopattern;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午3:35:36
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-29 下午3:35:36
	 * @param args
	 */
	public static void main(String[] args) {
		 MementoCaretaker mc = new MementoCaretaker();  
	        Chessman chess = new Chessman("车",1,1);  
	        display(chess);  
	        mc.setMemento(chess.save()); //保存状态       
	        chess.setY(4);  
	        display(chess);  
	        mc.setMemento(chess.save()); //保存状态  
	        display(chess);  
	        chess.setX(5);  
	        display(chess);  
	        System.out.println("******悔棋******");     
	        chess.restore(mc.getMemento()); //恢复状态  
	        display(chess);  
	    }  
	      
	    public static void display(Chessman chess) {  
	        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");  
	    }  
	}

