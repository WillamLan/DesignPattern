/**  
 * 工程: designpatterndemo <br>
 * 标题: CountProxy.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 上午11:18:52 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.staticproxypattern;

/**
 * 类: CountProxy <br>
 * 描述: 这是一个代理类（增强CountImpl实现类） <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 上午11:18:52
 */
class CountProxy implements Count {  
    private CountImpl countImpl;  
    private void beforeQueryCount(){
    	System.out.println("--查询事物处理：----");
    	System.out.println("账号查询事务处理之前");  
    }
    private void afterQueryCount(){
    	 System.out.println("账号查询事务处理之后");
    	 System.out.println("----******----");
    	 System.out.println();
    }
    private void beforeUpdateCount(){
    	System.out.println("--更新事物处理：----");
    	System.out.println("账号更新事务处理之前"); 
    }
    private void afterUpdateCount(){
    	System.out.println("账号更新事务处理之后"); 
    	System.out.println("----******----");
    }
    /** 
     * 覆盖默认构造器 
     *  
     * @param countImpl 
     */  
    public CountProxy(CountImpl countImpl) {  
        this.countImpl = countImpl;  
    }  
  
    public void queryCount() {  
        this.beforeQueryCount();
        // 调用委托类的方法;  
        countImpl.queryCount();  
        this.afterQueryCount();
    }  
  
    public void updateCount() {  
         this.beforeUpdateCount();
        // 调用委托类的方法;  
        countImpl.updateCount();  
          this.afterUpdateCount();
  
    }  
  
}  
