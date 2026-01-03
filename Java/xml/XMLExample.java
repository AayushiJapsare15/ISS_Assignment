package xml;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

class XMLExample {
    public static void main(String[] args) {

        try {
            File file = new File("Java/xml/student.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            doc.getDocumentElement().normalize();

            Element root = doc.getDocumentElement();

            String id = root.getElementsByTagName("id").item(0).getTextContent();
            String name = root.getElementsByTagName("name").item(0).getTextContent();
            String marks = root.getElementsByTagName("marks").item(0).getTextContent();
            String passed = root.getElementsByTagName("passed").item(0).getTextContent();

            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Passed: " + passed);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
