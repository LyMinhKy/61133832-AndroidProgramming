package com.example.ex4_basicmath;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai baos cac doi tuonng gan voi dieu khien tuong ung
    EditText Soa;
    EditText Sob;
    EditText KQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }
    void TimDieuKhien(){
         Soa = (EditText)findViewById(R.id.edtSoA);
         Sob = (EditText)findViewById(R.id.edtSoB);
         KQ = (EditText)findViewById(R.id.edtKQ);
         nutCong = (Button)findViewById(R.id.btnCong);
         nutTru = (Button)findViewById(R.id.btnTru);
         nutNhan = (Button)findViewById(R.id.btnNhan);
         nutChia = (Button)findViewById(R.id.btnChia);
    }


    //XuLyCong
    public void PhepCong(View v){
        //Lay du lieu tu ben xml
            //EditText Soa = (EditText)findViewById(R.id.edtSoA);
            //EditText Sob = (EditText)findViewById(R.id.edtSoB);
        //Lay du lieu tu phia tren chuyen sang chuoi
        String soa = Soa.getText().toString();
        String sob = Sob.getText().toString();
        //Chuyen du lieu chuoi phia tren sang so
        float a = Float.parseFloat(soa);
        float b = Float.parseFloat(sob);
        //TinhToan
        float Tong = a+b;
        //Hien ket qua
            //EditText KQ = (EditText)findViewById(R.id.edtKQ);
        //chuyen du lieu thanh dang chuoi
        String Kq = String.valueOf(Tong);
        //Gan KQ
        KQ.setText(Kq);
    }

    public void PhepTru(View v){
        //Lay du lieu tu ben xml
            //EditText Soa = (EditText)findViewById(R.id.edtSoA);
            //EditText Sob = (EditText)findViewById(R.id.edtSoB);
        //Lay du lieu tu phia tren chuyen sang chuoi
        String soa = Soa.getText().toString();
        String sob = Sob.getText().toString();
        //Chuyen du lieu chuoi phia tren sang so
        float a = Float.parseFloat(soa);
        float b = Float.parseFloat(sob);
        //TinhToan
        float Hieu = a-b;
        //Hien ket qua
            //EditText KQ = (EditText)findViewById(R.id.edtKQ);
        //chuyen du lieu thanh dang chuoi
        String Kq = String.valueOf(Hieu);
        //Gan KQ
        KQ.setText(Kq);
    }

    public void PhepNhan(View v){
        //Lay du lieu tu ben xml
            //EditText Soa = (EditText)findViewById(R.id.edtSoA);
            //EditText Sob = (EditText)findViewById(R.id.edtSoB);
        //Lay du lieu tu phia tren chuyen sang chuoi
        String soa = Soa.getText().toString();
        String sob = Sob.getText().toString();
        //Chuyen du lieu chuoi phia tren sang so
        float a = Float.parseFloat(soa);
        float b = Float.parseFloat(sob);
        //TinhToan
        float Tich = a*b;
        //Hien ket qua
            //EditText KQ = (EditText)findViewById(R.id.edtKQ);
        //chuyen du lieu thanh dang chuoi
        String Kq = String.valueOf(Tich);
        //Gan KQ
        KQ.setText(Kq);
    }

    public void PhepChia(View v){
        //Lay du lieu tu ben xml
            //EditText Soa = (EditText)findViewById(R.id.edtSoA);
            //EditText Sob = (EditText)findViewById(R.id.edtSoB);
        //Lay du lieu tu phia tren chuyen sang chuoi
        String soa = Soa.getText().toString();
        String sob = Sob.getText().toString();
        //Chuyen du lieu chuoi phia tren sang so
        float a = Float.parseFloat(soa);
        float b = Float.parseFloat(sob);
        //TinhToan
        float Thuong = a/b;
        //Hien ket qua
            //EditText KQ = (EditText)findViewById(R.id.edtKQ);
        //chuyen du lieu thanh dang chuoi
        String Kq = String.valueOf(Thuong);
        //Gan KQ
        KQ.setText(Kq);
    }
}