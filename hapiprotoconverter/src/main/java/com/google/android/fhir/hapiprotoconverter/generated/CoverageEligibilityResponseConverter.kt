package com.google.android.fhir.hapiprotoconverter.generated

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
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UnsignedIntConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UnsignedIntConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.ClaimProcessingCode
import com.google.fhir.r4.core.CoverageEligibilityResponse
import com.google.fhir.r4.core.Date
import com.google.fhir.r4.core.EligibilityResponsePurposeCode
import com.google.fhir.r4.core.FinancialResourceStatusCode
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.Money
import com.google.fhir.r4.core.Period
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.UnsignedInt
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.DateType
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.StringType
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UnsignedIntType

public object CoverageEligibilityResponseConverter {
  public fun CoverageEligibilityResponse.ServicedX.coverageEligibilityResponseServicedToHapi():
      Type {
    if (this.getDate() != Date.newBuilder().defaultInstanceForType ) {
      return (this.getDate()).toHapi()
    }
    if (this.getPeriod() != Period.newBuilder().defaultInstanceForType ) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("CoverageEligibilityResponse.serviced[x]")
  }

  public fun Type.coverageEligibilityResponseServicedToProto():
      CoverageEligibilityResponse.ServicedX {
    val protoValue = CoverageEligibilityResponse.ServicedX.newBuilder()
    if (this is DateType) {
      protoValue.setDate(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  public
      fun CoverageEligibilityResponse.Insurance.Item.Benefit.AllowedX.coverageEligibilityResponseInsuranceItemBenefitAllowedToHapi():
      Type {
    if (this.getUnsignedInt() != UnsignedInt.newBuilder().defaultInstanceForType ) {
      return (this.getUnsignedInt()).toHapi()
    }
    if (this.getStringValue() != String.newBuilder().defaultInstanceForType ) {
      return (this.getStringValue()).toHapi()
    }
    if (this.getMoney() != Money.newBuilder().defaultInstanceForType ) {
      return (this.getMoney()).toHapi()
    }
    throw IllegalArgumentException("CoverageEligibilityResponse.insurance.item.benefit.allowed[x]")
  }

  public fun Type.coverageEligibilityResponseInsuranceItemBenefitAllowedToProto():
      CoverageEligibilityResponse.Insurance.Item.Benefit.AllowedX {
    val protoValue = CoverageEligibilityResponse.Insurance.Item.Benefit.AllowedX.newBuilder()
    if (this is UnsignedIntType) {
      protoValue.setUnsignedInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Money) {
      protoValue.setMoney(this.toProto())
    }
    return protoValue.build()
  }

  public
      fun CoverageEligibilityResponse.Insurance.Item.Benefit.UsedX.coverageEligibilityResponseInsuranceItemBenefitUsedToHapi():
      Type {
    if (this.getUnsignedInt() != UnsignedInt.newBuilder().defaultInstanceForType ) {
      return (this.getUnsignedInt()).toHapi()
    }
    if (this.getStringValue() != String.newBuilder().defaultInstanceForType ) {
      return (this.getStringValue()).toHapi()
    }
    if (this.getMoney() != Money.newBuilder().defaultInstanceForType ) {
      return (this.getMoney()).toHapi()
    }
    throw IllegalArgumentException("CoverageEligibilityResponse.insurance.item.benefit.used[x]")
  }

  public fun Type.coverageEligibilityResponseInsuranceItemBenefitUsedToProto():
      CoverageEligibilityResponse.Insurance.Item.Benefit.UsedX {
    val protoValue = CoverageEligibilityResponse.Insurance.Item.Benefit.UsedX.newBuilder()
    if (this is UnsignedIntType) {
      protoValue.setUnsignedInt(this.toProto())
    }
    if (this is StringType) {
      protoValue.setStringValue(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Money) {
      protoValue.setMoney(this.toProto())
    }
    return protoValue.build()
  }

  public fun CoverageEligibilityResponse.toHapi():
      org.hl7.fhir.r4.model.CoverageEligibilityResponse {
    val hapiValue = org.hl7.fhir.r4.model.CoverageEligibilityResponse()
    hapiValue.id = id.value 
    hapiValue.setMeta(meta.toHapi())
    hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    hapiValue.setLanguageElement(language.toHapi())
    hapiValue.setText(text.toHapi())
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setIdentifier(identifierList.map{it.toHapi()})
    hapiValue.setStatus(org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponseStatus.valueOf(status.value.name.replace("_","")))
    purposeList.map{hapiValue.addPurpose(org.hl7.fhir.r4.model.CoverageEligibilityResponse.EligibilityResponsePurpose.valueOf(it.value.name.replace("_","")))}
    hapiValue.setPatient(patient.toHapi())
    hapiValue.setServiced(serviced.coverageEligibilityResponseServicedToHapi())
    hapiValue.setCreatedElement(created.toHapi())
    hapiValue.setRequestor(requestor.toHapi())
    hapiValue.setRequest(request.toHapi())
    hapiValue.setOutcome(Enumerations.RemittanceOutcome.valueOf(outcome.value.name.replace("_","")))
    hapiValue.setDispositionElement(disposition.toHapi())
    hapiValue.setInsurer(insurer.toHapi())
    hapiValue.setInsurance(insuranceList.map{it.toHapi()})
    hapiValue.setPreAuthRefElement(preAuthRef.toHapi())
    hapiValue.setForm(form.toHapi())
    hapiValue.setErrors(errorsList.map{it.toHapi()})
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.CoverageEligibilityResponse.toProto():
      CoverageEligibilityResponse {
    val protoValue = CoverageEligibilityResponse.newBuilder()
    .setId(Id.newBuilder().setValue(id))
    .setMeta(meta.toProto())
    .setImplicitRules(implicitRulesElement.toProto())
    .setLanguage(languageElement.toProto())
    .setText(text.toProto())
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .addAllIdentifier(identifier.map{it.toProto()})
    .setStatus(CoverageEligibilityResponse.StatusCode.newBuilder().setValue(FinancialResourceStatusCode.Value.valueOf(status.toCode().replace("-",
        "_").toUpperCase())).build())
    .addAllPurpose(purpose.map{CoverageEligibilityResponse.PurposeCode.newBuilder().setValue(EligibilityResponsePurposeCode.Value.valueOf(it.value.toCode().replace("-",
        "_").toUpperCase())).build()})
    .setPatient(patient.toProto())
    .setServiced(serviced.coverageEligibilityResponseServicedToProto())
    .setCreated(createdElement.toProto())
    .setRequestor(requestor.toProto())
    .setRequest(request.toProto())
    .setOutcome(CoverageEligibilityResponse.OutcomeCode.newBuilder().setValue(ClaimProcessingCode.Value.valueOf(outcome.toCode().replace("-",
        "_").toUpperCase())).build())
    .setDisposition(dispositionElement.toProto())
    .setInsurer(insurer.toProto())
    .addAllInsurance(insurance.map{it.toProto()})
    .setPreAuthRef(preAuthRefElement.toProto())
    .setForm(form.toProto())
    .addAllErrors(errors.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.CoverageEligibilityResponse.InsuranceComponent.toProto():
      CoverageEligibilityResponse.Insurance {
    val protoValue = CoverageEligibilityResponse.Insurance.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setCoverage(coverage.toProto())
    .setInforce(inforceElement.toProto())
    .setBenefitPeriod(benefitPeriod.toProto())
    .addAllItems(items.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.CoverageEligibilityResponse.ItemsComponent.toProto():
      CoverageEligibilityResponse.Insurance.Items {
    val protoValue = CoverageEligibilityResponse.Insurance.Items.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setCategory(category.toProto())
    .setProductOrService(productOrService.toProto())
    .addAllModifier(modifier.map{it.toProto()})
    .setProvider(provider.toProto())
    .setExcluded(excludedElement.toProto())
    .setName(nameElement.toProto())
    .setDescription(descriptionElement.toProto())
    .setNetwork(network.toProto())
    .setUnit(unit.toProto())
    .setTerm(term.toProto())
    .addAllBenefit(benefit.map{it.toProto()})
    .setAuthorizationRequired(authorizationRequiredElement.toProto())
    .addAllAuthorizationSupporting(authorizationSupporting.map{it.toProto()})
    .setAuthorizationUrl(authorizationUrlElement.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.CoverageEligibilityResponse.BenefitComponent.toProto():
      CoverageEligibilityResponse.Insurance.Item.Benefit {
    val protoValue = CoverageEligibilityResponse.Insurance.Item.Benefit.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setType(type.toProto())
    .setAllowed(allowed.coverageEligibilityResponseInsuranceItemBenefitAllowedToProto())
    .setUsed(used.coverageEligibilityResponseInsuranceItemBenefitUsedToProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.CoverageEligibilityResponse.ErrorsComponent.toProto():
      CoverageEligibilityResponse.Errors {
    val protoValue = CoverageEligibilityResponse.Errors.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setCode(code.toProto())
    .build()
    return protoValue
  }

  public fun CoverageEligibilityResponse.Insurance.toHapi():
      org.hl7.fhir.r4.model.CoverageEligibilityResponse.InsuranceComponent {
    val hapiValue = org.hl7.fhir.r4.model.CoverageEligibilityResponse.InsuranceComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setCoverage(coverage.toHapi())
    hapiValue.setInforceElement(inforce.toHapi())
    hapiValue.setBenefitPeriod(benefitPeriod.toHapi())
    hapiValue.setItems(itemsList.map{it.toHapi()})
    return hapiValue
  }

  public fun CoverageEligibilityResponse.Insurance.Items.toHapi():
      org.hl7.fhir.r4.model.CoverageEligibilityResponse.ItemsComponent {
    val hapiValue = org.hl7.fhir.r4.model.CoverageEligibilityResponse.ItemsComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setCategory(category.toHapi())
    hapiValue.setProductOrService(productOrService.toHapi())
    hapiValue.setModifier(modifierList.map{it.toHapi()})
    hapiValue.setProvider(provider.toHapi())
    hapiValue.setExcludedElement(excluded.toHapi())
    hapiValue.setNameElement(name.toHapi())
    hapiValue.setDescriptionElement(description.toHapi())
    hapiValue.setNetwork(network.toHapi())
    hapiValue.setUnit(unit.toHapi())
    hapiValue.setTerm(term.toHapi())
    hapiValue.setBenefit(benefitList.map{it.toHapi()})
    hapiValue.setAuthorizationRequiredElement(authorizationRequired.toHapi())
    hapiValue.setAuthorizationSupporting(authorizationSupportingList.map{it.toHapi()})
    hapiValue.setAuthorizationUrlElement(authorizationUrl.toHapi())
    return hapiValue
  }

  public fun CoverageEligibilityResponse.Insurance.Item.Benefit.toHapi():
      org.hl7.fhir.r4.model.CoverageEligibilityResponse.BenefitComponent {
    val hapiValue = org.hl7.fhir.r4.model.CoverageEligibilityResponse.BenefitComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setType(type.toHapi())
    hapiValue.setAllowed(allowed.coverageEligibilityResponseInsuranceItemBenefitAllowedToHapi())
    hapiValue.setUsed(used.coverageEligibilityResponseInsuranceItemBenefitUsedToHapi())
    return hapiValue
  }

  public fun CoverageEligibilityResponse.Errors.toHapi():
      org.hl7.fhir.r4.model.CoverageEligibilityResponse.ErrorsComponent {
    val hapiValue = org.hl7.fhir.r4.model.CoverageEligibilityResponse.ErrorsComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setCode(code.toHapi())
    return hapiValue
  }
}
