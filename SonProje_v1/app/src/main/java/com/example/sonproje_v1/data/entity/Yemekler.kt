package com.example.sonproje_v1
import java.io.Serializable

data class Yemekler(var yemek_id: Int,
                    var yemek_adi: String,
                    var yemek_resim_adi: String,
                    var yemek_fiyat: Int) : Serializable {
}