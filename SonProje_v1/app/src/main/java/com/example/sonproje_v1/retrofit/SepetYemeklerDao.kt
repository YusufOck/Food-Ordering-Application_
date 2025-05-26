package com.example.sonproje_v1
import com.example.sonproje_v1.CRUDResponse
import com.example.sonproje_v1.SepetYemeklerCevap
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface SepetYemeklerDao {

    @POST("/yemekler/sepettekiYemekleriGetir.php")
    @FormUrlEncoded
    suspend fun sepettekiYemekleriGetir(@Field("kullanici_adi") kullanici_adi:String) : SepetYemeklerCevap

    @POST("/yemekler/sepeteYemekEkle.php")
    @FormUrlEncoded
    suspend fun sepeteYemekEkle(@Field("yemek_adi") yemek_adi:String,
                                @Field("yemek_resim_adi") yemek_resim_adi:String,
                                @Field("yemek_fiyat") yemek_fiyat:Int,
                                @Field("yemek_siparis_adet") yemek_siparis_adet:Int,
                                @Field("kullanici_adi") kullanici_adi:String) : CRUDResponse

    @POST("/yemekler/sepettenYemekSil.php")
    @FormUrlEncoded
    suspend fun sepettenYemekSil(@Field("sepet_yemek_id") sepet_yemek_id:Int,
                                 @Field("kullanici_adi") kullanici_adi:String) : CRUDResponse

}