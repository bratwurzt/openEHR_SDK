package org.ehrbase.client.classgenerator.examples.openereactcarecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.examples.shareddefinition.Language;

import java.time.temporal.TemporalAccessor;

public class HeightObservationContainment extends Containment {
  public SelectAqlField<HeightObservation> HEIGHT_OBSERVATION = new AqlFieldImp<HeightObservation>(HeightObservation.class, "", "HeightObservation", HeightObservation.class, this);

  public SelectAqlField<Double> HEIGHT_LENGTH_MAGNITUDE = new AqlFieldImp<Double>(HeightObservation.class, "/data[at0001]/events[at0002]/data[at0003]/items[at0004]/value|magnitude", "heightLengthMagnitude", Double.class, this);

  public SelectAqlField<String> HEIGHT_LENGTH_UNITS = new AqlFieldImp<String>(HeightObservation.class, "/data[at0001]/events[at0002]/data[at0003]/items[at0004]/value|units", "heightLengthUnits", String.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(HeightObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<Cluster> DEVICE = new AqlFieldImp<Cluster>(HeightObservation.class, "/protocol[at0007]/items[at0011]", "device", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(HeightObservation.class, "/protocol[at0007]/items[at0022]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(HeightObservation.class, "/data[at0001]/events[at0002]/time|value", "timeValue", TemporalAccessor.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(HeightObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(HeightObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  private HeightObservationContainment() {
    super("openEHR-EHR-OBSERVATION.height.v2");
  }

  public static HeightObservationContainment getInstance() {
    return new HeightObservationContainment();
  }
}
