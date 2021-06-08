package work_classes;

import Interfaces.TypeOfCreatedDocsInterface;
import com.google.gson.*;
import docs.Documents.*;
import java.io.*;
import java.util.ArrayList;

public class MyGsonBuilder implements Serializable {

    void gsonCreate(ArrayList<TypeOfCreatedDocsInterface> typeOfCreatedDocsInterface) {

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        String json = gson.toJson(typeOfCreatedDocsInterface);
        try ( PrintWriter out = new PrintWriter("D://ListOfDocs.JSON.txt")) {
            out.println(json);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
