package com.example.acapplication.util.classes

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.util.Log
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.drawToBitmap
import androidx.room.TypeConverter
import de.hdodenhof.circleimageview.CircleImageView
import java.io.ByteArrayOutputStream


class Constants {

    companion object
    {
        fun getBytesFromImageView(imageView : ImageView) : ByteArray
        {
            val bitmap : Bitmap
            if (imageView is CircleImageView)
            {
                bitmap = (imageView.drawable).toBitmap()
            }
            else
            {
                bitmap = (imageView.drawable as BitmapDrawable).toBitmap()
            }
            val byteArrayOutputStream = ByteArrayOutputStream()
            bitmap.compress(Bitmap.CompressFormat.PNG, 20, byteArrayOutputStream)
            return byteArrayOutputStream.toByteArray()
        }
    }
}