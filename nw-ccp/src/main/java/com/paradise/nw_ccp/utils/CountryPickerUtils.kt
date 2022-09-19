package com.paradise.nw_ccp.utils

import com.paradise.nw_ccp.R
import java.util.*

data class CountryCode(
    var countryCode: String,
    val countryPhoneCode: String = "",
    val countryName: String = "",
    val flagResID: Int = 0
)

fun getFlagMasterResID(countryName: String): Int {
    return when (countryName) {
        "ad" -> R.drawable.flag_ad
        "ae" -> R.drawable.flag_ae
        "af" -> R.drawable.flag_af
        "ag" -> R.drawable.flag_ag
        "ai" -> R.drawable.flag_ai
        "al" -> R.drawable.flag_al
        "am" -> R.drawable.flag_am
        "ao" -> R.drawable.flag_ao
//        "aq" -> R.drawable.flag_antarctica
        "ar" -> R.drawable.flag_ar
        "as" -> R.drawable.flag_as
        "at" -> R.drawable.flag_at
        "au" -> R.drawable.flag_au
        "aw" -> R.drawable.flag_aw
        "ax" -> R.drawable.flag_ax
        "az" -> R.drawable.flag_az
        "ba" -> R.drawable.flag_ba
        "bb" -> R.drawable.flag_bb
        "bd" -> R.drawable.flag_bd
        "be" -> R.drawable.flag_be
        "bf" -> R.drawable.flag_bf
        "bg" -> R.drawable.flag_bg
        "bh" -> R.drawable.flag_bh
        "bi" -> R.drawable.flag_bi
        "bj" -> R.drawable.flag_bj
        "bl" -> R.drawable.flag_bl // custom
        "bm" -> R.drawable.flag_bm
        "bn" -> R.drawable.flag_bn
        "bo" -> R.drawable.flag_bo
        "br" -> R.drawable.flag_br
        "bs" -> R.drawable.flag_bs
        "bt" -> R.drawable.flag_bt
        "bw" -> R.drawable.flag_bw
        "by" -> R.drawable.flag_by
        "bz" -> R.drawable.flag_bz
        "ca" -> R.drawable.flag_ca
        "cc" -> R.drawable.flag_cc // custom
        "cd" -> R.drawable.flag_cd
        "cf" -> R.drawable.flag_cf
        "cg" -> R.drawable.flag_cg
        "ch" -> R.drawable.flag_ch
        "ci" -> R.drawable.flag_ci
        "ck" -> R.drawable.flag_ck
        "cl" -> R.drawable.flag_cl
        "cm" -> R.drawable.flag_cm
        "cn" -> R.drawable.flag_cn
        "co" -> R.drawable.flag_co
        "cr" -> R.drawable.flag_cr
        "cu" -> R.drawable.flag_cu
        "cv" -> R.drawable.flag_cv
        "cw" -> R.drawable.flag_cw
        "cx" -> R.drawable.flag_cx
        "cy" -> R.drawable.flag_cy
        "cz" -> R.drawable.flag_cz
        "de" -> R.drawable.flag_de
        "dj" -> R.drawable.flag_dj
        "dk" -> R.drawable.flag_dk
        "dm" -> R.drawable.flag_dm
        "do" -> R.drawable.flag_do
        "dz" -> R.drawable.flag_dz
        "ec" -> R.drawable.flag_ec
        "ee" -> R.drawable.flag_ee
        "eg" -> R.drawable.flag_eg
        "er" -> R.drawable.flag_er
        "es" -> R.drawable.flag_es
        "et" -> R.drawable.flag_et
        "fi" -> R.drawable.flag_fi
        "fj" -> R.drawable.flag_fj
        "fk" -> R.drawable.flag_fk
        "fm" -> R.drawable.flag_fm
        "fo" -> R.drawable.flag_fo
        "fr" -> R.drawable.flag_fr
        "ga" -> R.drawable.flag_ga
        "gb" -> R.drawable.flag_gb
        "gd" -> R.drawable.flag_gd
        "ge" -> R.drawable.flag_ge
        "gf" -> R.drawable.flag_gf
        "gg" -> R.drawable.flag_gg
        "gh" -> R.drawable.flag_gh
        "gi" -> R.drawable.flag_gi
        "gl" -> R.drawable.flag_gl
        "gm" -> R.drawable.flag_gm
        "gn" -> R.drawable.flag_gn
        "gp" -> R.drawable.flag_gp
        "gq" -> R.drawable.flag_gq
        "gr" -> R.drawable.flag_gr
        "gt" -> R.drawable.flag_gt
        "gu" -> R.drawable.flag_gu
        "gw" -> R.drawable.flag_gw
        "gy" -> R.drawable.flag_gy
        "hk" -> R.drawable.flag_hk
        "hn" -> R.drawable.flag_hn
        "hr" -> R.drawable.flag_hr
        "ht" -> R.drawable.flag_ht
        "hu" -> R.drawable.flag_hu
        "id" -> R.drawable.flag_id
        "ie" -> R.drawable.flag_ie
        "im" -> R.drawable.flag_im // custom
        "is" -> R.drawable.flag_is
        "in" -> R.drawable.flag_in
        "io" -> R.drawable.flag_io
        "iq" -> R.drawable.flag_iq
        "ir" -> R.drawable.flag_ir
        "it" -> R.drawable.flag_it
        "je" -> R.drawable.flag_je
        "jm" -> R.drawable.flag_jm
        "jo" -> R.drawable.flag_jo
        "jp" -> R.drawable.flag_jp
        "ke" -> R.drawable.flag_ke
        "kg" -> R.drawable.flag_kg
        "kh" -> R.drawable.flag_kh
        "ki" -> R.drawable.flag_ki
        "km" -> R.drawable.flag_km
        "kn" -> R.drawable.flag_kn
        "kp" -> R.drawable.flag_kp
        "kr" -> R.drawable.flag_kr
        "kw" -> R.drawable.flag_kw
        "ky" -> R.drawable.flag_ky
        "kz" -> R.drawable.flag_kz
        "la" -> R.drawable.flag_la
        "lb" -> R.drawable.flag_lb
        "lc" -> R.drawable.flag_lc
        "li" -> R.drawable.flag_li
        "lk" -> R.drawable.flag_lk
        "lr" -> R.drawable.flag_lr
        "ls" -> R.drawable.flag_ls
        "lt" -> R.drawable.flag_lt
        "lu" -> R.drawable.flag_lu
        "lv" -> R.drawable.flag_lv
        "ly" -> R.drawable.flag_ly
        "ma" -> R.drawable.flag_ma
        "mc" -> R.drawable.flag_mc
        "md" -> R.drawable.flag_md
        "me" -> R.drawable.flag_me // custom
        "mf" -> R.drawable.flag_mf
        "mg" -> R.drawable.flag_mg
        "mh" -> R.drawable.flag_mh
        "mk" -> R.drawable.flag_mk
        "ml" -> R.drawable.flag_ml
        "mm" -> R.drawable.flag_mm
        "mn" -> R.drawable.flag_mn
        "mo" -> R.drawable.flag_mo
        "mp" -> R.drawable.flag_mp
        "mq" -> R.drawable.flag_mq
        "mr" -> R.drawable.flag_mr
        "ms" -> R.drawable.flag_ms
        "mt" -> R.drawable.flag_mt
        "mu" -> R.drawable.flag_mu
        "mv" -> R.drawable.flag_mv
        "mw" -> R.drawable.flag_mw
        "mx" -> R.drawable.flag_mx
        "my" -> R.drawable.flag_my
        "mz" -> R.drawable.flag_mz
        "na" -> R.drawable.flag_na
        "nc" -> R.drawable.flag_nc // custom
        "ne" -> R.drawable.flag_ne
        "nf" -> R.drawable.flag_nf
        "ng" -> R.drawable.flag_ng
        "ni" -> R.drawable.flag_ni
        "nl" -> R.drawable.flag_nl
        "no" -> R.drawable.flag_no
        "np" -> R.drawable.flag_np
        "nr" -> R.drawable.flag_nr
        "nu" -> R.drawable.flag_nu
        "nz" -> R.drawable.flag_nz
        "om" -> R.drawable.flag_om
        "pa" -> R.drawable.flag_pa
        "pe" -> R.drawable.flag_pe
        "pf" -> R.drawable.flag_pf
        "pg" -> R.drawable.flag_pg
        "ph" -> R.drawable.flag_ph
        "pk" -> R.drawable.flag_pk
        "pl" -> R.drawable.flag_pl
        "pm" -> R.drawable.flag_pm
        "pn" -> R.drawable.flag_pn
        "pr" -> R.drawable.flag_pr
        "ps" -> R.drawable.flag_ps
        "pt" -> R.drawable.flag_pt
        "pw" -> R.drawable.flag_pw
        "py" -> R.drawable.flag_py
        "qa" -> R.drawable.flag_qa
        "re" -> R.drawable.flag_re // no exact flag found
        "ro" -> R.drawable.flag_ro
        "rs" -> R.drawable.flag_rs // custom
        "ru" -> R.drawable.flag_ru
        "rw" -> R.drawable.flag_rw
        "sa" -> R.drawable.flag_sa
        "sb" -> R.drawable.flag_sb
        "sc" -> R.drawable.flag_sc
        "sd" -> R.drawable.flag_sd
        "se" -> R.drawable.flag_se
        "sg" -> R.drawable.flag_sg
        "sh" -> R.drawable.flag_sh // custom
        "si" -> R.drawable.flag_si
        "sk" -> R.drawable.flag_sk
        "sl" -> R.drawable.flag_sl
        "sm" -> R.drawable.flag_sm
        "sn" -> R.drawable.flag_sn
        "so" -> R.drawable.flag_so
        "sr" -> R.drawable.flag_sr
        "ss" -> R.drawable.flag_ss
        "st" -> R.drawable.flag_st
        "sv" -> R.drawable.flag_sv
        "sx" -> R.drawable.flag_sx
        "sy" -> R.drawable.flag_sy
        "sz" -> R.drawable.flag_sz
        "tc" -> R.drawable.flag_tc
        "td" -> R.drawable.flag_td
        "tg" -> R.drawable.flag_tg
        "th" -> R.drawable.flag_th
        "tj" -> R.drawable.flag_tj
        "tk" -> R.drawable.flag_tk // custom
        "tl" -> R.drawable.flag_tl
        "tm" -> R.drawable.flag_tm
        "tn" -> R.drawable.flag_tn
        "to" -> R.drawable.flag_to
        "tr" -> R.drawable.flag_tr
        "tt" -> R.drawable.flag_tt
        "tv" -> R.drawable.flag_tv
        "tw" -> R.drawable.flag_tw
        "tz" -> R.drawable.flag_tz
        "ua" -> R.drawable.flag_ua
        "ug" -> R.drawable.flag_ug
        "us" -> R.drawable.flag_us
        "uy" -> R.drawable.flag_uy
        "uz" -> R.drawable.flag_uz
        "va" -> R.drawable.flag_va
        "vc" -> R.drawable.flag_vc
        "ve" -> R.drawable.flag_ve
        "vg" -> R.drawable.flag_vg
        "vi" -> R.drawable.flag_gi
        "vn" -> R.drawable.flag_vn
        "vu" -> R.drawable.flag_vu
        "wf" -> R.drawable.flag_wf
        "ws" -> R.drawable.flag_ws
//        "xk" -> R.drawable.flag_kosovo
        "ye" -> R.drawable.flag_ye
        "yt" -> R.drawable.flag_yt // no exact flag found
        "za" -> R.drawable.flag_za
        "zm" -> R.drawable.flag_zm
        "zw" -> R.drawable.flag_zw
        else -> R.drawable.flag_transparent
    }
}

