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
import com.google.android.fhir.hapiprotoconverter.generated.ContactDetailConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ContactDetailConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DateConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DateConverter.toProto
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
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ReferenceConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.RelatedArtifactConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.RelatedArtifactConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UsageContextConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UsageContextConverter.toProto
import com.google.fhir.r4.core.CodeableConcept
import com.google.fhir.r4.core.Id
import com.google.fhir.r4.core.PublicationStatusCode
import com.google.fhir.r4.core.Reference
import com.google.fhir.r4.core.ResearchDefinition
import java.lang.IllegalArgumentException
import kotlin.jvm.JvmStatic
import org.hl7.fhir.r4.model.Enumerations
import org.hl7.fhir.r4.model.Type

object ResearchDefinitionConverter {
  @JvmStatic
  private fun ResearchDefinition.SubjectX.researchDefinitionSubjectToHapi(): Type {
    if (this.codeableConcept != CodeableConcept.newBuilder().defaultInstanceForType) {
      return (this.codeableConcept).toHapi()
    }
    if (this.reference != Reference.newBuilder().defaultInstanceForType) {
      return (this.reference).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for ResearchDefinition.subject[x]")
  }

  @JvmStatic
  private fun Type.researchDefinitionSubjectToProto(): ResearchDefinition.SubjectX {
    val protoValue = ResearchDefinition.SubjectX.newBuilder()
    if (this is org.hl7.fhir.r4.model.CodeableConcept) {
        protoValue.codeableConcept = this.toProto()
    }
    if (this is org.hl7.fhir.r4.model.Reference) {
        protoValue.reference = this.toProto()
    }
    return protoValue.build()
  }

  @JvmStatic
  fun ResearchDefinition.toHapi(): org.hl7.fhir.r4.model.ResearchDefinition {
    val hapiValue = org.hl7.fhir.r4.model.ResearchDefinition()
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
    if (hasUrl()) {
        hapiValue.urlElement = url.toHapi()
    }
    if (identifierCount > 0) {
        hapiValue.identifier = identifierList.map { it.toHapi() }
    }
    if (hasVersion()) {
        hapiValue.versionElement = version.toHapi()
    }
    if (hasName()) {
        hapiValue.nameElement = name.toHapi()
    }
    if (hasTitle()) {
        hapiValue.titleElement = title.toHapi()
    }
    if (hasShortTitle()) {
        hapiValue.shortTitleElement = shortTitle.toHapi()
    }
    if (hasSubtitle()) {
        hapiValue.subtitleElement = subtitle.toHapi()
    }
      hapiValue.status =
          Enumerations.PublicationStatus.valueOf(status.value.name.hapiCodeCheck().replace("_", ""))
    if (hasExperimental()) {
        hapiValue.experimentalElement = experimental.toHapi()
    }
    if (hasSubject()) {
        hapiValue.subject = subject.researchDefinitionSubjectToHapi()
    }
    if (hasDate()) {
        hapiValue.dateElement = date.toHapi()
    }
    if (hasPublisher()) {
        hapiValue.publisherElement = publisher.toHapi()
    }
    if (contactCount > 0) {
        hapiValue.contact = contactList.map { it.toHapi() }
    }
    if (hasDescription()) {
        hapiValue.descriptionElement = description.toHapi()
    }
    if (commentCount > 0) {
        hapiValue.comment = commentList.map { it.toHapi() }
    }
    if (useContextCount > 0) {
        hapiValue.useContext = useContextList.map { it.toHapi() }
    }
    if (jurisdictionCount > 0) {
        hapiValue.jurisdiction = jurisdictionList.map { it.toHapi() }
    }
    if (hasPurpose()) {
        hapiValue.purposeElement = purpose.toHapi()
    }
    if (hasUsage()) {
        hapiValue.usageElement = usage.toHapi()
    }
    if (hasCopyright()) {
        hapiValue.copyrightElement = copyright.toHapi()
    }
    if (hasApprovalDate()) {
        hapiValue.approvalDateElement = approvalDate.toHapi()
    }
    if (hasLastReviewDate()) {
        hapiValue.lastReviewDateElement = lastReviewDate.toHapi()
    }
    if (hasEffectivePeriod()) {
        hapiValue.effectivePeriod = effectivePeriod.toHapi()
    }
    if (topicCount > 0) {
        hapiValue.topic = topicList.map { it.toHapi() }
    }
    if (authorCount > 0) {
        hapiValue.author = authorList.map { it.toHapi() }
    }
    if (editorCount > 0) {
        hapiValue.editor = editorList.map { it.toHapi() }
    }
    if (reviewerCount > 0) {
        hapiValue.reviewer = reviewerList.map { it.toHapi() }
    }
    if (endorserCount > 0) {
        hapiValue.endorser = endorserList.map { it.toHapi() }
    }
    if (relatedArtifactCount > 0) {
        hapiValue.relatedArtifact = relatedArtifactList.map { it.toHapi() }
    }
    if (libraryCount > 0) {
        hapiValue.library = libraryList.map { it.toHapi() }
    }
    if (hasPopulation()) {
        hapiValue.population = population.toHapi()
    }
    if (hasExposure()) {
        hapiValue.exposure = exposure.toHapi()
    }
    if (hasExposureAlternative()) {
        hapiValue.exposureAlternative = exposureAlternative.toHapi()
    }
    if (hasOutcome()) {
        hapiValue.outcome = outcome.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  fun org.hl7.fhir.r4.model.ResearchDefinition.toProto(): ResearchDefinition {
    val protoValue = ResearchDefinition.newBuilder().setId(Id.newBuilder().setValue(id))
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
    if (hasUrl()) {
        protoValue.url = urlElement.toProto()
    }
    if (hasIdentifier()) {
      protoValue.addAllIdentifier(identifier.map { it.toProto() })
    }
    if (hasVersion()) {
        protoValue.version = versionElement.toProto()
    }
    if (hasName()) {
        protoValue.name = nameElement.toProto()
    }
    if (hasTitle()) {
        protoValue.title = titleElement.toProto()
    }
    if (hasShortTitle()) {
        protoValue.shortTitle = shortTitleElement.toProto()
    }
    if (hasSubtitle()) {
        protoValue.subtitle = subtitleElement.toProto()
    }
      protoValue.status = ResearchDefinition.StatusCode.newBuilder()
          .setValue(
              PublicationStatusCode.Value.valueOf(
                  status.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
              )
          )
          .build()
    if (hasExperimental()) {
        protoValue.experimental = experimentalElement.toProto()
    }
    if (hasSubject()) {
        protoValue.subject = subject.researchDefinitionSubjectToProto()
    }
    if (hasDate()) {
        protoValue.date = dateElement.toProto()
    }
    if (hasPublisher()) {
        protoValue.publisher = publisherElement.toProto()
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    if (hasDescription()) {
        protoValue.description = descriptionElement.toProto()
    }
    if (hasComment()) {
      protoValue.addAllComment(comment.map { it.toProto() })
    }
    if (hasUseContext()) {
      protoValue.addAllUseContext(useContext.map { it.toProto() })
    }
    if (hasJurisdiction()) {
      protoValue.addAllJurisdiction(jurisdiction.map { it.toProto() })
    }
    if (hasPurpose()) {
        protoValue.purpose = purposeElement.toProto()
    }
    if (hasUsage()) {
        protoValue.usage = usageElement.toProto()
    }
    if (hasCopyright()) {
        protoValue.copyright = copyrightElement.toProto()
    }
    if (hasApprovalDate()) {
        protoValue.approvalDate = approvalDateElement.toProto()
    }
    if (hasLastReviewDate()) {
        protoValue.lastReviewDate = lastReviewDateElement.toProto()
    }
    if (hasEffectivePeriod()) {
        protoValue.effectivePeriod = effectivePeriod.toProto()
    }
    if (hasTopic()) {
      protoValue.addAllTopic(topic.map { it.toProto() })
    }
    if (hasAuthor()) {
      protoValue.addAllAuthor(author.map { it.toProto() })
    }
    if (hasEditor()) {
      protoValue.addAllEditor(editor.map { it.toProto() })
    }
    if (hasReviewer()) {
      protoValue.addAllReviewer(reviewer.map { it.toProto() })
    }
    if (hasEndorser()) {
      protoValue.addAllEndorser(endorser.map { it.toProto() })
    }
    if (hasRelatedArtifact()) {
      protoValue.addAllRelatedArtifact(relatedArtifact.map { it.toProto() })
    }
    if (hasLibrary()) {
      protoValue.addAllLibrary(library.map { it.toProto() })
    }
    if (hasPopulation()) {
        protoValue.population = population.toProto()
    }
    if (hasExposure()) {
        protoValue.exposure = exposure.toProto()
    }
    if (hasExposureAlternative()) {
        protoValue.exposureAlternative = exposureAlternative.toProto()
    }
    if (hasOutcome()) {
        protoValue.outcome = outcome.toProto()
    }
    return protoValue.build()
  }
}
