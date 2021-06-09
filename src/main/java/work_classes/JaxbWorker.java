package work_classes;

import docs.Documents.*;
import java.util.Scanner;

public class JaxbWorker {

        public static void main(String[] args) {
//use a scanner
        Scanner sc = new Scanner(System.in);
//create the object XML-class
        MyXmlBuilder xb = new MyXmlBuilder();
//create the object JSON-class
        MyGsonBuilder mgb = new MyGsonBuilder();
//create factory object
        DocumentFactory df = new DocumentFactory();
//create a colletction for docs
        Holder holder = new Holder();
        
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
                                AbstractDocument documentCommon = df.CreateDocumentCommon();
                                holder.addThing(documentCommon);
                                System.out.println("\nDocument documentCommon created!\n");
                                break;
                            case "2":
                                AbstractDocument documentIncoming = df.CreateDocumentIncoming();
                                holder.addThing(documentIncoming);
                                System.out.println("\nDocument Incoming created!\n");
                                break;
                            case "3":
                                AbstractDocument documentOutgoing = df.CreateDocumentOutgoing();
                                holder.addThing(documentOutgoing);
                                System.out.println("\nDocument Outgoing created!\n");
                                break;
                            case "4":
                                AbstractDocument documentTask = df.CreateDocumentTask();
                                holder.addThing(documentTask);
                                System.out.println("\nDocument Task created!\n");
                                break;
                            case "0":
                                i1 = 0;
                                break;
                            default:
                                System.out.println("Enter correct value, please.\n");
                                break;
                        }
                    } while (i1 != 0);
                    break;
                case "2":
                    holder.print();
                    break;
                case "3":
                    holder.sort();
                    break;
                case "4":
                    int i4 = 1;
                    do {
                        System.out.println("Enter \"1\" to save list of documents in XML format.\n"
                                + "Enter \"2\" to save list of documents in JSON format.\n"
                                + "Enter \"0\" to go back.\n");
                        switch (sc.next()) {

                            case "1":
                                xb.saveToXML(holder, "D:/XML.xml");
                                System.out.println("List of documents has been saved to XML-format file!\n");
                                break;
                            case "2":
                                mgb.gsonCreate(holder, "D:/JSON.txt");
                                System.out.println("List of documents has been saved to JSON-format file!\n");
                                break;
                            case "0":
                                i4 = 0;
                                break;
                            default:
                                System.out.println("Enter correct value, please.\n");
                                break;
                        }
                    } while (i4 != 0);
                    break;
                case "0":
                    i = 0;
                    break;
                default:
                    System.out.println("Enter correct value, please.\n");
            }
        } while (i != 0);
    }
}