internal fun getFlagEmoji(countryName: String): String {
    return when (countryName) {
        "ad" -> "🇦🇩"
        "ae" -> "🇦🇪"
        "af" -> "🇦🇫"
        "ag" -> "🇦🇬"
        "ai" -> "🇦🇮"
        "al" -> "🇦🇱"
        "am" -> "🇦🇲"
        "ao" -> "🇦🇴"
//        "aq" -> "🇦🇶"
        "ar" -> "🇦🇷"
        "as" -> "🇦🇸"
        "at" -> "🇦🇹"
        "au" -> "🇦🇺"
        "aw" -> "🇦🇼"
        "ax" -> "🇦🇽"
        "az" -> "🇦🇿"
        "ba" -> "🇧🇦"
        "bb" -> "🇧🇧"
        "bd" -> "🇧🇩"
        "be" -> "🇧🇪"
        "bf" -> "🇧🇫"
        "bg" -> "🇧🇬"
        "bh" -> "🇧🇭"
        "bi" -> "🇧🇮"
        "bj" -> "🇧🇯"
        "bl" -> "🇧🇱"
        "bm" -> "🇧🇲"
        "bn" -> "🇧🇳"
        "bo" -> "🇧🇴"
        "bq" -> "🇧🇶"
        "br" -> "🇧🇷"
        "bs" -> "🇧🇸"
        "bt" -> "🇧🇹"
        "bv" -> "🇧🇻"
        "bw" -> "🇧🇼"
        "by" -> "🇧🇾"
        "bz" -> "🇧🇿"
        "ca" -> "🇨🇦"
        "cc" -> "🇨🇨"
        "cd" -> "🇨🇩"
        "cf" -> "🇨🇫"
        "cg" -> "🇨🇬"
        "ch" -> "🇨🇭"
        "ci" -> "🇨🇮"
        "ck" -> "🇨🇰"
        "cl" -> "🇨🇱"
        "cm" -> "🇨🇲"
        "cn" -> "🇨🇳"
        "co" -> "🇨🇴"
        "cr" -> "🇨🇷"
        "cu" -> "🇨🇺"
        "cv" -> "🇨🇻"
        "cw" -> "🇨🇼"
        "cx" -> "🇨🇽"
        "cy" -> "🇨🇾"
        "cz" -> "🇨🇿"
        "de" -> "🇩🇪"
        "dj" -> "🇩🇯"
        "dk" -> "🇩🇰"
        "dm" -> "🇩🇲"
        "do" -> "🇩🇴"
        "dz" -> "🇩🇿"
        "ec" -> "🇪🇨"
        "ee" -> "🇪🇪"
        "eg" -> "🇪🇬"
        "eh" -> "🇪🇭"
        "er" -> "🇪🇷"
        "es" -> "🇪🇸"
        "et" -> "🇪🇹"
        "fi" -> "🇫🇮"
        "fj" -> "🇫🇯"
        "fk" -> "🇫🇰"
        "fm" -> "🇫🇲"
        "fo" -> "🇫🇴"
        "fr" -> "🇫🇷"
        "ga" -> "🇬🇦"
        "gb" -> "🇬🇧"
        "gd" -> "🇬🇩"
        "ge" -> "🇬🇪"
        "gf" -> "🇬🇫"
        "gg" -> "🇬🇬"
        "gh" -> "🇬🇭"
        "gi" -> "🇬🇮"
        "gl" -> "🇬🇱"
        "gm" -> "🇬🇲"
        "gn" -> "🇬🇳"
        "gp" -> "🇬🇵"
        "gq" -> "🇬🇶"
        "gr" -> "🇬🇷"
        "gs" -> "🇬🇸"
        "gt" -> "🇬🇹"
        "gu" -> "🇬🇺"
        "gw" -> "🇬🇼"
        "gy" -> "🇬🇾"
        "hk" -> "🇭🇰"
        "hm" -> "🇭🇲"
        "hn" -> "🇭🇳"
        "hr" -> "🇭🇷"
        "ht" -> "🇭🇹"
        "hu" -> "🇭🇺"
        "id" -> "🇮🇩"
        "ie" -> "🇮🇪"
        "im" -> "🇮🇲"
        "in" -> "🇮🇳"
        "io" -> "🇮🇴"
        "iq" -> "🇮🇶"
        "ir" -> "🇮🇷"
        "is" -> "🇮🇸"
        "it" -> "🇮🇹"
        "je" -> "🇯🇪"
        "jm" -> "🇯🇲"
        "jo" -> "🇯🇴"
        "jp" -> "🇯🇵"
        "ke" -> "🇰🇪"
        "kg" -> "🇰🇬"
        "kh" -> "🇰🇭"
        "ki" -> "🇰🇮"
        "km" -> "🇰🇲"
        "kn" -> "🇰🇳"
        "kp" -> "🇰🇵"
        "kr" -> "🇰🇷"
        "kw" -> "🇰🇼"
        "ky" -> "🇰🇾"
        "kz" -> "🇰🇿"
        "la" -> "🇱🇦"
        "lb" -> "🇱🇧"
        "lc" -> "🇱🇨"
        "li" -> "🇱🇮"
        "lk" -> "🇱🇰"
        "lr" -> "🇱🇷"
        "ls" -> "🇱🇸"
        "lt" -> "🇱🇹"
        "lu" -> "🇱🇺"
        "lv" -> "🇱🇻"
        "ly" -> "🇱🇾"
        "ma" -> "🇲🇦"
        "mc" -> "🇲🇨"
        "md" -> "🇲🇩"
        "me" -> "🇲🇪"
        "mf" -> "🇲🇫"
        "mg" -> "🇲🇬"
        "mh" -> "🇲🇭"
        "mk" -> "🇲🇰"
        "ml" -> "🇲🇱"
        "mm" -> "🇲🇲"
        "mn" -> "🇲🇳"
        "mo" -> "🇲🇴"
        "mp" -> "🇲🇵"
        "mq" -> "🇲🇶"
        "mr" -> "🇲🇷"
        "ms" -> "🇲🇸"
        "mt" -> "🇲🇹"
        "mu" -> "🇲🇺"
        "mv" -> "🇲🇻"
        "mw" -> "🇲🇼"
        "mx" -> "🇲🇽"
        "my" -> "🇲🇾"
        "mz" -> "🇲🇿"
        "na" -> "🇳🇦"
        "nc" -> "🇳🇨"
        "ne" -> "🇳🇪"
        "nf" -> "🇳🇫"
        "ng" -> "🇳🇬"
        "ni" -> "🇳🇮"
        "nl" -> "🇳🇱"
        "no" -> "🇳🇴"
        "np" -> "🇳🇵"
        "nr" -> "🇳🇷"
        "nu" -> "🇳🇺"
        "nz" -> "🇳🇿"
        "om" -> "🇴🇲"
        "pa" -> "🇵🇦"
        "pe" -> "🇵🇪"
        "pf" -> "🇵🇫"
        "pg" -> "🇵🇬"
        "ph" -> "🇵🇭"
        "pk" -> "🇵🇰"
        "pl" -> "🇵🇱"
        "pm" -> "🇵🇲"
        "pn" -> "🇵🇳"
        "pr" -> "🇵🇷"
        "ps" -> "🇵🇸"
        "pt" -> "🇵🇹"
        "pw" -> "🇵🇼"
        "py" -> "🇵🇾"
        "qa" -> "🇶🇦"
        "re" -> "🇷🇪"
        "ro" -> "🇷🇴"
        "rs" -> "🇷🇸"
        "ru" -> "🇷🇺"
        "rw" -> "🇷🇼"
        "sa" -> "🇸🇦"
        "sb" -> "🇸🇧"
        "sc" -> "🇸🇨"
        "sd" -> "🇸🇩"
        "se" -> "🇸🇪"
        "sg" -> "🇸🇬"
        "sh" -> "🇸🇭"
        "si" -> "🇸🇮"
        "sj" -> "🇸🇯"
        "sk" -> "🇸🇰"
        "sl" -> "🇸🇱"
        "sm" -> "🇸🇲"
        "sn" -> "🇸🇳"
        "so" -> "🇸🇴"
        "sr" -> "🇸🇷"
        "ss" -> "🇸🇸"
        "st" -> "🇸🇹"
        "sv" -> "🇸🇻"
        "sx" -> "🇸🇽"
        "sy" -> "🇸🇾"
        "sz" -> "🇸🇿"
        "tc" -> "🇹🇨"
        "td" -> "🇹🇩"
        "tf" -> "🇹🇫"
        "tg" -> "🇹🇬"
        "th" -> "🇹🇭"
        "tj" -> "🇹🇯"
        "tk" -> "🇹🇰"
        "tl" -> "🇹🇱"
        "tm" -> "🇹🇲"
        "tn" -> "🇹🇳"
        "to" -> "🇹🇴"
        "tr" -> "🇹🇷"
        "tt" -> "🇹🇹"
        "tv" -> "🇹🇻"
        "tw" -> "🇹🇼"
        "tz" -> "🇹🇿"
        "ua" -> "🇺🇦"
        "ug" -> "🇺🇬"
        "um" -> "🇺🇲"
        "us" -> "🇺🇸"
        "uy" -> "🇺🇾"
        "uz" -> "🇺🇿"
        "va" -> "🇻🇦"
        "vc" -> "🇻🇨"
        "ve" -> "🇻🇪"
        "vg" -> "🇻🇬"
        "vi" -> "🇻🇮"
        "vn" -> "🇻🇳"
        "vu" -> "🇻🇺"
        "wf" -> "🇼🇫"
        "ws" -> "🇼🇸"
//        "xk" -> "🇽🇰"
        "ye" -> "🇾🇪"
        "yt" -> "🇾🇹"
        "za" -> "🇿🇦"
        "zm" -> "🇿🇲"
        "zw" -> "🇿🇼"
        else -> " "
    }
}

