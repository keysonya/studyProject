package dependencyInversion;

/**
 * Created by anakasimova on 17/07/2018.
 */
public class DefinitionProperty {

    private String name;
    private String value;
    private String reference;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
