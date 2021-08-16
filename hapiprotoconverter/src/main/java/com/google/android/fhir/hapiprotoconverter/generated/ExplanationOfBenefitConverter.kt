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

import com.google.android.fhir.hapiprotoconverter.generated.AddressConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AddressConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.AttachmentConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AttachmentConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.BooleanConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.BooleanConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodingConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodingConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DateConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DateConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DecimalConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DecimalConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.IdentifierConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.IdentifierConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MoneyConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MoneyConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.PositiveIntConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.PositiveIntConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.QuantityConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.QuantityConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.SimpleQuantityConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.SimpleQuantityConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UnsignedIntConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UnsignedIntConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.Address
import com.google.fhir.r4.core.Attachment
import com.google.fhir.r4.core.Boolean
import com.google.fhir.r4.core.ClaimProcessingCode
import com.google.fhir.r4.core.CodeableConcept
import com.google.fhir.r4.core.Date
import com.google.fhir.r4.core.ExplanationOfBenefit
import com.google.fhir.r4.core.ExplanationOfBenefit.Accident
import com.google.fhir.r4.core.ExplanationOfBenefit.AddedItem
import com.google.fhir.r4.core.ExplanationOfBenefit.AddedItem.AddedItemDetail
import com.google.fhir.r4.core.ExplanationOfBenefit.BenefitBalance
import com.google.fhir.r4.core.ExplanationOfBenefit.BenefitBalance.Benefit
import com.google.fhir.r4.core.ExplanationOfBenefit.Diagnosis
import com.google.fhir.r4.core.ExplanationOfBenefit.Item
import com.google.fhir.r4.core.ExplanationOfBenefit.Item.Detail
import com.google.fhir.r4.core.ExplanationOfBenefit.Note
import com.google.fhir.r4.core.ExplanationOfBenefit.Procedure
import com.google.fhir.r4.core.ExplanationOfBenefit.SupportingInformation
import com.google.fhir.r4.core.ExplanationOfBenefitStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Money
import com.google.fhir.r4.core.NoteTypeCode
import com.google.fhir.r4.core.Period
import com.google.fhir.r4.core.Quantity
import com.google.fhir.r4.core.Reference
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.UnsignedInt
import com.google.fhir.r4.core.UseCode
import java.lang.IllegalArgumentException
import kotlin.jvm.JvmStatic
import org.hl7.fhir.r4.model.BooleanType
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UnsignedIntType

