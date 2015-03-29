/**  
 * 工程: designpatterndemo <br>
 * 标题: Chessman.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午3:33:22 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.mementopattern;

/**
 * 类: Chessman <br>
 * 描述: 象棋棋子类：原发器 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午3:33:22
 */
class Chessman {
	 private String label;  
	    private int x;  
	    private int y;  
	  
	    public Chessman(String label,int x,int y) {  
	        this.label = label;  
	        this.x = x;  
	        this.y = y;  
	    }  
	  
	    public void setLabel(String label) {  
	        this.label = label;   
	    }  
	  
	    public void setX(int x) {  
	        this.x = x;   
	    }  
	  
	    public void setY(int y) {  
	        this.y = y;   
	    }  
	  
	    public String getLabel() {  
	        return (this.label);   
	    }  
	  
	    public int getX() {  
	        return (this.x);   
	    }  
	  
	    public int getY() {  
	        return (this.y);   
	    }  
	      
	    //保存状态  
	    public ChessmanMemento save() {  
	        return new ChessmanMemento(this.label,this.x,this.y);  
	    }  
	      
	    //恢复状态  
	    public void restore(ChessmanMemento memento) {  
	        this.label = memento.getLabel();  
	        this.x = memento.getX();  
	        this.y = memento.getY();  
	    }  
}
