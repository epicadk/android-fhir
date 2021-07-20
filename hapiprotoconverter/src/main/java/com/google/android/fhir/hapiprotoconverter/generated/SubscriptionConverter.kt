package com.google.android.fhir.hapiprotoconverter.generated

import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ContactPointConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ContactPointConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.InstantConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.InstantConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UrlConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UrlConverter.toProto
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.Subscription
import com.google.fhir.r4.core.SubscriptionChannelTypeCode
import com.google.fhir.r4.core.SubscriptionStatusCode

public object SubscriptionConverter {
  public fun Subscription.toHapi(): org.hl7.fhir.r4.model.Subscription {
    val hapiValue = org.hl7.fhir.r4.model.Subscription()
    hapiValue.id = id.value 
    hapiValue.setMeta(meta.toHapi())
    hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    hapiValue.setLanguageElement(language.toHapi())
    hapiValue.setText(text.toHapi())
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setStatus(org.hl7.fhir.r4.model.Subscription.SubscriptionStatus.valueOf(status.value.name.replace("_","")))
    hapiValue.setContact(contactList.map{it.toHapi()})
    hapiValue.setEndElement(end.toHapi())
    hapiValue.setReasonElement(reason.toHapi())
    hapiValue.setCriteriaElement(criteria.toHapi())
    hapiValue.setErrorElement(error.toHapi())
    hapiValue.setChannel(channel.toHapi())
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Subscription.toProto(): Subscription {
    val protoValue = Subscription.newBuilder()
    .setId(Id.newBuilder().setValue(id))
    .setMeta(meta.toProto())
    .setImplicitRules(implicitRulesElement.toProto())
    .setLanguage(languageElement.toProto())
    .setText(text.toProto())
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setStatus(Subscription.StatusCode.newBuilder().setValue(SubscriptionStatusCode.Value.valueOf(status.toCode().replace("-",
        "_").toUpperCase())).build())
    .addAllContact(contact.map{it.toProto()})
    .setEnd(endElement.toProto())
    .setReason(reasonElement.toProto())
    .setCriteria(criteriaElement.toProto())
    .setError(errorElement.toProto())
    .setChannel(channel.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.Subscription.SubscriptionChannelComponent.toProto():
      Subscription.Channel {
    val protoValue = Subscription.Channel.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .setType(Subscription.Channel.TypeCode.newBuilder().setValue(SubscriptionChannelTypeCode.Value.valueOf(type.toCode().replace("-",
        "_").toUpperCase())).build())
    .setEndpoint(endpointElement.toProto())
    .setPayload(Subscription.Channel.PayloadCode.newBuilder().setValue(payload).build())
    .addAllHeader(header.map{it.toProto()})
    .build()
    return protoValue
  }

  public fun Subscription.Channel.toHapi():
      org.hl7.fhir.r4.model.Subscription.SubscriptionChannelComponent {
    val hapiValue = org.hl7.fhir.r4.model.Subscription.SubscriptionChannelComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setType(org.hl7.fhir.r4.model.Subscription.SubscriptionChannelType.valueOf(type.value.name.replace("_","")))
    hapiValue.setEndpointElement(endpoint.toHapi())
    hapiValue.setPayload(payload.value)
    hapiValue.setHeader(headerList.map{it.toHapi()})
    return hapiValue
  }
}
