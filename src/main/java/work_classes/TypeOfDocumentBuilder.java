package work_classes;

import java.util.ArrayList;

public class TypeOfDocumentBuilder {
    public static String DocumentType;

    public TypeOfDocumentBuilder() {
    }

    String CreateDocumentType() {
        ArrayList<String> type_of_document = new ArrayList();
        type_of_document.add(0, "Petition");
        type_of_document.add(1, "Appeal");
        type_of_document.add(2, "Request");
        type_of_document.add(3, "Reply");
        DocumentType = (String)type_of_document.get(0 + (int)(Math.random() * (double)type_of_document.size()));
        return DocumentType;
    }
}