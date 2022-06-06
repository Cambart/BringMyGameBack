package com.cambart.bringmygameback.dashboard.ui.addBoardGames

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.cambart.bringmygameback.R

class AddBoardGamesFragment : Fragment() {

    private lateinit var addBoardGamesViewModel: AddBoardGamesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addBoardGamesViewModel =
            ViewModelProvider(this).get(AddBoardGamesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_add_board_games, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        addBoardGamesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}