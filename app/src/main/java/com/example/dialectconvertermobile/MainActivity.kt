package com.example.dialectconvertermobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.atilika.kuromoji.ipadic.Tokenizer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputText = "お爺ちゃんあそこにおいてあるペン取って"
        val tokenizer = Tokenizer()
        for(token in tokenizer.tokenize(inputText)) {
            Log.d("token", "${token}")
        }
//        val command = arrayOf(
//            "sh", "-c",
//            "echo ${inputText} | mecab -d /usr/local/lib/mecab/dic/mecab-ipadic-neologd"
//        )
//        val parsedDataList = Parser().parse(command)
//        Converter().convert(parsedDataList)
    }
}
