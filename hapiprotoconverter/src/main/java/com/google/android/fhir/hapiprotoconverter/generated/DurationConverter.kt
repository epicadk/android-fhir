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

import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DecimalConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DecimalConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.StringConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UriConverter.toProto
import com.google.fhir.r4.core.Duration
import com.google.fhir.r4.core.QuantityComparatorCode
import com.google.fhir.r4.core.String
import kotlin.jvm.JvmStatic
import org.hl7.fhir.r4.model.Quantity

public object DurationConverter {
  @JvmStatic
  public fun Duration.toHapi(): org.hl7.fhir.r4.model.Duration {
    val hapiValue = org.hl7.fhir.r4.model.Duration()
    hapiValue.id = id.value
    hapiValue.setExtension(extensionList.map { it.toHapi() })
    hapiValue.setValueElement(value.toHapi())
    hapiValue.setComparator(
      Quantity.QuantityComparator.valueOf(comparator.value.name.hapiCodeCheck().replace("_", ""))
    )
    hapiValue.setUnitElement(unit.toHapi())
    hapiValue.setSystemElement(system.toHapi())
    hapiValue.setCodeElement(code.toHapi())
    return hapiValue
  }

  @JvmStatic
  public fun org.hl7.fhir.r4.model.Duration.toProto(): Duration {
    val protoValue =
      Duration.newBuilder()
        .setId(String.newBuilder().setValue(id))
        .addAllExtension(extension.map { it.toProto() })
        .setValue(valueElement.toProto())
        .setComparator(
          Duration.ComparatorCode.newBuilder()
            .setValue(
              QuantityComparatorCode.Value.valueOf(
                comparator.toCode().protoCodeCheck().replace("-", "_").toUpperCase()
              )
            )
            .build()
        )
        .setUnit(unitElement.toProto())
        .setSystem(systemElement.toProto())
        .setCode(codeElement.toProto())
        .build()
    return protoValue
  }
}
