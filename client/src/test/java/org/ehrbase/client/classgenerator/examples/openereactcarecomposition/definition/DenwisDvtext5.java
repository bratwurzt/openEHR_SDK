package org.ehrbase.client.classgenerator.examples.openereactcarecomposition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_TEXT")
public class DenwisDvtext5 implements DenwisChoice5 {
    @Path("|value")
    private String valueValue;

    public void setValueValue(String valueValue) {
        this.valueValue = valueValue;
    }

    public String getValueValue() {
        return this.valueValue;
    }
}
