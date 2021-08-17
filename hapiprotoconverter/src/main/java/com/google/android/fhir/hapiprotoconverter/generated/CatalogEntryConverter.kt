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
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.CatalogEntry
import com.google.fhir.r4.core.CatalogEntry.RelatedEntry
import com.google.fhir.r4.core.CatalogEntryRelationTypeCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.Enumerations

object CatalogEntryConverter {
  fun CatalogEntry.toHapi(): org.hl7.fhir.r4.model.CatalogEntry {
    val hapiValue = org.hl7.fhir.r4.model.CatalogEntry()
    hapiValue.id = id.value
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
    if (hasType()) {
      hapiValue.type = type.toHapi()
    }
    if (hasOrderable()) {
      hapiValue.orderableElement = orderable.toHapi()
    }
    if (hasReferencedItem()) {
      hapiValue.referencedItem = referencedItem.toHapi()
    }
    if (additionalIdentifierCount > 0) {
      hapiValue.additionalIdentifier = additionalIdentifierList.map { it.toHapi() }
    }
    if (classificationCount > 0) {
      hapiValue.classification = classificationList.map { it.toHapi() }
    }
    hapiValue.status =
      Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", ""))
    if (hasValidityPeriod()) {
      hapiValue.validityPeriod = validityPeriod.toHapi()
    }
    if (hasValidTo()) {
      hapiValue.validToElement = validTo.toHapi()
    }
    if (hasLastUpdated()) {
      hapiValue.lastUpdatedElement = lastUpdated.toHapi()
    }
    if (additionalCharacteristicCount > 0) {
      hapiValue.additionalCharacteristic = additionalCharacteristicList.map { it.toHapi() }
    }
    if (additionalClassificationCount > 0) {
      hapiValue.additionalClassification = additionalClassificationList.map { it.toHapi() }
    }
    if (relatedEntryCount > 0) {
      hapiValue.relatedEntry = relatedEntryList.map { it.toHapi() }
    }
    return hapiValue
  }

  fun org.hl7.fhir.r4.model.CatalogEntry.toProto(): CatalogEntry {
    val protoValue = CatalogEntry.newBuilder().setId(Id.newBuilder().setValue(id))
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
    if (hasType()) {
      protoValue.type = type.toProto()
    }
    if (hasOrderable()) {
      protoValue.orderable = orderableElement.toProto()
    }
    if (hasReferencedItem()) {
      protoValue.referencedItem = referencedItem.toProto()
    }
    if (hasAdditionalIdentifier()) {
      protoValue.addAllAdditionalIdentifier(additionalIdentifier.map { it.toProto() })
    }
    if (hasClassification()) {
      protoValue.addAllClassification(classification.map { it.toProto() })
    }
    protoValue.status =
      CatalogEntry.StatusCode.newBuilder()
        .setValue(
          PublicationStatusCode.Value.valueOf(
            status.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
          )
        )
        .build()
    if (hasValidityPeriod()) {
      protoValue.validityPeriod = validityPeriod.toProto()
    }
    if (hasValidTo()) {
      protoValue.validTo = validToElement.toProto()
    }
    if (hasLastUpdated()) {
      protoValue.lastUpdated = lastUpdatedElement.toProto()
    }
    if (hasAdditionalCharacteristic()) {
      protoValue.addAllAdditionalCharacteristic(additionalCharacteristic.map { it.toProto() })
    }
    if (hasAdditionalClassification()) {
      protoValue.addAllAdditionalClassification(additionalClassification.map { it.toProto() })
    }
    if (hasRelatedEntry()) {
      protoValue.addAllRelatedEntry(relatedEntry.map { it.toProto() })
    }
    return protoValue.build()
  }

  private fun org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent.toProto():
    CatalogEntry.RelatedEntry {
    val protoValue = CatalogEntry.RelatedEntry.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    protoValue.relationtype =
      CatalogEntry.RelatedEntry.RelationtypeCode.newBuilder()
        .setValue(
          CatalogEntryRelationTypeCode.Value.valueOf(
            relationtype.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
          )
        )
        .build()
    if (hasItem()) {
      protoValue.item = item.toProto()
    }
    return protoValue.build()
  }

  private fun CatalogEntry.RelatedEntry.toHapi():
    org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent {
    val hapiValue = org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelatedEntryComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
      hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    hapiValue.relationtype =
      org.hl7.fhir.r4.model.CatalogEntry.CatalogEntryRelationType.valueOf(
        relationtype.value.name.hapiCodeCheck().replace("_", "")
      )
    if (hasItem()) {
      hapiValue.item = item.toHapi()
    }
    return hapiValue
  }
}
