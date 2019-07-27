package com.github.dkurata38.enum_lookup_scala

sealed case class RegistrationStatus(code: String)
object RegistrationStatus {
  case object Temporary extends RegistrationStatus("0")
  case object Regular extends RegistrationStatus("1")
}