/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dom;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author J2EE-33
 */
public class DomParserex {

    public static void main(String[] args) {
        try {
            File inputFile = new File("D:\\Users\\J2EE-33\\Documents\\NetBeansProjects\\core-java\\AdvancedJava\\src\\com\\dom\\studentXMLDocument.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println("------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element: " + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Student roll no :" + eElement.getAttribute("rollno"));
                    System.out.println("First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Nick Name: " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
        }
    }
}
