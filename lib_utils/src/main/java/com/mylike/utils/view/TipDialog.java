package com.mylike.utils.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.mylike.utils.R;

public class TipDialog extends Dialog {

    public TipDialog(Context context){
        this(context, R.style.TipDialog);

    }
    public TipDialog(Context context, int resId){
        super(context,resId);
        setCanceledOnTouchOutside(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDialogWidth();
    }
    private void initDialogWidth(){
        Window window = getWindow();
        if(window!=null){
            WindowManager.LayoutParams wl = window.getAttributes();
            wl.width = ViewGroup.LayoutParams.MATCH_PARENT;
            window.setAttributes(wl);
        }
    }



}
