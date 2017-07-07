package com.toong.androidprogressdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

/**
 * Created by phanvanlinh on 01/07/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class ProgressDialog {
    private Dialog dialog;
    private Context mContext;

    public ProgressDialog(Context context) {
        this.mContext = context;
    }

    public void show() {
        if (dialog != null && dialog.isShowing()) {
            return;
        }
        if (dialog == null) {
            dialog = new Dialog(mContext);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.layout_progress_dialog);
            setColor();
            dialog.setCancelable(false);
        }
        dialog.show();
    }

    private void setColor() {
        ColorDrawable dialogColor = new ColorDrawable(Color.WHITE);
        dialogColor.setAlpha(230);
        dialog.getWindow().setBackgroundDrawable(dialogColor);
    }

    public void hide() {
        if (dialog != null && dialog.isShowing()) {
            dialog.hide();
        }
    }

    public void dismiss() {
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
