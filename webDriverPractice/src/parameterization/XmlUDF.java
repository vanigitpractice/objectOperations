package parameterization;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlUDF {
	
	//data read from xml file
			//identify the file
			//create instance of document builder factory
			//identify the document builder,associate the document,nodes information,specific node,specific element
		
			public static  NodeList myListNode;
			public static NodeList  fnReadFromXML(String filename, String nodeName ) throws ParserConfigurationException, SAXException, IOException
			{
	
			///identify the file    
			File myFile  = new File(filename);
			
			//create instance of docement builder
			DocumentBuilderFactory mydbf=DocumentBuilderFactory.newInstance();
			
			//identify the document  builder 
			DocumentBuilder mydb=mydbf.newDocumentBuilder();
			//associate the document
			
			Document mydoc = mydb.parse(myFile);
			//capture root element
			//+System.out.println("Root element "+mydoc.getDocumentElement().getNodeName());
			//identify the specific node
			 myListNode=mydoc.getElementsByTagName(nodeName);
			/////display the elements and values  
			//System.out.println(mynl.getLength());
			
		/*	for(int nodeItr=0; nodeItr<mynl.getLength();  nodeItr++)
			{			
				Node myn  = mynl.item(nodeItr);
				System.out.println(myn.getNodeName());
				{				
					if(myn.getNodeType()==Node.ELEMENT_NODE)
					{
						Element myEle  = (Element) myn;
						////capture data  
						System.out.println(myEle.getElementsByTagName("firstname").item(0).getTextContent());
						System.out.println(myEle.getElementsByTagName("lastname").item(0).getTextContent());
					}
				}	
			}*/
			 return myListNode;
			
			}
}
