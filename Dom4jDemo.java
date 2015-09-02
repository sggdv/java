package com.sggdv.demo.dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;

/**
* 展示dom4j的用法
* <a href="http://www.dom4j.org/">dom4j官网</a>
* @version dom4j-1.6.1.jar 
* 	jaxen-1.1.6.jar
*/
public class Dom4jDemo {

	private String xml = new StringBuffer()
		.append("<xml>")
		.append("<ToUserName><![CDATA[gh_9e77e303748b]]></ToUserName>")
		.append("<FromUserName><![CDATA[o5Onqt5UfXDInq-QkFYM0w107cZs]]></FromUserName>")
		.append("<CreateTime>1440733616</CreateTime>")
		.append("<MsgType><![CDATA[event]]></MsgType>")
		.append("<Event><![CDATA[SCAN]]></Event>")
		.append("<EventKey><![CDATA[123]]></EventKey>")
		.append("<Ticket><![CDATA[gQF88DoAAAAAAAAAASxodHRwOi8vd2VpeGluLnFxLmNvbS9xL1pVeXJZTjdra1czb0pGN05hV0lnAAIEfdnfVQMEgDoJAA==]]></Ticket>")
		.append("</xml>")
		.toString();

	public void demo1() throws Exception {
		Document document = DocumentHelper.parseText(xml);
		Element root = document.getRootElement();
		Element toUserName = root.element("ToUserName");

		System.out.println(toUserName.getData().toString());
	}

	/**
	* Jaxen 
	*/
	public void demo2() throws Exception {
		Document document = DocumentHelper.parseText(xml);
		Node node = document.selectSingleNode("//xml/Event"); // XPath

		System.out.println(node.getText());
	}


	public static void main (String[] args) throws Exception {
		Dom4jDemo demo = new Dom4jDemo();
		demo.demo1();
		demo.demo2();
	}

}