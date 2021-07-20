package com.google.android.fhir.hapiprotoconverter.generated

import com.google.android.fhir.hapiprotoconverter.generated.AddressConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AddressConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.AttachmentConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AttachmentConverter.toProto
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
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.SimpleQuantityConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.SimpleQuantityConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.Address
import com.google.fhir.r4.core.ClaimProcessingCode
import com.google.fhir.r4.core.ClaimResponse
import com.google.fhir.r4.core.CodeableConcept
import com.google.fhir.r4.core.Date
import com.google.fhir.r4.core.FinancialResourceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.NoteTypeCode
import com.google.fhir.r4.core.Period
import com.google.fhir.r4.core.Reference
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.UseCode
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.SimpleQuantity
import org.hl7.fhir.r4.model.Type

public object ClaimResponseConverter {
  public fun ClaimResponse.AddItem.ServicedX.claimResponseAddItemServicedToHapi(): Type {
    if (this.getDate() != Date.newBuilder().defaultInstanceForType ) {
      return (this.getDate()).toHapi()
    }
    if (this.getPeriod() != Period.newBuilder().defaultInstanceForType ) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("ClaimResponse.addItem.serviced[x]")
  }

  public fun Type.claimResponseAddItemServicedToProto(): ClaimResponse.AddItem.ServicedX {
    val protoValue = ClaimResponse.AddItem.ServicedX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  public fun ClaimResponse.AddItem.LocationX.claimResponseAddItemLocationToHapi(): Type {
    if (this.getCodeableConcept() != CodeableConcept.newBuilder().defaultInstanceForType ) {
      return (this.getCodeableConcept()).toHapi()
    }
    if (this.getAddress() != Address.newBuilder().defaultInstanceForType ) {
      return (this.getAddress()).toHapi()
    }
    if (this.getReference() != Reference.newBuilder().defaultInstanceForType ) {
      return (this.getReference()).toHapi()
    }
    throw IllegalArgumentException("ClaimResponse.addItem.location[x]")
  }

  public fun Type.claimResponseAddItemLocationToProto(): ClaimResponse.AddItem.LocationX {
    val protoValue = ClaimResponse.AddItem.LocationX.newBuilder()
    if (this is org.hl7.fhir.r4.model.CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Address) {
      protoValue.setAddress(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Reference) {
      protoValue.setReference(this.toProto())
    }
    return protoValue.build()
  }

  public fun ClaimResponse.toHapi(): org.hl7.fhir.r4.model.ClaimResponse {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse()
    hapiValue.id = id.value 
    hapiValue.setMeta(meta.toHapi())
    hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    hapiValue.setLanguageElement(language.toHapi())
    hapiValue.setText(text.toHapi())
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setIdentifier(identifierList.map{it.toHapi()})
    hapiValue.setStatus(org.hl7.fhir.r4.model.ClaimResponse.ClaimResponseStatus.valueOf(status.value.name.replace("_","")))
    hapiValue.setType(type.toHapi())
    hapiValue.setSubType(subType.toHapi())
    hapiValue.setUse(org.hl7.fhir.r4.model.ClaimResponse.Use.valueOf(use.value.name.replace("_","")))
    hapiValue.setPatient(patient.toHapi())
    hapiValue.setCreatedElement(created.toHapi())
    hapiValue.setInsurer(insurer.toHapi())
    hapiValue.setRequestor(requestor.toHapi())
    hapiValue.setRequest(request.toHapi())
    hapiValue.setOutcome(org.hl7.fhir.r4.model.ClaimResponse.RemittanceOutcome.valueOf(outcome.value.name.replace("_","")))
    hapiValue.setDispositionElement(disposition.toHapi())
    hapiValue.setPreAuthRefElement(preAuthRef.toHapi())
    hapiValue.setPreAuthPeriod(preAuthPeriod.toHapi())
    hapiValue.setPayeeType(payeeType.toHapi())
    hapiValue.setItem(itemList.map{it.toHapi()})
    hapiValue.setAddedItem(addedItemList.map{it.toHapi()})
    hapiValue.setAdjudication(adjudicationList.map{it.toHapi()})
    hapiValue.setTotal(totalList.map{it.toHapi()})
    hapiValue.setPayment(payment.toHapi())
    hapiValue.setFundsReserve(fundsReserve.toHapi())
    hapiValue.setFormCode(formCode.toHapi())
    hapiValue.setForm(form.toHapi())
    hapiValue.setNote(noteList.map{it.toHapi()})
    hapiValue.setCommunicationRequest(communicationRequestList.map{it.toHapi()})
    hapiValue.setInsurance(insuranceList.map{it.toHapi()})
    hapiValue.setError(errorList.map{it.toHapi()})
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.toProto(): ClaimResponse {
    val protoValue = ClaimResponse.newBuilder()
    .setId(Id.newBuilder().setValue(id))
    .setMeta(meta.toProto())
    .setImplicitRules(implicitRulesElement.toProto())
    .setLanguage(languageElement.toProto())
    .setText(text.toProto())
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .addAllIdentifier(identifier.map{it.toProto()})
    .setStatus(ClaimResponse.StatusCode.newBuilder().setValue(FinancialResourceStatusCode.Value.valueOf(status.toCode().replace("-",
        "_").toUpperCase())).build())
    .setType(type.toProto())
    .setSubType(subType.toProto())
    .setUse(ClaimResponse.UseCode.newBuilder().setValue(UseCode.Value.valueOf(use.toCode().replace("-",
        "_").toUpperCase())).build())
    .setPatient(patient.toProto())
    .setCreated(createdElement.toProto())
    .setInsurer(insurer.toProto())
    .setRequestor(requestor.toProto())
    .setRequest(request.toProto())
    .setOutcome(ClaimResponse.OutcomeCode.newBuilder().setValue(ClaimProcessingCode.Value.valueOf(outcome.toCode().replace("-",
        "_").toUpperCase())).build())
    .setDisposition(dispositionElement.toProto())
    .setPreAuthRef(preAuthRefElement.toProto())
    .setPreAuthPeriod(preAuthPeriod.toProto())
    .setPayeeType(payeeType.toProto())
    .addAllItem(item.map{it.toProto()})
    .addAllAddedItem(addedItem.map{it.toProto()})
    .addAllAdjudication(adjudication.map{it.toProto()})
    .addAllTotal(total.map{it.toProto()})
    .setPayment(payment.toProto())
    .setFundsReserve(fundsReserve.toProto())
    .setFormCode(formCode.toProto())
    .setForm(form.toProto())
    .addAllNote(note.map{it.toProto()})
    .addAllCommunicationRequest(communicationRequest.map{it.toProto()})
    .addAllInsurance(insurance.map{it.toProto()})
    .addAllError(error.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.ItemComponent.toProto(): ClaimResponse.Item {
    val protoValue = ClaimResponse.Item.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setItemSequence(itemSequenceElement.toProto())
    .addAllNoteNumber(noteNumber.map{it.toProto()})
    .addAllAdjudication(adjudication.map{it.toProto()})
    .addAllItemDetail(itemDetail.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent.toProto():
      ClaimResponse.Item.Adjudication {
    val protoValue = ClaimResponse.Item.Adjudication.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setCategory(category.toProto())
    .setReason(reason.toProto())
    .setAmount(amount.toProto())
    .setValue(valueElement.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.ItemDetailComponent.toProto():
      ClaimResponse.Item.ItemDetail {
    val protoValue = ClaimResponse.Item.ItemDetail.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setDetailSequence(detailSequenceElement.toProto())
    .addAllNoteNumber(noteNumber.map{it.toProto()})
    .addAllAdjudication(adjudication.map{it.toProto()})
    .addAllSubDetail(subDetail.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.SubDetailComponent.toProto():
      ClaimResponse.Item.Detail.SubDetail {
    val protoValue = ClaimResponse.Item.Detail.SubDetail.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setSubDetailSequence(subDetailSequenceElement.toProto())
    .addAllNoteNumber(noteNumber.map{it.toProto()})
    .addAllAdjudication(adjudication.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.AddedItemComponent.toProto():
      ClaimResponse.AddedItem {
    val protoValue = ClaimResponse.AddedItem.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .addAllItemSequence(itemSequence.map{it.toProto()})
    .addAllDetailSequence(detailSequence.map{it.toProto()})
    .addAllSubdetailSequence(subdetailSequence.map{it.toProto()})
    .addAllProvider(provider.map{it.toProto()})
    .setProductOrService(productOrService.toProto())
    .addAllModifier(modifier.map{it.toProto()})
    .addAllProgramCode(programCode.map{it.toProto()})
    .setServiced(serviced.claimResponseAddItemServicedToProto())
    .setLocation(location.claimResponseAddItemLocationToProto())
    .setQuantity(( quantity as SimpleQuantity ).toProto())
    .setUnitPrice(unitPrice.toProto())
    .setFactor(factorElement.toProto())
    .setNet(net.toProto())
    .setBodySite(bodySite.toProto())
    .addAllSubSite(subSite.map{it.toProto()})
    .addAllNoteNumber(noteNumber.map{it.toProto()})
    .addAllAdjudication(adjudication.map{it.toProto()})
    .addAllAddedItemDetail(addedItemDetail.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.AddedItemDetailComponent.toProto():
      ClaimResponse.AddItem.AddedItemDetail {
    val protoValue = ClaimResponse.AddItem.AddedItemDetail.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setProductOrService(productOrService.toProto())
    .addAllModifier(modifier.map{it.toProto()})
    .setQuantity(( quantity as SimpleQuantity ).toProto())
    .setUnitPrice(unitPrice.toProto())
    .setFactor(factorElement.toProto())
    .setNet(net.toProto())
    .addAllNoteNumber(noteNumber.map{it.toProto()})
    .addAllAdjudication(adjudication.map{it.toProto()})
    .addAllAddedItemSubDetail(addedItemSubDetail.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.AddedItemSubDetailComponent.toProto():
      ClaimResponse.AddItem.Detail.AddedItemSubDetail {
    val protoValue = ClaimResponse.AddItem.Detail.AddedItemSubDetail.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setProductOrService(productOrService.toProto())
    .addAllModifier(modifier.map{it.toProto()})
    .setQuantity(( quantity as SimpleQuantity ).toProto())
    .setUnitPrice(unitPrice.toProto())
    .setFactor(factorElement.toProto())
    .setNet(net.toProto())
    .addAllNoteNumber(noteNumber.map{it.toProto()})
    .addAllAdjudication(adjudication.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.TotalComponent.toProto(): ClaimResponse.Total {
    val protoValue = ClaimResponse.Total.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setCategory(category.toProto())
    .setAmount(amount.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.PaymentComponent.toProto(): ClaimResponse.Payment {
    val protoValue = ClaimResponse.Payment.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setType(type.toProto())
    .setAdjustment(adjustment.toProto())
    .setAdjustmentReason(adjustmentReason.toProto())
    .setDate(dateElement.toProto())
    .setAmount(amount.toProto())
    .setIdentifier(identifier.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.NoteComponent.toProto(): ClaimResponse.Note {
    val protoValue = ClaimResponse.Note.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setNumber(numberElement.toProto())
    .setType(ClaimResponse.ProcessNote.TypeCode.newBuilder().setValue(NoteTypeCode.Value.valueOf(type.toCode().replace("-",
        "_").toUpperCase())).build())
    .setText(textElement.toProto())
    .setLanguage(language.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.InsuranceComponent.toProto():
      ClaimResponse.Insurance {
    val protoValue = ClaimResponse.Insurance.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setSequence(sequenceElement.toProto())
    .setFocal(focalElement.toProto())
    .setCoverage(coverage.toProto())
    .setBusinessArrangement(businessArrangementElement.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.ClaimResponse.ErrorComponent.toProto(): ClaimResponse.Error {
    val protoValue = ClaimResponse.Error.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setItemSequence(itemSequenceElement.toProto())
    .setDetailSequence(detailSequenceElement.toProto())
    .setSubDetailSequence(subDetailSequenceElement.toProto())
    .setCode(code.toProto())
    .build()
    return protoValue
  }

  public fun ClaimResponse.Item.toHapi(): org.hl7.fhir.r4.model.ClaimResponse.ItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.ItemComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setItemSequenceElement(itemSequence.toHapi())
    hapiValue.setNoteNumber(noteNumberList.map{it.toHapi()})
    hapiValue.setAdjudication(adjudicationList.map{it.toHapi()})
    hapiValue.setItemDetail(itemDetailList.map{it.toHapi()})
    return hapiValue
  }

  public fun ClaimResponse.Item.Adjudication.toHapi():
      org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.AdjudicationComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setCategory(category.toHapi())
    hapiValue.setReason(reason.toHapi())
    hapiValue.setAmount(amount.toHapi())
    hapiValue.setValueElement(value.toHapi())
    return hapiValue
  }

  public fun ClaimResponse.Item.ItemDetail.toHapi():
      org.hl7.fhir.r4.model.ClaimResponse.ItemDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.ItemDetailComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setDetailSequenceElement(detailSequence.toHapi())
    hapiValue.setNoteNumber(noteNumberList.map{it.toHapi()})
    hapiValue.setAdjudication(adjudicationList.map{it.toHapi()})
    hapiValue.setSubDetail(subDetailList.map{it.toHapi()})
    return hapiValue
  }

  public fun ClaimResponse.Item.Detail.SubDetail.toHapi():
      org.hl7.fhir.r4.model.ClaimResponse.SubDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.SubDetailComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setSubDetailSequenceElement(subDetailSequence.toHapi())
    hapiValue.setNoteNumber(noteNumberList.map{it.toHapi()})
    hapiValue.setAdjudication(adjudicationList.map{it.toHapi()})
    return hapiValue
  }

  public fun ClaimResponse.AddedItem.toHapi():
      org.hl7.fhir.r4.model.ClaimResponse.AddedItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.AddedItemComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setItemSequence(itemSequenceList.map{it.toHapi()})
    hapiValue.setDetailSequence(detailSequenceList.map{it.toHapi()})
    hapiValue.setSubdetailSequence(subdetailSequenceList.map{it.toHapi()})
    hapiValue.setProvider(providerList.map{it.toHapi()})
    hapiValue.setProductOrService(productOrService.toHapi())
    hapiValue.setModifier(modifierList.map{it.toHapi()})
    hapiValue.setProgramCode(programCodeList.map{it.toHapi()})
    hapiValue.setServiced(serviced.claimResponseAddItemServicedToHapi())
    hapiValue.setLocation(location.claimResponseAddItemLocationToHapi())
    hapiValue.setQuantity(quantity.toHapi())
    hapiValue.setUnitPrice(unitPrice.toHapi())
    hapiValue.setFactorElement(factor.toHapi())
    hapiValue.setNet(net.toHapi())
    hapiValue.setBodySite(bodySite.toHapi())
    hapiValue.setSubSite(subSiteList.map{it.toHapi()})
    hapiValue.setNoteNumber(noteNumberList.map{it.toHapi()})
    hapiValue.setAdjudication(adjudicationList.map{it.toHapi()})
    hapiValue.setAddedItemDetail(addedItemDetailList.map{it.toHapi()})
    return hapiValue
  }

  public fun ClaimResponse.AddItem.AddedItemDetail.toHapi():
      org.hl7.fhir.r4.model.ClaimResponse.AddedItemDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.AddedItemDetailComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setProductOrService(productOrService.toHapi())
    hapiValue.setModifier(modifierList.map{it.toHapi()})
    hapiValue.setQuantity(quantity.toHapi())
    hapiValue.setUnitPrice(unitPrice.toHapi())
    hapiValue.setFactorElement(factor.toHapi())
    hapiValue.setNet(net.toHapi())
    hapiValue.setNoteNumber(noteNumberList.map{it.toHapi()})
    hapiValue.setAdjudication(adjudicationList.map{it.toHapi()})
    hapiValue.setAddedItemSubDetail(addedItemSubDetailList.map{it.toHapi()})
    return hapiValue
  }

  public fun ClaimResponse.AddItem.Detail.AddedItemSubDetail.toHapi():
      org.hl7.fhir.r4.model.ClaimResponse.AddedItemSubDetailComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.AddedItemSubDetailComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setProductOrService(productOrService.toHapi())
    hapiValue.setModifier(modifierList.map{it.toHapi()})
    hapiValue.setQuantity(quantity.toHapi())
    hapiValue.setUnitPrice(unitPrice.toHapi())
    hapiValue.setFactorElement(factor.toHapi())
    hapiValue.setNet(net.toHapi())
    hapiValue.setNoteNumber(noteNumberList.map{it.toHapi()})
    hapiValue.setAdjudication(adjudicationList.map{it.toHapi()})
    return hapiValue
  }

  public fun ClaimResponse.Total.toHapi(): org.hl7.fhir.r4.model.ClaimResponse.TotalComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.TotalComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setCategory(category.toHapi())
    hapiValue.setAmount(amount.toHapi())
    return hapiValue
  }

  public fun ClaimResponse.Payment.toHapi(): org.hl7.fhir.r4.model.ClaimResponse.PaymentComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.PaymentComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setType(type.toHapi())
    hapiValue.setAdjustment(adjustment.toHapi())
    hapiValue.setAdjustmentReason(adjustmentReason.toHapi())
    hapiValue.setDateElement(date.toHapi())
    hapiValue.setAmount(amount.toHapi())
    hapiValue.setIdentifier(identifier.toHapi())
    return hapiValue
  }

  public fun ClaimResponse.Note.toHapi(): org.hl7.fhir.r4.model.ClaimResponse.NoteComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.NoteComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setNumberElement(number.toHapi())
    hapiValue.setType(Enumerations.NoteType.valueOf(type.value.name.replace("_","")))
    hapiValue.setTextElement(text.toHapi())
    hapiValue.setLanguage(language.toHapi())
    return hapiValue
  }

  public fun ClaimResponse.Insurance.toHapi():
      org.hl7.fhir.r4.model.ClaimResponse.InsuranceComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.InsuranceComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setSequenceElement(sequence.toHapi())
    hapiValue.setFocalElement(focal.toHapi())
    hapiValue.setCoverage(coverage.toHapi())
    hapiValue.setBusinessArrangementElement(businessArrangement.toHapi())
    return hapiValue
  }

  public fun ClaimResponse.Error.toHapi(): org.hl7.fhir.r4.model.ClaimResponse.ErrorComponent {
    val hapiValue = org.hl7.fhir.r4.model.ClaimResponse.ErrorComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setItemSequenceElement(itemSequence.toHapi())
    hapiValue.setDetailSequenceElement(detailSequence.toHapi())
    hapiValue.setSubDetailSequenceElement(subDetailSequence.toHapi())
    hapiValue.setCode(code.toHapi())
    return hapiValue
  }
}
