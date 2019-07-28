package com.github.dkurata38.enum_lookup_scala.type_value

/**
  * code値で検索可能なEnum定数の集合を表すトレイト
  */
trait EnumSearchableByCode extends Enum {
  type EnumType <: ConstantSearchableByCode
  def searchByCode(code: String): Option[EnumType] = values.find(e => e.code == code)
}

/**
  * code値で検索可能なEnum定数を表す抽象クラス
  */
trait ConstantSearchableByCode extends EnumConstant {
  type CodeType
  val code: CodeType
}

