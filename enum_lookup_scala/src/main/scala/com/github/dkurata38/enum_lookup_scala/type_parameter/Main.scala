package com.github.dkurata38.enum_lookup_scala.type_parameter

object Main extends App {
  println(RegistrationStatus.searchByCode("1"))
  println(RegistrationStatus.searchByCode("0"))
}