fun getListCountries(): List<CountryCode> {
    val countries: MutableList<CountryCode> = ArrayList()
    countries.add(CountryCode("ad", "+376", "Andorra"))
    countries.add(CountryCode("ae", "+971", "United Arab Emirates (UAE)"))
    countries.add(CountryCode("af", "+93", "Afghanistan"))
    countries.add(CountryCode("ag", "+1", "Antigua and Barbuda"))
    countries.add(CountryCode("ai", "+1", "Anguilla"))
    countries.add(CountryCode("al", "+355", "Albania"))
    countries.add(CountryCode("am", "+374", "Armenia"))
    countries.add(CountryCode("ao", "+244", "Angola"))
//    countries.add(CountryCode("aq", "+672", "Antarctica"))
    countries.add(CountryCode("ar", "+54", "Argentina"))
    countries.add(CountryCode("as", "+1", "American Samoa"))
    countries.add(CountryCode("at", "+43", "Austria"))
    countries.add(CountryCode("au", "+61", "Australia"))
    countries.add(CountryCode("aw", "+297", "Aruba"))
    countries.add(CountryCode("ax", "+358", "Åland Islands"))
    countries.add(CountryCode("az", "+994", "Azerbaijan"))
    countries.add(CountryCode("ba", "+387", "Bosnia And Herzegovina"))
    countries.add(CountryCode("bb", "+1", "Barbados"))
    countries.add(CountryCode("bd", "+880", "Bangladesh"))
    countries.add(CountryCode("be", "+32", "Belgium"))
    countries.add(CountryCode("bf", "+226", "Burkina Faso"))
    countries.add(CountryCode("bg", "+359", "Bulgaria"))
    countries.add(CountryCode("bh", "+973", "Bahrain"))
    countries.add(CountryCode("bi", "+257", "Burundi"))
    countries.add(CountryCode("bj", "+229", "Benin"))
    countries.add(CountryCode("bl", "+590", "Saint Barthélemy"))
    countries.add(CountryCode("bm", "+1", "Bermuda"))
    countries.add(CountryCode("bn", "+673", "Brunei Darussalam"))
    countries.add(CountryCode("bo", "+591", "Bolivia, Plurinational State Of"))
    countries.add(CountryCode("br", "+55", "Brazil"))
    countries.add(CountryCode("bs", "+1", "Bahamas"))
    countries.add(CountryCode("bt", "+975", "Bhutan"))
    countries.add(CountryCode("bw", "+267", "Botswana"))
    countries.add(CountryCode("by", "+375", "Belarus"))
    countries.add(CountryCode("bz", "+501", "Belize"))
    countries.add(CountryCode("ca", "+1", "Canada"))
    countries.add(CountryCode("cc", "+61", "Cocos (keeling) Islands"))
    countries.add(CountryCode("cd", "+243", "Congo, The Democratic Republic Of The"))
    countries.add(CountryCode("cf", "+236", "Central African Republic"))
    countries.add(CountryCode("cg", "+242", "Congo"))
    countries.add(CountryCode("ch", "+41", "Switzerland"))
    countries.add(CountryCode("ci", "+225", "Côte D'ivoire"))
    countries.add(CountryCode("ck", "+682", "Cook Islands"))
    countries.add(CountryCode("cl", "+56", "Chile"))
    countries.add(CountryCode("cm", "+237", "Cameroon"))
    countries.add(CountryCode("cn", "+86", "China"))
    countries.add(CountryCode("co", "+57", "Colombia"))
    countries.add(CountryCode("cr", "+506", "Costa Rica"))
    countries.add(CountryCode("cu", "+53", "Cuba"))
    countries.add(CountryCode("cv", "+238", "Cape Verde"))
    countries.add(CountryCode("cw", "+599", "Curaçao"))
    countries.add(CountryCode("cx", "+61", "Christmas Island"))
    countries.add(CountryCode("cy", "+357", "Cyprus"))
    countries.add(CountryCode("cz", "+420", "Czech Republic"))
    countries.add(CountryCode("de", "+49", "Germany"))
    countries.add(CountryCode("dj", "+253", "Djibouti"))
    countries.add(CountryCode("dk", "+45", "Denmark"))
    countries.add(CountryCode("dm", "+1", "Dominica"))
    countries.add(CountryCode("do", "+1", "Dominican Republic"))
    countries.add(CountryCode("dz", "+213", "Algeria"))
    countries.add(CountryCode("ec", "+593", "Ecuador"))
    countries.add(CountryCode("ee", "+372", "Estonia"))
    countries.add(CountryCode("eg", "+20", "Egypt"))
    countries.add(CountryCode("er", "+291", "Eritrea"))
    countries.add(CountryCode("es", "+34", "Spain"))
    countries.add(CountryCode("et", "+251", "Ethiopia"))
    countries.add(CountryCode("fi", "+358", "Finland"))
    countries.add(CountryCode("fj", "+679", "Fiji"))
    countries.add(CountryCode("fk", "+500", "Falkland Islands (malvinas)"))
    countries.add(CountryCode("fm", "+691", "Micronesia, Federated States Of"))
    countries.add(CountryCode("fo", "+298", "Faroe Islands"))
    countries.add(CountryCode("fr", "+33", "France"))
    countries.add(CountryCode("ga", "+241", "Gabon"))
    countries.add(CountryCode("gb", "+44", "United Kingdom"))
    countries.add(CountryCode("gd", "+1", "Grenada"))
    countries.add(CountryCode("ge", "+995", "Georgia"))
    countries.add(CountryCode("gf", "+594", "French Guyana"))
    countries.add(CountryCode("gh", "+233", "Ghana"))
    countries.add(CountryCode("gi", "+350", "Gibraltar"))
    countries.add(CountryCode("gl", "+299", "Greenland"))
    countries.add(CountryCode("gm", "+220", "Gambia"))
    countries.add(CountryCode("gn", "+224", "Guinea"))
    countries.add(CountryCode("gp", "+450", "Guadeloupe"))
    countries.add(CountryCode("gq", "+240", "Equatorial Guinea"))
    countries.add(CountryCode("gr", "+30", "Greece"))
    countries.add(CountryCode("gt", "+502", "Guatemala"))
    countries.add(CountryCode("gu", "+1", "Guam"))
    countries.add(CountryCode("gw", "+245", "Guinea-bissau"))
    countries.add(CountryCode("gy", "+592", "Guyana"))
    countries.add(CountryCode("hk", "+852", "Hong Kong"))
    countries.add(CountryCode("hn", "+504", "Honduras"))
    countries.add(CountryCode("hr", "+385", "Croatia"))
    countries.add(CountryCode("ht", "+509", "Haiti"))
    countries.add(CountryCode("hu", "+36", "Hungary"))
    countries.add(CountryCode("id", "+62", "Indonesia"))
    countries.add(CountryCode("ie", "+353", "Ireland"))
    countries.add(CountryCode("im", "+44", "Isle Of Man"))
    countries.add(CountryCode("is", "+354", "Iceland"))
    countries.add(CountryCode("in", "+91", "India"))
    countries.add(CountryCode("io", "+246", "British Indian Ocean Territory"))
    countries.add(CountryCode("iq", "+964", "Iraq"))
    countries.add(CountryCode("ir", "+98", "Iran, Islamic Republic Of"))
    countries.add(CountryCode("it", "+39", "Italy"))
    countries.add(CountryCode("je", "+44", "Jersey "))
    countries.add(CountryCode("jm", "+1", "Jamaica"))
    countries.add(CountryCode("jo", "+962", "Jordan"))
    countries.add(CountryCode("jp", "+81", "Japan"))
    countries.add(CountryCode("ke", "+254", "Kenya"))
    countries.add(CountryCode("kg", "+996", "Kyrgyzstan"))
    countries.add(CountryCode("kh", "+855", "Cambodia"))
    countries.add(CountryCode("ki", "+686", "Kiribati"))
    countries.add(CountryCode("km", "+269", "Comoros"))
    countries.add(CountryCode("kn", "+1", "Saint Kitts and Nevis"))
    countries.add(CountryCode("kp", "+850", "North Korea"))
    countries.add(CountryCode("kr", "+82", "South Korea"))
    countries.add(CountryCode("kw", "+965", "Kuwait"))
    countries.add(CountryCode("ky", "+1", "Cayman Islands"))
    countries.add(CountryCode("kz", "+7", "Kazakhstan"))
    countries.add(CountryCode("la", "+856", "Lao People's Democratic Republic"))
    countries.add(CountryCode("lb", "+961", "Lebanon"))
    countries.add(CountryCode("lc", "+1", "Saint Lucia"))
    countries.add(CountryCode("li", "+423", "Liechtenstein"))
    countries.add(CountryCode("lk", "+94", "Sri Lanka"))
    countries.add(CountryCode("lr", "+231", "Liberia"))
    countries.add(CountryCode("ls", "+266", "Lesotho"))
    countries.add(CountryCode("lt", "+370", "Lithuania"))
    countries.add(CountryCode("lu", "+352", "Luxembourg"))
    countries.add(CountryCode("lv", "+371", "Latvia"))
    countries.add(CountryCode("ly", "+218", "Libya"))
    countries.add(CountryCode("ma", "+212", "Morocco"))
    countries.add(CountryCode("mc", "+377", "Monaco"))
    countries.add(CountryCode("md", "+373", "Moldova, Republic Of"))
    countries.add(CountryCode("me", "+382", "Montenegro"))
    countries.add(CountryCode("mf", "+590", "Saint Martin"))
    countries.add(CountryCode("mg", "+261", "Madagascar"))
    countries.add(CountryCode("mh", "+692", "Marshall Islands"))
    countries.add(CountryCode("mk", "+389", "Macedonia (FYROM)"))
    countries.add(CountryCode("ml", "+223", "Mali"))
    countries.add(CountryCode("mm", "+95", "Myanmar"))
    countries.add(CountryCode("mn", "+976", "Mongolia"))
    countries.add(CountryCode("mo", "+853", "Macau"))
    countries.add(CountryCode("mp", "+1", "Northern Mariana Islands"))
    countries.add(CountryCode("mq", "+596", "Martinique"))
    countries.add(CountryCode("mr", "+222", "Mauritania"))
    countries.add(CountryCode("ms", "+1", "Montserrat"))
    countries.add(CountryCode("mt", "+356", "Malta"))
    countries.add(CountryCode("mu", "+230", "Mauritius"))
    countries.add(CountryCode("mv", "+960", "Maldives"))
    countries.add(CountryCode("mw", "+265", "Malawi"))
    countries.add(CountryCode("mx", "+52", "Mexico"))
    countries.add(CountryCode("my", "+60", "Malaysia"))
    countries.add(CountryCode("mz", "+258", "Mozambique"))
    countries.add(CountryCode("na", "+264", "Namibia"))
    countries.add(CountryCode("nc", "+687", "New Caledonia"))
    countries.add(CountryCode("ne", "+227", "Niger"))
    countries.add(CountryCode("nf", "+672", "Norfolk Islands"))
    countries.add(CountryCode("ng", "+234", "Nigeria"))
    countries.add(CountryCode("ni", "+505", "Nicaragua"))
    countries.add(CountryCode("nl", "+31", "Netherlands"))
    countries.add(CountryCode("no", "+47", "Norway"))
    countries.add(CountryCode("np", "+977", "Nepal"))
    countries.add(CountryCode("nr", "+674", "Nauru"))
    countries.add(CountryCode("nu", "+683", "Niue"))
    countries.add(CountryCode("nz", "+64", "New Zealand"))
    countries.add(CountryCode("om", "+968", "Oman"))
    countries.add(CountryCode("pa", "+507", "Panama"))
    countries.add(CountryCode("pe", "+51", "Peru"))
    countries.add(CountryCode("pf", "+689", "French Polynesia"))
    countries.add(CountryCode("pg", "+675", "Papua New Guinea"))
    countries.add(CountryCode("ph", "+63", "Philippines"))
    countries.add(CountryCode("pk", "+92", "Pakistan"))
    countries.add(CountryCode("pl", "+48", "Poland"))
    countries.add(CountryCode("pm", "+508", "Saint Pierre And Miquelon"))
    countries.add(CountryCode("pn", "+870", "Pitcairn Islands"))
    countries.add(CountryCode("pr", "+1", "Puerto Rico"))
    countries.add(CountryCode("ps", "+970", "Palestine"))
    countries.add(CountryCode("pt", "+351", "Portugal"))
    countries.add(CountryCode("pw", "+680", "Palau"))
    countries.add(CountryCode("py", "+595", "Paraguay"))
    countries.add(CountryCode("qa", "+974", "Qatar"))
    countries.add(CountryCode("re", "+262", "Réunion"))
    countries.add(CountryCode("ro", "+40", "Romania"))
    countries.add(CountryCode("rs", "+381", "Serbia"))
    countries.add(CountryCode("ru", "+7", "Russian Federation"))
    countries.add(CountryCode("rw", "+250", "Rwanda"))
    countries.add(CountryCode("sa", "+966", "Saudi Arabia"))
    countries.add(CountryCode("sb", "+677", "Solomon Islands"))
    countries.add(CountryCode("sc", "+248", "Seychelles"))
    countries.add(CountryCode("sd", "+249", "Sudan"))
    countries.add(CountryCode("se", "+46", "Sweden"))
    countries.add(CountryCode("sg", "+65", "Singapore"))
    countries.add(CountryCode("sh", "+290", "Saint Helena, Ascension And Tristan Da Cunha"))
    countries.add(CountryCode("si", "+386", "Slovenia"))
    countries.add(CountryCode("sk", "+421", "Slovakia"))
    countries.add(CountryCode("sl", "+232", "Sierra Leone"))
    countries.add(CountryCode("sm", "+378", "San Marino"))
    countries.add(CountryCode("sn", "+221", "Senegal"))
    countries.add(CountryCode("so", "+252", "Somalia"))
    countries.add(CountryCode("sr", "+597", "Suriname"))
    countries.add(CountryCode("ss", "+211", "South Sudan"))
    countries.add(CountryCode("st", "+239", "Sao Tome And Principe"))
    countries.add(CountryCode("sv", "+503", "El Salvador"))
    countries.add(CountryCode("sx", "+1", "Sint Maarten"))
    countries.add(CountryCode("sy", "+963", "Syrian Arab Republic"))
    countries.add(CountryCode("sz", "+268", "Swaziland"))
    countries.add(CountryCode("tc", "+1", "Turks and Caicos Islands"))
    countries.add(CountryCode("td", "+235", "Chad"))
    countries.add(CountryCode("tg", "+228", "Togo"))
    countries.add(CountryCode("th", "+66", "Thailand"))
    countries.add(CountryCode("tj", "+992", "Tajikistan"))
    countries.add(CountryCode("tk", "+690", "Tokelau"))
    countries.add(CountryCode("tl", "+670", "Timor-leste"))
    countries.add(CountryCode("tm", "+993", "Turkmenistan"))
    countries.add(CountryCode("tn", "+216", "Tunisia"))
    countries.add(CountryCode("to", "+676", "Tonga"))
    countries.add(CountryCode("tr", "+90", "Turkey"))
    countries.add(CountryCode("tt", "+1", "Trinidad &amp; Tobago"))
    countries.add(CountryCode("tv", "+688", "Tuvalu"))
    countries.add(CountryCode("tw", "+886", "Taiwan"))
    countries.add(CountryCode("tz", "+255", "Tanzania, United Republic Of"))
    countries.add(CountryCode("ua", "+380", "Ukraine"))
    countries.add(CountryCode("ug", "+256", "Uganda"))
    countries.add(CountryCode("us", "+1", "United States"))
    countries.add(CountryCode("uy", "+598", "Uruguay"))
    countries.add(CountryCode("uz", "+998", "Uzbekistan"))
    countries.add(CountryCode("va", "+379", "Holy See (vatican City State)"))
    countries.add(CountryCode("vc", "+1", "Saint Vincent &amp; The Grenadines"))
    countries.add(CountryCode("ve", "+58", "Venezuela, Bolivarian Republic Of"))
    countries.add(CountryCode("vg", "+1", "British Virgin Islands"))
    countries.add(CountryCode("vi", "+1", "US Virgin Islands"))
    countries.add(CountryCode("vn", "+84", "Vietnam"))
    countries.add(CountryCode("vu", "+678", "Vanuatu"))
    countries.add(CountryCode("wf", "+681", "Wallis And Futuna"))
    countries.add(CountryCode("ws", "4685", "Samoa"))
//    countries.add(CountryCode("xk", "+383", "Kosovo"))
    countries.add(CountryCode("ye", "+967", "Yemen"))
    countries.add(CountryCode("yt", "+262", "Mayotte"))
    countries.add(CountryCode("za", "+27", "South Africa"))
    countries.add(CountryCode("zm", "+260", "Zambia"))
    countries.add(CountryCode("zw", "+263", "Zimbabwe"))
    return countries
}