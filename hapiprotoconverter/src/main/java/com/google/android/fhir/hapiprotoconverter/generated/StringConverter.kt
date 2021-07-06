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

import com.google.fhir.r4.core.String
import org.hl7.fhir.r4.model.StringType

/** contains functions that convert between the hapi and proto representations of string */
public object StringConverter {
  /** returns the proto String equivalent of the hapi StringType */
  public fun StringType.toProto(): String {
    val protoValue = String.newBuilder().setValue(value).build()
    return protoValue
  }

  /** returns the hapi StringType equivalent of the proto String */
  public fun String.toHapi(): StringType {
    val hapiValue = StringType()
    hapiValue.value = value
    return hapiValue
  }
}
