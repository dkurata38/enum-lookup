package com.github.dkurata38.enum_lookup_scala.type_value

sealed class RegistrationStatus(val code: String) extends ConstantSearchableByCode {
  override type CodeType = String
}

object RegistrationStatus extends EnumSearchableByCode {
  case object Temporary extends RegistrationStatus("0")
  case object Regular extends RegistrationStatus("1")

  override type EnumType = RegistrationStatus

  override val values: Seq[RegistrationStatus] = Seq(Temporary, Regular)
}