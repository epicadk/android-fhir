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

import com.google.android.fhir.hapiprotoconverter.generated.ContactDetailConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ContactDetailConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.fhir.r4.core.Contributor
import com.google.fhir.r4.core.ContributorTypeCode
import com.google.fhir.r4.core.String
import kotlin.jvm.JvmStatic

object ContributorConverter {
  @JvmStatic
  fun Contributor.toHapi(): org.hl7.fhir.r4.model.Contributor {
    val hapiValue = org.hl7.fhir.r4.model.Contributor()
    hapiValue.id = id.value
    if (extensionCount > 0) {
        hapiValue.extension = extensionList.map { it.toHapi() }
    }
      hapiValue.type = org.hl7.fhir.r4.model.Contributor.ContributorType.valueOf(
          type.value.name.hapiCodeCheck().replace("_", "")
      )
    if (hasName()) {
        hapiValue.nameElement = name.toHapi()
    }
    if (contactCount > 0) {
        hapiValue.contact = contactList.map { it.toHapi() }
    }
    return hapiValue
  }

  @JvmStatic
  fun org.hl7.fhir.r4.model.Contributor.toProto(): Contributor {
    val protoValue = Contributor.newBuilder().setId(String.newBuilder().setValue(id))
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
      protoValue.type = Contributor.TypeCode.newBuilder()
          .setValue(
              ContributorTypeCode.Value.valueOf(
                  type.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
              )
          )
          .build()
    if (hasName()) {
        protoValue.name = nameElement.toProto()
    }
    if (hasContact()) {
      protoValue.addAllContact(contact.map { it.toProto() })
    }
    return protoValue.build()
  }
}
