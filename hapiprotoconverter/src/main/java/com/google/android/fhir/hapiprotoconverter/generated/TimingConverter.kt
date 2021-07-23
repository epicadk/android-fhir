package com.google.android.fhir.hapiprotoconverter.generated

import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.CodeableConceptConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DateTimeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DecimalConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DecimalConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.DurationConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.DurationConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.ExtensionConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.PeriodConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.PositiveIntConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.PositiveIntConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.RangeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.RangeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.TimeConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.TimeConverter.toProto
import com.google.android.fhir.hapiprotoconverter.generated.UnsignedIntConverter.toHapi
import com.google.android.fhir.hapiprotoconverter.generated.UnsignedIntConverter.toProto
import com.google.fhir.r4.core.DaysOfWeekCode
import com.google.fhir.r4.core.Duration
import com.google.fhir.r4.core.EventTimingValueSet
import com.google.fhir.r4.core.Period
import com.google.fhir.r4.core.Range
import com.google.fhir.r4.core.String
import com.google.fhir.r4.core.Timing
import com.google.fhir.r4.core.UnitsOfTimeValueSet
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.Type

public object TimingConverter {
  public fun Timing.Repeat.BoundsX.timingRepeatBoundsToHapi(): Type {
    if (this.getDuration() != Duration.newBuilder().defaultInstanceForType ) {
      return (this.getDuration()).toHapi()
    }
    if (this.getRange() != Range.newBuilder().defaultInstanceForType ) {
      return (this.getRange()).toHapi()
    }
    if (this.getPeriod() != Period.newBuilder().defaultInstanceForType ) {
      return (this.getPeriod()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Timing.repeat.bounds[x]")
  }

  public fun Type.timingRepeatBoundsToProto(): Timing.Repeat.BoundsX {
    val protoValue = Timing.Repeat.BoundsX.newBuilder()
    if (this is org.hl7.fhir.r4.model.Duration) {
      protoValue.setDuration(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is org.hl7.fhir.r4.model.Period) {
      protoValue.setPeriod(this.toProto())
    }
    return protoValue.build()
  }

  public fun Timing.toHapi(): org.hl7.fhir.r4.model.Timing {
    val hapiValue = org.hl7.fhir.r4.model.Timing()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setModifierExtension(modifierExtensionList.map{it.toHapi()})
    hapiValue.setEvent(eventList.map{it.toHapi()})
    hapiValue.setRepeat(repeat.toHapi())
    hapiValue.setCode(code.toHapi())
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Timing.toProto(): Timing {
    val protoValue = Timing.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .addAllModifierExtension(modifierExtension.map{it.toProto()})
    .addAllEvent(event.map{it.toProto()})
    .setRepeat(repeat.toProto())
    .setCode(code.toProto())
    .build()
    return protoValue
  }

  public fun org.hl7.fhir.r4.model.Timing.TimingRepeatComponent.toProto(): Timing.Repeat {
    val protoValue = Timing.Repeat.newBuilder()
    .setId(String.newBuilder().setValue(id))
    .addAllExtension(extension.map{it.toProto()})
    .setBounds(bounds.timingRepeatBoundsToProto())
    .setCount(countElement.toProto())
    .setCountMax(countMaxElement.toProto())
    .setDuration(durationElement.toProto())
    .setDurationMax(durationMaxElement.toProto())
    .setDurationUnit(Timing.Repeat.DurationUnitCode.newBuilder().setValue(UnitsOfTimeValueSet.Value.valueOf(durationUnit.toCode().replace("-",
        "_").toUpperCase())).build())
    .setFrequency(frequencyElement.toProto())
    .setFrequencyMax(frequencyMaxElement.toProto())
    .setPeriod(periodElement.toProto())
    .setPeriodMax(periodMaxElement.toProto())
    .setPeriodUnit(Timing.Repeat.PeriodUnitCode.newBuilder().setValue(UnitsOfTimeValueSet.Value.valueOf(periodUnit.toCode().replace("-",
        "_").toUpperCase())).build())
    .addAllDayOfWeek(dayOfWeek.map{Timing.Repeat.DayOfWeekCode.newBuilder().setValue(DaysOfWeekCode.Value.valueOf(it.value.toCode().replace("-",
        "_").toUpperCase())).build()})
    .addAllTimeOfDay(timeOfDay.map{it.toProto()})
    .addAllWhen(`when`.map{Timing.Repeat.WhenCode.newBuilder().setValue(EventTimingValueSet.Value.valueOf(it.value.toCode().replace("-",
        "_").toUpperCase())).build()})
    .setOffset(offsetElement.toProto())
    .build()
    return protoValue
  }

  public fun Timing.Repeat.toHapi(): org.hl7.fhir.r4.model.Timing.TimingRepeatComponent {
    val hapiValue = org.hl7.fhir.r4.model.Timing.TimingRepeatComponent()
    hapiValue.id = id.value 
    hapiValue.setExtension(extensionList.map{it.toHapi()})
    hapiValue.setBounds(bounds.timingRepeatBoundsToHapi())
    hapiValue.setCountElement(count.toHapi())
    hapiValue.setCountMaxElement(countMax.toHapi())
    hapiValue.setDurationElement(duration.toHapi())
    hapiValue.setDurationMaxElement(durationMax.toHapi())
    hapiValue.setDurationUnit(org.hl7.fhir.r4.model.Timing.UnitsOfTime.valueOf(durationUnit.value.name.replace("_","")))
    hapiValue.setFrequencyElement(frequency.toHapi())
    hapiValue.setFrequencyMaxElement(frequencyMax.toHapi())
    hapiValue.setPeriodElement(period.toHapi())
    hapiValue.setPeriodMaxElement(periodMax.toHapi())
    hapiValue.setPeriodUnit(org.hl7.fhir.r4.model.Timing.UnitsOfTime.valueOf(periodUnit.value.name.replace("_","")))
    dayOfWeekList.map{hapiValue.addDayOfWeek(org.hl7.fhir.r4.model.Timing.DayOfWeek.valueOf(it.value.name.replace("_","")))}
    hapiValue.setTimeOfDay(timeOfDayList.map{it.toHapi()})
    whenList.map{hapiValue.addWhen(org.hl7.fhir.r4.model.Timing.EventTiming.valueOf(it.value.name.replace("_","")))}
    hapiValue.setOffsetElement(offset.toHapi())
    return hapiValue
  }
}
