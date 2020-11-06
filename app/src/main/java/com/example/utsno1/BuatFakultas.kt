package com.example.utsno1

fun BuatFakultas () : List<DataFakultas> {
    val  partListFakultas = ArrayList<DataFakultas>()
    partListFakultas.add(
        DataFakultas(
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Ekonomi dan Bisnis adalah salahsatu dari 7 Fakultas di UPNVTJT \n " +
                    "yang memiliki beberapa program studi yaitu : ",
            "1. Ekonomi Pembangunan \n " +
                    "2. Akuntansi \n " +
                    "3. Manajemen",
            R.drawable.feb,
            "feb@upnjatim.ac.id",
            "https://febis.upnjatim.ac.id/"
        )
    )
    partListFakultas.add(
        DataFakultas(
            "Fakultas Pertanian",
            "Fakultas Pertanian adalah salahsatu dari 7 fakultas di UPNVJT \n " +
                    "yang memiliki beberapa program studi yaitu : ",
            "1. Agroteknologi \n " +
                    "2. Agribisnis",
            R.drawable.fp,
            "---",
        "https://faperta.upnjatim.ac.id"
        )
    )
    partListFakultas.add(
        DataFakultas(
            "Fakultas Teknik",
            "Fakultas Teknik adalah salahsatu dari 7 fakultas di UPNVJT \n " +
                    "yang memiliki beberapa program studi yaitu : ",
            "1. Teknik Kimia \n " +
                    "2. Teknik INdustri \n " +
                    "3. Teknik Sipil \n " +
                    "4. Teknik Lingkungan \n " +
                    "5. Teknologi Pangan",
            R.drawable.ft,
            "---",
        "https://ft.upnjatim.ac.id"
        )
    )
    partListFakultas.add(
        DataFakultas(
            "Fakultas Ilmu Komputer",
        "Fakultas Ilmu Komputer Adalah salahsatu dari 7 fakultas di UPNVJT dan FIK Menjadi Fakultas Terbaik di UPN \n " +
                "yang memiliki beberapa program studi yaitu : ",
            "1. Informatika \n " +
                    "2. Sistem Informasi \n " +
                    "3. Data science",
            R.drawable.fik,
            "tu.fik@upnjatim.ac.id",
            "https://fik.upnjatim.ac.id"

        )
    )
    partListFakultas.add(
        DataFakultas(
            "Fakultas Ilmu Sosial dan Ilmu Politik",
            "Fakultas Ilmu Sosial dan Ilmu Politik adalah salahsatu dari 7 fakultas di UPNVJT \n " +
                    "yang memeiki beberapa jurusan yaitu ",
            "1. Ilmu Komunikasi \n " +
                    "2. Ilmu Administrasi Bisnis \n " +
                    "3. Ilmu Administrasi Negara \n " +
                    "4. Hubungan Internasional",
            R.drawable.fisip,
            "---",
        "https://fisip.upnjatim.ac.id"

        )
    )
    partListFakultas.add(
        DataFakultas(
            "Fakultas Hukum ",
            "Fakultas Hukum adalah salahsatu dari 7 fakultas di UPNVJT \n " +
                    "yang memiliki 1 jurusan yaitu : ",
            "1. Ilmu Hukum ",
            R.drawable.fh,
            "---",
        "https://fhukum.upnjatim.ac.id"
        )
    )
    return partListFakultas
}