package com.github.dkurata38.enum_lookup_scala.type_parameter

trait Enum[E <:EnumConstant] {
  def values: Seq[E]
}

trait EnumConstant