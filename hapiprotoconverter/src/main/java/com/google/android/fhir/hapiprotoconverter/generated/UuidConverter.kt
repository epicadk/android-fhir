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

import com.google.fhir.r4.core.Uuid
import org.hl7.fhir.r4.model.UuidType

object UuidConverter {
  /** returns the proto Uuid equivalent of the hapi UuidType */
  fun UuidType.toProto(): Uuid {
    val protoValue = Uuid.newBuilder()
    if (hasValue()) protoValue.value = value
    return protoValue.build()
  }

  /** returns the hapi UuidType equivalent of the proto Uuid */
  fun Uuid.toHapi(): UuidType {
    val hapiValue = UuidType()
    hapiValue.value = value
    return hapiValue
  }
}
