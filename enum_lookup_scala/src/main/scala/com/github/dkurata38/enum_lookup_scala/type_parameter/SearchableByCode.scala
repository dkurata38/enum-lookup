package com.github.dkurata38.enum_lookup_scala.type_parameter

abstract class ConstantSearchableByCode[E <: EnumConstant](val code: String) extends EnumConstant

trait EnumSearchableByCode[E <: ConstantSearchableByCode[E]] extends Enum[E] {
  def searchByCode(code: String): Option[E] = values.find(e => e.code == code)
}
