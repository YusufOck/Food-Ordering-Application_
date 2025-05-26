package com.example.sonproje_v1
import com.example.sonproje_v1.YemeklerCevap
import retrofit2.http.GET

interface YemeklerDao {

    @GET("/yemekler/tumYemekleriGetir.php")
    suspend fun  tumYemekleriGetir() : YemeklerCevap

}