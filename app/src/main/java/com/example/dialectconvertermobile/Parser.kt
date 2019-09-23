package com.example.dialectconvertermobile

import android.util.Log
import com.atilika.kuromoji.ipadic.Tokenizer

class Parser {
    /**
     * 形態素解析し、出現した名詞のリストを返す。
     */
    fun parse(inputText: String): ArrayList<ParseResultData> {
        val parsedDataList = arrayListOf<ParseResultData>()
        val tokenizer = Tokenizer()
        for(token in tokenizer.tokenize(inputText)) {
            Log.d("token", "${token.surface} ${token.baseForm}")
            // 読み、発音情報がない単語もある。その場合要素数が少ないため、[8][9]の要素を指定するとArrayIndexOutOfBoundsExceptionで落ちる。
            val parsedData = ParseResultData(
                surface = token.surface,
                lexicaCate = token.partOfSpeechLevel1,
                lexicaCateClass1 = token.partOfSpeechLevel2,
                lexicaCateClass2 = token.partOfSpeechLevel3,
                lexicaCateClass3 = token.partOfSpeechLevel4,
                conjForm = token.conjugationForm,
                conjType = token.conjugationType,
                original = token.baseForm,
                reading = token.reading,
                pronunciation = token.pronunciation
            )
            parsedDataList.add(parsedData)
        }
        return parsedDataList
    }
}