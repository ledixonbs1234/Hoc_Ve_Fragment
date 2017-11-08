package com.example.xon.fragmenttoactivityandesle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * Created by XON on 11/8/2017.
 */
class FragmentOne : Fragment {

    lateinit var mView :View
    lateinit var mButton : Button
    lateinit var listener : ClickButtonListenner

    constructor()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater!!.inflate(R.layout.fragment_one,container,false)

        mButton = mView.findViewById(R.id.changelayout)
        mButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v:View){
                listener.onClick()
            }
        })

        return mView
    }

    fun setdListener(listen: FragmentOne.ClickButtonListenner) {
        listener = listen
    }


    public interface ClickButtonListenner{

        fun onClick()
    }

}