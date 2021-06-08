package work_classes;

import Interfaces.TypeOfCreatedDocsInterface;
import docs.Documents.*;
import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.*;

public class MyXmlBuilder {

//создание перегруженных методов для генерации XML файлов всех типов документов 
    void XmlCreatorDocument(DocumentCommon doc) {
        String fileName = "D:/DocumentCommonXML.xml";
        convertObjectToXml(doc, fileName);
    }

    void XmlCreatorDocument(Task doc) {
        String fileName = "D:/TaskXML.xml";
        convertObjectToXml(doc, fileName);
    }

    void XmlCreatorDocument(Incoming doc) {
        String fileName = "D:/IncomingXML.xml";
        convertObjectToXml(doc, fileName);
    }

    void XmlCreatorDocument(Outgoing doc) {
        String fileName = "D:/OutgoingXML.xml";
        convertObjectToXml(doc, fileName);
    }
    

    public DocumentCommon XmlLoaderDocumentCommon(String fileName) {
        DocumentCommon documentCommon = fromXmlToObjectDocumentCommon(fileName);
        if (documentCommon != null) {
            //System.out.println(documentCommon.toString());
        } else {
            System.out.println("XML-file is empty!");
        }
        return documentCommon;
    }

    public Task XmlLoaderTask(String fileName) {
        Task task = fromXmlToObjectTask(fileName);
        if (task != null) {
            //System.out.println(documentCommon.toString());
        } else {
            System.out.println("XML-file is empty!");
        }
        return task;
    }

    public Incoming XmlLoaderIncoming(String fileName) {
        Incoming incoming = fromXmlToObjectIncoming(fileName);
        if (incoming != null) {
            //System.out.println(documentCommon.toString());
        } else {
            System.out.println("XML-file is empty!");
        }
        return incoming;
    }

    public Outgoing XmlLoaderOutgoing(String fileName) {
        Outgoing outgoing = fromXmlToObjectOutgoing(fileName);
        if (outgoing != null) {
            //System.out.println(documentCommon.toString());
        } else {
            System.out.println("XML-file is empty!");
        }
        return outgoing;
    }

//создание перегруженных методов для десериализации объектов документов всех типов из XML
    private static DocumentCommon fromXmlToObjectDocumentCommon(String filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DocumentCommon.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (DocumentCommon) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Task fromXmlToObjectTask(String filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Task.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (Task) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Incoming fromXmlToObjectIncoming(String filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Incoming.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (Incoming) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Outgoing fromXmlToObjectOutgoing(String filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Outgoing.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (Outgoing) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void convertObjectToXml(DocumentCommon doc, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(DocumentCommon.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(doc, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void convertObjectToXml(Task doc, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Task.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(doc, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void convertObjectToXml(Incoming doc, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Incoming.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(doc, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void convertObjectToXml(Outgoing doc, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Outgoing.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(doc, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    public static void saveToXML(ArrayList<TypeOfCreatedDocsInterface> typeOfCreatedDocsInterface, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(TypeOfCreatedDocsInterface.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(typeOfCreatedDocsInterface, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
