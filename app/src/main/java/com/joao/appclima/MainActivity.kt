package com.joao.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val serviceRetrofit = RetrofitService()
        serviceRetrofit.api?.consulta(37.8267,-122.4233)?.enqueue(object : Callback<DadosClima> {
            override fun onResponse(call: Call<DadosClima>?, response: Response<DadosClima>?) {
                val corpo = response?.body()
                imagem.setImageResource(corpo.currently.icon)


            }

            override fun onFailure(call: Call<DadosClima>?, t: Throwable?) {
                Log.e("Erro", "************** erro **********\n"+t?.message.toString())
            }


        })

    }
}

private fun Unit?.enqueue(callback: Callback<DadosClima>) {
    TODO("Not yet implemented")
}
