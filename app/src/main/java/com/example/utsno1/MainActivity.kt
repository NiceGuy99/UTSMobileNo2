package com.example.utsno1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = BuatFakultas()
        mRecycleView.layoutManager = LinearLayoutManager(this)
        mRecycleView.setHasFixedSize(true)
        mRecycleView.adapter = AdapterFakultas(data, { onItem: DataFakultas -> onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: DataFakultas) {
        val showDetailActivityIntent = Intent(this, DetailFakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INTENT, onItem.namafakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.isifakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.isijurusan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.gambarfakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, onItem.emailfakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_ORIGINATING_URI, onItem.webfakultas)
        startActivity(showDetailActivityIntent)
    }

}


