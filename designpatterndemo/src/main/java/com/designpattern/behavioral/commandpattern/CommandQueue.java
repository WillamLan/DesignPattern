/**  
 * 工程: designpatterndemo <br>
 * 标题: CommandQueue.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午11:20:42 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.commandpattern;

import java.util.ArrayList;

/**
 * 类: CommandQueue <br>
 * 描述: 命令队列类 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-25 下午11:20:42
 */
class CommandQueue {
	//定义一个ArrayList来存储命令队列  
    private ArrayList<Command> commands = new ArrayList<Command>();  
      
    public void addCommand(Command command) {  
        commands.add(command);  
    }  
      
    public void removeCommand(Command command) {  
        commands.remove(command);  
    }  
      
    //循环调用每一个命令对象的execute()方法  
    public void execute() {  
        for (Object command : commands) {  
            ((Command)command).execute();  
        }  
    }  
}
