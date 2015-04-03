/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午9:13:04 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.templatepattern;

import com.designpattern.util.XMLUtil;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-30 下午9:13:04
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-30 下午9:13:04
	 * @param args
	 */
	public static void main(String[] args) {
		 MobilePhoneTemplate ac;
		 ac = (MobilePhoneTemplate) XMLUtil.getBean("rp"); //反射生成具体建造者对象|子类的对象付给父类
	       ac.makeMobile();//制作手机

	       //制作不同的手机只是修改子类就可以了
	}

}
