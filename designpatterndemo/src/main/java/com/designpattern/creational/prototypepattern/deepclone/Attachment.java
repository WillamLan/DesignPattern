package com.designpattern.creational.prototypepattern.deepclone;


import  java.io.*;
//附件类
class  Attachment implements Serializable
{
       /**
	 * 
	 */
	private static final long serialVersionUID = 234543935595966692L;
	private  String name; //附件名
       public  void setName(String name)
       {
              this.name  = name;
       }
       public  String getName()
       {
              return  this.name;
       }
     public void download()
     {
            System.out.println("下载附件，文件名为" + name);
     }
}