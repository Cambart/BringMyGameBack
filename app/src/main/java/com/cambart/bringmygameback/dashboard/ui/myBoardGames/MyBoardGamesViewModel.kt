package com.cambart.bringmygameback.dashboard.ui.myBoardGames

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyBoardGamesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is MyBoardGames Fragment"
    }
    val text: LiveData<String> = _text
}