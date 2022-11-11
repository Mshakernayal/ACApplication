package com.example.acapplication.util.classes

import android.app.Activity
import android.content.Intent
import androidx.fragment.app.Fragment

class Requests {

    companion object
    {
        const val GALLERY_REQUEST_CODE = 1

        fun chooseImage(activity: Activity?, fragment: Fragment?)
        {
            val intent = Intent()
            intent.type = "image/*"
            intent.action = Intent.ACTION_GET_CONTENT

            if(activity != null)
            {
                activity.startActivityForResult(intent, GALLERY_REQUEST_CODE)
            }
            else if(fragment != null)
            {
                fragment.startActivityForResult(intent, GALLERY_REQUEST_CODE)
            }
        }
    }
}