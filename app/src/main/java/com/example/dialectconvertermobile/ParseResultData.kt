package com.example.dialectconvertermobile

data class ParseResultData(
    // 表層系
    var surface: String,
    // 品詞
    var lexicaCate: String,
    // 品詞細分類1
    val lexicaCateClass1: String,
    // 品詞細分類2
    val lexicaCateClass2: String,
    // 品詞細分類3
    val lexicaCateClass3: String,
    // 活用形
    val conjForm: String,
    // 活用型
    val conjType: String,
    // 原形
    val original: String,
    // 読み
    val reading: String,
    // 発音
    val pronunciation: String)