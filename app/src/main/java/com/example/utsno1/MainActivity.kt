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
        val data = buatFac()
        mRecycleView.layoutManager = LinearLayoutManager(this)
        mRecycleView.setHasFixedSize(true)
        mRecycleView.adapter = AdapterFakultas(data, { onItem: DataFakultas -> onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: DataFakultas) {
        val showDetailActivityIntent = Intent(this, DetailFakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.gambarfakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.namafakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.isifakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.isijurusan)
        startActivity(showDetailActivityIntent)
    }

    private fun buatFac(): List<DataFakultas> {
        val RVlist = ArrayList<DataFakultas>()
        RVlist.add(
            DataFakultas(
                R.drawable.logo_upn,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer \n" +
                        "merupakan salah satu dari 7 Fakultas di UPN “Veteran” Jawa Timur.\n" +
                        "yang mempunyai 3 program studi :",
                "1. Informatika \n" + "2. Sistem Informasi \n" + "3.Data Sains \n"
            )
        )
        RVlist.add(
            DataFakultas(
                R.drawable.logo_upn,
                "Fakultas Teknik",
                "Fakultas Teknik \n " +
                        "Adalah fakultas dengan program studi paling banyak di UPN “Veteran” Jawa Timur. \n " +
                        "yaitu memiliki 5 program studi : ",
                "1.Teknik Kimia \n" +
                        "2.Teknik Industri \n" +
                        "3.Teknik Sipil \n " +
                        "4.Teknik Lingkungan \n " +
                        "5.Teknologi Pangan"
            )
        )
        RVlist.add(
            DataFakultas(
                R.drawable.logo_upn,
                "Fakultas Ekonomi Dan Bisnis",
                "Fakultas Ekonomi Dan Bisnis \n " +
                        "merupakan salah satu fakultas dari 7 faultas di UPN “Veteran” Jawa Timur. \n " +
                        "Yang terdiri dari program studi :",
                "1.Ekonomi Pembangunan \n " +
                        "2.Akuntansi \n " +
                        "3.Manajemen"
            )
        )
        RVlist.add(
            DataFakultas(
                R.drawable.logo_upn,
                "Fakultas Pertanian ",
                "Fakultas Pertanian \n " +
                        "merupakan salah satu fakultas dari 7 faultas di UPN “Veteran” Jawa Timur. \n " +
                        "Yang terdiri dari program studi :",
                "1.Agroteknologi \n " +
                        "2.Agribisnis"
            )
        )
        RVlist.add(
            DataFakultas(
                R.drawable.foto1,
                "Data \n " +
                        "Diri Saya",
                "Nama : Muhammad Yusuf Ardiansyah \n " +
                        "TTL : Sidoarjo, 28 July 2000 \n " +
                        "Alamat : Balongbendo Rt.07 Rw.01 Kab. Sidoarjo \n " +
                        "No.Hp : 082139820863 \n " +
                        "Email : 18082010001@student.upnjatim.ac,id \n " +
                        "Github : https://github.com/NiceGuy99 \n",
                "Riwayat Pendidikan : \n " +
                        "1.SDN 04 Krian \n " +
                        "2.SMPN 01 Krian \n " +
                        "3.SMAN 1 Wringinanom \n \n " +
                "Prestasi/Penghargaan : \n " +
                        "1.Juara 1 Lomba catur Klasik Porkab Gresik 2017 \n " +
                        "2.Juara 1 Lomba catur O2SN Kab.Gresik 2017"
            )
        )
        return RVlist
    }
}


