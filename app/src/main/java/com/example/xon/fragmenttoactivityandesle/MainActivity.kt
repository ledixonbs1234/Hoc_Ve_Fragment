package com.example.xon.fragmenttoactivityandesle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var mFragmentOne: FragmentOne
    lateinit var mFragmentTwo: FragmentTwo


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initFragment()
        showFragmentOne()

    }

    fun showFragmentOne() {

        supportFragmentManager.beginTransaction().replace(R.id.main,mFragmentOne,mFragmentOne.javaClass.name)
                .commit()
    }

    fun showFragmentTwo() {
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.anim_in,R.anim.anim_out,R.anim.temp_anim_in,R.anim.temp_anim_out)
                .replace(R.id.main,mFragmentTwo,mFragmentTwo.javaClass.name)
                .commit()
    }

    fun initFragment() {
       mFragmentOne = FragmentOne()

        mFragmentOne.setdListener(object: FragmentOne.ClickButtonListenner{
            override fun onClick() {
                showFragmentTwo()
                }
        })

        mFragmentTwo = FragmentTwo()
     //   supportFragmentManager.beginTransaction()
     //           .add(R.id.main, mFragmentOne, mFragmentOne.javaClass.name)
     //           .add(R.id.main, mFragmentTwo, mFragmentTwo.javaClass.name)
     //           .commit()//
    }

}
