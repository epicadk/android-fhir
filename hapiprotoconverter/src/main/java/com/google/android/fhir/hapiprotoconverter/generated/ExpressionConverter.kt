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

import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.IdConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.IdConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.Expression
import com.google.fhir.r4.core.String
import kotlin.jvm.JvmStatic

public object ExpressionConverter {
  @JvmStatic
  public fun Expression.toHapi(): org.hl7.fhir.r4.model.Expression {
    val hapiValue = org.hl7.fhir.r4.model.Expression()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasDescription()) {
      hapiValue.setDescriptionElement(description.toHapi())
    }
    if (hasName()) {
      hapiValue.setNameElement(name.toHapi())
    }
    if (hasReference()) {
      hapiValue.setReferenceElement(reference.toHapi())
    }
    return hapiValue
  }

  @JvmStatic
  public fun org.hl7.fhir.r4.model.Expression.toProto(): Expression {
    val protoValue = Expression.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasDescription()) {
      protoValue.setDescription(descriptionElement.toProto())
    }
    if (hasName()) {
      protoValue.setName(nameElement.toProto())
    }
    if (hasReference()) {
      protoValue.setReference(referenceElement.toProto())
    }
    return protoValue.build()
  }
}
