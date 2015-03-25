/**  
 * 工程: designpatterndemo <br>
 * 标题: Coordinates.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午1:49:01 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.flyweightpattern;

/**
 * 类: Coordinates <br>
 * 描述: 坐标类：外部状态类  <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午1:49:01
 */
class Coordinates {
	 private int x;  
	    private int y;  
	      
	    public Coordinates(int x,int y) {  
	        this.x = x;  
	        this.y = y;  
	    }  
	      
	    public int getX() {  
	        return this.x;  
	    }  
	      
	    public void setX(int x) {  
	        this.x = x;  
	    }  
	      
	    public int getY() {  
	        return this.y;  
	    }  
	      
	    public void setY(int y) {  
	        this.y = y;  
	    }  
}
