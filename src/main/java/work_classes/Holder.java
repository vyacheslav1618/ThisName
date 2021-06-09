package work_classes;

import docs.Documents.AbstractDocument;
import java.util.ArrayList;
import java.util.Collections;
import javax.xml.bind.annotation.*;
//adapter for JAXB
@XmlRootElement
public class Holder {

    ArrayList<AbstractDocument> typeOfCreatedDocsInterface;

    public Holder() {
        typeOfCreatedDocsInterface = new ArrayList<>();
    }

    @XmlElementWrapper
    @XmlAnyElement(lax = true)
    public ArrayList<AbstractDocument> getTypeOfCreatedDocsInterface() {
        return typeOfCreatedDocsInterface;
    }

    public void addThing(AbstractDocument thing) {
        typeOfCreatedDocsInterface.add(thing);
    }
//create a print method for list of documents
    public void print() {

        for (AbstractDocument p : typeOfCreatedDocsInterface) {
            System.out.println(p.toString());
        }
    }
//create a sort method for list of documents
    public void sort() {
        Collections.sort(typeOfCreatedDocsInterface);
        System.out.println("List has been sorted by ID");
    }
}
