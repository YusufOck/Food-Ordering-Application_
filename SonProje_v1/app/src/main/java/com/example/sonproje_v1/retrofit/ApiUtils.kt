package com.example.sonproje_v1
class ApiUtils {
    companion object {
        val BASE_URL = "http://kasimadalan.pe.hu"

        fun getYemeklerDao() : YemeklerDao {
            return RetrofitClient.getClient(BASE_URL).create(YemeklerDao::class.java)
        }

        fun getSepetYemeklerDao() : SepetYemeklerDao {
            return RetrofitClient.getClient(BASE_URL).create(SepetYemeklerDao::class.java)
        }
    }
}