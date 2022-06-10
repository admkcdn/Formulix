package com.ademkocdogan.formulix

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Bir Adem Koçdoğan Harikası", Toast.LENGTH_LONG).show()


        var mediaPlayer = MediaPlayer.create(this,R.raw.f1)

        button3.setOnClickListener(){

            if (!mediaPlayer.isPlaying()){
                mediaPlayer.start()
            }
        }
        button4.setOnClickListener(){
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause()
            }
        }
    }

    fun yarislar(view: View){


        val intent = Intent(applicationContext, Yarislar::class.java)
        startActivity(intent)
    }

    fun sesPaketleri(view: View){

        val intent = Intent(applicationContext, Sounds::class.java)
        startActivity(intent)
    }
}