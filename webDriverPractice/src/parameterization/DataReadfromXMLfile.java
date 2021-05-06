package parameterization;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DataReadfromXMLfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//data read from xml file
		//identify the file
		//create instance of document builder factory
		//identify the document builder,associate the document,nodes information,specific node,specific element
		//ass
		
		///identify the file    
		File myFile  = new File("C:\\Users\\sures\\OneDrive\\Documents\\Testing\\XMLdata.xml");
		
		//create instance of docement builder
		DocumentBuilderFactory mydbf=DocumentBuilderFactory.newInstance();
		
		//identify the document  builder 
		DocumentBuilder mydb=mydbf.newDocumentBuilder();
		//associate the document
		
		Document mydoc = mydb.parse(myFile);
		//capture root element
		System.out.println("Root Node Type"+mydoc.getDocumentElement().getNodeType());
		System.out.println(mydoc.getDocumentElement().getNodeName());
		//identify the specific node
		NodeList mynl=mydoc.getElementsByTagName("Registration");
		/////display the elements and values  
		System.out.println(mynl.getLength());
		
		for(int nodeItr=0; nodeItr<mynl.getLength();  nodeItr++)
		{
			Node myn  = mynl.item(nodeItr);
			System.out.println(myn.getNodeName());
			System.out.println("getNodeType "+myn.getNodeType());
			{				
				if(myn.getNodeType()==Node.ELEMENT_NODE)
				{
					NodeList MyEL=myn.getChildNodes();
					//Element myEle  = (Element) myn;
					
			for (int j=0;j<=MyEL.getLength();j++)
			{
				Element myEle  =(Element) MyEL.item(j);
				System.out.println("My Element"+myEle);
			}
					
					////capture data  
					/*System.out.println(myEle.getElementsByTagName("firstname").item(1).getTextContent());
					System.out.println(myEle.getElementsByTagName("lastname").item(1).getTextContent());*/
				}
			}
		}
			
		
		

	}

}
