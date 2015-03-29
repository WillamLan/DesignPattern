/**  
 * 工程: designpatterndemo <br>
 * 标题: NormalState.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:49:07 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.strategypattern;

/**
 * 类: NormalState <br>
 * 描述: 正常状态：具体状态类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:49:07
 */
class NormalState extends AccountState{
	 public NormalState(Account acc) {  
	        this.acc = acc;  
	    }  
	  
	public NormalState(AccountState state) {  
	        this.acc = state.acc;  
	    }  
	          
	    public void deposit(double amount) {  
	        acc.setBalance(acc.getBalance() + amount);  
	        stateCheck();  
	    }  
	      
	    public void withdraw(double amount) {  
	        acc.setBalance(acc.getBalance() - amount);  
	        stateCheck();  
	    }  
	      
	    public void computeInterest()  
	    {  
	        System.out.println("正常状态，无须支付利息！");  
	    }  
	      
	    //状态转换  
	    public void stateCheck() {  
	        if (acc.getBalance() > -2000 && acc.getBalance() <= 0) {  
	            acc.setState(new OverdraftState(this));  
	        }  
	        else if (acc.getBalance() == -2000) {  
	            acc.setState(new RestrictedState(this));  
	        }  
	        else if (acc.getBalance() < -2000) {  
	            System.out.println("操作受限！");  
	        }     
	    }     
}
