package com.edwyn.ciclodevida

import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    companion object {
        private const val TAG = "CicloVidaApp"
    }

    private var tiempoInicioActiva: Long = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: Activity creada.")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: Activity a punto de hacerse visible.")
    }

    override fun onResume() {
        super.onResume()
        tiempoInicioActiva = SystemClock.elapsedRealtime()
        Log.d(TAG, "onResume: Activity visible y activa (con foco).")
    }

    override fun onPause() {
        super.onPause()
        val tiempoActivaMs = SystemClock.elapsedRealtime() - tiempoInicioActiva
        val segundos = tiempoActivaMs / 1000.0
        Log.d(TAG, "onPause: Activity pierde el foco. Tiempo activa: $segundos s ($tiempoActivaMs ms)")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Activity oculta (en segundo plano).")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: Activity reiniciándose tras haber sido detenida.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Activity destruida.")
    }
}