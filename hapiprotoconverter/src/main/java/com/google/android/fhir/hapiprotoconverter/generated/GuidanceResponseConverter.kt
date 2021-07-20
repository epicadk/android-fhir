package com.google.android.fhir.hapiprotoconverter.generated

import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CanonicalConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CanonicalConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DataRequirementConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DataRequirementConverter.toProto
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
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.Canonical
import com.google.fhir.r4.core.CodeableConcept
import com.google.fhir.r4.core.GuidanceResponse
import com.google.fhir.r4.core.GuidanceResponseStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Uri
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CanonicalType
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UriType

public object GuidanceResponseConverter {
  public fun GuidanceResponse.ModuleX.guidanceResponseModuleToHapi(): Type {
    if (this.getUri() != Uri.newBuilder().defaultInstanceForType ) {
      return (this.getUri()).toHapi()
    }
    if (this.getCanonical() != Canonical.newBuilder().defaultInstanceForType ) {
      return (this.getCanonical()).toHapi()
    }
    if (this.getCodeableConcept() != CodeableConcept.newBuilder().defaultInstanceForType ) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("GuidanceResponse.module[x]")
  }

  public fun Type.guidanceResponseModuleToProto(): GuidanceResponse.ModuleX {
    val protoValue = GuidanceResponse.ModuleX.newBuilder()
    if (this is UriType) {
      protoValue.setUri(this.toProto())
    }
    if (this is CanonicalType) {
      protoValue.setCanonical(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  public fun GuidanceResponse.toHapi(): org.hl7.fhir.r4.model.GuidanceResponse {
    val hapiValue = org.hl7.fhir.r4.model.GuidanceResponse()
    hapiValue.id = id.value 
    hapiValue.setMeta(meta.toHapi())
    hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    hapiValue.setLanguageElement(language.toHapi())
    hapiValue.setText(text.toHapi())
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setRequestIdentifier(requestIdentifier.toHapi())
    hapiValue.setIdentifier(identifierList.map{it.toHapi()})
    hapiValue.setModule(module.guidanceResponseModuleToHapi())
    hapiValue.setStatus(org.hl7.fhir.r4.model.GuidanceResponse.GuidanceResponseStatus.valueOf(status.value.name.replace("_","")))
    hapiValue.setSubject(subject.toHapi())
    hapiValue.setEncounter(encounter.toHapi())
    hapiValue.setOccurrenceDateTimeElement(occurrenceDateTime.toHapi())
    hapiValue.setPerformer(performer.toHapi())
    hapiValue.setReasonCode(reasonCodeList.map{it.toHapi()})
    hapiValue.setReasonReference(reasonReferenceList.map{it.toHapi()})
    hapiValue.setNote(noteList.map{it.toHapi()})
    hapiValue.setEvaluationMessage(evaluationMessageList.map{it.toHapi()})
    hapiValue.setOutputParameters(outputParameters.toHapi())
    hapiValue.setResult(result.toHapi())
    hapiValue.setDataRequirement(dataRequirementList.map{it.toHapi()})
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.GuidanceResponse.toProto(): GuidanceResponse {
    val protoValue = GuidanceResponse.newBuilder()
    .setId(Id.newBuilder().setValue(id))
    .setMeta(meta.toProto())
    .setImplicitRules(implicitRulesElement.toProto())
    .setLanguage(languageElement.toProto())
    .setText(text.toProto())
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setRequestIdentifier(requestIdentifier.toProto())
    .addAllIdentifier(identifier.map{it.toProto()})
    .setModule(module.guidanceResponseModuleToProto())
    .setStatus(GuidanceResponse.StatusCode.newBuilder().setValue(GuidanceResponseStatusCode.Value.valueOf(status.toCode().replace("-",
        "_").toUpperCase())).build())
    .setSubject(subject.toProto())
    .setEncounter(encounter.toProto())
    .setOccurrenceDateTime(occurrenceDateTimeElement.toProto())
    .setPerformer(performer.toProto())
    .addAllReasonCode(reasonCode.map{it.toProto()})
    .addAllReasonReference(reasonReference.map{it.toProto()})
    .addAllNote(note.map{it.toProto()})
    .addAllEvaluationMessage(evaluationMessage.map{it.toProto()})
    .setOutputParameters(outputParameters.toProto())
    .setResult(result.toProto())
    .addAllDataRequirement(dataRequirement.map{it.toProto()})
    .build()
    return protoValue
  }
}
