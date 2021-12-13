package com.resep.resep_masak.retrofit

import com.resep.resep_masak.model.ResepModel
import retrofit2.Call
import retrofit2.http.GET

interface ResepEndPoint {

    @GET("api/recipes")
    fun getDataResep(): Call<ResepModel>

}