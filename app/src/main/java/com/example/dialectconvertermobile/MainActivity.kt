package com.example.dialectconvertermobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.dom4j.io.SAXReader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputText = "お爺ちゃんあそこにおいてあるペン取って"
        val parsedDataList = Parser().parse(inputText)
        val reader = SAXReader()
        val document = reader.read(assets.open("dialect_data.xml"))
        Converter(document).convert(parsedDataList)
    }
}
