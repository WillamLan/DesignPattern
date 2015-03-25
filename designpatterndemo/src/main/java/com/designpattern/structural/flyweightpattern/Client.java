/**  
 * 工程: designpatterndemo <br>
 * 标题: Client.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午1:48:02 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.structural.flyweightpattern;

/**
 * 类: Client <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午1:48:02
 */
public class Client {

	/** 
	 * 方法: main <br>
	 * 描述: TODO <br>
	 * 作者: xiaoxiaolan <br>
	 * 时间: 2015-3-25 下午1:48:02
	 * @param args
	 */
	public static void main(String[] args) {
		 IgoChessman black1,black2,black3,white1,white2;  
	        IgoChessmanFactory factory;  
	          
	        //获取享元工厂对象  
	        factory = IgoChessmanFactory.getInstance();  
	  
	        //通过享元工厂获取三颗黑子  
	        black1 = factory.getIgoChessman("b");  
	        black2 = factory.getIgoChessman("b");  
	        black3 = factory.getIgoChessman("b");  
	        System.out.println("判断两颗黑子是否相同：" + (black1==black2));  
	  
	        //通过享元工厂获取两颗白子  
	        white1 = factory.getIgoChessman("w");  
	        white2 = factory.getIgoChessman("w");  
	        System.out.println("判断两颗白子是否相同：" + (white1==white2));  
	  
	        //显示棋子，同时设置棋子的坐标位置  
	        black1.display(new Coordinates(1,2));  
	        black2.display(new Coordinates(3,4));  
	        black3.display(new Coordinates(1,3));  
	        white1.display(new Coordinates(2,5));  
	        white2.display(new Coordinates(2,4));  
	}

}

/*使用方式：*/
/*享元模式通常需要和其他模式一起联用，几种常见的联用方式如下：
(1)在享元模式的享元工厂类中通常提供一个静态的工厂方法用于返回享元对象，使用简单工厂模式来生成享元对象。
(2)在一个系统中，通常只有唯一一个享元工厂，因此可以使用单例模式进行享元工厂类的设计。
(3)享元模式可以结合组合模式形成复合享元模式，统一对多个享元对象设置外部状态。
*/

/*当系统中存在大量相同或者相似的对象时，享元模式是一种较好的解决方案，它通过共享技术实现相同或相似的细粒度对象的复用，
从而节约了内存空间，提高了系统性能。相比其他结构型设计模式，享元模式的使用频率并不算太高，
但是作为一种以“节约内存，提高性能”为出发点的设计模式，它在软件开发中还是得到了一定程度的应用。
1.主要优点
享元模式的主要优点如下：
(1) 可以极大减少内存中对象的数量，使得相同或相似对象在内存中只保存一份，从而可以节约系统资源，提高系统性能。
(2) 享元模式的外部状态相对独立，而且不会影响其内部状态，从而使得享元对象可以在不同的环境中被共享。
2.主要缺点
享元模式的主要缺点如下：
(1) 享元模式使得系统变得复杂，需要分离出内部状态和外部状态，这使得程序的逻辑复杂化。
(2) 为了使对象可以共享，享元模式需要将享元对象的部分状态外部化，而读取外部状态将使得运行时间变长。
3.适用场景
在以下情况下可以考虑使用享元模式：
(1) 一个系统有大量相同或者相似的对象，造成内存的大量耗费。
(2) 对象的大部分状态都可以外部化，可以将这些外部状态传入对象中。
(3) 在使用享元模式时需要维护一个存储享元对象的享元池，而这需要耗费一定的系统资源，因此，应当在需要多次重复使用享元对象时才值得使用享元模式。*/

/*JDK类库中的String类使用了享元模式*/
/*在Java语言中，如果每次执行类似String str1="abcd"的操作时都创建一个新的字符串对象将导致内存开销很大，
因此如果第一次创建了内容为"abcd"的字符串对象str1，下一次再创建内容相同的字符串对象str2时会将它的引用指向"abcd"，
不会重新分配内存空间，从而实现了"abcd"在内存中的共享。*/