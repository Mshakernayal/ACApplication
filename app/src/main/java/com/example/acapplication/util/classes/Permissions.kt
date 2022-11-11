package com.example.acapplication.util.classes

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class Permissions {
    companion object
    {
        const val ADD_INVOICE_LOGO_PERMISSION_CODE = 1
        const val ADD_PAYMENT_LOGO_PERMISSION_CODE = 2
        const val ADD_SPEND_LOGO_PERMISSION_CODE = 3
        const val ADD_CLIENT_PHOTO_PERMISSION_CODE = 4
        const val PROFILE_PHOTO_PERMISSION_CODE = 5

        const val PROFILE_CALL_PERMISSION_CODE = 6

        fun requestRunTimePermission(
            activity: Activity?,
            fragment: Fragment?,
            permission: Array<String>,
            requestPermission: Int
        )
        {
            if(activity != null)
            {
                ActivityCompat.requestPermissions(
                    activity,
                    permission,
                    requestPermission
                )
            }
            else if(fragment != null)
            {
                fragment.requestPermissions(
                    permission,
                    requestPermission
                )
            }
        }

        fun isPermissionGranted(
            context: Context,
            permissions : Array<String>
        ) : Boolean
        {
            for (i in permissions)
            {
                if (ContextCompat.checkSelfPermission(context, i) != PackageManager.PERMISSION_GRANTED)
                {
                    return false
                }
            }
            return true
        }
    }
}