package com.google.android.fhir.hapiprotoconverter.generated

import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toProto
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
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.ClinicalImpression
import com.google.fhir.r4.core.ClinicalImpressionStatusValueSet
import com.google.fhir.r4.core.DateTime
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Period
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Type

public object ClinicalImpressionConverter {
  public fun ClinicalImpression.EffectiveX.clinicalImpressionEffectiveToHapi(): Type {
    if (this.getDateTime() != DateTime.newBuilder().defaultInstanceForType ) {
      return (this.getDateTime()).toHapi()
    }
    if (this.getPeriod() != Period.newBuilder().defaultInstanceForType ) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("ClinicalImpression.effective[x]")
  }

  public fun Type.clinicalImpressionEffectiveToProto(): ClinicalImpression.EffectiveX {
    val protoValue = ClinicalImpression.EffectiveX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  public fun ClinicalImpression.toHapi(): org.hl7.fhir.r4.model.ClinicalImpression {
    val hapiValue = org.hl7.fhir.r4.model.ClinicalImpression()
    hapiValue.id = id.value 
    hapiValue.setMeta(meta.toHapi())
    hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    hapiValue.setLanguageElement(language.toHapi())
    hapiValue.setText(text.toHapi())
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setIdentifier(identifierList.map{it.toHapi()})
    hapiValue.setStatus(org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionStatus.valueOf(status.value.name.replace("_","")))
    hapiValue.setStatusReason(statusReason.toHapi())
    hapiValue.setCode(code.toHapi())
    hapiValue.setDescriptionElement(description.toHapi())
    hapiValue.setSubject(subject.toHapi())
    hapiValue.setEncounter(encounter.toHapi())
    hapiValue.setEffective(effective.clinicalImpressionEffectiveToHapi())
    hapiValue.setDateElement(date.toHapi())
    hapiValue.setAssessor(assessor.toHapi())
    hapiValue.setPrevious(previous.toHapi())
    hapiValue.setProblem(problemList.map{it.toHapi()})
    hapiValue.setInvestigation(investigationList.map{it.toHapi()})
    hapiValue.setProtocol(protocolList.map{it.toHapi()})
    hapiValue.setSummaryElement(summary.toHapi())
    hapiValue.setFinding(findingList.map{it.toHapi()})
    hapiValue.setPrognosisCodeableConcept(prognosisCodeableConceptList.map{it.toHapi()})
    hapiValue.setPrognosisReference(prognosisReferenceList.map{it.toHapi()})
    hapiValue.setSupportingInfo(supportingInfoList.map{it.toHapi()})
    hapiValue.setNote(noteList.map{it.toHapi()})
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ClinicalImpression.toProto(): ClinicalImpression {
    val protoValue = ClinicalImpression.newBuilder()
    .setId(Id.newBuilder().setValue(id))
    .setMeta(meta.toProto())
    .setImplicitRules(implicitRulesElement.toProto())
    .setLanguage(languageElement.toProto())
    .setText(text.toProto())
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .addAllIdentifier(identifier.map{it.toProto()})
    .setStatus(ClinicalImpression.StatusCode.newBuilder().setValue(ClinicalImpressionStatusValueSet.Value.valueOf(status.toCode().replace("-",
        "_").toUpperCase())).build())
    .setStatusReason(statusReason.toProto())
    .setCode(code.toProto())
    .setDescription(descriptionElement.toProto())
    .setSubject(subject.toProto())
    .setEncounter(encounter.toProto())
    .setEffective(effective.clinicalImpressionEffectiveToProto())
    .setDate(dateElement.toProto())
    .setAssessor(assessor.toProto())
    .setPrevious(previous.toProto())
    .addAllProblem(problem.map{it.toProto()})
    .addAllInvestigation(investigation.map{it.toProto()})
    .addAllProtocol(protocol.map{it.toProto()})
    .setSummary(summaryElement.toProto())
    .addAllFinding(finding.map{it.toProto()})
    .addAllPrognosisCodeableConcept(prognosisCodeableConcept.map{it.toProto()})
    .addAllPrognosisReference(prognosisReference.map{it.toProto()})
    .addAllSupportingInfo(supportingInfo.map{it.toProto()})
    .addAllNote(note.map{it.toProto()})
    .build()
    return protoValue
  }

  public
      fun org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent.toProto():
      ClinicalImpression.Investigation {
    val protoValue = ClinicalImpression.Investigation.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setCode(code.toProto())
    .addAllItem(item.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent.toProto():
      ClinicalImpression.Finding {
    val protoValue = ClinicalImpression.Finding.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setItemCodeableConcept(itemCodeableConcept.toProto())
    .setItemReference(itemReference.toProto())
    .setBasis(basisElement.toProto())
    .build()
    return protoValue
  }

  public fun ClinicalImpression.Investigation.toHapi():
      org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent {
    val hapiValue =
        org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionInvestigationComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setCode(code.toHapi())
    hapiValue.setItem(itemList.map{it.toHapi()})
    return hapiValue
  }

  public fun ClinicalImpression.Finding.toHapi():
      org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionFindingComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setItemCodeableConcept(itemCodeableConcept.toHapi())
    hapiValue.setItemReference(itemReference.toHapi())
    hapiValue.setBasisElement(basis.toHapi())
    return hapiValue
  }
}
