/**  
 * 工程: designpatterndemo <br>
 * 标题: AbstractObjectList.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午12:43:02 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 类: AbstractObjectList <br>
 * 描述: 抽象聚合类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午12:43:02
 */
abstract class AbstractObjectList {
	 protected List<Object> objects = new ArrayList<Object>();  
	  
	    public AbstractObjectList(List<Object> objects) {  
	        this.objects = objects;  
	    }  
	      
	    public void addObject(Object obj) {  
	        this.objects.add(obj);  
	    }  
	      
	    public void removeObject(Object obj) {  
	        this.objects.remove(obj);  
	    }  
	      
	    public List<Object> getObjects() {  
	        return this.objects;  
	    }  
	      
	    //声明创建迭代器对象的抽象工厂方法  
	    public abstract AbstractIterator createIterator();  
}
