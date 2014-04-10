package com.xanthodont.dom;

import java.io.InputStream;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlDom {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		read();
	}

	public static void read() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = dbf.newDocumentBuilder();
			InputStream in = XmlDom.class.getClassLoader().getResourceAsStream("test.xml");
			Document doc = builder.parse(in);
			Element root = doc.getDocumentElement();
			if (root == null) {
				System.out.println("root is null!");
				return ;
			}
			System.out.printf("root's attribute of name: %s", root.getAttribute("name"));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
