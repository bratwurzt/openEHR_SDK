package org.ehrbase.client.classgenerator.examples.smicsbefundcomposition.definition;

import com.nedap.archie.rm.datavalues.encapsulated.DvMultimedia;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class EigenschaftenDesBeteiligtenErregersErregertypisierungErgebnisElement {
    @Path("/value")
    private DvMultimedia value;

    public void setValue(DvMultimedia value) {
        this.value = value;
    }

    public DvMultimedia getValue() {
        return this.value;
    }
}
