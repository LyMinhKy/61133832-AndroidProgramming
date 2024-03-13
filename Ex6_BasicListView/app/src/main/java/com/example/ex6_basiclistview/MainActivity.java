package com.example.ex6_basiclistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsCacBaiHat;//Khai báo biến
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Hiện thị dữ liệu lên ListView

        dsCacBaiHat = new ArrayList<String>(); //tạo thể hiện cụ thể
        //Thêm dữ liệu
        dsCacBaiHat.add("Chúng ta của hiện tại");
        dsCacBaiHat.add("Chúng ta của tương lai");
        dsCacBaiHat.add("Making My Way");
        dsCacBaiHat.add("There's no one at all");
        dsCacBaiHat.add("Muộn rồi mà sao còn");
        dsCacBaiHat.add("Có chắc yêu là đây");

        //B2:Tạo adapter
        ArrayAdapter<String> adapterBaiHat;
        adapterBaiHat = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsCacBaiHat);

        //B3: gắn vào điều khiển hiển thị ListView
        //Tìm ListView
        ListView lvTenBaiHat = findViewById(R.id.lvSongs);
        //Gắn
        lvTenBaiHat.setAdapter(adapterBaiHat);
        //User tương tác
        lvTenBaiHat.setOnItemClickListener(MTP);
    }

    //Tạo bộ lắng nghe và xử lý sự kiện OnItemClick, đặt vào một biến
    AdapterView.OnItemClickListener MTP = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //Hiện thông báo giá trị phần tử vừa chọn
            String ChonBaiHat=dsCacBaiHat.get(position);
            Toast.makeText(MainActivity.this,"Bạn vừa chọn "+ChonBaiHat,Toast.LENGTH_LONG).show();

        }
    };
}