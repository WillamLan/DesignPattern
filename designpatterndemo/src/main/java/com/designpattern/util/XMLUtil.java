package com.designpattern.util;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class XMLUtil {  
//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象  
    public static Object getBean(String args) {  
        try {  
            //创建文档对象  
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder = dFactory.newDocumentBuilder();  
            Document doc;    
          //这个配置可以做成一个界面，来设置Config.xml中的className来决定使用来个具体实现。
            doc = builder.parse(new File("config.xml"));   
            NodeList nl=null;  
            Node classNode=null;  
            String cName=null;  
            nl = doc.getElementsByTagName("className");  
            //下面是判断取得配置文件Config.xml中配置的类名（注：考虑到类名节点越多判断条件随着增加应该对它进行单独处理，以实现职责的分离）
			if (args.equals("ssf")) {
				classNode = nl.item(0).getFirstChild();
			} else if (args.equals("ab")) {
				classNode = nl.item(1).getFirstChild();
			} else if (args.equals("oa")) {
				classNode = nl.item(2).getFirstChild();
			} else if (args.equals("image")) {
				// 获取第一个包含类名的节点，即扩充抽象类
				classNode = nl.item(3).getFirstChild();

			} else if (args.equals("os")) {
				// 获取第二个包含类名的节点，即具体实现类
				classNode = nl.item(4).getFirstChild();
			}
              
             cName=classNode.getNodeValue();  
             //通过类名生成实例对象并将其返回  
             Class<?> c=Class.forName(cName);  
             Object obj=c.newInstance();  
             return obj;          
           }     
           catch(Exception e) {  
              e.printStackTrace();  
              return null;  
          }  
     }  
}  