package com.fatihacar.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=(TextView) findViewById(R.id.textView2);

        Intent intent=getIntent();//getIntent ile intent ile gelenleri intent nesnesine aldı
        String recived=intent.getStringExtra("input");// input diğer activity den gelen name içeriğini aldı.
        textView.setText(recived);
    }

    public void changeScreen(View view){
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);//getApplicationContext() uygulamayı işaret etmektedir.
        // 2. parametre ise hangi activity gidileceğidir.
        startActivity(intent);//intent nesnesi çalıştırılıyor.
    }
}
