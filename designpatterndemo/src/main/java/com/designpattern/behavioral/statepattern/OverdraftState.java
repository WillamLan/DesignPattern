/**  
 * 工程: designpatterndemo <br>
 * 标题: OverdraftState.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:50:10 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.statepattern;

/**
 * 类: OverdraftState <br>
 * 描述: 透支状态：具体状态类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午6:50:10
 */
class OverdraftState extends AccountState{
	public OverdraftState(AccountState state) {  
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
      
    public void computeInterest() {  
        System.out.println("计算利息！");  
    }  
      
    //状态转换  
    public void stateCheck() {  
        if (acc.getBalance() > 0) {  
            acc.setState(new NormalState(this));  
        }  
        else if (acc.getBalance() == -2000) {  
            acc.setState(new RestrictedState(this));  
        }  
        else if (acc.getBalance() < -2000) {  
            System.out.println("操作受限！");  
        }  
    }  
}
