package com.google.android.fhir.hapiprotoconverter.generated

import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.BooleanConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.BooleanConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DateConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DateConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.IdentifierConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.IdentifierConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.PositiveIntConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.PositiveIntConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.SimpleQuantityConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.SimpleQuantityConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.DateTime
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Immunization
import com.google.fhir.r4.core.ImmunizationStatusCodesValueSet
import com.google.fhir.r4.core.PositiveInt
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.PositiveIntType
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

public object ImmunizationConverter {
  public fun Immunization.OccurrenceX.immunizationOccurrenceToHapi(): Type {
    if (this.getDateTime() != DateTime.newBuilder().defaultInstanceForType ) {
      return (this.getDateTime()).toHapi()
    }
    if (this.getStringValue() != String.newBuilder().defaultInstanceForType ) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Immunization.occurrence[x]")
  }

  public fun Type.immunizationOccurrenceToProto(): Immunization.OccurrenceX {
    val protoValue = Immunization.OccurrenceX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun Immunization.ProtocolApplied.DoseNumberX.immunizationProtocolAppliedDoseNumberToHapi():
      Type {
    if (this.getPositiveInt() != PositiveInt.newBuilder().defaultInstanceForType ) {
      return (this.getPositiveInt()).toHapi()
    }
    if (this.getStringValue() != String.newBuilder().defaultInstanceForType ) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Immunization.protocolApplied.doseNumber[x]")
  }

  public fun Type.immunizationProtocolAppliedDoseNumberToProto():
      Immunization.ProtocolApplied.DoseNumberX {
    val protoValue = Immunization.ProtocolApplied.DoseNumberX.newBuilder()
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public
      fun Immunization.ProtocolApplied.SeriesDosesX.immunizationProtocolAppliedSeriesDosesToHapi():
      Type {
    if (this.getPositiveInt() != PositiveInt.newBuilder().defaultInstanceForType ) {
      return (this.getPositiveInt()).toHapi()
    }
    if (this.getStringValue() != String.newBuilder().defaultInstanceForType ) {
      return (this.getStringValue()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Immunization.protocolApplied.seriesDoses[x]")
  }

  public fun Type.immunizationProtocolAppliedSeriesDosesToProto():
      Immunization.ProtocolApplied.SeriesDosesX {
    val protoValue = Immunization.ProtocolApplied.SeriesDosesX.newBuilder()
    if (this is PositiveIntType) {
      protoValue.setPositiveInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    return protoValue.build()
  }

  public fun Immunization.toHapi(): org.hl7.fhir.r4.model.Immunization {
    val hapiValue = org.hl7.fhir.r4.model.Immunization()
    hapiValue.id = id.value 
    hapiValue.setMeta(meta.toHapi())
    hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    hapiValue.setLanguageElement(language.toHapi())
    hapiValue.setText(text.toHapi())
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setIdentifier(identifierList.map{it.toHapi()})
    hapiValue.setStatus(org.hl7.fhir.r4.model.Immunization.ImmunizationStatus.valueOf(status.value.name.replace("_","")))
    hapiValue.setStatusReason(statusReason.toHapi())
    hapiValue.setVaccineCode(vaccineCode.toHapi())
    hapiValue.setPatient(patient.toHapi())
    hapiValue.setEncounter(encounter.toHapi())
    hapiValue.setOccurrence(occurrence.immunizationOccurrenceToHapi())
    hapiValue.setRecordedElement(recorded.toHapi())
    hapiValue.setPrimarySourceElement(primarySource.toHapi())
    hapiValue.setReportOrigin(reportOrigin.toHapi())
    hapiValue.setLocation(location.toHapi())
    hapiValue.setManufacturer(manufacturer.toHapi())
    hapiValue.setLotNumberElement(lotNumber.toHapi())
    hapiValue.setExpirationDateElement(expirationDate.toHapi())
    hapiValue.setSite(site.toHapi())
    hapiValue.setRoute(route.toHapi())
    hapiValue.setDoseQuantity(doseQuantity.toHapi())
    hapiValue.setPerformer(performerList.map{it.toHapi()})
    hapiValue.setNote(noteList.map{it.toHapi()})
    hapiValue.setReasonCode(reasonCodeList.map{it.toHapi()})
    hapiValue.setReasonReference(reasonReferenceList.map{it.toHapi()})
    hapiValue.setIsSubpotentElement(isSubpotent.toHapi())
    hapiValue.setSubpotentReason(subpotentReasonList.map{it.toHapi()})
    hapiValue.setEducation(educationList.map{it.toHapi()})
    hapiValue.setProgramEligibility(programEligibilityList.map{it.toHapi()})
    hapiValue.setFundingSource(fundingSource.toHapi())
    hapiValue.setReaction(reactionList.map{it.toHapi()})
    hapiValue.setProtocolApplied(protocolAppliedList.map{it.toHapi()})
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Immunization.toProto(): Immunization {
    val protoValue = Immunization.newBuilder()
    .setId(Id.newBuilder().setValue(id))
    .setMeta(meta.toProto())
    .setImplicitRules(implicitRulesElement.toProto())
    .setLanguage(languageElement.toProto())
    .setText(text.toProto())
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .addAllIdentifier(identifier.map{it.toProto()})
    .setStatus(Immunization.StatusCode.newBuilder().setValue(ImmunizationStatusCodesValueSet.Value.valueOf(status.toCode().replace("-",
        "_").toUpperCase())).build())
    .setStatusReason(statusReason.toProto())
    .setVaccineCode(vaccineCode.toProto())
    .setPatient(patient.toProto())
    .setEncounter(encounter.toProto())
    .setOccurrence(occurrence.immunizationOccurrenceToProto())
    .setRecorded(recordedElement.toProto())
    .setPrimarySource(primarySourceElement.toProto())
    .setReportOrigin(reportOrigin.toProto())
    .setLocation(location.toProto())
    .setManufacturer(manufacturer.toProto())
    .setLotNumber(lotNumberElement.toProto())
    .setExpirationDate(expirationDateElement.toProto())
    .setSite(site.toProto())
    .setRoute(route.toProto())
    .setDoseQuantity(( doseQuantity as SimpleQuantity ).toProto())
    .addAllPerformer(performer.map{it.toProto()})
    .addAllNote(note.map{it.toProto()})
    .addAllReasonCode(reasonCode.map{it.toProto()})
    .addAllReasonReference(reasonReference.map{it.toProto()})
    .setIsSubpotent(isSubpotentElement.toProto())
    .addAllSubpotentReason(subpotentReason.map{it.toProto()})
    .addAllEducation(education.map{it.toProto()})
    .addAllProgramEligibility(programEligibility.map{it.toProto()})
    .setFundingSource(fundingSource.toProto())
    .addAllReaction(reaction.map{it.toProto()})
    .addAllProtocolApplied(protocolApplied.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent.toProto():
      Immunization.Performer {
    val protoValue = Immunization.Performer.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setFunction(function.toProto())
    .setActor(actor.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent.toProto():
      Immunization.Education {
    val protoValue = Immunization.Education.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setDocumentType(documentTypeElement.toProto())
    .setReference(referenceElement.toProto())
    .setPublicationDate(publicationDateElement.toProto())
    .setPresentationDate(presentationDateElement.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent.toProto():
      Immunization.Reaction {
    val protoValue = Immunization.Reaction.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setDate(dateElement.toProto())
    .setDetail(detail.toProto())
    .setReported(reportedElement.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent.toProto():
      Immunization.ProtocolApplied {
    val protoValue = Immunization.ProtocolApplied.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setSeries(seriesElement.toProto())
    .setAuthority(authority.toProto())
    .addAllTargetDisease(targetDisease.map{it.toProto()})
    .setDoseNumber(doseNumber.immunizationProtocolAppliedDoseNumberToProto())
    .setSeriesDoses(seriesDoses.immunizationProtocolAppliedSeriesDosesToProto())
    .build()
    return protoValue
  }

  public fun Immunization.Performer.toHapi():
      org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent {
    val hapiValue = org.hl7.fhir.r4.model.Immunization.ImmunizationPerformerComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setFunction(function.toHapi())
    hapiValue.setActor(actor.toHapi())
    return hapiValue
  }

  public fun Immunization.Education.toHapi():
      org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent {
    val hapiValue = org.hl7.fhir.r4.model.Immunization.ImmunizationEducationComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setDocumentTypeElement(documentType.toHapi())
    hapiValue.setReferenceElement(reference.toHapi())
    hapiValue.setPublicationDateElement(publicationDate.toHapi())
    hapiValue.setPresentationDateElement(presentationDate.toHapi())
    return hapiValue
  }

  public fun Immunization.Reaction.toHapi():
      org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent {
    val hapiValue = org.hl7.fhir.r4.model.Immunization.ImmunizationReactionComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setDateElement(date.toHapi())
    hapiValue.setDetail(detail.toHapi())
    hapiValue.setReportedElement(reported.toHapi())
    return hapiValue
  }

  public fun Immunization.ProtocolApplied.toHapi():
      org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent {
    val hapiValue = org.hl7.fhir.r4.model.Immunization.ImmunizationProtocolAppliedComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setSeriesElement(series.toHapi())
    hapiValue.setAuthority(authority.toHapi())
    hapiValue.setTargetDisease(targetDiseaseList.map{it.toHapi()})
    hapiValue.setDoseNumber(doseNumber.immunizationProtocolAppliedDoseNumberToHapi())
    hapiValue.setSeriesDoses(seriesDoses.immunizationProtocolAppliedSeriesDosesToHapi())
    return hapiValue
  }
}
