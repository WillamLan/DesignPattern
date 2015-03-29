/**  
 * 工程: designpatterndemo <br>
 * 标题: RestrictedState.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:50:52 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.strategypattern;

/**
 * 类: RestrictedState <br>
 * 描述: 受限状态：具体状态类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:50:52
 */
class RestrictedState extends AccountState{
	public RestrictedState(AccountState state) {  
        this.acc = state.acc;  
    }  
      
    public void deposit(double amount) {  
        acc.setBalance(acc.getBalance() + amount);  
        stateCheck();  
    }  
      
    public void withdraw(double amount) {  
        System.out.println("帐号受限，取款失败");  
    }  
      
    public void computeInterest() {  
        System.out.println("计算利息！");  
    }  
      
    //状态转换  
    public void stateCheck() {  
        if(acc.getBalance() > 0) {  
            acc.setState(new NormalState(this));  
        }  
        else if(acc.getBalance() > -2000) {  
            acc.setState(new OverdraftState(this));  
        }  
    }  
}
