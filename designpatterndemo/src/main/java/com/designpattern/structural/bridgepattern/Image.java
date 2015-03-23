package com.designpattern.structural.bridgepattern;

//抽象图像类：抽象类  
abstract class Image {  
  protected ImageImp imp;  //对象注入，实现关联

  public void setImageImp(ImageImp imp) {  
      this.imp = imp;  
  }   

  public abstract void parseFile(String fileName);  
}  