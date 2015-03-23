package com.designpattern.structural.bridgepattern;

//Windows操作系统实现类：具体实现类   (注：只有把实现类的访问权限设置为public才能在util工具包中的XMLUtil类中访问到）
public class WindowsImp implements ImageImp {  
  public void doPaint(Matrix m) {  
      //调用Windows系统的绘制函数绘制像素矩阵  
      System.out.print("在Windows操作系统中显示图像：");  
  }  
}  