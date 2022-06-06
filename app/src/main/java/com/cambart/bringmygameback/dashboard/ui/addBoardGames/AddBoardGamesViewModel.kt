package com.cambart.bringmygameback.dashboard.ui.addBoardGames

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddBoardGamesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is AddBoardGames Fragment"
    }
    val text: LiveData<String> = _text
}