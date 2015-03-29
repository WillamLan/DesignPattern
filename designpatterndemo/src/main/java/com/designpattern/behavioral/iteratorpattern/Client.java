/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午12:47:19 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午12:47:19
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-29 下午12:47:19
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();  
          
        products.add("三国演义");  
        products.add("水浒传");  
        products.add("西游记");  
        products.add("红楼梦"); 
        products.add("平凡的世界");
              
        AbstractObjectList list;  
        AbstractIterator iterator;  
          
        list = new ProductList(products); //创建聚合对象  
        iterator = list.createIterator();   //创建迭代器对象  
          
        System.out.println("正向遍历：");      
        while(!iterator.isLast()) {  
            System.out.print(iterator.getNextItem() + "，");  
            iterator.next();  
        }  
        System.out.println();  
        System.out.println("-----------------------------");  
        System.out.println("逆向遍历：");  
        while(!iterator.isFirst()) {  
            System.out.print(iterator.getPreviousItem() + "，");  
            iterator.previous();  
        }  

	}

}
