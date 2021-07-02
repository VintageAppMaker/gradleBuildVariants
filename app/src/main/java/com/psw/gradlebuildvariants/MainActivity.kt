package com.psw.gradlebuildvariants

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.psw.gradlebuildvariants.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            message addLog "BuildConfig.enableCert : ${BuildConfig.enableCert}"
            message addLog "BuildConfig.FLAVOR : ${BuildConfig.FLAVOR}"
            message addLog "string.xml -> app_name  : ${resources.getString(R.string.app_name)}"
        }
    }
}

infix fun TextView.addLog(s : String){
    val nCount = text.split("\n").size
    this.text = "${text}\n${nCount}. ${s}"
}