package com.fatihacar.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userInput;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void changeActivity(View view){
        userInput =(EditText) findViewById(R.id.editText); //text deki içerik alınıyor.
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);//getApplicationContext() uygulamayı işaret etmektedir.
        // 2. parametre ise hangi activity gidileceğidir.

        intent.putExtra("input",userInput.getText().toString());//userInput içerisindekini al(getText) string e çevir (toString)
        // userInput ile alınan değer input anahtar kelimesine yükleniyor. text intentle birlikte gönderiliyor

        String text=userInput.getText().toString();//userInput içerisindekini al(getText) string e çevir (toString) sonra text değişkenine aktar.

        if(text.equals("12345")) {
            startActivity(intent);//intent nesnesi çalıştırılıyor. Intent le birlikte bilgiler gönderiliyor.
        }
        else
        {
            textView=(TextView) findViewById(R.id.textView);
            textView.setText("Hatalı Parola");
        }
    }
}
