package com.google.android.fhir.hapiprotoconverter.generated

import com.google.android.fhir.hapiprotoconverter.generated.BooleanConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.BooleanConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ContactPointConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ContactPointConverter.toProto
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
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.OrganizationAffiliation

public object OrganizationAffiliationConverter {
  public fun OrganizationAffiliation.toHapi(): org.hl7.fhir.r4.model.OrganizationAffiliation {
    val hapiValue = org.hl7.fhir.r4.model.OrganizationAffiliation()
    hapiValue.id = id.value 
    hapiValue.setMeta(meta.toHapi())
    hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    hapiValue.setText(text.toHapi())
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setIdentifier(identifierList.map{it.toHapi()})
    hapiValue.setActiveElement(active.toHapi())
    hapiValue.setPeriod(period.toHapi())
    hapiValue.setOrganization(organization.toHapi())
    hapiValue.setParticipatingOrganization(participatingOrganization.toHapi())
    hapiValue.setNetwork(networkList.map{it.toHapi()})
    hapiValue.setCode(codeList.map{it.toHapi()})
    hapiValue.setSpecialty(specialtyList.map{it.toHapi()})
    hapiValue.setLocation(locationList.map{it.toHapi()})
    hapiValue.setHealthcareService(healthcareServiceList.map{it.toHapi()})
    hapiValue.setTelecom(telecomList.map{it.toHapi()})
    hapiValue.setEndpoint(endpointList.map{it.toHapi()})
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.OrganizationAffiliation.toProto(): OrganizationAffiliation {
    val protoValue = OrganizationAffiliation.newBuilder()
    .setId(Id.newBuilder().setValue(id))
    .setMeta(meta.toProto())
    .setImplicitRules(implicitRulesElement.toProto())
    .setText(text.toProto())
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .addAllIdentifier(identifier.map{it.toProto()})
    .setActive(activeElement.toProto())
    .setPeriod(period.toProto())
    .setOrganization(organization.toProto())
    .setParticipatingOrganization(participatingOrganization.toProto())
    .addAllNetwork(network.map{it.toProto()})
    .addAllCode(code.map{it.toProto()})
    .addAllSpecialty(specialty.map{it.toProto()})
    .addAllLocation(location.map{it.toProto()})
    .addAllHealthcareService(healthcareService.map{it.toProto()})
    .addAllTelecom(telecom.map{it.toProto()})
    .addAllEndpoint(endpoint.map{it.toProto()})
    .build()
    return protoValue
  }
}
