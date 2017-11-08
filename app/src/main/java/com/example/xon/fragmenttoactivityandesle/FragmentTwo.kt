package com.example.xon.fragmenttoactivityandesle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by XON on 11/8/2017.
 */
class FragmentTwo : Fragment {
    lateinit var mView : View
    constructor()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater!!.inflate(R.layout.fragment_two,container,false)
        return mView
    }
}