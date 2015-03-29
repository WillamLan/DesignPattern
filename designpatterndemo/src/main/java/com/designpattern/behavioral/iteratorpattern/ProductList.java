/**  
 * 工程: designpatterndemo <br>
 * 标题: ProductList.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午12:51:56 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.iteratorpattern;

import java.util.List;

/**
 * 类: ProductList <br>
 * 描述: 商品数据类：具体聚合类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午12:51:56
 */
class ProductList extends AbstractObjectList {  
	public ProductList(List products) {  
        super(products);  
    }  
      
    //实现创建迭代器对象的具体工厂方法  
    public AbstractIterator createIterator() {  
        return new ProductIterator(this);  
    }  
}   