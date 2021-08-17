/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.fhir.hapiprotoconverter.generated

import com.google.android.fhir.hapiprotoconverter.generated.AgeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AgeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CanonicalConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CanonicalConverter.toProto
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
import com.google.android.fhir.hapiprotoconverter.generated.RangeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.RangeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.EventStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Procedure
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Age
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.Period
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type

object ProcedureConverter {
  private fun Procedure.PerformedX.procedurePerformedToHapi(): Type {
    if (hasDateTime()) {
      return (this.dateTime).toHapi()
    }
    if (hasPeriod()) {
      return (this.period).toHapi()
    }
    if (hasStringValue()) {
      return (this.stringValue).toHapi()
    }
    if (hasAge()) {
      return (this.age).toHapi()
    }
    if (hasRange()) {
      return (this.range).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Procedure.performed[x]")
  }

  private fun Type.procedurePerformedToProto(): Procedure.PerformedX {
    val protoValue = Procedure.PerformedX.newBuilder()
    if (this is DateTimeType) {
      protoValue.dateTime = this.toProto()
    }
    if (this is Period) {
      protoValue.period = this.toProto()
    }
    if (this is StringType) {
      protoValue.stringValue = this.toProto()
    }
    if (this is Age) {
      protoValue.age = this.toProto()
    }
    if (this is Range) {
      protoValue.range = this.toProto()
    }
    return protoValue.build()
  }

  fun Procedure.toHapi(): org.hl7.fhir.r4.model.Procedure {
    val hapiValue = org.hl7.fhir.r4.model.Procedure()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (hasMeta()) {
      hapiValue.meta = meta.toHapi()
    }
    if (hasImplicitRules()) {
      hapiValue.implicitRulesElement = implicitRules.toHapi()
    }
    if (hasText()) {
      hapiValue.text = text.toHapi()
    }
    if (extensionCount > 0) {
      hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
      hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (identifierCount > 0) {
      hapiValue.identifier = identifierList.map { it.toHapi() }
    }
    if (instantiatesCanonicalCount > 0) {
      hapiValue.instantiatesCanonical = instantiatesCanonicalList.map { it.toHapi() }
    }
    if (instantiatesUriCount > 0) {
      hapiValue.instantiatesUri = instantiatesUriList.map { it.toHapi() }
    }
    if (basedOnCount > 0) {
      hapiValue.basedOn = basedOnList.map { it.toHapi() }
    }
    if (partOfCount > 0) {
      hapiValue.partOf = partOfList.map { it.toHapi() }
    }
    if (hasStatus()) {
      hapiValue.status =
        org.hl7.fhir.r4.model.Procedure.ProcedureStatus.valueOf(
          status.value.name.hapiCodeCheck().replace("_", "")
        )
    }
    if (hasStatusReason()) {
      hapiValue.statusReason = statusReason.toHapi()
    }
    if (hasCategory()) {
      hapiValue.category = category.toHapi()
    }
    if (hasCode()) {
      hapiValue.code = code.toHapi()
    }
    if (hasSubject()) {
      hapiValue.subject = subject.toHapi()
    }
    if (hasEncounter()) {
      hapiValue.encounter = encounter.toHapi()
    }
    if (hasPerformed()) {
      hapiValue.performed = performed.procedurePerformedToHapi()
    }
    if (hasRecorder()) {
      hapiValue.recorder = recorder.toHapi()
    }
    if (hasAsserter()) {
      hapiValue.asserter = asserter.toHapi()
    }
    if (performerCount > 0) {
      hapiValue.performer = performerList.map { it.toHapi() }
    }
    if (hasLocation()) {
      hapiValue.location = location.toHapi()
    }
    if (reasonCodeCount > 0) {
      hapiValue.reasonCode = reasonCodeList.map { it.toHapi() }
    }
    if (reasonReferenceCount > 0) {
      hapiValue.reasonReference = reasonReferenceList.map { it.toHapi() }
    }
    if (bodySiteCount > 0) {
      hapiValue.bodySite = bodySiteList.map { it.toHapi() }
    }
    if (hasOutcome()) {
      hapiValue.outcome = outcome.toHapi()
    }
    if (reportCount > 0) {
      hapiValue.report = reportList.map { it.toHapi() }
    }
    if (complicationCount > 0) {
      hapiValue.complication = complicationList.map { it.toHapi() }
    }
    if (complicationDetailCount > 0) {
      hapiValue.complicationDetail = complicationDetailList.map { it.toHapi() }
    }
    if (followUpCount > 0) {
      hapiValue.followUp = followUpList.map { it.toHapi() }
    }
    if (noteCount > 0) {
      hapiValue.note = noteList.map { it.toHapi() }
    }
    if (focalDeviceCount > 0) {
      hapiValue.focalDevice = focalDeviceList.map { it.toHapi() }
    }
    if (usedReferenceCount > 0) {
      hapiValue.usedReference = usedReferenceList.map { it.toHapi() }
    }
    if (usedCodeCount > 0) {
      hapiValue.usedCode = usedCodeList.map { it.toHapi() }
    }
    return hapiValue
  }

  fun org.hl7.fhir.r4.model.Procedure.toProto(): Procedure {
    val protoValue = Procedure.newBuilder()
    if (hasId()) {
      protoValue.setId(Id.newBuilder().setValue(id))
    }
    if (hasMeta()) {
      protoValue.meta = meta.toProto()
    }
    if (hasImplicitRules()) {
      protoValue.implicitRules = implicitRulesElement.toProto()
    }
    if (hasText()) {
      protoValue.text = text.toProto()
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasIdentifier()) {
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasInstantiatesCanonical()) {
      protoValue.addAllInstantiatesCanonical(instantiatesCanonical.map { it.toProto() })
    }
    if (hasInstantiatesUri()) {
      protoValue.addAllInstantiatesUri(instantiatesUri.map { it.toProto() })
    }
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasPartOf()) {
      protoValue.addAllPartOf(partOf.map { it.toProto() })
    }
    if (hasStatus()) {
      protoValue.status =
        Procedure.StatusCode.newBuilder()
          .setValue(
            EventStatusCode.Value.valueOf(
              status.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
            )
          )
          .build()
    }
    if (hasStatusReason()) {
      protoValue.statusReason = statusReason.toProto()
    }
    if (hasCategory()) {
      protoValue.category = category.toProto()
    }
    if (hasCode()) {
      protoValue.code = code.toProto()
    }
    if (hasSubject()) {
      protoValue.subject = subject.toProto()
    }
    if (hasEncounter()) {
      protoValue.encounter = encounter.toProto()
    }
    if (hasPerformed()) {
      protoValue.performed = performed.procedurePerformedToProto()
    }
    if (hasRecorder()) {
      protoValue.recorder = recorder.toProto()
    }
    if (hasAsserter()) {
      protoValue.asserter = asserter.toProto()
    }
    if (hasPerformer()) {
      protoValue.addAllPerformer(performer.map { it.toProto() })
    }
    if (hasLocation()) {
      protoValue.location = location.toProto()
    }
    if (hasReasonCode()) {
      protoValue.addAllReasonCode(reasonCode.map { it.toProto() })
    }
    if (hasReasonReference()) {
      protoValue.addAllReasonReference(reasonReference.map { it.toProto() })
    }
    if (hasBodySite()) {
      protoValue.addAllBodySite(bodySite.map { it.toProto() })
    }
    if (hasOutcome()) {
      protoValue.outcome = outcome.toProto()
    }
    if (hasReport()) {
      protoValue.addAllReport(report.map { it.toProto() })
    }
    if (hasComplication()) {
      protoValue.addAllComplication(complication.map { it.toProto() })
    }
    if (hasComplicationDetail()) {
      protoValue.addAllComplicationDetail(complicationDetail.map { it.toProto() })
    }
    if (hasFollowUp()) {
      protoValue.addAllFollowUp(followUp.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasFocalDevice()) {
      protoValue.addAllFocalDevice(focalDevice.map { it.toProto() })
    }
    if (hasUsedReference()) {
      protoValue.addAllUsedReference(usedReference.map { it.toProto() })
    }
    if (hasUsedCode()) {
      protoValue.addAllUsedCode(usedCode.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent.toProto():
    Procedure.Performer {
    val protoValue = Procedure.Performer.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasFunction()) {
      protoValue.function = function.toProto()
    }
    if (hasActor()) {
      protoValue.actor = actor.toProto()
    }
    if (hasOnBehalfOf()) {
      protoValue.onBehalfOf = onBehalfOf.toProto()
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent.toProto():
    Procedure.FocalDevice {
    val protoValue = Procedure.FocalDevice.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAction()) {
      protoValue.action = action.toProto()
    }
    if (hasManipulated()) {
      protoValue.manipulated = manipulated.toProto()
    }
    return protoValue.build()
  }

  private fun Procedure.Performer.toHapi():
    org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent {
    val hapiValue = org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
      hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasFunction()) {
      hapiValue.function = function.toHapi()
    }
    if (hasActor()) {
      hapiValue.actor = actor.toHapi()
    }
    if (hasOnBehalfOf()) {
      hapiValue.onBehalfOf = onBehalfOf.toHapi()
    }
    return hapiValue
  }

  private fun Procedure.FocalDevice.toHapi():
    org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent {
    val hapiValue = org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
      hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasAction()) {
      hapiValue.action = action.toHapi()
    }
    if (hasManipulated()) {
      hapiValue.manipulated = manipulated.toHapi()
    }
    return hapiValue
  }
}
