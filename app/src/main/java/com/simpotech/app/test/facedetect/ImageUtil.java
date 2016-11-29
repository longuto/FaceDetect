package com.simpotech.app.test.facedetect;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by longuto on 2016/11/29.
 */

public class ImageUtil {
    private static String TAG = "ImageUtil";    //标志

    public static void saveBitmap(Bitmap bm, Context context) {
        Log.e(TAG, "保存图片");
        File f = context.getFilesDir();
        File file = new File(f, "liu.png");
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream out = new FileOutputStream(file);
            bm.compress(Bitmap.CompressFormat.PNG, 90, out);
            out.flush();
            out.close();
            Log.i(TAG, "已经保存");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
