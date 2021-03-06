package org.ehrbase.client.classgenerator.examples.virologischerbefundcomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

import java.util.List;

@Entity
@Archetype("openEHR-EHR-CLUSTER.anatomical_location.v1")
public class AnatomischeLokalisationCluster {
    @Path("/items[at0053]")
    private List<Cluster> alternativeStruktur;

    @Path("/items[at0001]/value|value")
    private String nameDerKorperstelleValue;

    @Path("/items[at0054]")
    private List<Cluster> multimedialeDarstellung;

    public void setAlternativeStruktur(List<Cluster> alternativeStruktur) {
        this.alternativeStruktur = alternativeStruktur;
    }

    public List<Cluster> getAlternativeStruktur() {
        return this.alternativeStruktur;
    }

    public void setNameDerKorperstelleValue(String nameDerKorperstelleValue) {
        this.nameDerKorperstelleValue = nameDerKorperstelleValue;
    }

    public String getNameDerKorperstelleValue() {
        return this.nameDerKorperstelleValue;
    }

    public void setMultimedialeDarstellung(List<Cluster> multimedialeDarstellung) {
        this.multimedialeDarstellung = multimedialeDarstellung;
    }

    public List<Cluster> getMultimedialeDarstellung() {
        return this.multimedialeDarstellung;
    }
}
