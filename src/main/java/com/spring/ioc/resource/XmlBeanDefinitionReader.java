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

    Map<String,BeanDefinition> beanMap = new HashMap<String,BeanDefinition>();

    public void loadBeanDefinitions(String xmlName) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        String path = this.getClass().getClassLoader().getResource("").getPath();
        Document document = db.parse(path  + xmlName);
        //根节点
        Node rootNode = document.getElementsByTagName("beans").item(0);
        //bean节点
        NodeList nodeList = rootNode.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if(node.getNodeType()!=1) {
                continue;
            }
            NamedNodeMap namedNodeMap = node.getAttributes();
            Node idNode = namedNodeMap.getNamedItem("id");
            Node classNode = namedNodeMap.getNamedItem("class");
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setBeanClassName(classNode.getNodeValue());
            setPropertyValues(node,beanDefinition);
            beanMap.put(idNode.getNodeValue(),beanDefinition);
        }
    }

    private void setPropertyValues(Node node,BeanDefinition beanDefinition) {
        PropertyValues propertyValues = new PropertyValues();
        NodeList nodeList = node.getChildNodes();
        for(int i=0;i<nodeList.getLength();i++) {
            Node childNode = nodeList.item(i);
            if(childNode.getNodeType()!=1) {
                continue;
            }
            NamedNodeMap namedNodeMap = childNode.getAttributes();
            String name =  namedNodeMap.getNamedItem("name").getNodeValue();
            String value = namedNodeMap.getNamedItem("value").getNodeValue() ;
            PropertyValue propertyValue = new PropertyValue(name,value);
            propertyValues.addPropertyValue(propertyValue);
            beanDefinition.setPropertyValues(propertyValues);
        }
    }

    public static void main(String args []) {

        XmlBeanDefinitionReader xdr = new XmlBeanDefinitionReader();
        try {
            xdr.loadBeanDefinitions("beans.xml");
            Map map = xdr.beanMap;
            System.out.println(map.size());
        } catch(Exception e) {
            e.printStackTrace();
        }



    }
}
