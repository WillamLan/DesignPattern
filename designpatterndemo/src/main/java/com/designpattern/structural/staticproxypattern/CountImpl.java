/**  
 * 工程: designpatterndemo <br>
 * 标题: CountImpl.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 上午11:14:38 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.staticproxypattern;

/**
 * 类: CountImpl <br>
 * 描述: 委托类(包含业务逻辑) <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 上午11:14:38
 */
class CountImpl implements Count {  
  /**
   * 
   * 方法: queryCount <br>
   * 描述: 实现账户管理接口的查询方法
   * @see com.designpattern.structural.staticproxypattern.Count#queryCount()
   */
    public void queryCount() {  
        System.out.println("查看账户方法执行中");  
  
    }  
  /**
   * 
   * 方法: updateCount <br>
   * 描述: 实现账户管理接口的更新方法
   * @see com.designpattern.structural.staticproxypattern.Count#updateCount()
   */
    public void updateCount() {  
        System.out.println("修改账户方法执行中");  
  
    }  
  
}  