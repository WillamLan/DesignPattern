/**  
 * 工程: designpatterndemo <br>
 * 标题: Base.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午2:39:01 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.java.classloadingprinciple;

/**
 * 类: Base <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午2:39:01
 */
class Base {
	  
    static{
        System.out.println("base static");
    }
     /**
      * 
      * 标题: 构造器 <br>
      * 描述: TODO <br>
      * 作者: xiaoxiaolan <br>
      * 时间: 2015-3-25 下午2:39:28
      */
    public Base(){
        System.out.println("base constructor");
    }
}
