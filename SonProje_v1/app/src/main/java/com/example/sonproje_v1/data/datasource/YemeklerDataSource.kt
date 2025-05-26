package com.example.sonproje_v1
import com.example.sonproje_v1.Yemekler
import com.example.sonproje_v1.YemeklerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YemeklerDataSource(var ydao: YemeklerDao) {

    suspend fun tumYemekleriGetir(): List<Yemekler> =
        withContext(Dispatchers.IO) {
            return@withContext ydao.tumYemekleriGetir().yemekler
        }

}