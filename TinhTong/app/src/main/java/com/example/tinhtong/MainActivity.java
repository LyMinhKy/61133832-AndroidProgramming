package com.example.tinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Lắng nghe và xử lý sự kiện click nút Tính Tổng
    public void XuLyCong(View view){
        //Tìm tham chiếu đến điều khiển trn XML
        EditText SoA = findViewById(R.id.edtA);
        EditText SoB = findViewById(R.id.edtB);
        EditText Ketqua = findViewById(R.id.edtKQ);
        //Lấy dữ liệu của a và b
        String A = SoA.getText().toString();
        String B = SoB.getText().toString();
        //Chuyển dữ liệu sang dạng số
        int soA = Integer.parseInt(A);
        int soB = Integer.parseInt(B);
        //Phép tính
        int Tong = soA + soB;
        String strTong = String.valueOf(Tong);// Chuyển sang dạng chuỗi
        //Hiện lên màn hình
        Ketqua.setText(strTong);
    }
}