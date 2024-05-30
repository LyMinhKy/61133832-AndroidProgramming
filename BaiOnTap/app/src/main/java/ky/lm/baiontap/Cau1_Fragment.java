package ky.lm.baiontap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Cau1_Fragment extends Fragment {

    EditText Soa;
    EditText Sob;
    EditText KQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewcau1 = inflater.inflate(R.layout.fragment_cau1_, container, false);
        Soa = viewcau1.findViewById(R.id.edtsoa);
        Sob = viewcau1.findViewById(R.id.edtsob);
        KQ = viewcau1.findViewById(R.id.edtkq);
        nutCong = viewcau1.findViewById(R.id.btnCong);
        nutTru = viewcau1.findViewById(R.id.btnTru);
        nutNhan = viewcau1.findViewById(R.id.btnNhan);
        nutChia = viewcau1.findViewById(R.id.btnChia);

        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lay du lieu tu phia tren chuyen sang chuoi
                String soa = Soa.getText().toString();
                String sob = Sob.getText().toString();
                //Chuyen du lieu chuoi phia tren sang so
                float a = Float.parseFloat(soa);
                float b = Float.parseFloat(sob);
                //TinhToan
                float Tong = a+b;
                //chuyen du lieu thanh dang chuoi
                String Kq = String.valueOf(Tong);
                //Gan KQ
                KQ.setText(Kq);
            }
        });

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lay du lieu tu phia tren chuyen sang chuoi
                String soa = Soa.getText().toString();
                String sob = Sob.getText().toString();
                //Chuyen du lieu chuoi phia tren sang so
                float a = Float.parseFloat(soa);
                float b = Float.parseFloat(sob);
                //TinhToan
                float Hieu = a-b;
                //chuyen du lieu thanh dang chuoi
                String Kq = String.valueOf(Hieu);
                //Gan KQ
                KQ.setText(Kq);
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lay du lieu tu phia tren chuyen sang chuoi
                String soa = Soa.getText().toString();
                String sob = Sob.getText().toString();
                //Chuyen du lieu chuoi phia tren sang so
                float a = Float.parseFloat(soa);
                float b = Float.parseFloat(sob);
                //TinhToan
                float Tich = a*b;
                //chuyen du lieu thanh dang chuoi
                String Kq = String.valueOf(Tich);
                //Gan KQ
                KQ.setText(Kq);
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lay du lieu tu phia tren chuyen sang chuoi
                String soa = Soa.getText().toString();
                String sob = Sob.getText().toString();
                //Chuyen du lieu chuoi phia tren sang so
                float a = Float.parseFloat(soa);
                float b = Float.parseFloat(sob);
                //TinhToan
                float Thuong = a/b;
                //chuyen du lieu thanh dang chuoi
                String Kq = String.valueOf(Thuong);
                //Gan KQ
                KQ.setText(Kq);
            }
        });

        return viewcau1;
    }

}