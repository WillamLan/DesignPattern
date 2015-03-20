package com.designpattern.creational.prototypepattern.obejectclone;


//工作周报WeeklyLog：具体原型类，考虑到代码的可读性和易理解性，只列出部分与模式相关的核心代码
class WeeklyLog implements Cloneable
{
     private  String name;
     private  String date;
     private  String content;
     public  void setName(String name) {
            this.name  = name;
     }
     public  void setDate(String date) {
            this.date  = date;
     }
     public  void setContent(String content) {
            this.content  = content;
     }
     public  String getName() {
            return  (this.name);
     }
     public  String getDate() {
            return  (this.date);
     }
     public  String getContent() {
            return  (this.content);
     }
   //克隆方法clone()，此处使用Java语言提供的克隆机制
     public WeeklyLog clone()
     {
            Object obj = null;
            try
            {
                   obj = super.clone();
                   return (WeeklyLog)obj;     
            }
            catch(CloneNotSupportedException e)
            {
                   System.out.println("不支持复制！");
                   return null;
            }
     }
}