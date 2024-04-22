package ky.lm.basic_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

    }

    public void ChuyensangMH2(View v){
        //Tạo đối tượng Intent
        Intent MH2;
        //Hàm tạo có 2 tham số
        MH2=new Intent(MainActivity.this,MainActivity2.class);
        //gửi sàng màn hình phụ
        startActivity(MH2);
    }
}