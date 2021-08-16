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

import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.BooleanConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.BooleanConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.IdentifierConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.IdentifierConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.InstantConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.InstantConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.IntegerConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.IntegerConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.QuantityConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.QuantityConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.RangeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.RangeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.RatioConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.RatioConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.SampledDataConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.SampledDataConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.SimpleQuantityConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.SimpleQuantityConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.TimeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.TimeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.TimingConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.TimingConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.Boolean
import com.google.fhir.r4.core.CodeableConcept
import com.google.fhir.r4.core.DateTime
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Instant
import com.google.fhir.r4.core.Integer
import com.google.fhir.r4.core.Observation
import com.google.fhir.r4.core.Observation.Component
import com.google.fhir.r4.core.ObservationStatusCode
import com.google.fhir.r4.core.Period
import com.google.fhir.r4.core.Quantity
import com.google.fhir.r4.core.Range
import com.google.fhir.r4.core.Ratio
import com.google.fhir.r4.core.SampledData
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.Time
import com.google.fhir.r4.core.Timing
import java.lang.IllegalArgumentException
import kotlin.jvm.JvmStatic
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.DateTimeType
import org.hl7.fhir.r4.model.InstantType
import org.hl7.fhir.r4.model.IntegerType
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.TimeType
import org.hl7.fhir.r4.model.Type

