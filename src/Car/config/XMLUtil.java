package Car.config;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class XMLUtil {
	public static void main(String args[]) {
		
		Element element = null;
		// 路径
		File f = new File("src/Car/config/config.xml");
		DocumentBuilder db = null;
		DocumentBuilderFactory dbf = null;
		try {
			// 创建DocumentBuilderFactory的实例
			dbf = DocumentBuilderFactory.newInstance();
			// 创建newDocumentBuilder的实例
			db = dbf.newDocumentBuilder();
			Document dt = db.parse(f);// 得到一个DOM
			element = dt.getDocumentElement();
			String nodeName = element.getNodeName();
			System.out.println("根元素：" + nodeName);
			// 根元素下的所有子节点
			NodeList childNodes = element.getChildNodes();
			// 遍历这些子节点
			for (int i = 0; i < childNodes.getLength(); i++) {
				// 获得每个对应位置i的结点
				Node node1 = childNodes.item(i);
				if ("bean".equals(node1.getNodeName())) {
					String sClass = node1.getAttributes().getNamedItem("class").getNodeValue();
					System.out.println(sClass);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}