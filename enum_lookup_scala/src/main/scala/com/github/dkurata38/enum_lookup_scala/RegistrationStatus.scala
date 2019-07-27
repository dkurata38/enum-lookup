package com.github.dkurata38.enum_lookup_scala

sealed class RegistrationStatus(code: String) extends ConstantSearchableByCode[RegistrationStatus](code)

object RegistrationStatus extends EnumSearchableByCode[RegistrationStatus] {
  case object Temporary extends RegistrationStatus("0")
  case object Regular extends RegistrationStatus("1")

  override def values: Seq[RegistrationStatus] = Seq(Temporary, Regular)
}