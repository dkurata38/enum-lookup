package com.github.dkurata38.enum_lookup_scala.type_value

object Main extends App {
  println(RegistrationStatus.searchByCode("1"))
  println(RegistrationStatus.searchByCode("0"))

  println(RegistrationStatus.searchByCode("1").get == RegistrationStatus.searchByCode("1").get)
}
