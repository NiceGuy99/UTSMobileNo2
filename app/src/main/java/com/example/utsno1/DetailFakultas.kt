package com.example.utsno1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.isi_fakultas.*
import java.net.URL

class DetailFakultas : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.isi_fakultas)
        var intentThatStartedThisActivity = intent
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_INTENT)) {
            showContent(intentThatStartedThisActivity)
        }
    }

    private fun showContent(intentThatStartedThisActivity: Intent){
            val namafakultas = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INTENT)
            val isifakultas = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            val isijurusan = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            val gambarfakultas = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            val emailfakultas = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EMAIL)
            val webfakultas = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_ORIGINATING_URI)

            tv_name_detail.text = namafakultas
            tv_desc_detail.text = isifakultas
            tv_short_detail.text = isijurusan
            logoupn.contentDescription = namafakultas
            logoupn.setImageResource(gambarfakultas)

        if (emailfakultas == "") {
            link_email.text = ""
            email_detail.text = ""
        } else {
            link_email.text = emailfakultas
        }
        if (webfakultas == "") {
            tv_link_web.text = ""
            website_detail.text = ""
        } else {
            tv_link_web.text = webfakultas
        }
        link_email.setOnClickListener {
            clickEmail(emailfakultas)
        }
        tv_link_web.setOnClickListener {
                clickWeb(webfakultas)
        }
    }
    private fun clickEmail (email: String?) {
        val mailIntent = Intent(Intent.ACTION_SEND)
        mailIntent.data= Uri.parse("mailto: ")
        mailIntent.type= "text/plain"
        mailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
        mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Dari Profil Fakultas")
        mailIntent.putExtra(Intent.EXTRA_TEXT, "Perhatian")
        startActivity(Intent.createChooser(mailIntent, "Pilih Email . . . "))
    }
    private fun clickWeb (url: String?){
        val showWebActivity = Intent(this, WebFakultas::class.java)
        showWebActivity.putExtra(Intent.ACTION_VIEW, url)
        startActivity(showWebActivity)
    }
}