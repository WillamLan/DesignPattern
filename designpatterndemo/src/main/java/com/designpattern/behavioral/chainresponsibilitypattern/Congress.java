/**  
 * 工程: designpatterndemo <br>
 * 标题: Congress.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午3:40:50 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.chainresponsibilitypattern;

/**
 * 类: Congress <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午3:40:50
 */
class Congress extends Approver {  
    public Congress(String name) {  
        super(name);  
    }  
      
    //具体请求处理方法  
    public void processRequest(PurchaseRequest request) {  
        System.out.println("召开董事会审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");        //处理请求  
    }      
}
