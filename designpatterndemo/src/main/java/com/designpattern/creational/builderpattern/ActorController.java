package com.designpattern.creational.builderpattern;

/*指挥者类ActorController定义了construct()方法，
该方法拥有一个抽象建造者ActorBuilder类型的参数，
在该方法内部实现了游戏角色对象的逐步构建，代码如下所示：*/
//游戏角色创建控制器：指挥者
class ActorController
{
  //逐步构建复杂产品对象
     public Actor construct(ActorBuilder ab)
     {
            Actor actor;
            ab.buildType();
            ab.buildSex();
            ab.buildFace();
            ab.buildCostume();
            ab.buildHairstyle();
            actor=ab.createActor();
            return actor;
     }
}