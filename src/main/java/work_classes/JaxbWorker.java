package work_classes;

import docs.Documents.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JaxbWorker {

    public static void main(String[] args) {
        //создание объекта для ввода с консоли
        Scanner sc = new Scanner(System.in);
        //создание объекта для работы с XML
        MyXmlBuilder xb = new MyXmlBuilder();
        //создание объекта для работы с JSON
        MyGsonBuilder mgb = new MyGsonBuilder();
        //создание объекта фабрики
        DocumentFactory df = new DocumentFactory();
//create the collection for keeping new documents
        ArrayList<DocumentCommon> documentCommonList = new ArrayList<>();
        ArrayList<Task> taskList = new ArrayList<>();
        ArrayList<Incoming> incomingList = new ArrayList<>();
        ArrayList<Outgoing> outgoingList = new ArrayList<>();

//Фабрика начало
        int i = 1;
        do {
            System.out.println("Press \"1\" to enter a \"DocumentCommon\" menu\n"
                    + "Enter \"2\" to enter a \"Task\"\n"
                    + "Enter \"3\" to enter a \"Incoming\"\n"
                    + "Enter \"4\" to enter a \"Outgoing\"\n"
                    + "Enter \"5\" to load objects from XML-files\n"
                    + "Press \"0\" to exit\n"
                    + "Enter your value: ");
            switch (sc.next()) {

                case "1":
                    int i1 = 1;
                    do {
                        System.out.println("Press \"0\" to go back.\n"
                                + "Press \"1\" to create new Document in JSON format.\n"
                                + "Press \"2\" to create new Document in XML format.\n"
                                + "Press \"3\" to show list.\n"
                                + "Press \"4\" to sort by ID\n");
                        switch (sc.next()) {

                            case "1":
                                //создаем DocumentCommon в фабрике и выводим в строку
                                DocumentCommon DocumentJSON = df.CreateDocumentCommon();
                                int p1 = 0;
                                for (DocumentCommon d : documentCommonList) {
                                    if (d.getId() == DocumentJSON.getId()) {
                                        p1 = 1;
                                        break;
                                    }
                                }
                                if (p1 == 1) {
                                    System.out.println("Id exsists! Document has not been created.");
                                } else {
                                    //pushback element to list
                                    documentCommonList.add(DocumentJSON);
                                    //вызов метода для сериализации объекта фабрики в JSON
                                    mgb.gsonCreate(DocumentJSON);
                                }
                                break;
                            case "2":
                                //создаем DocumentCommon в фабрике и выводим в строку
                                DocumentCommon DocumentXML = df.CreateDocumentCommon();
                                //pushback element to list
                                documentCommonList.add(DocumentXML);
                                //генерация XML-файла из созданного документа
                                xb.XmlCreatorDocument(DocumentXML);
                                System.out.println(DocumentXML.toString());
                                break;
                            case "3":
                                System.out.println("List of documents:");
                                for (DocumentCommon d : documentCommonList) {
                                    System.out.println(d.toString());
                                }
                                break;
                            case "4":
                                Collections.sort(documentCommonList);
                                System.out.println("List has been sorted by ID");
                                break;
                            case "0":
                                i1 = 0;
                                break;
                            default:
                                System.out.println("Chose correct value, please.");
                                break;
                        }
                    } while (i1 != 0);
                    break;

                case "2":
                    int i2 = 1;
                    do {
                        System.out.println("Press \"1\" to create new Task in JSON format.\n"
                                + "Press \"2\" to create new Task in XML format.\n"
                                + "Press \"3\" to show list.\n"
                                + "Press \"4\" to sort by ID\n"
                                + "Press \"0\" to go back.\n");
                        switch (sc.next()) {

                            case "1":
                                //создаем Task в фабрике и выводим в строку
                                Task DocumentJSON = df.CreateDocumentTask();
                                int p1 = 0;
                                for (Task d : taskList) {
                                    if (d.getId() == DocumentJSON.getId()) {
                                        p1 = 1;
                                        break;
                                    }
                                }
                                if (p1 == 1) {
                                    System.out.println("Id exsists! Document Task has not been created.");
                                } else {
                                    //pushback element to list
                                    taskList.add(DocumentJSON);
                                    //вызов метода для сериализации объекта фабрики в JSON
                                    mgb.gsonCreate(DocumentJSON);
                                }
                                break;
                            case "2":
                                //создаем Task в фабрике и выводим в строку
                                Task DocumentXML = df.CreateDocumentTask();
                                //pushback element to list
                                taskList.add(DocumentXML);
                                //генерация XML-файла из созданного документа
                                xb.XmlCreatorDocument(DocumentXML);
                                System.out.println(DocumentXML.toString());
                                break;
                            case "3":
                                System.out.println("List of documents:");
                                for (Task d : taskList) {
                                    System.out.println(d.toString());
                                }
                                break;
                            case "4":
                                Collections.sort(taskList);
                                System.out.println("List has been sorted by ID");
                                break;
                            case "0":
                                i2 = 0;
                                break;
                            default:
                                System.out.println("Chose correct value, please.");
                                break;
                        }
                    } while (i2 != 0);
                    break;
                case "3":
                    int i3 = 1;
                    do {
                        System.out.println("Press \"1\" to create new Incoming in JSON format.\n"
                                + "Press \"2\" to create new Incoming in XML format.\n"
                                + "Press \"3\" to show list.\n"
                                + "Press \"4\" to sort by ID\n"
                                + "Press \"0\" to go back.\n");
                        switch (sc.next()) {

                            case "1":
                                //создаем Incoming в фабрике и выводим в строку
                                Incoming DocumentJSON = df.CreateDocumentIncoming();
                                int p1 = 0;
                                for (Incoming d : incomingList) {
                                    if (d.getId() == DocumentJSON.getId()) {
                                        p1 = 1;
                                        break;
                                    }
                                }
                                if (p1 == 1) {
                                    System.out.println("Id exsists! Document Incoming has not been created.");
                                } else {
                                    //pushback element to list
                                    incomingList.add(DocumentJSON);
                                    //вызов метода для сериализации объекта фабрики в JSON
                                    mgb.gsonCreate(DocumentJSON);
                                }
                                break;
                            case "2":
                                //создаем Incoming в фабрике и выводим в строку
                                Incoming DocumentXML = df.CreateDocumentIncoming();
                                //pushback element to list
                                incomingList.add(DocumentXML);
                                //генерация XML-файла из созданного документа
                                xb.XmlCreatorDocument(DocumentXML);
                                System.out.println(DocumentXML.toString());
                                break;
                            case "3":
                                System.out.println("List of documents:");
                                for (Incoming d : incomingList) {
                                    System.out.println(d.toString());
                                }
                                break;
                            case "4":
                                Collections.sort(incomingList);
                                System.out.println("List has been sorted by ID");
                                break;
                            case "0":
                                i3 = 0;
                                break;
                            default:
                                System.out.println("Chose correct value, please.");
                                break;
                        }
                    } while (i3 != 0);
                    break;

                case "4":
                    int i4 = 1;
                    do {
                        System.out.println("Press \"1\" to create new Outgoing in JSON format.\n"
                                + "Press \"2\" to create new Outgoing in XML format.\n"
                                + "Press \"3\" to show list.\n"
                                + "Press \"4\" to sort by ID\n"
                                + "Press \"0\" to go back.\n");
                        switch (sc.next()) {

                            case "1":
                                //создаем Outgoing в фабрике и выводим в строку
                                Outgoing DocumentJSON = df.CreateDocumentOutgoing();
                                int p1 = 0;
                                for (Outgoing d : outgoingList) {
                                    if (d.getId() == DocumentJSON.getId()) {
                                        p1 = 1;
                                        break;
                                    }
                                }
                                if (p1 == 1) {
                                    System.out.println("Id exsists! Document Outgoing has not been created.");
                                } else {
                                    //pushback element to list
                                    outgoingList.add(DocumentJSON);
                                    //вызов метода для сериализации объекта фабрики в JSON
                                    mgb.gsonCreate(DocumentJSON);
                                }
                                break;
                            case "2":
                                //создаем Outgoing в фабрике и выводим в строку
                                Outgoing DocumentXML = df.CreateDocumentOutgoing();
                                //pushback element to list
                                outgoingList.add(DocumentXML);
                                //генерация XML-файла из созданного документа
                                xb.XmlCreatorDocument(DocumentXML);
                                System.out.println(DocumentXML.toString());
                                break;
                            case "3":
                                System.out.println("List of documents:");
                                for (Outgoing d : outgoingList) {
                                    System.out.println(d.toString());
                                }
                                break;
                            case "4":
                                Collections.sort(outgoingList);
                                System.out.println("List has been sorted by ID");
                                break;
                            case "0":
                                i4 = 0;
                                break;
                            default:
                                System.out.println("Chose correct value, please.");
                                break;
                        }
                    } while (i4 != 0);
                    break;
//end of factory
                case "5":
                    //кейс для изъятия информации из XML-файлов
                    DocumentCommon Document4
                            = xb.XmlLoaderDocumentCommon("D:/1.xml");
                    System.out.println(Document4.toString());

                    DocumentCommon Document5
                            = xb.XmlLoaderDocumentCommon("D:/2.xml");
                    System.out.println(Document5.toString());
                    DocumentCommon Document6
                            = xb.XmlLoaderDocumentCommon("D:/3.xml");
                    System.out.println(Document6.toString());
                    System.out.println("Do you want to create another document?\n"
                            + "Enter \"0\" to decline it. Enter \"1\" to accept.");
                    switch (sc.next()) {
                        case "0":
                            i = 0;
                            break;
                        case "1":
                            System.out.println("Enter the number of document's wanted type, please: ");
                            break;
                        default:
                            System.out.println("Chose correct value, please.");
                            break;
                    }
                    break;
                case "0":
                    i = 0;
                    break;
                default:
                    System.out.println("Chose correct value, please.");
            }

        } while (i != 0);
    }
}
