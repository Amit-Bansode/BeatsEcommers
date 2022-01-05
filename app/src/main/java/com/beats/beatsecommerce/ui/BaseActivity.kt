package com.beats.beatsecommerce.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.beats.beatsecommerce.R

open class BaseActivity : AppCompatActivity() {

    fun loadFragment(fragment: Fragment, isReplace: Boolean) {
        if (isReplace)
            supportFragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit()
        else
            supportFragmentManager.beginTransaction().add(R.id.flContainer, fragment).commit()
    }
}