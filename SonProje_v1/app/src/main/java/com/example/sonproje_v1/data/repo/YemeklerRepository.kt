package com.example.sonproje_v1
import com.example.sonproje_v1.YemeklerDataSource
import com.example.sonproje_v1.Yemekler

class YemeklerRepository(var yds: YemeklerDataSource) {

    suspend fun tumYemekleriGetir(): List<Yemekler> = yds.tumYemekleriGetir()
}