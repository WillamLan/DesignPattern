/**  
 * 工程: designpatterndemo <br>
 * 标题: AbstractIterator.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午12:44:28 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.iteratorpattern;

/**
 * 类: AbstractIterator <br>
 * 描述: 抽象迭代器 ：在本实例中，为了详细说明自定义迭代器的实现过程，我们没有使用JDK中内置的迭代器，
 * 事实上，JDK内置迭代器已经实现了对一个List对象的正向遍历  <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午12:44:28
 */
interface AbstractIterator {
	    public void next(); //移至下一个元素  
	    public boolean isLast(); //判断是否为最后一个元素  
	    public void previous(); //移至上一个元素  
	    public boolean isFirst(); //判断是否为第一个元素  
	    public Object getNextItem(); //获取下一个元素  
	    public Object getPreviousItem(); //获取上一个元素  
}
