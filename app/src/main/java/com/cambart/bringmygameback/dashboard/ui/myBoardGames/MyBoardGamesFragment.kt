package com.cambart.bringmygameback.dashboard.ui.myBoardGames

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.cambart.bringmygameback.R

class MyBoardGamesFragment : Fragment() {

    private lateinit var myBoardGamesViewModel: MyBoardGamesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myBoardGamesViewModel =
            ViewModelProvider(this).get(MyBoardGamesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_my_board_games, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        myBoardGamesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}