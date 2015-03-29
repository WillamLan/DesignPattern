/**  
 * 工程: designpatterndemo <br>
 * 标题: PurchaseRequest.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午3:33:09 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.chainresponsibilitypattern;

/**
 * 类: PurchaseRequest <br>
 * 描述: 采购单：请求类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午3:33:09
 */
class PurchaseRequest {
	 private double amount;  //采购金额  
	    private int number;  //采购单编号  
	    private String purpose;  //采购目的  
	      
	    public PurchaseRequest(double amount, int number, String purpose) {  
	        this.amount = amount;  
	        this.number = number;  
	        this.purpose = purpose;  
	    }  
	      
	    public void setAmount(double amount) {  
	        this.amount = amount;  
	    }  
	      
	    public double getAmount() {  
	        return this.amount;  
	    }  
	      
	    public void setNumber(int number) {  
	        this.number = number;  
	    }  
	      
	    public int getNumber() {  
	        return this.number;  
	    }  
	      
	    public void setPurpose(String purpose) {  
	        this.purpose = purpose;  
	    }  
	      
	    public String getPurpose() {  
	        return this.purpose;  
	    }  
}
