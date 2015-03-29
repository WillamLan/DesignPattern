/**  
 * 工程: designpatterndemo <br>
 * 标题: MementoCaretaker.java <br>
 * 描述: TODO <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午3:34:59 <br>
 * 版权: Copyright 2015 1000CHI Software Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.designpattern.behavioral.mementopattern;

/**
 * 类: MementoCaretaker <br>
 * 描述: 象棋棋子备忘录管理类：负责人 <br>
 * 作者: xiaoxiaolan <br>
 * 时间: 2015-3-29 下午3:34:59
 */
class MementoCaretaker {
	private ChessmanMemento memento;  
	  
    public ChessmanMemento getMemento() {  
        return memento;  
    }  
  
    public void setMemento(ChessmanMemento memento) {  
        this.memento = memento;  
    }  
}
