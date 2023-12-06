package com.example.roomsiswa

import android.app.Application
import com.example.roomsiswa.repositori.ContainerApp

class AplikasiSiswa : Application(){
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container : ContainerApp


}