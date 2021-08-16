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
import com.google.android.fhir.hapiprotoconverter.generated.RatioConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.RatioConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.SimpleQuantityConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.SimpleQuantityConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.TimingConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.TimingConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.NutritionOrder
import com.google.fhir.r4.core.NutritionOrder.EnteralFormula
import com.google.fhir.r4.core.NutritionOrder.EnteralFormula.Administration
import com.google.fhir.r4.core.NutritionOrder.OralDiet
import com.google.fhir.r4.core.Ratio
import com.google.fhir.r4.core.RequestIntentCode
import com.google.fhir.r4.core.RequestStatusCode
import com.google.fhir.r4.core.SimpleQuantity
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import kotlin.jvm.JvmStatic
import org.hl7.fhir.r4.model.Type

public object NutritionOrderConverter {
  @JvmStatic
  private fun NutritionOrder.EnteralFormula.Administration.RateX.nutritionOrderEnteralFormulaAdministrationRateToHapi():
    Type {
    if (this.getQuantity() != SimpleQuantity.newBuilder().defaultInstanceForType) {
      return (this.getQuantity()).toHapi()
    }
    if (this.getRatio() != Ratio.newBuilder().defaultInstanceForType) {
      return (this.getRatio()).toHapi()
    }
    throw IllegalArgumentException(
      "Invalid Type for NutritionOrder.enteralFormula.administration.rate[x]"
    )
  }

