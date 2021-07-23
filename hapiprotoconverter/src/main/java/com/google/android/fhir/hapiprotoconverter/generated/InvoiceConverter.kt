package com.google.android.fhir.hapiprotoconverter.generated

import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.AnnotationConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DecimalConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DecimalConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.IdentifierConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.IdentifierConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MarkdownConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MarkdownConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MoneyConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MoneyConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.PositiveIntConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.PositiveIntConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.CodeableConcept
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Invoice
import com.google.fhir.r4.core.InvoicePriceComponentTypeCode
import com.google.fhir.r4.core.InvoiceStatusCode
import com.google.fhir.r4.core.Reference
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Type

public object InvoiceConverter {
  public fun Invoice.LineItem.ChargeItemX.invoiceLineItemChargeItemToHapi(): Type {
    if (this.getReference() != Reference.newBuilder().defaultInstanceForType ) {
      return (this.getReference()).toHapi()
    }
    if (this.getCodeableConcept() != CodeableConcept.newBuilder().defaultInstanceForType ) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Invoice.lineItem.chargeItem[x]")
  }

  public fun Type.invoiceLineItemChargeItemToProto(): Invoice.LineItem.ChargeItemX {
    val protoValue = Invoice.LineItem.ChargeItemX.newBuilder()
    if (this is org.hl7.fhir.r4.model.Reference) {
      protoValue.setReference(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  public fun Invoice.toHapi(): org.hl7.fhir.r4.model.Invoice {
    val hapiValue = org.hl7.fhir.r4.model.Invoice()
    hapiValue.id = id.value 
    hapiValue.setMeta(meta.toHapi())
    hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    hapiValue.setLanguageElement(language.toHapi())
    hapiValue.setText(text.toHapi())
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setIdentifier(identifierList.map{it.toHapi()})
    hapiValue.setStatus(org.hl7.fhir.r4.model.Invoice.InvoiceStatus.valueOf(status.value.name.replace("_","")))
    hapiValue.setCancelledReasonElement(cancelledReason.toHapi())
    hapiValue.setType(type.toHapi())
    hapiValue.setSubject(subject.toHapi())
    hapiValue.setRecipient(recipient.toHapi())
    hapiValue.setDateElement(date.toHapi())
    hapiValue.setParticipant(participantList.map{it.toHapi()})
    hapiValue.setIssuer(issuer.toHapi())
    hapiValue.setAccount(account.toHapi())
    hapiValue.setLineItem(lineItemList.map{it.toHapi()})
    hapiValue.setTotalPriceComponent(totalPriceComponentList.map{it.toHapi()})
    hapiValue.setTotalNet(totalNet.toHapi())
    hapiValue.setTotalGross(totalGross.toHapi())
    hapiValue.setPaymentTermsElement(paymentTerms.toHapi())
    hapiValue.setNote(noteList.map{it.toHapi()})
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Invoice.toProto(): Invoice {
    val protoValue = Invoice.newBuilder()
    .setId(Id.newBuilder().setValue(id))
    .setMeta(meta.toProto())
    .setImplicitRules(implicitRulesElement.toProto())
    .setLanguage(languageElement.toProto())
    .setText(text.toProto())
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .addAllIdentifier(identifier.map{it.toProto()})
    .setStatus(Invoice.StatusCode.newBuilder().setValue(InvoiceStatusCode.Value.valueOf(status.toCode().replace("-",
        "_").toUpperCase())).build())
    .setCancelledReason(cancelledReasonElement.toProto())
    .setType(type.toProto())
    .setSubject(subject.toProto())
    .setRecipient(recipient.toProto())
    .setDate(dateElement.toProto())
    .addAllParticipant(participant.map{it.toProto()})
    .setIssuer(issuer.toProto())
    .setAccount(account.toProto())
    .addAllLineItem(lineItem.map{it.toProto()})
    .addAllTotalPriceComponent(totalPriceComponent.map{it.toProto()})
    .setTotalNet(totalNet.toProto())
    .setTotalGross(totalGross.toProto())
    .setPaymentTerms(paymentTermsElement.toProto())
    .addAllNote(note.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent.toProto():
      Invoice.Participant {
    val protoValue = Invoice.Participant.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setRole(role.toProto())
    .setActor(actor.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent.toProto(): Invoice.LineItem {
    val protoValue = Invoice.LineItem.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setSequence(sequenceElement.toProto())
    .setChargeItem(chargeItem.invoiceLineItemChargeItemToProto())
    .addAllPriceComponent(priceComponent.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent.toProto():
      Invoice.LineItem.PriceComponent {
    val protoValue = Invoice.LineItem.PriceComponent.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setType(Invoice.LineItem.PriceComponent.TypeCode.newBuilder().setValue(InvoicePriceComponentTypeCode.Value.valueOf(type.toCode().replace("-",
        "_").toUpperCase())).build())
    .setCode(code.toProto())
    .setFactor(factorElement.toProto())
    .setAmount(amount.toProto())
    .build()
    return protoValue
  }

  public fun Invoice.Participant.toHapi():
      org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent {
    val hapiValue = org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setRole(role.toHapi())
    hapiValue.setActor(actor.toHapi())
    return hapiValue
  }

  public fun Invoice.LineItem.toHapi(): org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent {
    val hapiValue = org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setSequenceElement(sequence.toHapi())
    hapiValue.setChargeItem(chargeItem.invoiceLineItemChargeItemToHapi())
    hapiValue.setPriceComponent(priceComponentList.map{it.toHapi()})
    return hapiValue
  }

  public fun Invoice.LineItem.PriceComponent.toHapi():
      org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent {
    val hapiValue = org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setType(org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentType.valueOf(type.value.name.replace("_","")))
    hapiValue.setCode(code.toHapi())
    hapiValue.setFactorElement(factor.toHapi())
    hapiValue.setAmount(amount.toHapi())
    return hapiValue
  }
}
