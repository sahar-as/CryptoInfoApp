package ir.saharapps.cryptoinfoapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.saharapps.cryptoinfoapp.common.Constants
import ir.saharapps.cryptoinfoapp.data.remote.PaprikaSiteApi
import ir.saharapps.cryptoinfoapp.data.repository.CoinRepositoryImp
import ir.saharapps.cryptoinfoapp.domain.repository.CoinRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(): PaprikaSiteApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PaprikaSiteApi::class.java)
    }

    @Singleton
    @Provides
    fun provideRepository(api: PaprikaSiteApi): CoinRepository{
        return CoinRepositoryImp(api)
    }
}