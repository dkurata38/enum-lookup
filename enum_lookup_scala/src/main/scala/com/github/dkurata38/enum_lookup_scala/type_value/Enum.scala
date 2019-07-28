package com.github.dkurata38.enum_lookup_scala.type_value

/**
  * Enum定数の集合を表すトレイト
  */
abstract class Enum {
  type EnumType <: EnumConstant
  val values: Seq[EnumType]
}

/**
  * Enum定数を表すトレイト
  */
trait EnumConstant