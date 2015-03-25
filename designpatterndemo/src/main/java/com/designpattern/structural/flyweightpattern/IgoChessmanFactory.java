/**  
 * 工程: designpatterndemo <br>
 * 标题: IgoChessmanFactory.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午1:47:08 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.flyweightpattern;

import java.util.Hashtable;

/**
 * 类: IgoChessmanFactory <br>
 * 描述: 围棋棋子工厂类：享元工厂类，使用单例模式进行设计<br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午1:47:08
 */
class IgoChessmanFactory {
	 private static IgoChessmanFactory instance = new IgoChessmanFactory();  
	    private static Hashtable<String, IgoChessman> ht; //使用Hashtable来存储享元对象，充当享元池  
	      
	    private IgoChessmanFactory() {  
	        ht = new Hashtable<String, IgoChessman>();  
	        IgoChessman black,white;  
	        black = new BlackIgoChessman();  
	        ht.put("b",black);  
	        white = new WhiteIgoChessman();  
	        ht.put("w",white);  
	    }  
	      
	    //返回享元工厂类的唯一实例  
	    public static IgoChessmanFactory getInstance() {  
	        return instance;  
	    }  
	    //通过key来获取存储在Hashtable中的享元对象  （注：实例调用的方法不能使用static修饰。）
	    public IgoChessman getIgoChessman(String color) {  
	        return (IgoChessman)ht.get(color);    
	    }  
}
