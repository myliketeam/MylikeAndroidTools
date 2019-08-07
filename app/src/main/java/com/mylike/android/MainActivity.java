package com.mylike.android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mylike.utils.view.TipDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_tipDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TipDialog.
            }
        });
    }

    private String testNull(@NonNull String str){
        return str;
    }
}
