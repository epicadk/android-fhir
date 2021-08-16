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

import com.google.android.fhir.hapiprotoconverter.generated.CanonicalConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CanonicalConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.IntegerConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.IntegerConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.fhir.r4.core.FHIRAllTypesValueSet
import com.google.fhir.r4.core.OperationParameterUseCode
import com.google.fhir.r4.core.ParameterDefinition
import com.google.fhir.r4.core.String
import kotlin.jvm.JvmStatic

object ParameterDefinitionConverter {
  @JvmStatic
  fun ParameterDefinition.toHapi(): org.hl7.fhir.r4.model.ParameterDefinition {
    val hapiValue = org.hl7.fhir.r4.model.ParameterDefinition()
    hapiValue.id = id.value
    if (extensionCount > 0) {
      hapiValue.extension = extensionList.map { it.toHapi() }
    }
    if (hasName()) {
      hapiValue.nameElement = name.toHapi()
    }
    hapiValue.use =
      org.hl7.fhir.r4.model.ParameterDefinition.ParameterUse.valueOf(
        use.value.name.hapiCodeCheck().replace("_", "")
      )
    if (hasMin()) {
      hapiValue.minElement = min.toHapi()
    }
    if (hasMax()) {
      hapiValue.maxElement = max.toHapi()
    }
    if (hasDocumentation()) {
      hapiValue.documentationElement = documentation.toHapi()
    }
    hapiValue.type = type.value.name
    if (hasProfile()) {
      hapiValue.profileElement = profile.toHapi()
    }
    return hapiValue
  }

  @JvmStatic
  fun org.hl7.fhir.r4.model.ParameterDefinition.toProto(): ParameterDefinition {
    val protoValue = ParameterDefinition.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasName()) {
      protoValue.name = nameElement.toProto()
    }
    protoValue.use =
      ParameterDefinition.UseCode.newBuilder()
        .setValue(
          OperationParameterUseCode.Value.valueOf(
            use.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
          )
        )
        .build()
    if (hasMin()) {
      protoValue.min = minElement.toProto()
    }
    if (hasMax()) {
      protoValue.max = maxElement.toProto()
    }
    if (hasDocumentation()) {
      protoValue.documentation = documentationElement.toProto()
    }
    protoValue.type =
      ParameterDefinition.TypeCode.newBuilder()
        .setValue(FHIRAllTypesValueSet.Value.valueOf(type))
        .build()
    if (hasProfile()) {
      protoValue.profile = profileElement.toProto()
    }
    return protoValue.build()
  }
}
