/**  
 * 工程: designpatterndemo <br>
 * 标题: Sensor.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午4:24:16 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.facadepattern;

/**
 * 类: Sensor <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午4:24:16
 */
class Sensor {  
    public void activate()  
    {  
        System.out.println("开启感应器！");  
    }  
      
    public void deactivate()  
    {  
        System.out.println("关闭感应器！");  
    }  
}  
