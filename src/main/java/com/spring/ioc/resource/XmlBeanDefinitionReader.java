package com.spring.ioc.resource;

import com.spring.ioc.bean.BeanDefinition;
import com.spring.ioc.bean.PropertyValue;
import com.spring.ioc.bean.PropertyValues;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by majinliang on 16/9/27.
 */
public class XmlBeanDefinitionReader {

    Map<String,BeanDefinition> map = new HashMap<String,BeanDefinition>();

    public void loadBeanDefinitions(String xmlName) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse("");

        //根节点
        Node rootNode = document.getElementsByTagName("beans").item(0);

        //bean节点
        NodeList nodeList = rootNode.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            NamedNodeMap namedNodeMap = node.getAttributes();
            Node idNode = namedNodeMap.getNamedItem("id");
            Node classNode = namedNodeMap.getNamedItem("class");
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setBeanClassName(classNode.getNodeValue());

        }



    }

    private PropertyValues getPropertyValues(Node node,BeanDefinition beanDefinition) {
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        NodeList nodeList = node.getChildNodes();
        return null;
    }
}