  @JvmStatic
  private fun Type.nutritionOrderEnteralFormulaAdministrationRateToProto():
    NutritionOrder.EnteralFormula.Administration.RateX {
    val protoValue = NutritionOrder.EnteralFormula.Administration.RateX.newBuilder()
    if (this is org.hl7.fhir.r4.model.SimpleQuantity) {
      protoValue.setQuantity(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Ratio) {
      protoValue.setRatio(this.toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  public fun NutritionOrder.toHapi(): org.hl7.fhir.r4.model.NutritionOrder {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder()
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
    if (instantiatesCanonicalCount > 0) {
      hapiValue.setInstantiatesCanonical(instantiatesCanonicalList.map { it.toHapi() })
    }
    if (instantiatesUriCount > 0) {
      hapiValue.setInstantiatesUri(instantiatesUriList.map { it.toHapi() })
    }
    if (instantiatesCount > 0) {
      hapiValue.setInstantiates(instantiatesList.map { it.toHapi() })
    }
    hapiValue.setStatus(
      org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderStatus.valueOf(
        status.value.name.hapiCodeCheck().replace("_", "")
      )
    )
    hapiValue.setIntent(
      org.hl7.fhir.r4.model.NutritionOrder.NutritiionOrderIntent.valueOf(
        intent.value.name.hapiCodeCheck().replace("_", "")
      )
    )
    if (hasPatient()) {
      hapiValue.setPatient(patient.toHapi())
    }
    if (hasEncounter()) {
      hapiValue.setEncounter(encounter.toHapi())
    }
    if (hasDateTime()) {
      hapiValue.setDateTimeElement(dateTime.toHapi())
    }
    if (hasOrderer()) {
      hapiValue.setOrderer(orderer.toHapi())
    }
    if (allergyIntoleranceCount > 0) {
      hapiValue.setAllergyIntolerance(allergyIntoleranceList.map { it.toHapi() })
    }
    if (foodPreferenceModifierCount > 0) {
      hapiValue.setFoodPreferenceModifier(foodPreferenceModifierList.map { it.toHapi() })
    }
    if (excludeFoodModifierCount > 0) {
      hapiValue.setExcludeFoodModifier(excludeFoodModifierList.map { it.toHapi() })
    }
    if (hasOralDiet()) {
      hapiValue.setOralDiet(oralDiet.toHapi())
    }
    if (supplementCount > 0) {
      hapiValue.setSupplement(supplementList.map { it.toHapi() })
    }
    if (hasEnteralFormula()) {
      hapiValue.setEnteralFormula(enteralFormula.toHapi())
    }
    if (noteCount > 0) {
      hapiValue.setNote(noteList.map { it.toHapi() })
    }
    return hapiValue
  }

  @JvmStatic
  public fun org.hl7.fhir.r4.model.NutritionOrder.toProto(): NutritionOrder {
    val protoValue = NutritionOrder.newBuilder().setId(Id.newBuilder().setValue(id))
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
    if (hasInstantiatesCanonical()) {
      protoValue.addAllInstantiatesCanonical(instantiatesCanonical.map { it.toProto() })
    }
    if (hasInstantiatesUri()) {
      protoValue.addAllInstantiatesUri(instantiatesUri.map { it.toProto() })
    }
    if (hasInstantiates()) {
      protoValue.addAllInstantiates(instantiates.map { it.toProto() })
    }
    protoValue.setStatus(
      NutritionOrder.StatusCode.newBuilder()
        .setValue(
          RequestStatusCode.Value.valueOf(
            status.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
          )
        )
        .build()
    )
    protoValue.setIntent(
      NutritionOrder.IntentCode.newBuilder()
        .setValue(
          RequestIntentCode.Value.valueOf(
            intent.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
          )
        )
        .build()
    )
    if (hasPatient()) {
      protoValue.setPatient(patient.toProto())
    }
    if (hasEncounter()) {
      protoValue.setEncounter(encounter.toProto())
    }
    if (hasDateTime()) {
      protoValue.setDateTime(dateTimeElement.toProto())
    }
    if (hasOrderer()) {
      protoValue.setOrderer(orderer.toProto())
    }
    if (hasAllergyIntolerance()) {
      protoValue.addAllAllergyIntolerance(allergyIntolerance.map { it.toProto() })
    }
    if (hasFoodPreferenceModifier()) {
      protoValue.addAllFoodPreferenceModifier(foodPreferenceModifier.map { it.toProto() })
    }
    if (hasExcludeFoodModifier()) {
      protoValue.addAllExcludeFoodModifier(excludeFoodModifier.map { it.toProto() })
    }
    if (hasOralDiet()) {
      protoValue.setOralDiet(oralDiet.toProto())
    }
    if (hasSupplement()) {
      protoValue.addAllSupplement(supplement.map { it.toProto() })
    }
    if (hasEnteralFormula()) {
      protoValue.setEnteralFormula(enteralFormula.toProto())
    }
    if (hasNote()) {
      protoValue.addAllNote(note.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietComponent.toProto():
    NutritionOrder.OralDiet {
    val protoValue = NutritionOrder.OralDiet.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasSchedule()) {
      protoValue.addAllSchedule(schedule.map { it.toProto() })
    }
    if (hasNutrient()) {
      protoValue.addAllNutrient(nutrient.map { it.toProto() })
    }
    if (hasTexture()) {
      protoValue.addAllTexture(texture.map { it.toProto() })
    }
    if (hasFluidConsistencyType()) {
      protoValue.addAllFluidConsistencyType(fluidConsistencyType.map { it.toProto() })
    }
    if (hasInstruction()) {
      protoValue.setInstruction(instructionElement.toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent.toProto():
    NutritionOrder.OralDiet.Nutrient {
    val protoValue =
      NutritionOrder.OralDiet.Nutrient.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasModifier()) {
      protoValue.setModifier(modifier.toProto())
    }
    if (hasAmount()) {
      protoValue.setAmount((amount as org.hl7.fhir.r4.model.SimpleQuantity).toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent.toProto():
    NutritionOrder.OralDiet.Texture {
    val protoValue =
      NutritionOrder.OralDiet.Texture.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasModifier()) {
      protoValue.setModifier(modifier.toProto())
    }
    if (hasFoodType()) {
      protoValue.setFoodType(foodType.toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent.toProto():
    NutritionOrder.Supplement {
    val protoValue = NutritionOrder.Supplement.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasType()) {
      protoValue.setType(type.toProto())
    }
    if (hasProductName()) {
      protoValue.setProductName(productNameElement.toProto())
    }
    if (hasSchedule()) {
      protoValue.addAllSchedule(schedule.map { it.toProto() })
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as org.hl7.fhir.r4.model.SimpleQuantity).toProto())
    }
    if (hasInstruction()) {
      protoValue.setInstruction(instructionElement.toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaComponent.toProto():
    NutritionOrder.EnteralFormula {
    val protoValue =
      NutritionOrder.EnteralFormula.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasBaseFormulaType()) {
      protoValue.setBaseFormulaType(baseFormulaType.toProto())
    }
    if (hasBaseFormulaProductName()) {
      protoValue.setBaseFormulaProductName(baseFormulaProductNameElement.toProto())
    }
    if (hasAdditiveType()) {
      protoValue.setAdditiveType(additiveType.toProto())
    }
    if (hasAdditiveProductName()) {
      protoValue.setAdditiveProductName(additiveProductNameElement.toProto())
    }
    if (hasCaloricDensity()) {
      protoValue.setCaloricDensity(
        (caloricDensity as org.hl7.fhir.r4.model.SimpleQuantity).toProto()
      )
    }
    if (hasRouteofAdministration()) {
      protoValue.setRouteofAdministration(routeofAdministration.toProto())
    }
    if (hasAdministration()) {
      protoValue.addAllAdministration(administration.map { it.toProto() })
    }
    if (hasMaxVolumeToDeliver()) {
      protoValue.setMaxVolumeToDeliver(
        (maxVolumeToDeliver as org.hl7.fhir.r4.model.SimpleQuantity).toProto()
      )
    }
    if (hasAdministrationInstruction()) {
      protoValue.setAdministrationInstruction(administrationInstructionElement.toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent.toProto():
    NutritionOrder.EnteralFormula.Administration {
    val protoValue =
      NutritionOrder.EnteralFormula.Administration.newBuilder()
        .setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSchedule()) {
      protoValue.setSchedule(schedule.toProto())
    }
    if (hasQuantity()) {
      protoValue.setQuantity((quantity as org.hl7.fhir.r4.model.SimpleQuantity).toProto())
    }
    if (hasRate()) {
      protoValue.setRate(rate.nutritionOrderEnteralFormulaAdministrationRateToProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun NutritionOrder.OralDiet.toHapi():
    org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietComponent {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (typeCount > 0) {
      hapiValue.setType(typeList.map { it.toHapi() })
    }
    if (scheduleCount > 0) {
      hapiValue.setSchedule(scheduleList.map { it.toHapi() })
    }
    if (nutrientCount > 0) {
      hapiValue.setNutrient(nutrientList.map { it.toHapi() })
    }
    if (textureCount > 0) {
      hapiValue.setTexture(textureList.map { it.toHapi() })
    }
    if (fluidConsistencyTypeCount > 0) {
      hapiValue.setFluidConsistencyType(fluidConsistencyTypeList.map { it.toHapi() })
    }
    if (hasInstruction()) {
      hapiValue.setInstructionElement(instruction.toHapi())
    }
    return hapiValue
  }

  @JvmStatic
  private fun NutritionOrder.OralDiet.Nutrient.toHapi():
    org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasModifier()) {
      hapiValue.setModifier(modifier.toHapi())
    }
    if (hasAmount()) {
      hapiValue.setAmount(amount.toHapi())
    }
    return hapiValue
  }

  @JvmStatic
  private fun NutritionOrder.OralDiet.Texture.toHapi():
    org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasModifier()) {
      hapiValue.setModifier(modifier.toHapi())
    }
    if (hasFoodType()) {
      hapiValue.setFoodType(foodType.toHapi())
    }
    return hapiValue
  }

  @JvmStatic
  private fun NutritionOrder.Supplement.toHapi():
    org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasType()) {
      hapiValue.setType(type.toHapi())
    }
    if (hasProductName()) {
      hapiValue.setProductNameElement(productName.toHapi())
    }
    if (scheduleCount > 0) {
      hapiValue.setSchedule(scheduleList.map { it.toHapi() })
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasInstruction()) {
      hapiValue.setInstructionElement(instruction.toHapi())
    }
    return hapiValue
  }

  @JvmStatic
  private fun NutritionOrder.EnteralFormula.toHapi():
    org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaComponent {
    val hapiValue = org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasBaseFormulaType()) {
      hapiValue.setBaseFormulaType(baseFormulaType.toHapi())
    }
    if (hasBaseFormulaProductName()) {
      hapiValue.setBaseFormulaProductNameElement(baseFormulaProductName.toHapi())
    }
    if (hasAdditiveType()) {
      hapiValue.setAdditiveType(additiveType.toHapi())
    }
    if (hasAdditiveProductName()) {
      hapiValue.setAdditiveProductNameElement(additiveProductName.toHapi())
    }
    if (hasCaloricDensity()) {
      hapiValue.setCaloricDensity(caloricDensity.toHapi())
    }
    if (hasRouteofAdministration()) {
      hapiValue.setRouteofAdministration(routeofAdministration.toHapi())
    }
    if (administrationCount > 0) {
      hapiValue.setAdministration(administrationList.map { it.toHapi() })
    }
    if (hasMaxVolumeToDeliver()) {
      hapiValue.setMaxVolumeToDeliver(maxVolumeToDeliver.toHapi())
    }
    if (hasAdministrationInstruction()) {
      hapiValue.setAdministrationInstructionElement(administrationInstruction.toHapi())
    }
    return hapiValue
  }

  @JvmStatic
  private fun NutritionOrder.EnteralFormula.Administration.toHapi():
    org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent {
    val hapiValue =
      org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasSchedule()) {
      hapiValue.setSchedule(schedule.toHapi())
    }
    if (hasQuantity()) {
      hapiValue.setQuantity(quantity.toHapi())
    }
    if (hasRate()) {
      hapiValue.setRate(rate.nutritionOrderEnteralFormulaAdministrationRateToHapi())
    }
    return hapiValue
  }
}
