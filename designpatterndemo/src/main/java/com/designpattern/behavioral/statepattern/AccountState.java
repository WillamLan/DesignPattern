/**  
 * 工程: designpatterndemo <br>
 * 标题: AccountState.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:48:25 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.statepattern;

/**
 * 类: AccountState <br>
 * 描述: 抽象状态类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:48:25
 */
abstract class AccountState {
	 protected Account acc;  
	    public abstract void deposit(double amount);  
	    public abstract void withdraw(double amount);  
	    public abstract void computeInterest();  
	    public abstract void stateCheck();  
}
