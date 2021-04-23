package work_classes;

import docs.Documents.*;
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
//Фабрика начало
        System.out.println("Enter \"1\" to create a new Document\n"
                + "Enter \"2\" to create a new Task\n"
                + "Enter \"3\" to create a new Incoming\n"
                + "Enter \"4\" to create a new Outgoing\n"
                + "Enter \"5\" to load objects from XML-files\n"
                + "Enter your value: ");

        int i = 1;
        do {
            switch (sc.next()) {
                case "1":
                    //создаем DocumentCommon в фабрике и выводим в строку
                    DocumentCommon Document = df.CreateDocumentCommon();
                    //генерация XML-файла из созданного документа
                    xb.XmlCreatorDocument(Document);
                    System.out.println(Document.toString());
                    //вызов метода для сериализации объекта фабрики в JSON
                    mgb.gsonCreate(Document);
                    //конструкция для запроса на создание нового документа
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
                case "2":
                    //создаем Task в фабрике и выводим в строку
                    Task Document1 = df.CreateDocumentTask();
                    //генерация XML-файла из созданного документа
                    xb.XmlCreatorDocument(Document1);
                    System.out.println(Document1.toString());
                    //вызов метода для сериализации объекта фабрики в JSON
                    mgb.gsonCreate(Document1);
                    //конструкция для запроса на создание нового документа
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
                case "3":
                    //создаем Incoming в фабрике и выводим в строку
                    Incoming Document2 = df.CreateDocumentIncoming();
                    //генерация XML-файла из созданного документа
                    xb.XmlCreatorDocument(Document2);
                    System.out.println(Document2.toString());
                    //вызов метода для сериализации объекта фабрики в JSON
                    mgb.gsonCreate(Document2);
                    //конструкция для запроса на создание нового документа
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
                case "4":
                    //создаем Outgoing в фабрике и выводим в строку
                    Outgoing Document3 = df.CreateDocumentOutgoing();
                    //генерация XML-файла из созданного документа
                    xb.XmlCreatorDocument(Document3);
                    System.out.println(Document3.toString());
                    //вызов метода для сериализации объекта фабрики в JSON
                    mgb.gsonCreate(Document3);
                    //конструкция для запроса на создание нового документа
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
//Фабрика конец
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
                default:
                    System.out.println("Chose correct value, please.");
            }
        } while (i != 0);
//Фабрика конец
    }

}
