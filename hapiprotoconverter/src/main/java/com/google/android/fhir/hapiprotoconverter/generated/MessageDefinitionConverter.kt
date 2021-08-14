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
import com.google.android.fhir.hapiprotoconverter.generated.CanonicalConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CanonicalConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodingConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodingConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ContactDetailConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ContactDetailConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.IdentifierConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.IdentifierConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MarkdownConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MarkdownConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.MetaConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.NarrativeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UnsignedIntConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UnsignedIntConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UsageContextConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UsageContextConverter.toProto
import com.google.fhir.r4.core.Coding
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.MessageDefinition
import com.google.fhir.r4.core.MessageDefinition.Focus
import com.google.fhir.r4.core.MessageSignificanceCategoryCode
import com.google.fhir.r4.core.MessageheaderResponseRequestCode
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.ResourceTypeCode
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.Uri
import java.lang.IllegalArgumentException
import kotlin.jvm.JvmStatic
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.Type
import org.hl7.fhir.r4.model.UriType

public object MessageDefinitionConverter {
  @JvmStatic
  private fun MessageDefinition.EventX.messageDefinitionEventToHapi(): Type {
    if (this.getCoding() != Coding.newBuilder().defaultInstanceForType) {
      return (this.getCoding()).toHapi()
    }
    if (this.getUri() != Uri.newBuilder().defaultInstanceForType) {
      return (this.getUri()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for MessageDefinition.event[x]")
  }

  @JvmStatic
  private fun Type.messageDefinitionEventToProto(): MessageDefinition.EventX {
    val protoValue = MessageDefinition.EventX.newBuilder()
    if (this is org.hl7.fhir.r4.model.Coding) {
      protoValue.setCoding(this.toProto())
    }
    if (this is UriType) {
      protoValue.setUri(this.toProto())
    }
    return protoValue.build()
  }

  @JvmStatic
  public fun MessageDefinition.toHapi(): org.hl7.fhir.r4.model.MessageDefinition {
    val hapiValue = org.hl7.fhir.r4.model.MessageDefinition()
    hapiValue.id = id.value
    hapiValue.setMeta(meta.toHapi())
    hapiValue.setImplicitRulesElement(implicitRules.toHapi())
    hapiValue.setText(text.toHapi())
    hapiValue.setExtension(extensionList.map { it.toHapi() })
    hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    hapiValue.setUrlElement(url.toHapi())
    hapiValue.setIdentifier(identifierList.map { it.toHapi() })
    hapiValue.setVersionElement(version.toHapi())
    hapiValue.setNameElement(name.toHapi())
    hapiValue.setTitleElement(title.toHapi())
    hapiValue.setReplaces(replacesList.map { it.toHapi() })
    hapiValue.setStatus(
      Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", ""))
    )
    hapiValue.setExperimentalElement(experimental.toHapi())
    hapiValue.setDateElement(date.toHapi())
    hapiValue.setPublisherElement(publisher.toHapi())
    hapiValue.setContact(contactList.map { it.toHapi() })
    hapiValue.setDescriptionElement(description.toHapi())
    hapiValue.setUseContext(useContextList.map { it.toHapi() })
    hapiValue.setJurisdiction(jurisdictionList.map { it.toHapi() })
    hapiValue.setPurposeElement(purpose.toHapi())
    hapiValue.setCopyrightElement(copyright.toHapi())
    hapiValue.setBaseElement(base.toHapi())
    hapiValue.setParent(parentList.map { it.toHapi() })
    hapiValue.setEvent(event.messageDefinitionEventToHapi())
    hapiValue.setCategory(
      org.hl7.fhir.r4.model.MessageDefinition.MessageSignificanceCategory.valueOf(
        category.value.name.hapiCodeCheck().replace("_", "")
      )
    )
    hapiValue.setFocus(focusList.map { it.toHapi() })
    hapiValue.setResponseRequired(
      org.hl7.fhir.r4.model.MessageDefinition.MessageheaderResponseRequest.valueOf(
        responseRequired.value.name.hapiCodeCheck().replace("_", "")
      )
    )
    hapiValue.setAllowedResponse(allowedResponseList.map { it.toHapi() })
    hapiValue.setGraph(graphList.map { it.toHapi() })
    return hapiValue
  }

  @JvmStatic
  public fun org.hl7.fhir.r4.model.MessageDefinition.toProto(): MessageDefinition {
    val protoValue =
      MessageDefinition.newBuilder()
        .setId(Id.newBuilder().setValue(id))
        .setMeta(meta.toProto())
        .setImplicitRules(implicitRulesElement.toProto())
        .setText(text.toProto())
        .addAllExtension(extension.map { it.toProto() })
        .addAllModifierExtension(modifierExtension.map { it.toProto() })
        .setUrl(urlElement.toProto())
        .addAllIdentifier(identifier.map { it.toProto() })
        .setVersion(versionElement.toProto())
        .setName(nameElement.toProto())
        .setTitle(titleElement.toProto())
        .addAllReplaces(replaces.map { it.toProto() })
        .setStatus(
          MessageDefinition.StatusCode.newBuilder()
            .setValue(
              PublicationStatusCode.Value.valueOf(
                status.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
              )
            )
            .build()
        )
        .setExperimental(experimentalElement.toProto())
        .setDate(dateElement.toProto())
        .setPublisher(publisherElement.toProto())
        .addAllContact(contact.map { it.toProto() })
        .setDescription(descriptionElement.toProto())
        .addAllUseContext(useContext.map { it.toProto() })
        .addAllJurisdiction(jurisdiction.map { it.toProto() })
        .setPurpose(purposeElement.toProto())
        .setCopyright(copyrightElement.toProto())
        .setBase(baseElement.toProto())
        .addAllParent(parent.map { it.toProto() })
        .setEvent(event.messageDefinitionEventToProto())
        .setCategory(
          MessageDefinition.CategoryCode.newBuilder()
            .setValue(
              MessageSignificanceCategoryCode.Value.valueOf(
                category.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
              )
            )
            .build()
        )
        .addAllFocus(focus.map { it.toProto() })
        .setResponseRequired(
          MessageDefinition.ResponseRequiredCode.newBuilder()
            .setValue(
              MessageheaderResponseRequestCode.Value.valueOf(
                responseRequired.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
              )
            )
            .build()
        )
        .addAllAllowedResponse(allowedResponse.map { it.toProto() })
        .addAllGraph(graph.map { it.toProto() })
        .build()
    return protoValue
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent.toProto():
    MessageDefinition.Focus {
    val protoValue =
      MessageDefinition.Focus.newBuilder()
        .setId(String.newBuilder().setValue(id))
        .addAllExtension(extension.map { it.toProto() })
        .addAllModifierExtension(modifierExtension.map { it.toProto() })
        .setCode(
          MessageDefinition.Focus.CodeType.newBuilder()
            .setValue(ResourceTypeCode.Value.valueOf(code))
            .build()
        )
        .setProfile(profileElement.toProto())
        .setMin(minElement.toProto())
        .setMax(maxElement.toProto())
        .build()
    return protoValue
  }

  @JvmStatic
  private fun org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent.toProto():
    MessageDefinition.AllowedResponse {
    val protoValue =
      MessageDefinition.AllowedResponse.newBuilder()
        .setId(String.newBuilder().setValue(id))
        .addAllExtension(extension.map { it.toProto() })
        .addAllModifierExtension(modifierExtension.map { it.toProto() })
        .setMessage(messageElement.toProto())
        .setSituation(situationElement.toProto())
        .build()
    return protoValue
  }

  @JvmStatic
  private fun MessageDefinition.Focus.toHapi():
    org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent {
    val hapiValue = org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent()
    hapiValue.id = id.value
    hapiValue.setExtension(extensionList.map { it.toHapi() })
    hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    hapiValue.setCode(code.value.name)
    hapiValue.setProfileElement(profile.toHapi())
    hapiValue.setMinElement(min.toHapi())
    hapiValue.setMaxElement(max.toHapi())
    return hapiValue
  }

  @JvmStatic
  private fun MessageDefinition.AllowedResponse.toHapi():
    org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent {
    val hapiValue =
      org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent()
    hapiValue.id = id.value
    hapiValue.setExtension(extensionList.map { it.toHapi() })
    hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    hapiValue.setMessageElement(message.toHapi())
    hapiValue.setSituationElement(situation.toHapi())
    return hapiValue
  }
}
