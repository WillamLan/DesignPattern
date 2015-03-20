package com.designpattern.creational.prototypepattern.deepclone;


class Client
{
       public  static void main(String args[])
       {
              WeeklyLog  log_previous, log_new = null;
              log_previous  = new WeeklyLog(); //创建原型对象
              Attachment  attachment = new Attachment(); //创建附件对象
              log_previous.setAttachment(attachment);  //将附件添加到周报中
              try
              {
                     log_new =  log_previous.deepClone(); //调用深克隆方法创建克隆对象                  
              }
              catch(Exception e)
              {
                     System.err.println("克隆失败！");
              }
              //比较周报
              System.out.println("周报是否相同？ " + (log_previous ==  log_new));
              //比较附件
              System.out.println("附件是否相同？ " +  (log_previous.getAttachment() == log_new.getAttachment()));
       }
}

/*扩展
Java语言提供的Cloneable接口和Serializable接口的代码非常简单，
它们都是空接口，这种空接口也称为标识接口，标识接口中没有任何方法的定义，
其作用是告诉JRE这些接口的实现类是否具有某个功能，如是否支持克隆、是否支持序列化等。*/