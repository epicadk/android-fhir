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

import com.google.android.fhir.hapiprotoconverter.generated.Base64BinaryConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.Base64BinaryConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UnsignedIntConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UnsignedIntConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UrlConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UrlConverter.toProto
import com.google.fhir.r4.core.Attachment
import com.google.fhir.r4.core.String

public object AttachmentConverter {
  public fun Attachment.toHapi(): org.hl7.fhir.r4.model.Attachment {
    val hapiValue = org.hl7.fhir.r4.model.Attachment()
    hapiValue.id = id.value
    hapiValue.setExtension(extensionList.map { it.toHapi() })
    hapiValue.setContentType(contentType.value)
    hapiValue.setDataElement(data.toHapi())
    hapiValue.setUrlElement(url.toHapi())
    hapiValue.setSizeElement(size.toHapi())
    hapiValue.setHashElement(hash.toHapi())
    hapiValue.setTitleElement(title.toHapi())
    hapiValue.setCreationElement(creation.toHapi())
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Attachment.toProto(): Attachment {
    val protoValue =
      Attachment.newBuilder()
        .setId(String.newBuilder().setValue(id))
        .addAllExtension(extension.map { it.toProto() })
        .setContentType(Attachment.ContentTypeCode.newBuilder().setValue(contentType).build())
        .setData(dataElement.toProto())
        .setUrl(urlElement.toProto())
        .setSize(sizeElement.toProto())
        .setHash(hashElement.toProto())
        .setTitle(titleElement.toProto())
        .setCreation(creationElement.toProto())
        .build()
    return protoValue
  }
}
