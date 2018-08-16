package com.example.tzl.tinker_demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.TextView
import android.widget.Toast
import com.tencent.tinker.lib.tinker.TinkerInstaller

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv:TextView=findViewById(R.id.tv)
        tv.setOnClickListener({
            Toast.makeText(this,"改变内容", Toast.LENGTH_SHORT).show()
            TinkerInstaller.onReceiveUpgradePatch(applicationContext, Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk")
        })
    }
}
