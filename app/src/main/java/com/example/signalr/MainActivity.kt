package com.example.signalr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.signalr.HubConnection
import com.microsoft.signalr.HubConnectionBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var hubConnection : HubConnection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hubConnection = HubConnectionBuilder.create("http://localhost:5000/movehub").build()



    }
}