package com.example.lolgraphs.data.network.apiConsumer

import com.example.lolgraphs.data.network.apiConsumer.Responses.ChampResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface APIService {
    @GET("champion.json")
    suspend fun getAllChamp(): Response<ChampResponse>


    @GET("champion/{query}.json")
    suspend fun getOnlyChamp(@Path("query") query: String): Response<ChampResponse>
}