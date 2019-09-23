package com.example.dialectconvertermobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.dom4j.io.SAXReader

class MainActivity : AppCompatActivity() {

    // TODO:遠州弁の強さをモード制御
    // TODO:テキストファイルを読み込みテキストファイルに出力する処理

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val executeButton = findViewById<View>(R.id.executeButton)

        executeButton.setOnClickListener {
            val inputText = findViewById<View>(R.id.inputText) as EditText
            val parsedDataList = Parser().parse("${inputText.text}")
            val reader = SAXReader()
            val document = reader.read(assets.open("dialect_data.xml"))
            val outputText = findViewById<View>(R.id.outputText) as TextView
            Converter(document).convert(parsedDataList).forEach { outputText.append(it) }
        }
    }
}
