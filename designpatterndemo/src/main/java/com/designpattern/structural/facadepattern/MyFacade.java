/**  
 * 工程: designpatterndemo <br>
 * 标题: MyFacade.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午4:24:56 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.facadepattern;

/**
 * 类: MyFacade <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-24 下午4:24:56
 */
class MyFacade {  
    private static Camara c1;  
    private static Light l1;  
    private static Sensor s;  
      
    static  
    {  
        c1 = new Camara();  
        l1 = new Light();  
        s = new Sensor();  
    }  
      
    public static void activate()  
    {  
        c1.turnOn();  
          
        l1.turnOn();  
          
        s.activate();  
    }  
      
    public static void deactivate()  
    {  
        c1.turnOff();  
          
        l1.turnOff();  
          
        s.deactivate();  
    }  
}  

