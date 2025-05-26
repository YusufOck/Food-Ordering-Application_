package com.example.sonproje_v1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.sonproje_v1.SepetYemekler
import com.example.sonproje_v1.SepetYemeklerDao
import com.example.sonproje_v1.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.EOFException


class SepetYemeklerDataSource(var sydao: SepetYemeklerDao) {

    val kullanici_adi_kaya = "kayaalpkoker"

    suspend fun sepettekiYemekleriGetir(): List<SepetYemekler> =
        withContext(Dispatchers.IO) {
            try {
                return@withContext sydao.sepettekiYemekleriGetir(kullanici_adi_kaya).sepet_yemekler
            } catch (e: EOFException) {
                return@withContext listOf<SepetYemekler>()
            }
        }

    suspend fun sepeteYemekEkle(yemek_adi: String,
                                yemek_resim_adi: String,
                                yemek_fiyat: Int,
                                yemek_siparis_adet: Int) {
        sydao.sepeteYemekEkle(yemek_adi, yemek_resim_adi, yemek_fiyat, yemek_siparis_adet, kullanici_adi_kaya)
    }

    suspend fun sepettenYemekSil(sepet_yemek_id: Int) {
        sydao.sepettenYemekSil(sepet_yemek_id, kullanici_adi_kaya)
    }

}