package com.example.sonproje_v1
import com.example.sonproje_v1.SepetYemeklerDataSource
import com.example.sonproje_v1.YemeklerDataSource
import com.example.sonproje_v1.SepetYemeklerRepository
import com.example.sonproje_v1.YemeklerRepository
import com.example.sonproje_v1.ApiUtils
import com.example.sonproje_v1.SepetYemeklerDao
import com.example.sonproje_v1.YemeklerDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideYemeklerRepository(yds: YemeklerDataSource) : YemeklerRepository {
        return YemeklerRepository(yds)
    }

    @Provides
    @Singleton
    fun provideYemeklerDataSource(ydao: YemeklerDao) : YemeklerDataSource {
        return YemeklerDataSource(ydao)
    }

    @Provides
    @Singleton
    fun provideYemeklerDao() : YemeklerDao {
        return ApiUtils.getYemeklerDao()
    }

    // SepetYemekler
    @Provides
    @Singleton
    fun provideSepetYemeklerRepository(syds: SepetYemeklerDataSource) : SepetYemeklerRepository {
        return SepetYemeklerRepository(syds)
    }

    @Provides
    @Singleton
    fun provideSepetYemeklerDataSource(sydao: SepetYemeklerDao) : SepetYemeklerDataSource {
        return SepetYemeklerDataSource(sydao)
    }

    @Provides
    @Singleton
    fun provideSepetYemeklerDao() : SepetYemeklerDao {
        return ApiUtils.getSepetYemeklerDao()
    }
}