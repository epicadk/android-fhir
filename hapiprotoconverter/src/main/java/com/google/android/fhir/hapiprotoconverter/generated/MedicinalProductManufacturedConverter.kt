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

import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ProdCharacteristicConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ProdCharacteristicConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.QuantityConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.QuantityConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MedicinalProductManufactured

object MedicinalProductManufacturedConverter {
  fun MedicinalProductManufactured.toHapi(): org.hl7.fhir.r4.model.MedicinalProductManufactured {
    val hapiValue = org.hl7.fhir.r4.model.MedicinalProductManufactured()
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
    if (hasManufacturedDoseForm()) {
      hapiValue.manufacturedDoseForm = manufacturedDoseForm.toHapi()
    }
    if (hasUnitOfPresentation()) {
      hapiValue.unitOfPresentation = unitOfPresentation.toHapi()
    }
    if (hasQuantity()) {
      hapiValue.quantity = quantity.toHapi()
    }
    if (manufacturerCount > 0) {
      hapiValue.manufacturer = manufacturerList.map { it.toHapi() }
    }
    if (ingredientCount > 0) {
      hapiValue.ingredient = ingredientList.map { it.toHapi() }
    }
    if (hasPhysicalCharacteristics()) {
      hapiValue.physicalCharacteristics = physicalCharacteristics.toHapi()
    }
    if (otherCharacteristicsCount > 0) {
      hapiValue.otherCharacteristics = otherCharacteristicsList.map { it.toHapi() }
    }
    return hapiValue
  }

  fun org.hl7.fhir.r4.model.MedicinalProductManufactured.toProto(): MedicinalProductManufactured {
    val protoValue = MedicinalProductManufactured.newBuilder().setId(Id.newBuilder().setValue(id))
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
    if (hasManufacturedDoseForm()) {
      protoValue.manufacturedDoseForm = manufacturedDoseForm.toProto()
    }
    if (hasUnitOfPresentation()) {
      protoValue.unitOfPresentation = unitOfPresentation.toProto()
    }
    if (hasQuantity()) {
      protoValue.quantity = quantity.toProto()
    }
    if (hasManufacturer()) {
      protoValue.addAllManufacturer(manufacturer.map { it.toProto() })
    }
    if (hasIngredient()) {
      protoValue.addAllIngredient(ingredient.map { it.toProto() })
    }
    if (hasPhysicalCharacteristics()) {
      protoValue.physicalCharacteristics = physicalCharacteristics.toProto()
    }
    if (hasOtherCharacteristics()) {
      protoValue.addAllOtherCharacteristics(otherCharacteristics.map { it.toProto() })
    }
    return protoValue.build()
  }
}
