package work_classes;

import com.google.gson.*;
import java.io.*;

public class MyGsonBuilder implements Serializable {

    void gsonCreate(Holder holder, String filePath) {

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        String json = gson.toJson(holder);
        try ( PrintWriter out = new PrintWriter(filePath)) {
            out.println(json);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