object ExplanationOfBenefitConverter {
  @JvmStatic
  private fun ExplanationOfBenefit.SupportingInformation.TimingX.explanationOfBenefitSupportingInfoTimingToHapi():
    Type {
    if (this.date != Date.newBuilder().defaultInstanceForType) {
      return (this.date).toHapi()
    }
    if (this.period != Period.newBuilder().defaultInstanceForType) {
      return (this.period).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.supportingInfo.timing[x]")
  }

  @JvmStatic
  private fun Type.explanationOfBenefitSupportingInfoTimingToProto():
    ExplanationOfBenefit.SupportingInformation.TimingX {
    val protoValue = ExplanationOfBenefit.SupportingInformation.TimingX.newBuilder()
    if (this is DateType) {
        protoValue.date = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Period) {
        protoValue.period = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.SupportingInformation.ValueX.explanationOfBenefitSupportingInfoValueToHapi():
    Type {
    if (this.boolean != Boolean.newBuilder().defaultInstanceForType) {
      return (this.boolean).toHapi()
    }
    if (this.stringValue != String.newBuilder().defaultInstanceForType) {
      return (this.stringValue).toHapi()
    }
    if (this.quantity != Quantity.newBuilder().defaultInstanceForType) {
      return (this.quantity).toHapi()
    }
    if (this.attachment != Attachment.newBuilder().defaultInstanceForType) {
      return (this.attachment).toHapi()
    }
    if (this.reference != Reference.newBuilder().defaultInstanceForType) {
      return (this.reference).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.supportingInfo.value[x]")
  }

  @JvmStatic
  private fun Type.explanationOfBenefitSupportingInfoValueToProto():
    ExplanationOfBenefit.SupportingInformation.ValueX {
    val protoValue = ExplanationOfBenefit.SupportingInformation.ValueX.newBuilder()
    if (this is BooleanType) {
        protoValue.boolean = this.toProto()
    }
    if (this is StringType) {
        protoValue.stringValue = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Quantity) {
        protoValue.quantity = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Attachment) {
        protoValue.attachment = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Reference) {
        protoValue.reference = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Diagnosis.DiagnosisX.explanationOfBenefitDiagnosisDiagnosisToHapi():
    Type {
    if (this.codeableConcept != CodeableConcept.newBuilder().defaultInstanceForType) {
      return (this.codeableConcept).toHapi()
    }
    if (this.reference != Reference.newBuilder().defaultInstanceForType) {
      return (this.reference).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.diagnosis.diagnosis[x]")
  }

  @JvmStatic
  private fun Type.explanationOfBenefitDiagnosisDiagnosisToProto():
    ExplanationOfBenefit.Diagnosis.DiagnosisX {
    val protoValue = ExplanationOfBenefit.Diagnosis.DiagnosisX.newBuilder()
    if (this is org.hl7.fhir.r4.model.CodeableConcept) {
        protoValue.codeableConcept = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Reference) {
        protoValue.reference = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Procedure.ProcedureX.explanationOfBenefitProcedureProcedureToHapi():
    Type {
    if (this.codeableConcept != CodeableConcept.newBuilder().defaultInstanceForType) {
      return (this.codeableConcept).toHapi()
    }
    if (this.reference != Reference.newBuilder().defaultInstanceForType) {
      return (this.reference).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.procedure.procedure[x]")
  }

  @JvmStatic
  private fun Type.explanationOfBenefitProcedureProcedureToProto():
    ExplanationOfBenefit.Procedure.ProcedureX {
    val protoValue = ExplanationOfBenefit.Procedure.ProcedureX.newBuilder()
    if (this is org.hl7.fhir.r4.model.CodeableConcept) {
        protoValue.codeableConcept = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Reference) {
        protoValue.reference = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Accident.LocationX.explanationOfBenefitAccidentLocationToHapi():
    Type {
    if (this.address != Address.newBuilder().defaultInstanceForType) {
      return (this.address).toHapi()
    }
    if (this.reference != Reference.newBuilder().defaultInstanceForType) {
      return (this.reference).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.accident.location[x]")
  }

  @JvmStatic
  private fun Type.explanationOfBenefitAccidentLocationToProto():
    ExplanationOfBenefit.Accident.LocationX {
    val protoValue = ExplanationOfBenefit.Accident.LocationX.newBuilder()
    if (this is org.hl7.fhir.r4.model.Address) {
        protoValue.address = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Reference) {
        protoValue.reference = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Item.ServicedX.explanationOfBenefitItemServicedToHapi(): Type {
    if (this.date != Date.newBuilder().defaultInstanceForType) {
      return (this.date).toHapi()
    }
    if (this.period != Period.newBuilder().defaultInstanceForType) {
      return (this.period).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.item.serviced[x]")
  }

  @JvmStatic
  private fun Type.explanationOfBenefitItemServicedToProto(): ExplanationOfBenefit.Item.ServicedX {
    val protoValue = ExplanationOfBenefit.Item.ServicedX.newBuilder()
    if (this is DateType) {
        protoValue.date = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Period) {
        protoValue.period = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Item.LocationX.explanationOfBenefitItemLocationToHapi(): Type {
    if (this.codeableConcept != CodeableConcept.newBuilder().defaultInstanceForType) {
      return (this.codeableConcept).toHapi()
    }
    if (this.address != Address.newBuilder().defaultInstanceForType) {
      return (this.address).toHapi()
    }
    if (this.reference != Reference.newBuilder().defaultInstanceForType) {
      return (this.reference).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.item.location[x]")
  }

  @JvmStatic
  private fun Type.explanationOfBenefitItemLocationToProto(): ExplanationOfBenefit.Item.LocationX {
    val protoValue = ExplanationOfBenefit.Item.LocationX.newBuilder()
    if (this is org.hl7.fhir.r4.model.CodeableConcept) {
        protoValue.codeableConcept = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Address) {
        protoValue.address = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Reference) {
        protoValue.reference = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.AddedItem.ServicedX.explanationOfBenefitAddItemServicedToHapi():
    Type {
    if (this.date != Date.newBuilder().defaultInstanceForType) {
      return (this.date).toHapi()
    }
    if (this.period != Period.newBuilder().defaultInstanceForType) {
      return (this.period).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.addItem.serviced[x]")
  }

  @JvmStatic
  private fun Type.explanationOfBenefitAddItemServicedToProto():
    ExplanationOfBenefit.AddedItem.ServicedX {
    val protoValue = ExplanationOfBenefit.AddedItem.ServicedX.newBuilder()
    if (this is DateType) {
        protoValue.date = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Period) {
        protoValue.period = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.AddedItem.LocationX.explanationOfBenefitAddItemLocationToHapi():
    Type {
    if (this.codeableConcept != CodeableConcept.newBuilder().defaultInstanceForType) {
      return (this.codeableConcept).toHapi()
    }
    if (this.address != Address.newBuilder().defaultInstanceForType) {
      return (this.address).toHapi()
    }
    if (this.reference != Reference.newBuilder().defaultInstanceForType) {
      return (this.reference).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ExplanationOfBenefit.addItem.location[x]")
  }

  @JvmStatic
  private fun Type.explanationOfBenefitAddItemLocationToProto():
    ExplanationOfBenefit.AddedItem.LocationX {
    val protoValue = ExplanationOfBenefit.AddedItem.LocationX.newBuilder()
    if (this is org.hl7.fhir.r4.model.CodeableConcept) {
        protoValue.codeableConcept = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Address) {
        protoValue.address = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Reference) {
        protoValue.reference = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.BenefitBalance.Benefit.AllowedX.explanationOfBenefitBenefitBalanceFinancialAllowedToHapi():
    Type {
    if (this.unsignedInt != UnsignedInt.newBuilder().defaultInstanceForType) {
      return (this.unsignedInt).toHapi()
    }
    if (this.stringValue != String.newBuilder().defaultInstanceForType) {
      return (this.stringValue).toHapi()
    }
    if (this.money != Money.newBuilder().defaultInstanceForType) {
      return (this.money).toHapi()
    }
    throw IllegalArgumentException(
      "Invalid Type for ExplanationOfBenefit.benefitBalance.financial.allowed[x]"
    )
  }

  @JvmStatic
  private fun Type.explanationOfBenefitBenefitBalanceFinancialAllowedToProto():
    ExplanationOfBenefit.BenefitBalance.Benefit.AllowedX {
    val protoValue = ExplanationOfBenefit.BenefitBalance.Benefit.AllowedX.newBuilder()
    if (this is UnsignedIntType) {
        protoValue.unsignedInt = this.toProto()
    }
    if (this is StringType) {
        protoValue.stringValue = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Money) {
        protoValue.money = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.BenefitBalance.Benefit.UsedX.explanationOfBenefitBenefitBalanceFinancialUsedToHapi():
    Type {
    if (this.unsignedInt != UnsignedInt.newBuilder().defaultInstanceForType) {
      return (this.unsignedInt).toHapi()
    }
    if (this.money != Money.newBuilder().defaultInstanceForType) {
      return (this.money).toHapi()
    }
    throw IllegalArgumentException(
      "Invalid Type for ExplanationOfBenefit.benefitBalance.financial.used[x]"
    )
  }

  @JvmStatic
  private fun Type.explanationOfBenefitBenefitBalanceFinancialUsedToProto():
    ExplanationOfBenefit.BenefitBalance.Benefit.UsedX {
    val protoValue = ExplanationOfBenefit.BenefitBalance.Benefit.UsedX.newBuilder()
    if (this is UnsignedIntType) {
        protoValue.unsignedInt = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Money) {
        protoValue.money = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  fun ExplanationOfBenefit.toHapi(): org.hl7.fhir.r4.model.ExplanationOfBenefit {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit()
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
      hapiValue.status = org.hl7.fhir.r4.model.ExplanationOfBenefit.ExplanationOfBenefitStatus.valueOf(
          status.value.name.hapiCodeCheck().replace("_", "")
      )
    if (hasType()) {
        hapiValue.type = type.toHapi()
    }
    if (hasSubType()) {
        hapiValue.subType = subType.toHapi()
    }
      hapiValue.use = org.hl7.fhir.r4.model.ExplanationOfBenefit.Use.valueOf(
          use.value.name.hapiCodeCheck().replace("_", "")
      )
    if (hasPatient()) {
        hapiValue.patient = patient.toHapi()
    }
    if (hasBillablePeriod()) {
        hapiValue.billablePeriod = billablePeriod.toHapi()
    }
    if (hasCreated()) {
        hapiValue.createdElement = created.toHapi()
    }
    if (hasEnterer()) {
        hapiValue.enterer = enterer.toHapi()
    }
    if (hasInsurer()) {
        hapiValue.insurer = insurer.toHapi()
    }
    if (hasProvider()) {
        hapiValue.provider = provider.toHapi()
    }
    if (hasPriority()) {
        hapiValue.priority = priority.toHapi()
    }
    if (hasFundsReserveRequested()) {
        hapiValue.fundsReserveRequested = fundsReserveRequested.toHapi()
    }
    if (hasFundsReserve()) {
        hapiValue.fundsReserve = fundsReserve.toHapi()
    }
    if (relatedCount > 0) {
        hapiValue.related = relatedList.map { it.toHapi() }
    }
    if (hasPrescription()) {
        hapiValue.prescription = prescription.toHapi()
    }
    if (hasOriginalPrescription()) {
        hapiValue.originalPrescription = originalPrescription.toHapi()
    }
    if (hasPayee()) {
        hapiValue.payee = payee.toHapi()
    }
    if (hasReferral()) {
        hapiValue.referral = referral.toHapi()
    }
    if (hasFacility()) {
        hapiValue.facility = facility.toHapi()
    }
    if (hasClaim()) {
        hapiValue.claim = claim.toHapi()
    }
    if (hasClaimResponse()) {
        hapiValue.claimResponse = claimResponse.toHapi()
    }
      hapiValue.outcome = org.hl7.fhir.r4.model.ExplanationOfBenefit.RemittanceOutcome.valueOf(
          outcome.value.name.hapiCodeCheck().replace("_", "")
      )
    if (hasDisposition()) {
        hapiValue.dispositionElement = disposition.toHapi()
    }
    if (preAuthRefCount > 0) {
        hapiValue.preAuthRef = preAuthRefList.map { it.toHapi() }
    }
    if (preAuthRefPeriodCount > 0) {
        hapiValue.preAuthRefPeriod = preAuthRefPeriodList.map { it.toHapi() }
    }
    if (careTeamCount > 0) {
        hapiValue.careTeam = careTeamList.map { it.toHapi() }
    }
    if (supportingInfoCount > 0) {
        hapiValue.supportingInfo = supportingInfoList.map { it.toHapi() }
    }
    if (diagnosisCount > 0) {
        hapiValue.diagnosis = diagnosisList.map { it.toHapi() }
    }
    if (procedureCount > 0) {
        hapiValue.procedure = procedureList.map { it.toHapi() }
    }
    if (hasPrecedence()) {
        hapiValue.precedenceElement = precedence.toHapi()
    }
    if (insuranceCount > 0) {
        hapiValue.insurance = insuranceList.map { it.toHapi() }
    }
    if (hasAccident()) {
        hapiValue.accident = accident.toHapi()
    }
    if (itemCount > 0) {
        hapiValue.item = itemList.map { it.toHapi() }
    }
    if (addItemCount > 0) {
        hapiValue.addItem = addItemList.map { it.toHapi() }
    }
    if (totalCount > 0) {
        hapiValue.total = totalList.map { it.toHapi() }
    }
    if (hasPayment()) {
        hapiValue.payment = payment.toHapi()
    }
    if (hasFormCode()) {
        hapiValue.formCode = formCode.toHapi()
    }
    if (hasForm()) {
        hapiValue.form = form.toHapi()
    }
    if (processNoteCount > 0) {
        hapiValue.processNote = processNoteList.map { it.toHapi() }
    }
    if (hasBenefitPeriod()) {
        hapiValue.benefitPeriod = benefitPeriod.toHapi()
    }
    if (benefitBalanceCount > 0) {
        hapiValue.benefitBalance = benefitBalanceList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  fun org.hl7.fhir.r4.model.ExplanationOfBenefit.toProto(): ExplanationOfBenefit {
    val protoValue = ExplanationOfBenefit.newBuilder().setId(Id.newBuilder().setValue(id))
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
      protoValue.status = ExplanationOfBenefit.StatusCode.newBuilder()
          .setValue(
              ExplanationOfBenefitStatusCode.Value.valueOf(
                  status.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
              )
          )
          .build()
    if (hasType()) {
        protoValue.type = type.toProto()
    }
    if (hasSubType()) {
        protoValue.subType = subType.toProto()
    }
      protoValue.use = ExplanationOfBenefit.UseCode.newBuilder()
          .setValue(
              UseCode.Value.valueOf(use.toCode().protoCodeCheck().replace("-", "_").toUpperCase())
          )
          .build()
    if (hasPatient()) {
        protoValue.patient = patient.toProto()
    }
    if (hasBillablePeriod()) {
        protoValue.billablePeriod = billablePeriod.toProto()
    }
    if (hasCreated()) {
        protoValue.created = createdElement.toProto()
    }
    if (hasEnterer()) {
        protoValue.enterer = enterer.toProto()
    }
    if (hasInsurer()) {
        protoValue.insurer = insurer.toProto()
    }
    if (hasProvider()) {
        protoValue.provider = provider.toProto()
    }
    if (hasPriority()) {
        protoValue.priority = priority.toProto()
    }
    if (hasFundsReserveRequested()) {
        protoValue.fundsReserveRequested = fundsReserveRequested.toProto()
    }
    if (hasFundsReserve()) {
        protoValue.fundsReserve = fundsReserve.toProto()
    }
    if (hasRelated()) {
      protoValue.addAllRelated(related.map { it.toProto() })
    }
    if (hasPrescription()) {
        protoValue.prescription = prescription.toProto()
    }
    if (hasOriginalPrescription()) {
        protoValue.originalPrescription = originalPrescription.toProto()
    }
    if (hasPayee()) {
        protoValue.payee = payee.toProto()
    }
    if (hasReferral()) {
        protoValue.referral = referral.toProto()
    }
    if (hasFacility()) {
        protoValue.facility = facility.toProto()
    }
    if (hasClaim()) {
        protoValue.claim = claim.toProto()
    }
    if (hasClaimResponse()) {
        protoValue.claimResponse = claimResponse.toProto()
    }
      protoValue.outcome = ExplanationOfBenefit.OutcomeCode.newBuilder()
          .setValue(
              ClaimProcessingCode.Value.valueOf(
                  outcome.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
              )
          )
          .build()
    if (hasDisposition()) {
        protoValue.disposition = dispositionElement.toProto()
    }
    if (hasPreAuthRef()) {
      protoValue.addAllPreAuthRef(preAuthRef.map { it.toProto() })
    }
    if (hasPreAuthRefPeriod()) {
      protoValue.addAllPreAuthRefPeriod(preAuthRefPeriod.map { it.toProto() })
    }
    if (hasCareTeam()) {
      protoValue.addAllCareTeam(careTeam.map { it.toProto() })
    }
    if (hasSupportingInfo()) {
      protoValue.addAllSupportingInfo(supportingInfo.map { it.toProto() })
    }
    if (hasDiagnosis()) {
      protoValue.addAllDiagnosis(diagnosis.map { it.toProto() })
    }
    if (hasProcedure()) {
      protoValue.addAllProcedure(procedure.map { it.toProto() })
    }
    if (hasPrecedence()) {
        protoValue.precedence = precedenceElement.toProto()
    }
    if (hasInsurance()) {
      protoValue.addAllInsurance(insurance.map { it.toProto() })
    }
    if (hasAccident()) {
        protoValue.accident = accident.toProto()
    }
    if (hasItem()) {
      protoValue.addAllItem(item.map { it.toProto() })
    }
    if (hasAddItem()) {
      protoValue.addAllAddItem(addItem.map { it.toProto() })
    }
    if (hasTotal()) {
      protoValue.addAllTotal(total.map { it.toProto() })
    }
    if (hasPayment()) {
        protoValue.payment = payment.toProto()
    }
    if (hasFormCode()) {
        protoValue.formCode = formCode.toProto()
    }
    if (hasForm()) {
        protoValue.form = form.toProto()
    }
    if (hasProcessNote()) {
      protoValue.addAllProcessNote(processNote.map { it.toProto() })
    }
    if (hasBenefitPeriod()) {
        protoValue.benefitPeriod = benefitPeriod.toProto()
    }
    if (hasBenefitBalance()) {
      protoValue.addAllBenefitBalance(benefitBalance.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent.toProto():
    ExplanationOfBenefit.RelatedClaim {
    val protoValue =
      ExplanationOfBenefit.RelatedClaim.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasClaim()) {
        protoValue.claim = claim.toProto()
    }
    if (hasRelationship()) {
        protoValue.relationship = relationship.toProto()
    }
    if (hasReference()) {
        protoValue.reference = reference.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.PayeeComponent.toProto():
    ExplanationOfBenefit.Payee {
    val protoValue = ExplanationOfBenefit.Payee.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasType()) {
        protoValue.type = type.toProto()
    }
    if (hasParty()) {
        protoValue.party = party.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent.toProto():
    ExplanationOfBenefit.CareTeam {
    val protoValue =
      ExplanationOfBenefit.CareTeam.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSequence()) {
        protoValue.sequence = sequenceElement.toProto()
    }
    if (hasProvider()) {
        protoValue.provider = provider.toProto()
    }
    if (hasResponsible()) {
        protoValue.responsible = responsibleElement.toProto()
    }
    if (hasRole()) {
        protoValue.role = role.toProto()
    }
    if (hasQualification()) {
        protoValue.qualification = qualification.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent.toProto():
    ExplanationOfBenefit.SupportingInformation {
    val protoValue =
      ExplanationOfBenefit.SupportingInformation.newBuilder()
        .setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSequence()) {
        protoValue.sequence = sequenceElement.toProto()
    }
    if (hasCategory()) {
        protoValue.category = category.toProto()
    }
    if (hasCode()) {
        protoValue.code = code.toProto()
    }
    if (hasTiming()) {
        protoValue.timing = timing.explanationOfBenefitSupportingInfoTimingToProto()
    }
    if (hasValue()) {
        protoValue.value = value.explanationOfBenefitSupportingInfoValueToProto()
    }
    if (hasReason()) {
        protoValue.reason = reason.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent.toProto():
    ExplanationOfBenefit.Diagnosis {
    val protoValue =
      ExplanationOfBenefit.Diagnosis.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSequence()) {
        protoValue.sequence = sequenceElement.toProto()
    }
    if (hasDiagnosis()) {
        protoValue.diagnosis = diagnosis.explanationOfBenefitDiagnosisDiagnosisToProto()
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasOnAdmission()) {
        protoValue.onAdmission = onAdmission.toProto()
    }
    if (hasPackageCode()) {
        protoValue.packageCode = packageCode.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent.toProto():
    ExplanationOfBenefit.Procedure {
    val protoValue =
      ExplanationOfBenefit.Procedure.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSequence()) {
        protoValue.sequence = sequenceElement.toProto()
    }
    if (hasType()) {
      protoValue.addAllType(type.map { it.toProto() })
    }
    if (hasDate()) {
        protoValue.date = dateElement.toProto()
    }
    if (hasProcedure()) {
        protoValue.procedure = procedure.explanationOfBenefitProcedureProcedureToProto()
    }
    if (hasUdi()) {
      protoValue.addAllUdi(udi.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent.toProto():
    ExplanationOfBenefit.Insurance {
    val protoValue =
      ExplanationOfBenefit.Insurance.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasFocal()) {
        protoValue.focal = focalElement.toProto()
    }
    if (hasCoverage()) {
        protoValue.coverage = coverage.toProto()
    }
    if (hasPreAuthRef()) {
      protoValue.addAllPreAuthRef(preAuthRef.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.AccidentComponent.toProto():
    ExplanationOfBenefit.Accident {
    val protoValue =
      ExplanationOfBenefit.Accident.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasDate()) {
        protoValue.date = dateElement.toProto()
    }
    if (hasType()) {
        protoValue.type = type.toProto()
    }
    if (hasLocation()) {
        protoValue.location = location.explanationOfBenefitAccidentLocationToProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent.toProto():
    ExplanationOfBenefit.Item {
    val protoValue = ExplanationOfBenefit.Item.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSequence()) {
        protoValue.sequence = sequenceElement.toProto()
    }
    if (hasCareTeamSequence()) {
      protoValue.addAllCareTeamSequence(careTeamSequence.map { it.toProto() })
    }
    if (hasDiagnosisSequence()) {
      protoValue.addAllDiagnosisSequence(diagnosisSequence.map { it.toProto() })
    }
    if (hasProcedureSequence()) {
      protoValue.addAllProcedureSequence(procedureSequence.map { it.toProto() })
    }
    if (hasInformationSequence()) {
      protoValue.addAllInformationSequence(informationSequence.map { it.toProto() })
    }
    if (hasRevenue()) {
        protoValue.revenue = revenue.toProto()
    }
    if (hasCategory()) {
        protoValue.category = category.toProto()
    }
    if (hasProductOrService()) {
        protoValue.productOrService = productOrService.toProto()
    }
    if (hasModifier()) {
      protoValue.addAllModifier(modifier.map { it.toProto() })
    }
    if (hasProgramCode()) {
      protoValue.addAllProgramCode(programCode.map { it.toProto() })
    }
    if (hasServiced()) {
        protoValue.serviced = serviced.explanationOfBenefitItemServicedToProto()
    }
    if (hasLocation()) {
        protoValue.location = location.explanationOfBenefitItemLocationToProto()
    }
    if (hasQuantity()) {
        protoValue.quantity = (quantity as SimpleQuantity).toProto()
    }
    if (hasUnitPrice()) {
        protoValue.unitPrice = unitPrice.toProto()
    }
    if (hasFactor()) {
        protoValue.factor = factorElement.toProto()
    }
    if (hasNet()) {
        protoValue.net = net.toProto()
    }
    if (hasUdi()) {
      protoValue.addAllUdi(udi.map { it.toProto() })
    }
    if (hasBodySite()) {
        protoValue.bodySite = bodySite.toProto()
    }
    if (hasSubSite()) {
      protoValue.addAllSubSite(subSite.map { it.toProto() })
    }
    if (hasEncounter()) {
      protoValue.addAllEncounter(encounter.map { it.toProto() })
    }
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    if (hasAdjudication()) {
      protoValue.addAllAdjudication(adjudication.map { it.toProto() })
    }
    if (hasDetail()) {
      protoValue.addAllDetail(detail.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent.toProto():
    ExplanationOfBenefit.Item.Adjudication {
    val protoValue =
      ExplanationOfBenefit.Item.Adjudication.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCategory()) {
        protoValue.category = category.toProto()
    }
    if (hasReason()) {
        protoValue.reason = reason.toProto()
    }
    if (hasAmount()) {
        protoValue.amount = amount.toProto()
    }
    if (hasValue()) {
        protoValue.value = valueElement.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent.toProto():
    ExplanationOfBenefit.Item.Detail {
    val protoValue =
      ExplanationOfBenefit.Item.Detail.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSequence()) {
        protoValue.sequence = sequenceElement.toProto()
    }
    if (hasRevenue()) {
        protoValue.revenue = revenue.toProto()
    }
    if (hasCategory()) {
        protoValue.category = category.toProto()
    }
    if (hasProductOrService()) {
        protoValue.productOrService = productOrService.toProto()
    }
    if (hasModifier()) {
      protoValue.addAllModifier(modifier.map { it.toProto() })
    }
    if (hasProgramCode()) {
      protoValue.addAllProgramCode(programCode.map { it.toProto() })
    }
    if (hasQuantity()) {
        protoValue.quantity = (quantity as SimpleQuantity).toProto()
    }
    if (hasUnitPrice()) {
        protoValue.unitPrice = unitPrice.toProto()
    }
    if (hasFactor()) {
        protoValue.factor = factorElement.toProto()
    }
    if (hasNet()) {
        protoValue.net = net.toProto()
    }
    if (hasUdi()) {
      protoValue.addAllUdi(udi.map { it.toProto() })
    }
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    if (hasSubDetail()) {
      protoValue.addAllSubDetail(subDetail.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent.toProto():
    ExplanationOfBenefit.Item.Detail.SubDetail {
    val protoValue =
      ExplanationOfBenefit.Item.Detail.SubDetail.newBuilder()
        .setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasSequence()) {
        protoValue.sequence = sequenceElement.toProto()
    }
    if (hasRevenue()) {
        protoValue.revenue = revenue.toProto()
    }
    if (hasCategory()) {
        protoValue.category = category.toProto()
    }
    if (hasProductOrService()) {
        protoValue.productOrService = productOrService.toProto()
    }
    if (hasModifier()) {
      protoValue.addAllModifier(modifier.map { it.toProto() })
    }
    if (hasProgramCode()) {
      protoValue.addAllProgramCode(programCode.map { it.toProto() })
    }
    if (hasQuantity()) {
        protoValue.quantity = (quantity as SimpleQuantity).toProto()
    }
    if (hasUnitPrice()) {
        protoValue.unitPrice = unitPrice.toProto()
    }
    if (hasFactor()) {
        protoValue.factor = factorElement.toProto()
    }
    if (hasNet()) {
        protoValue.net = net.toProto()
    }
    if (hasUdi()) {
      protoValue.addAllUdi(udi.map { it.toProto() })
    }
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent.toProto():
    ExplanationOfBenefit.AddedItem {
    val protoValue =
      ExplanationOfBenefit.AddedItem.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasItemSequence()) {
      protoValue.addAllItemSequence(itemSequence.map { it.toProto() })
    }
    if (hasDetailSequence()) {
      protoValue.addAllDetailSequence(detailSequence.map { it.toProto() })
    }
    if (hasSubDetailSequence()) {
      protoValue.addAllSubDetailSequence(subDetailSequence.map { it.toProto() })
    }
    if (hasProvider()) {
      protoValue.addAllProvider(provider.map { it.toProto() })
    }
    if (hasProductOrService()) {
        protoValue.productOrService = productOrService.toProto()
    }
    if (hasModifier()) {
      protoValue.addAllModifier(modifier.map { it.toProto() })
    }
    if (hasProgramCode()) {
      protoValue.addAllProgramCode(programCode.map { it.toProto() })
    }
    if (hasServiced()) {
        protoValue.serviced = serviced.explanationOfBenefitAddItemServicedToProto()
    }
    if (hasLocation()) {
        protoValue.location = location.explanationOfBenefitAddItemLocationToProto()
    }
    if (hasQuantity()) {
        protoValue.quantity = (quantity as SimpleQuantity).toProto()
    }
    if (hasUnitPrice()) {
        protoValue.unitPrice = unitPrice.toProto()
    }
    if (hasFactor()) {
        protoValue.factor = factorElement.toProto()
    }
    if (hasNet()) {
        protoValue.net = net.toProto()
    }
    if (hasBodySite()) {
        protoValue.bodySite = bodySite.toProto()
    }
    if (hasSubSite()) {
      protoValue.addAllSubSite(subSite.map { it.toProto() })
    }
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    if (hasDetail()) {
      protoValue.addAllDetail(detail.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent.toProto():
    ExplanationOfBenefit.AddedItem.AddedItemDetail {
    val protoValue =
      ExplanationOfBenefit.AddedItem.AddedItemDetail.newBuilder()
        .setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasProductOrService()) {
        protoValue.productOrService = productOrService.toProto()
    }
    if (hasModifier()) {
      protoValue.addAllModifier(modifier.map { it.toProto() })
    }
    if (hasQuantity()) {
        protoValue.quantity = (quantity as SimpleQuantity).toProto()
    }
    if (hasUnitPrice()) {
        protoValue.unitPrice = unitPrice.toProto()
    }
    if (hasFactor()) {
        protoValue.factor = factorElement.toProto()
    }
    if (hasNet()) {
        protoValue.net = net.toProto()
    }
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    if (hasSubDetail()) {
      protoValue.addAllSubDetail(subDetail.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent.toProto():
    ExplanationOfBenefit.AddedItem.AddedItemDetail.AddedItemDetailSubDetail {
    val protoValue =
      ExplanationOfBenefit.AddedItem.AddedItemDetail.AddedItemDetailSubDetail.newBuilder()
        .setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasProductOrService()) {
        protoValue.productOrService = productOrService.toProto()
    }
    if (hasModifier()) {
      protoValue.addAllModifier(modifier.map { it.toProto() })
    }
    if (hasQuantity()) {
        protoValue.quantity = (quantity as SimpleQuantity).toProto()
    }
    if (hasUnitPrice()) {
        protoValue.unitPrice = unitPrice.toProto()
    }
    if (hasFactor()) {
        protoValue.factor = factorElement.toProto()
    }
    if (hasNet()) {
        protoValue.net = net.toProto()
    }
    if (hasNoteNumber()) {
      protoValue.addAllNoteNumber(noteNumber.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent.toProto():
    ExplanationOfBenefit.Total {
    val protoValue = ExplanationOfBenefit.Total.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCategory()) {
        protoValue.category = category.toProto()
    }
    if (hasAmount()) {
        protoValue.amount = amount.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.PaymentComponent.toProto():
    ExplanationOfBenefit.Payment {
    val protoValue =
      ExplanationOfBenefit.Payment.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasType()) {
        protoValue.type = type.toProto()
    }
    if (hasAdjustment()) {
        protoValue.adjustment = adjustment.toProto()
    }
    if (hasAdjustmentReason()) {
        protoValue.adjustmentReason = adjustmentReason.toProto()
    }
    if (hasDate()) {
        protoValue.date = dateElement.toProto()
    }
    if (hasAmount()) {
        protoValue.amount = amount.toProto()
    }
    if (hasIdentifier()) {
        protoValue.identifier = identifier.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent.toProto():
    ExplanationOfBenefit.Note {
    val protoValue = ExplanationOfBenefit.Note.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasNumber()) {
        protoValue.number = numberElement.toProto()
    }
      protoValue.type = ExplanationOfBenefit.Note.TypeCode.newBuilder()
          .setValue(
              NoteTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-", "_").toUpperCase())
          )
          .build()
    if (hasText()) {
        protoValue.text = textElement.toProto()
    }
    if (hasLanguage()) {
        protoValue.language = language.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent.toProto():
    ExplanationOfBenefit.BenefitBalance {
    val protoValue =
      ExplanationOfBenefit.BenefitBalance.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasCategory()) {
        protoValue.category = category.toProto()
    }
    if (hasExcluded()) {
        protoValue.excluded = excludedElement.toProto()
    }
    if (hasName()) {
        protoValue.name = nameElement.toProto()
    }
    if (hasDescription()) {
        protoValue.description = descriptionElement.toProto()
    }
    if (hasNetwork()) {
        protoValue.network = network.toProto()
    }
    if (hasUnit()) {
        protoValue.unit = unit.toProto()
    }
    if (hasTerm()) {
        protoValue.term = term.toProto()
    }
    if (hasFinancial()) {
      protoValue.addAllFinancial(financial.map { it.toProto() })
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent.toProto():
    ExplanationOfBenefit.BenefitBalance.Benefit {
    val protoValue =
      ExplanationOfBenefit.BenefitBalance.Benefit.newBuilder()
        .setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasType()) {
        protoValue.type = type.toProto()
    }
    if (hasAllowed()) {
        protoValue.allowed = allowed.explanationOfBenefitBenefitBalanceFinancialAllowedToProto()
    }
    if (hasUsed()) {
        protoValue.used = used.explanationOfBenefitBenefitBalanceFinancialUsedToProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  private fun ExplanationOfBenefit.RelatedClaim.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.RelatedClaimComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasClaim()) {
        hapiValue.claim = claim.toHapi()
    }
    if (hasRelationship()) {
        hapiValue.relationship = relationship.toHapi()
    }
    if (hasReference()) {
        hapiValue.reference = reference.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Payee.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.PayeeComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.PayeeComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasType()) {
        hapiValue.type = type.toHapi()
    }
    if (hasParty()) {
        hapiValue.party = party.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.CareTeam.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.CareTeamComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasSequence()) {
        hapiValue.sequenceElement = sequence.toHapi()
    }
    if (hasProvider()) {
        hapiValue.provider = provider.toHapi()
    }
    if (hasResponsible()) {
        hapiValue.responsibleElement = responsible.toHapi()
    }
    if (hasRole()) {
        hapiValue.role = role.toHapi()
    }
    if (hasQualification()) {
        hapiValue.qualification = qualification.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.SupportingInformation.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.SupportingInformationComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasSequence()) {
        hapiValue.sequenceElement = sequence.toHapi()
    }
    if (hasCategory()) {
        hapiValue.category = category.toHapi()
    }
    if (hasCode()) {
        hapiValue.code = code.toHapi()
    }
    if (hasTiming()) {
        hapiValue.timing = timing.explanationOfBenefitSupportingInfoTimingToHapi()
    }
    if (hasValue()) {
        hapiValue.value = value.explanationOfBenefitSupportingInfoValueToHapi()
    }
    if (hasReason()) {
        hapiValue.reason = reason.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Diagnosis.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.DiagnosisComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasSequence()) {
        hapiValue.sequenceElement = sequence.toHapi()
    }
    if (hasDiagnosis()) {
        hapiValue.diagnosis = diagnosis.explanationOfBenefitDiagnosisDiagnosisToHapi()
    }
    if (typeCount > 0) {
        hapiValue.type = typeList.map { it.toHapi() }
    }
    if (hasOnAdmission()) {
        hapiValue.onAdmission = onAdmission.toHapi()
    }
    if (hasPackageCode()) {
        hapiValue.packageCode = packageCode.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Procedure.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.ProcedureComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasSequence()) {
        hapiValue.sequenceElement = sequence.toHapi()
    }
    if (typeCount > 0) {
        hapiValue.type = typeList.map { it.toHapi() }
    }
    if (hasDate()) {
        hapiValue.dateElement = date.toHapi()
    }
    if (hasProcedure()) {
        hapiValue.procedure = procedure.explanationOfBenefitProcedureProcedureToHapi()
    }
    if (udiCount > 0) {
        hapiValue.udi = udiList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Insurance.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.InsuranceComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasFocal()) {
        hapiValue.focalElement = focal.toHapi()
    }
    if (hasCoverage()) {
        hapiValue.coverage = coverage.toHapi()
    }
    if (preAuthRefCount > 0) {
        hapiValue.preAuthRef = preAuthRefList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Accident.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.AccidentComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.AccidentComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasDate()) {
        hapiValue.dateElement = date.toHapi()
    }
    if (hasType()) {
        hapiValue.type = type.toHapi()
    }
    if (hasLocation()) {
        hapiValue.location = location.explanationOfBenefitAccidentLocationToHapi()
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Item.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.ItemComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasSequence()) {
        hapiValue.sequenceElement = sequence.toHapi()
    }
    if (careTeamSequenceCount > 0) {
        hapiValue.careTeamSequence = careTeamSequenceList.map { it.toHapi() }
    }
    if (diagnosisSequenceCount > 0) {
        hapiValue.diagnosisSequence = diagnosisSequenceList.map { it.toHapi() }
    }
    if (procedureSequenceCount > 0) {
        hapiValue.procedureSequence = procedureSequenceList.map { it.toHapi() }
    }
    if (informationSequenceCount > 0) {
        hapiValue.informationSequence = informationSequenceList.map { it.toHapi() }
    }
    if (hasRevenue()) {
        hapiValue.revenue = revenue.toHapi()
    }
    if (hasCategory()) {
        hapiValue.category = category.toHapi()
    }
    if (hasProductOrService()) {
        hapiValue.productOrService = productOrService.toHapi()
    }
    if (modifierCount > 0) {
        hapiValue.modifier = modifierList.map { it.toHapi() }
    }
    if (programCodeCount > 0) {
        hapiValue.programCode = programCodeList.map { it.toHapi() }
    }
    if (hasServiced()) {
        hapiValue.serviced = serviced.explanationOfBenefitItemServicedToHapi()
    }
    if (hasLocation()) {
        hapiValue.location = location.explanationOfBenefitItemLocationToHapi()
    }
    if (hasQuantity()) {
        hapiValue.quantity = quantity.toHapi()
    }
    if (hasUnitPrice()) {
        hapiValue.unitPrice = unitPrice.toHapi()
    }
    if (hasFactor()) {
        hapiValue.factorElement = factor.toHapi()
    }
    if (hasNet()) {
        hapiValue.net = net.toHapi()
    }
    if (udiCount > 0) {
        hapiValue.udi = udiList.map { it.toHapi() }
    }
    if (hasBodySite()) {
        hapiValue.bodySite = bodySite.toHapi()
    }
    if (subSiteCount > 0) {
        hapiValue.subSite = subSiteList.map { it.toHapi() }
    }
    if (encounterCount > 0) {
        hapiValue.encounter = encounterList.map { it.toHapi() }
    }
    if (noteNumberCount > 0) {
        hapiValue.noteNumber = noteNumberList.map { it.toHapi() }
    }
    if (adjudicationCount > 0) {
        hapiValue.adjudication = adjudicationList.map { it.toHapi() }
    }
    if (detailCount > 0) {
        hapiValue.detail = detailList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Item.Adjudication.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.AdjudicationComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasCategory()) {
        hapiValue.category = category.toHapi()
    }
    if (hasReason()) {
        hapiValue.reason = reason.toHapi()
    }
    if (hasAmount()) {
        hapiValue.amount = amount.toHapi()
    }
    if (hasValue()) {
        hapiValue.valueElement = value.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Item.Detail.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.DetailComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasSequence()) {
        hapiValue.sequenceElement = sequence.toHapi()
    }
    if (hasRevenue()) {
        hapiValue.revenue = revenue.toHapi()
    }
    if (hasCategory()) {
        hapiValue.category = category.toHapi()
    }
    if (hasProductOrService()) {
        hapiValue.productOrService = productOrService.toHapi()
    }
    if (modifierCount > 0) {
        hapiValue.modifier = modifierList.map { it.toHapi() }
    }
    if (programCodeCount > 0) {
        hapiValue.programCode = programCodeList.map { it.toHapi() }
    }
    if (hasQuantity()) {
        hapiValue.quantity = quantity.toHapi()
    }
    if (hasUnitPrice()) {
        hapiValue.unitPrice = unitPrice.toHapi()
    }
    if (hasFactor()) {
        hapiValue.factorElement = factor.toHapi()
    }
    if (hasNet()) {
        hapiValue.net = net.toHapi()
    }
    if (udiCount > 0) {
        hapiValue.udi = udiList.map { it.toHapi() }
    }
    if (noteNumberCount > 0) {
        hapiValue.noteNumber = noteNumberList.map { it.toHapi() }
    }
    if (subDetailCount > 0) {
        hapiValue.subDetail = subDetailList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Item.Detail.SubDetail.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.SubDetailComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasSequence()) {
        hapiValue.sequenceElement = sequence.toHapi()
    }
    if (hasRevenue()) {
        hapiValue.revenue = revenue.toHapi()
    }
    if (hasCategory()) {
        hapiValue.category = category.toHapi()
    }
    if (hasProductOrService()) {
        hapiValue.productOrService = productOrService.toHapi()
    }
    if (modifierCount > 0) {
        hapiValue.modifier = modifierList.map { it.toHapi() }
    }
    if (programCodeCount > 0) {
        hapiValue.programCode = programCodeList.map { it.toHapi() }
    }
    if (hasQuantity()) {
        hapiValue.quantity = quantity.toHapi()
    }
    if (hasUnitPrice()) {
        hapiValue.unitPrice = unitPrice.toHapi()
    }
    if (hasFactor()) {
        hapiValue.factorElement = factor.toHapi()
    }
    if (hasNet()) {
        hapiValue.net = net.toHapi()
    }
    if (udiCount > 0) {
        hapiValue.udi = udiList.map { it.toHapi() }
    }
    if (noteNumberCount > 0) {
        hapiValue.noteNumber = noteNumberList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.AddedItem.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (itemSequenceCount > 0) {
        hapiValue.itemSequence = itemSequenceList.map { it.toHapi() }
    }
    if (detailSequenceCount > 0) {
        hapiValue.detailSequence = detailSequenceList.map { it.toHapi() }
    }
    if (subDetailSequenceCount > 0) {
        hapiValue.subDetailSequence = subDetailSequenceList.map { it.toHapi() }
    }
    if (providerCount > 0) {
        hapiValue.provider = providerList.map { it.toHapi() }
    }
    if (hasProductOrService()) {
        hapiValue.productOrService = productOrService.toHapi()
    }
    if (modifierCount > 0) {
        hapiValue.modifier = modifierList.map { it.toHapi() }
    }
    if (programCodeCount > 0) {
        hapiValue.programCode = programCodeList.map { it.toHapi() }
    }
    if (hasServiced()) {
        hapiValue.serviced = serviced.explanationOfBenefitAddItemServicedToHapi()
    }
    if (hasLocation()) {
        hapiValue.location = location.explanationOfBenefitAddItemLocationToHapi()
    }
    if (hasQuantity()) {
        hapiValue.quantity = quantity.toHapi()
    }
    if (hasUnitPrice()) {
        hapiValue.unitPrice = unitPrice.toHapi()
    }
    if (hasFactor()) {
        hapiValue.factorElement = factor.toHapi()
    }
    if (hasNet()) {
        hapiValue.net = net.toHapi()
    }
    if (hasBodySite()) {
        hapiValue.bodySite = bodySite.toHapi()
    }
    if (subSiteCount > 0) {
        hapiValue.subSite = subSiteList.map { it.toHapi() }
    }
    if (noteNumberCount > 0) {
        hapiValue.noteNumber = noteNumberList.map { it.toHapi() }
    }
    if (detailCount > 0) {
        hapiValue.detail = detailList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.AddedItem.AddedItemDetail.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasProductOrService()) {
        hapiValue.productOrService = productOrService.toHapi()
    }
    if (modifierCount > 0) {
        hapiValue.modifier = modifierList.map { it.toHapi() }
    }
    if (hasQuantity()) {
        hapiValue.quantity = quantity.toHapi()
    }
    if (hasUnitPrice()) {
        hapiValue.unitPrice = unitPrice.toHapi()
    }
    if (hasFactor()) {
        hapiValue.factorElement = factor.toHapi()
    }
    if (hasNet()) {
        hapiValue.net = net.toHapi()
    }
    if (noteNumberCount > 0) {
        hapiValue.noteNumber = noteNumberList.map { it.toHapi() }
    }
    if (subDetailCount > 0) {
        hapiValue.subDetail = subDetailList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.AddedItem.AddedItemDetail.AddedItemDetailSubDetail.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.AddedItemDetailSubDetailComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasProductOrService()) {
        hapiValue.productOrService = productOrService.toHapi()
    }
    if (modifierCount > 0) {
        hapiValue.modifier = modifierList.map { it.toHapi() }
    }
    if (hasQuantity()) {
        hapiValue.quantity = quantity.toHapi()
    }
    if (hasUnitPrice()) {
        hapiValue.unitPrice = unitPrice.toHapi()
    }
    if (hasFactor()) {
        hapiValue.factorElement = factor.toHapi()
    }
    if (hasNet()) {
        hapiValue.net = net.toHapi()
    }
    if (noteNumberCount > 0) {
        hapiValue.noteNumber = noteNumberList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Total.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.TotalComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasCategory()) {
        hapiValue.category = category.toHapi()
    }
    if (hasAmount()) {
        hapiValue.amount = amount.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Payment.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.PaymentComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.PaymentComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasType()) {
        hapiValue.type = type.toHapi()
    }
    if (hasAdjustment()) {
        hapiValue.adjustment = adjustment.toHapi()
    }
    if (hasAdjustmentReason()) {
        hapiValue.adjustmentReason = adjustmentReason.toHapi()
    }
    if (hasDate()) {
        hapiValue.dateElement = date.toHapi()
    }
    if (hasAmount()) {
        hapiValue.amount = amount.toHapi()
    }
    if (hasIdentifier()) {
        hapiValue.identifier = identifier.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.Note.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.NoteComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasNumber()) {
        hapiValue.numberElement = number.toHapi()
    }
      hapiValue.type = Enumerations.NoteType.valueOf(type.value.name.hapiCodeCheck().replace("_", ""))
    if (hasText()) {
        hapiValue.textElement = text.toHapi()
    }
    if (hasLanguage()) {
        hapiValue.language = language.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.BenefitBalance.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitBalanceComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasCategory()) {
        hapiValue.category = category.toHapi()
    }
    if (hasExcluded()) {
        hapiValue.excludedElement = excluded.toHapi()
    }
    if (hasName()) {
        hapiValue.nameElement = name.toHapi()
    }
    if (hasDescription()) {
        hapiValue.descriptionElement = description.toHapi()
    }
    if (hasNetwork()) {
        hapiValue.network = network.toHapi()
    }
    if (hasUnit()) {
        hapiValue.unit = unit.toHapi()
    }
    if (hasTerm()) {
        hapiValue.term = term.toHapi()
    }
    if (financialCount > 0) {
        hapiValue.financial = financialList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  private fun ExplanationOfBenefit.BenefitBalance.Benefit.toHapi():
    org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent {
    val hapiValue = org.hl7.fhir.r4.model.ExplanationOfBenefit.BenefitComponent()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (modifierExtensionCount > 0) {
        hapiValue.modifierExtension = modifierExtensionList.map { it.toHapi() }
    }
    if (hasType()) {
        hapiValue.type = type.toHapi()
    }
    if (hasAllowed()) {
        hapiValue.allowed = allowed.explanationOfBenefitBenefitBalanceFinancialAllowedToHapi()
    }
    if (hasUsed()) {
        hapiValue.used = used.explanationOfBenefitBenefitBalanceFinancialUsedToHapi()
    }
    return hapiValue
  }
}
