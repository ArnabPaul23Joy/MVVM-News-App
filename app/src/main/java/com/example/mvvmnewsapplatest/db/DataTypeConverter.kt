package com.example.mvvmnewsapplatest.db

import androidx.room.TypeConverter
import com.example.mvvmnewsapplatest.model.Source
import com.google.gson.Gson

class DataTypeConverter {

    @TypeConverter
    fun fromSource (source: Source): String {
        return Gson().toJson(source)
    }


    @TypeConverter
    fun toSource (jsonString: String): Source {
        return Gson().fromJson(jsonString, Source::class.java)
    }
}