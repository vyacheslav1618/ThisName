package work_classes;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlBuilder {

    DocumentFactory DF = new DocumentFactory();

    public void XmlCreator() {

//начало конвертора XML
//директория XML-файла
        String fileName = "D:/employee.xml";

        //создаем объект DocumentForXml
        //DF.getId();
        // сохраняем объект в XML файл
        convertObjectToXml(DF, fileName);

//        // восстанавливаем объект из XML файла
//        Student unmarshStudent = fromXmlToObject(fileName);
//        if (unmarshStudent != null) {
//            System.out.println(unmarshStudent.toString());
    }

//    // восстанавливаем объект из XML файла
//    private static Student fromXmlToObject(String filePath) {
//        try {
//            // создаем объект JAXBContext - точку входа для JAXB
//            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
//            Unmarshaller un = jaxbContext.createUnmarshaller();
//
//            return (Student) un.unmarshal(new File(filePath));
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    // сохраняем объект в XML файл
    private static void convertObjectToXml(DocumentFactory DF, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(DocumentFactory.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(DF, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    //конец конвертора XML
}
