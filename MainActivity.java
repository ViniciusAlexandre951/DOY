package com.example.doy;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        TextView tituloTextView = findViewById(R.id.tituloTextView);
        TextView subtituloTextView = findViewById(R.id.subTituloTextView);
        Button btnComeco = findViewById(R.id.btn_Comeco);

        Typeface font = Typeface.createFromAsset(getAssets(),"Ubuntu-BoldItalic.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(),"Ubuntu-Bold.ttf");

        tituloTextView.setTypeface(font);
        subtituloTextView.setTypeface(font);
        btnComeco.setTypeface(font2);

    }


    public void chamaTelaLogin(View v){
        Intent it = new Intent(this,LoginActivity.class);
        startActivity(it);

    }

}
