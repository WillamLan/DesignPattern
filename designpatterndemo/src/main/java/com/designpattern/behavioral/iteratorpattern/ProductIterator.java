/**  
 * 工程: designpatterndemo <br>
 * 标题: ProductIterator.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午12:45:14 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.iteratorpattern;

import java.util.List;

/**
 * 类: ProductIterator <br>
 * 描述: 商品迭代器：具体迭代器 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午12:45:14
 */
class ProductIterator implements AbstractIterator {  
    private ProductList productList;  
    private List<?> products;  
    private int cursor1; //定义一个游标，用于记录正向遍历的位置  
    private int cursor2; //定义一个游标，用于记录逆向遍历的位置  
      
    public ProductIterator(ProductList list) {  
        this.productList = list;  
        this.products = list.getObjects(); //获取集合对象  
        cursor1 = 0; //设置正向遍历游标的初始值  
        cursor2 = products.size() -1; //设置逆向遍历游标的初始值  
    }  
      
    public void next() {  
        if(cursor1 < products.size()) {  
            cursor1++;  
        }  
    }  
      
    public boolean isLast() {  
        return (cursor1 == products.size());  
    }  
      
    public void previous() {  
        if (cursor2 > -1) {  
            cursor2--;  
        }  
    }  
      
    public boolean isFirst() {  
        return (cursor2 == -1);  
    }  
      
    public Object getNextItem() {  
        return products.get(cursor1);  
    }   
          
    public Object getPreviousItem() {  
        return products.get(cursor2);  
    }  
}
