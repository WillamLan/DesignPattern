/**  
 * 工程: designpatterndemo <br>
 * 标题: ChessmanMemento.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午3:34:16 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.mementopattern;

/**
 * 类: ChessmanMemento <br>
 * 描述: 象棋棋子备忘录类：备忘录  <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午3:34:16
 */
class ChessmanMemento {
	 private String label;  
	    private int x;  
	    private int y;  
	  
	    public ChessmanMemento(String label,int x,int y) {  
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
}
