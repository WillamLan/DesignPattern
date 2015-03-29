/**  
 * 工程: designpatterndemo <br>
 * 标题: Manager.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午3:43:23 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.chainresponsibilitypattern;

/**
 * 类: Manager <br>
 * 描述: 经理类：具体处理者  <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午3:43:23
 */
class Manager extends Approver {  
    public Manager(String name) {  
        super(name);  
    }  
      
    //具体请求处理方法  
    public void processRequest(PurchaseRequest request) {  
        if (request.getAmount() < 80000) {  
            System.out.println("经理" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求  
        }  
        else {  
            this.successor.processRequest(request);  //转发请求  
        }     
    }  
}
