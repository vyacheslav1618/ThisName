package work_classes;

import docs.Documents.*;
import java.io.File;
import javax.xml.bind.*;

public class MyXmlBuilder {

    public static void saveToXML(Holder holder, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Outgoing.class, Task.class, DocumentCommon.class, Incoming.class, Holder.class, AbstractDocument.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(holder, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
