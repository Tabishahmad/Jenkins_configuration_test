package com.example.githubtest1

import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val policy = ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

            runOnUiThread(java.lang.Runnable {
            val string = TestVehicleNumber.getData("DL3SAY1719")
            println("Vehicle Number " + string)
        })
    }
    fun addFirstFunction(){

    }
    fun addSecondFunction(){

    }
    fun addThirdFunction(){
        
    }
    fun toCreateThirdBranch(){
        
    }
    fun toCheckMerge_1(){

    }
    fun checkMergerAgain1(){

    }

}