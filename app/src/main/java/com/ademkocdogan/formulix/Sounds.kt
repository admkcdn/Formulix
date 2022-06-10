package com.ademkocdogan.formulix

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Sounds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sounds)
    }

    fun forzaFerrari(view:View){
        val mediaPlayer = MediaPlayer.create(this,R.raw.forzaferrari)
        mediaPlayer.start()
    }

    fun aman(view: View){
        val mediaPlayer = MediaPlayer.create(this,R.raw.amanaman)
        mediaPlayer.start()
    }

    fun buthere(view: View){
        val mediaPlayer = MediaPlayer.create(this,R.raw.buthere)
        mediaPlayer.start()
    }

    fun noMikey(view: View){
        val mediaPlayer = MediaPlayer.create(this,R.raw.nomikey)
        mediaPlayer.start()
    }

    fun mylord(view: View){
        val mediaPlayer = MediaPlayer.create(this,R.raw.ohmylord)
        mediaPlayer.start()
    }

    fun bababa(view: View){
        val mediaPlayer = MediaPlayer.create(this,R.raw.sebababa)
        mediaPlayer.start()
    }

    fun bariyer(view: View){

        val mediaPlayer = MediaPlayer.create(this,R.raw.sebbariyer)
        mediaPlayer.start()
    }

    fun stupid(view: View){
        val mediaPlayer = MediaPlayer.create(this, R.raw.stupid)
        mediaPlayer.start()
    }

    fun wdc(view: View){
        val mediaPlayer = MediaPlayer.create(this,R.raw.youarewdc)
        mediaPlayer.start()
    }
}