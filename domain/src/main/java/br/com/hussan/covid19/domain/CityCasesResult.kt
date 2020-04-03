package br.com.hussan.covid19.domain

import java.io.Serializable

data class CityCasesResult(
    val count: Int,
    val next: Any,
    val previous: Any,
    val results: List<CityCases>
) : Serializable
