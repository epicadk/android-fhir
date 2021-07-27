package com.google.android.fhir.hapiprotoconverter.generated

import com.google.fhir.r4.core.RelatedArtifact
import com.google.fhir.r4.core.RelatedArtifactTypeCode
import com.google.fhir.r4.core.String

public fun RelatedArtifact.toHapi(): org.hl7.fhir.r4.model.RelatedArtifact {
  val hapiValue = org.hl7.fhir.r4.model.RelatedArtifact()
  hapiValue.id = id.value 
  hapiValue.setExtension(extensionList.map{it.toHapi()})
  hapiValue.setType(org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType.valueOf(type.value.name.replace("_","")))
  hapiValue.setLabelElement(label.toHapi())
  hapiValue.setDisplayElement(display.toHapi())
  hapiValue.setCitationElement(citation.toHapi())
  hapiValue.setUrlElement(url.toHapi())
  hapiValue.setDocument(document.toHapi())
  hapiValue.setResourceElement(resource.toHapi())
  return hapiValue
}

public fun org.hl7.fhir.r4.model.RelatedArtifact.toProto(): RelatedArtifact {
  val protoValue = RelatedArtifact.newBuilder()
  .setId(String.newBuilder().setValue(id))
  .addAllExtension(extension.map{it.toProto()})
  .setType(RelatedArtifact.TypeCode.newBuilder().setValue(RelatedArtifactTypeCode.Value.valueOf(type.toCode().replace("-",
      "_").toUpperCase())).build())
  .setLabel(labelElement.toProto())
  .setDisplay(displayElement.toProto())
  .setCitation(citationElement.toProto())
  .setUrl(urlElement.toProto())
  .setDocument(document.toProto())
  .setResource(resourceElement.toProto())
  .build()
  return protoValue
}
