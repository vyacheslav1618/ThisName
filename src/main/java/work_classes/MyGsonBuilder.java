package work_classes;

import com.google.gson.*;
import docs.Documents.*;
import java.io.*;

public class MyGsonBuilder implements Serializable {

    void gsonCreate(DocumentCommon doc) {

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        String json = gson.toJson(doc);
        //сериализация в JSON
        System.out.println("Generated file JSON-format:");
        System.out.println(json);
        //создание файла в директории для сериализации объекта в JSON
        try (PrintWriter out = new PrintWriter("D://"+ doc.getAuthors_name()
                +".DocumentCommon.JSON.txt")) {
            out.println(json);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    void gsonCreate(Task doc) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        String json = gson.toJson(doc);
        //сериализация в JSON
        System.out.println("Generated file JSON-format:");
        System.out.println(json);
        //создание файла в директории для сериализации объекта в JSON
        try (PrintWriter out = new PrintWriter("D://"
                + doc.getResponsible_executor()+".Task.JSON.txt")) {
            out.println(json);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    void gsonCreate(Incoming doc) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        String json = gson.toJson(doc);
        //сериализация в JSON
        System.out.println("Generated file JSON-format:");
        System.out.println(json);
        //создание файла в директории для сериализации объекта в JSON
        try (PrintWriter out = new PrintWriter("D://"+ doc.getSender()
                +".Incoming.JSON.txt")) {
            out.println(json);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    void gsonCreate(Outgoing doc) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        String json = gson.toJson(doc);
        //сериализация в JSON
        System.out.println("Generated file JSON-format:");
        System.out.println(json);
        //создание файла в директории для сериализации объекта в JSON
        try (PrintWriter out = new PrintWriter("D://"+ doc.getSender()
                +".Outgoing.JSON.txt")) {
            out.println(json);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
