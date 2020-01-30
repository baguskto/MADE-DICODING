package com.example.made.Fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.made.R

class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val mFragmentManager = supportFragmentManager
        val mHomeFragment = HomeFragment()
        val fragment = mFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if (fragment !is HomeFragment ){
            Log.d("MyFlexibleFragment", "Fragment Name :" + HomeFragment::class.java.canonicalName)
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mHomeFragment,HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}
