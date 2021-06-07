package work_classes;

import java.util.ArrayList;

public class TypeOfDocumentBuilder {
    public static String DocumentType;

    public TypeOfDocumentBuilder() {
    }

    String CreateDocumentType() {
        ArrayList<String> typeOfDocument = new ArrayList();
        typeOfDocument.add(0, "Petition");
        typeOfDocument.add(1, "Appeal");
        typeOfDocument.add(2, "Request");
        typeOfDocument.add(3, "Reply");
        DocumentType = (String)typeOfDocument.get(0 + (int)(Math.random() * (double)typeOfDocument.size()));
        return DocumentType;
    }
}