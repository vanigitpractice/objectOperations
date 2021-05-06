package parameterization;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class datareadxml {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		///xml file address  
		String filename  = "C:\\Users\\sures\\OneDrive\\Documents\\Testing\\XMLdata.xml";
		System.out.println(System.getProperty("user.dir"));
		
		 String  nodeName ="Login";
		 
		 ///data from xml 
		 NodeList myNodeL = XmlUDF.fnReadFromXML(filename, nodeName);
		
		 String  myUn ;
		 String myPwd;
	
		 
		 for(int nodeItr=0; nodeItr<myNodeL.getLength();  nodeItr++)
			{
				Node myn  = myNodeL.item(nodeItr);
		
				if(myn.getNodeType()==Node.ELEMENT_NODE)
					{
						Element myEle  = (Element) myn;
						
				{
						////capture data
						myUn = myEle.getElementsByTagName("username").item(1).getTextContent();
						System.out.println(myUn);
						myPwd =  myEle.getElementsByTagName("pwd").item(1).getTextContent();
						System.out.println(myPwd);
						}
					}
				
			}
		 
		 

	}

}
