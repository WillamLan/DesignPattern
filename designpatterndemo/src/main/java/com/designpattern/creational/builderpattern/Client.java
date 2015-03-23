package com.designpattern.creational.builderpattern;
import com.designpattern.util.*;

class Client
{
       public  static void main(String args[])
       {
              ActorBuilder ab; //针对抽象建造者编程
              ab =  (ActorBuilder)XMLUtil.getBean("ab"); //反射生成具体建造者对象
 
         ActorController ac = new  ActorController();
              Actor actor;
              actor = ac.construct(ab); //通过指挥者创建完整的建造者对象
 
              String  type = actor.getType();
              System.out.println(type  + "的外观：");
              System.out.println("性别：" + actor.getSex());
              System.out.println("面容：" + actor.getFace());
              System.out.println("服装：" + actor.getCostume());
              System.out.println("发型：" + actor.getHairstyle());
       }
}
/*注：
在建造者模式中，客户端只需实例化指挥者类，指挥者类针对抽象建造者编程，客户端根据需要传入具体的建造者类型，
指挥者将指导具体建造者一步一步构造一个完整的产品（逐步调用具体建造者的buildX()方法），相同的构造过程可以创建完全不同的产品。
在游戏角色实例中，如果需要更换角色，只需要修改配置文件，更换具体角色建造者类即可；如果需要增加新角色，
可以增加一个新的具体角色建造者类作为抽象角色建造者的子类，再修改配置文件即可，原有代码无须修改，完全符合“开闭原则”。*/