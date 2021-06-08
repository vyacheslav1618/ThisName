package work_classes;

import Interfaces.TypeOfCreatedDocsInterface;
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
        //create factory object
        DocumentFactory df = new DocumentFactory();
//create a colletction for docs
        ArrayList<TypeOfCreatedDocsInterface> typeOfCreatedDocsInterface = new ArrayList<>();
        
        
//start of factory
        int i = 1;
        do {
            System.out.println("Enter \"1\" to create a new document.\n"
                    + "Enter \"2\" to show a list of documents.\n"
                    + "Enter \"3\" to sort a documents by ID.\n"
                    + "Enter \"4\" to save list to file.\n"
                    + "Enter \"0\" to exit\n"
                    + "Enter your value: ");
            switch (sc.next()) {

                case "1":
                    int i1 = 1;
                    do {
                        System.out.println("Enter \"1\" to create a DocumentCommon type.\n"
                                + "Enter \"2\" to create a Incoming type.\n"
                                + "Enter \"3\" to create a Outgoing type.\n"
                                + "Enter \"4\" to create a Task type.\n"
                                + "Enter \"0\" to go back.\n"
                                + "Enter your value: ");
                        switch (sc.next()) {

                            case "1":
                                //create DocumentCommon in factory
                                TypeOfCreatedDocsInterface documentCommon = df.CreateDocumentCommon();
                                typeOfCreatedDocsInterface.add(documentCommon);
                                System.out.println("\nDocument documentCommon created!\n");
                                
                               // int p1 = 0;
                                
                                //check for exsisting ID
//                                for (DocumentCommon d : documentCommonList) {
//                                    if (d.getId() == DocumentJSON.getId()) {
//                                        p1 = 1;
//                                        break;
//                                    }
//                                }
                                
//                                if (p1 == 1) {
//                                    System.out.println("Id exsists! Document has not been created.");
//                                } else {
//                                    //pushback element to list
//                                    documentCommonList.add(DocumentJSON);
//                                    //вызов метода для сериализации объекта фабрики в JSON
//                                    mgb.gsonCreate(DocumentJSON);
//                                }
                                break;
                            case "2":
                                TypeOfCreatedDocsInterface documentIncoming = df.CreateDocumentIncoming();
                                typeOfCreatedDocsInterface.add(documentIncoming);
                                System.out.println("\nDocument Incoming created!\n");
                                break;
                            case "3":
                                TypeOfCreatedDocsInterface documentOutgoing = df.CreateDocumentOutgoing();
                                typeOfCreatedDocsInterface.add(documentOutgoing);
                                System.out.println("\nDocument Outgoing created!\n");
                                break;
                            case "4":
                                TypeOfCreatedDocsInterface documentTask = df.CreateDocumentTask();
                                typeOfCreatedDocsInterface.add(documentTask);
                                System.out.println("\nDocument Task created!\n");
                                break;
                            case "0":
                                i1 = 0;
                                break;
                            default:
                                System.out.println("Enter correct value, please.");
                                break;
                        }
                    } while (i1 != 0);
                    break;

                case "2":
                    for(TypeOfCreatedDocsInterface p : typeOfCreatedDocsInterface){
                    System.out.println(p.toString());
                    }
                    break;
                case "3":
                     Collections.sort(typeOfCreatedDocsInterface);
                     
                                System.out.println("List has been sorted by ID");
                                break;

                case "4":
                    int i4 = 1;
                    do {
                        System.out.println("Enter \"1\" to save list of documents in XML format.\n"
                                + "Enter \"2\" to save list of documents in JSON format.\n"
                                + "Enter \"0\" to go back.\n");
                        switch (sc.next()) {

                            case "1":
                                xb.saveToXML(typeOfCreatedDocsInterface, "D:/1.xml");
                                break;
                            case "2":
                                mgb.gsonCreate(typeOfCreatedDocsInterface);
                                break;
                            case "0":
                                i4 = 0;
                                break;
                            default:
                                System.out.println("Enter correct value, please.");
                                break;
                        }
                    } while (i4 != 0);
                    break;
                case "0":
                    i = 0;
                    break;
                default:
                    System.out.println("Enter correct value, please.");
            }

        } while (i != 0);
    }
}
