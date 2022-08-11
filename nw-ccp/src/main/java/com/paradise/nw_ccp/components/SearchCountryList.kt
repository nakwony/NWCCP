package com.paradise.nw_ccp.components

import com.paradise.nw_ccp.utils.CountryCode
import java.util.*

fun List<CountryCode>.searchCountryList(key: String): MutableList<CountryCode> {
    val tempList = mutableListOf<CountryCode>()
    this.forEach {
        if (Locale("", it.countryCode).displayName.lowercase().contains(key.lowercase())) {
            tempList.add(it)
        }
    }
    return tempList
}