package com.example.utsno1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.isi_fakultas.*

class DetailFakultas : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.isi_fakultas)
        var intentThatStartedThisActivity = getIntent ()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){

            var gambarfakultas = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var namafakultas = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var isifakultas = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var isijurusan = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)

            logoupn.setImageResource(gambarfakultas)
            tv_name_detail.text = namafakultas
            tv_desc_detail.text = isifakultas
            tv_short_detail.text = isijurusan
        }
    }
}