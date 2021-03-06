package org.jetbrains.kotlin.idea.structuralsearch.filters

import org.jetbrains.kotlin.idea.structuralsearch.KSSRBundle

@Suppress("ComponentNotRegistered")
class VarOnlyFilter : OneStateFilter(
  KSSRBundle.messagePointer("filter.match.only.vars"),
  KSSRBundle.message("label.match.only.vars"),
  CONSTRAINT_NAME
) {

    companion object {
        const val CONSTRAINT_NAME: String = "kotlinVarOnly"
    }

}

@Suppress("ComponentNotRegistered")
class ValOnlyFilter : OneStateFilter(
  KSSRBundle.messagePointer("filter.match.only.vals"),
  KSSRBundle.message("label.match.only.vals"),
  CONSTRAINT_NAME
) {

    companion object {
        const val CONSTRAINT_NAME: String = "kotlinValOnly"
    }

}