public object ObservationConverter {
  @JvmStatic
  private fun Observation.EffectiveX.observationEffectiveToHapi(): Type {
    if (this.getDateTime() != DateTime.newBuilder().defaultInstanceForType) {
      return (this.getDateTime()).toHapi()
    }
    if (this.getPeriod() != Period.newBuilder().defaultInstanceForType) {
      return (this.getPeriod()).toHapi()
    }
    if (this.getTiming() != Timing.newBuilder().defaultInstanceForType) {
      return (this.getTiming()).toHapi()
    }
    if (this.getInstant() != Instant.newBuilder().defaultInstanceForType) {
      return (this.getInstant()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Observation.effective[x]")
  }

  @JvmStatic
  private fun Type.observationEffectiveToProto(): Observation.EffectiveX {
    val protoValue = Observation.EffectiveX.newBuilder()
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Period) {
      protoValue.setPeriod(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Timing) {
      protoValue.setTiming(this.toProto())
    }
    if (this is InstantType) {
      protoValue.setInstant(this.toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun Observation.ValueX.observationValueToHapi(): Type {
    if (this.getQuantity() != Quantity.newBuilder().defaultInstanceForType) {
      return (this.getQuantity()).toHapi()
    }
    if (this.getCodeableConcept() != CodeableConcept.newBuilder().defaultInstanceForType) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (this.getStringValue() != String.newBuilder().defaultInstanceForType) {
      return (this.getStringValue()).toHapi()
    }
    if (this.getBoolean() != Boolean.newBuilder().defaultInstanceForType) {
      return (this.getBoolean()).toHapi()
    }
    if (this.getInteger() != Integer.newBuilder().defaultInstanceForType) {
      return (this.getInteger()).toHapi()
    }
    if (this.getRange() != Range.newBuilder().defaultInstanceForType) {
      return (this.getRange()).toHapi()
    }
    if (this.getRatio() != Ratio.newBuilder().defaultInstanceForType) {
      return (this.getRatio()).toHapi()
    }
    if (this.getSampledData() != SampledData.newBuilder().defaultInstanceForType) {
      return (this.getSampledData()).toHapi()
    }
    if (this.getTime() != Time.newBuilder().defaultInstanceForType) {
      return (this.getTime()).toHapi()
    }
    if (this.getDateTime() != DateTime.newBuilder().defaultInstanceForType) {
      return (this.getDateTime()).toHapi()
    }
    if (this.getPeriod() != Period.newBuilder().defaultInstanceForType) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Observation.value[x]")
  }

  @JvmStatic
  private fun Type.observationValueToProto(): Observation.ValueX {
    val protoValue = Observation.ValueX.newBuilder()
    if (this is org.hl7.fhir.r4.model.Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Ratio) {
      protoValue.setRatio(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.SampledData) {
      protoValue.setSampledData(this.toProto())
    }
    if (this is TimeType) {
      protoValue.setTime(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun Observation.Component.ValueX.observationComponentValueToHapi(): Type {
    if (this.getQuantity() != Quantity.newBuilder().defaultInstanceForType) {
      return (this.getQuantity()).toHapi()
    }
    if (this.getCodeableConcept() != CodeableConcept.newBuilder().defaultInstanceForType) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (this.getStringValue() != String.newBuilder().defaultInstanceForType) {
      return (this.getStringValue()).toHapi()
    }
    if (this.getBoolean() != Boolean.newBuilder().defaultInstanceForType) {
      return (this.getBoolean()).toHapi()
    }
    if (this.getInteger() != Integer.newBuilder().defaultInstanceForType) {
      return (this.getInteger()).toHapi()
    }
    if (this.getRange() != Range.newBuilder().defaultInstanceForType) {
      return (this.getRange()).toHapi()
    }
    if (this.getRatio() != Ratio.newBuilder().defaultInstanceForType) {
      return (this.getRatio()).toHapi()
    }
    if (this.getSampledData() != SampledData.newBuilder().defaultInstanceForType) {
      return (this.getSampledData()).toHapi()
    }
    if (this.getTime() != Time.newBuilder().defaultInstanceForType) {
      return (this.getTime()).toHapi()
    }
    if (this.getDateTime() != DateTime.newBuilder().defaultInstanceForType) {
      return (this.getDateTime()).toHapi()
    }
    if (this.getPeriod() != Period.newBuilder().defaultInstanceForType) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Observation.component.value[x]")
  }

  @JvmStatic
  private fun Type.observationComponentValueToProto(): Observation.Component.ValueX {
    val protoValue = Observation.Component.ValueX.newBuilder()
    if (this is org.hl7.fhir.r4.model.Quantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is BooleanType) {
      protoValue.setBoolean(this.toProto())
    }
    if (this is IntegerType) {
      protoValue.setInteger(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Ratio) {
      protoValue.setRatio(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.SampledData) {
      protoValue.setSampledData(this.toProto())
    }
    if (this is TimeType) {
      protoValue.setTime(this.toProto())
    }
    if (this is DateTimeType) {
      protoValue.setDateTime(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  public fun Observation.toHapi(): org.hl7.fhir.r4.model.Observation {
    val hapiValue = org.hl7.fhir.r4.model.Observation()
    hapiValue.id = id.value
    if (hasMeta()) {
      hapiValue.setMeta(meta.toHapi())
    }
    if (hasImplicitRules()) {
      hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    }
    if (hasText()) {
      hapiValue.setText(text.toHapi())
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (identifierCount > 0) {
      hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    }
    if (basedOnCount > 0) {
      hapiValue.setBasedOn(basedOnList.map { it.toHapi() })
    }
    if (partOfCount > 0) {
      hapiValue.setPartOf(partOfList.map { it.toHapi() })
    }
    hapiValue.setStatus(
      org.hl7.fhir.r4.model.Observation.ObservationStatus.valueOf(
        status.value.name.hapiCodeCheck().replace("_", "")
      )
    )
    if (categoryCount > 0) {
      hapiValue.setCategory(categoryList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasSubject()) {
      hapiValue.setSubject(subject.toHapi())
    }
    if (focusCount > 0) {
      hapiValue.setFocus(focusList.map { it.toHapi() })
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasEffective()) {
      hapiValue.setEffective(effective.observationEffectiveToHapi())
    }
    if (hasIssued()) {
      hapiValue.setIssuedElement(issued.toHapi())
    }
    if (performerCount > 0) {
      hapiValue.setPerformer(performerList.map { it.toHapi() })
    }
    if (hasValue()) {
      hapiValue.setValue(value.observationValueToHapi())
    }
    if (hasDataAbsentReason()) {
      hapiValue.setDataAbsentReason(dataAbsentReason.toHapi())
    }
    if (interpretationCount > 0) {
      hapiValue.setInterpretation(interpretationList.map { it.toHapi() })
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    if (hasBodySite()) {
      hapiValue.setBodySite(bodySite.toHapi())
    }
    if (hasMethod()) {
      hapiValue.setMethod(method.toHapi())
    }
    if (hasSpecimen()) {
      hapiValue.setSpecimen(specimen.toHapi())
    }
    if (hasDevice()) {
      hapiValue.setDevice(device.toHapi())
    }
    if (referenceRangeCount > 0) {
      hapiValue.setReferenceRange(referenceRangeList.map { it.toHapi() })
    }
    if (hasMemberCount > 0) {
      hapiValue.setHasMember(hasMemberList.map { it.toHapi() })
    }
    if (derivedFromCount > 0) {
      hapiValue.setDerivedFrom(derivedFromList.map { it.toHapi() })
    }
    if (componentCount > 0) {
      hapiValue.setComponent(componentList.map { it.toHapi() })
    }
    return hapiValue
  }

  @JvmStatic
  public fun org.hl7.fhir.r4.model.Observation.toProto(): Observation {
    val protoValue = Observation.newBuilder().setId(Id.newBuilder().setValue(id))
    if (hasMeta()) {
      protoValue.setMeta(meta.toProto())
    }
    if (hasImplicitRules()) {
      protoValue.setImplicitRules(implicitRulesElement.toProto())
    }
    if (hasText()) {
      protoValue.setText(text.toProto())
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
    if (hasBasedOn()) {
      protoValue.addAllBasedOn(basedOn.map { it.toProto() })
    }
    if (hasPartOf()) {
      protoValue.addAllPartOf(partOf.map { it.toProto() })
    }
    protoValue.setStatus(
      Observation.StatusCode.newBuilder()
        .setValue(
          ObservationStatusCode.Value.valueOf(
            status.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
          )
        )
        .build()
    )
    if (hasCategory()) {
      protoValue.addAllCategory(category.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasSubject()) {
      protoValue.setSubject(subject.toProto())
    }
    if (hasFocus()) {
      protoValue.addAllFocus(focus.map { it.toProto() })
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasEffective()) {
      protoValue.setEffective(effective.observationEffectiveToProto())
    }
    if (hasIssued()) {
      protoValue.setIssued(issuedElement.toProto())
    }
    if (hasPerformer()) {
      protoValue.addAllPerformer(performer.map { it.toProto() })
    }
    if (hasValue()) {
      protoValue.setValue(value.observationValueToProto())
    }
    if (hasDataAbsentReason()) {
      protoValue.setDataAbsentReason(dataAbsentReason.toProto())
    }
    if (hasInterpretation()) {
      protoValue.addAllInterpretation(interpretation.map { it.toProto() })
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    if (hasBodySite()) {
      protoValue.setBodySite(bodySite.toProto())
    }
    if (hasMethod()) {
      protoValue.setMethod(method.toProto())
    }
    if (hasSpecimen()) {
      protoValue.setSpecimen(specimen.toProto())
    }
    if (hasDevice()) {
      protoValue.setDevice(device.toProto())
    }
    if (hasReferenceRange()) {
      protoValue.addAllReferenceRange(referenceRange.map { it.toProto() })
    }
    if (hasHasMember()) {
      protoValue.addAllHasMember(hasMember.map { it.toProto() })
    }
    if (hasDerivedFrom()) {
      protoValue.addAllDerivedFrom(derivedFrom.map { it.toProto() })
    }
    if (hasComponent()) {
      protoValue.addAllComponent(component.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent.toProto():
    Observation.ReferenceRange {
    val protoValue = Observation.ReferenceRange.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasLow()) {
      protoValue.setLow((low as SimpleQuantity).toProto())
    }
    if (hasHigh()) {
      protoValue.setHigh((high as SimpleQuantity).toProto())
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasAppliesTo()) {
      protoValue.addAllAppliesTo(appliesTo.map { it.toProto() })
    }
    if (hasAge()) {
      protoValue.setAge(age.toProto())
    }
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.Observation.ObservationComponentComponent.toProto():
    Observation.Component {
    val protoValue = Observation.Component.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCode()) {
      protoValue.setCode(code.toProto())
    }
    if (hasValue()) {
      protoValue.setValue(value.observationComponentValueToProto())
    }
    if (hasDataAbsentReason()) {
      protoValue.setDataAbsentReason(dataAbsentReason.toProto())
    }
    if (hasInterpretation()) {
      protoValue.addAllInterpretation(interpretation.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun Observation.ReferenceRange.toHapi():
    org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent {
    val hapiValue = org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasLow()) {
      hapiValue.setLow(low.toHapi())
    }
    if (hasHigh()) {
      hapiValue.setHigh(high.toHapi())
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (appliesToCount > 0) {
      hapiValue.setAppliesTo(appliesToList.map { it.toHapi() })
    }
    if (hasAge()) {
      hapiValue.setAge(age.toHapi())
    }
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    return hapiValue
  }

  @JvmStatic
  private fun Observation.Component.toHapi():
    org.hl7.fhir.r4.model.Observation.ObservationComponentComponent {
    val hapiValue = org.hl7.fhir.r4.model.Observation.ObservationComponentComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasCode()) {
      hapiValue.setCode(code.toHapi())
    }
    if (hasValue()) {
      hapiValue.setValue(value.observationComponentValueToHapi())
    }
    if (hasDataAbsentReason()) {
      hapiValue.setDataAbsentReason(dataAbsentReason.toHapi())
    }
    if (interpretationCount > 0) {
      hapiValue.setInterpretation(interpretationList.map { it.toHapi() })
    }
    return hapiValue
  }
}
