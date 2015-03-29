/**  
 * 工程: designpatterndemo <br>
 * 标题: Approver.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午3:34:08 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.chainresponsibilitypattern;

/**
 * 类: Approver <br>
 * 描述: 审批者类：抽象处理者 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午3:34:08
 */
abstract class Approver {
	 protected Approver successor; //定义后继对象  
	    protected String name; //审批者姓名  
	      
	    public Approver(String name) {  
	        this.name = name;  
	    }  
	  
	    //设置后继者  
	    public void setSuccessor(Approver successor) {   
	        this.successor = successor;  
	    }  
	  
	    //抽象请求处理方法  
	    public abstract void processRequest(PurchaseRequest request);  
}
