/**  
 * 工程: designpatterndemo <br>
 * 标题: control_1.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午11:25:43 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.commandpattern;

/**
 * 类: Control_1 <br>
 * 描述: 面向命令队列编程的控制器类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午11:25:43
 */
class Control_1 {
	 private CommandQueue commandQueue; //维持一个CommandQueue对象的引用  
     
	    //构造注入  
	    public Control_1(CommandQueue commandQueue) {  
	        this. commandQueue = commandQueue;  
	    }  
	      
	    //设值注入  
	    public void setCommandQueue(CommandQueue commandQueue) {  
	        this.commandQueue = commandQueue;  
	    }  
	      
	    //调用CommandQueue类的execute()方法  
	    public void call() {  
	        commandQueue.execute();  
	    }  
}
