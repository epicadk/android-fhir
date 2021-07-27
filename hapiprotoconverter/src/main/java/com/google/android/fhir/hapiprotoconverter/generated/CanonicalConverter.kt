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

import com.google.fhir.r4.core.Canonical
import org.hl7.fhir.r4.model.CanonicalType

/** returns the proto Canonical equivalent of the hapi CanonicalType */
public fun CanonicalType.toProto(): Canonical {
  val protoValue = Canonical.newBuilder()
  if (value != null) protoValue.setValue(value)
  return protoValue.build()
}

/** returns the hapi CanonicalType equivalent of the proto Canonical */
public fun Canonical.toHapi(): CanonicalType {
  val hapiValue = CanonicalType()
  hapiValue.value = value
  return hapiValue
}
