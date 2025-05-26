package com.example.sonproje_v1
import com.example.sonproje_v1.SepetYemeklerDataSource
import com.example.sonproje_v1.SepetYemekler

class SepetYemeklerRepository(var syds: SepetYemeklerDataSource) {

    suspend fun sepettekiYemekleriGetir(): List<SepetYemekler> = syds.sepettekiYemekleriGetir()

    suspend fun sepeteYemekEkle(
        yemek_adi: String,
        yemek_resim_adi: String,
        yemek_fiyat: Int,
        yemek_siparis_adet: Int
    ) = syds.sepeteYemekEkle(yemek_adi, yemek_resim_adi, yemek_fiyat, yemek_siparis_adet)

    suspend fun sepettenYemekSil(sepet_yemek_id: Int) = syds.sepettenYemekSil(sepet_yemek_id)

}