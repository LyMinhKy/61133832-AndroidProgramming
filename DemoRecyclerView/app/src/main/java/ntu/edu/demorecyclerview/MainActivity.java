package ntu.edu.demorecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CitiesAdapter citiesAdapter;
    ArrayList<Cities> citiesList;
    RecyclerView recyclerViewCities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Chuận bị dữ liệu cho CitiesList
        citiesList = getDataForRecyclerView();
        //Tìm đều khiển cho recycler
        recyclerViewCities = findViewById(R.id.recyclerCity);
        //Tạo Layout Manager đặt bố cục cho recycler
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewCities.setLayoutManager(layoutLinear);
        //Tạo Adapter
        citiesAdapter = new CitiesAdapter(this,citiesList);
        //Gắn Adapter với Recycler
        recyclerViewCities.setAdapter(citiesAdapter);
    }

    ArrayList<Cities> getDataForRecyclerView(){
        ArrayList<Cities> dsDulieu = new ArrayList<Cities>();
        dsDulieu.add(new Cities("hn1","Thành phố Hà Nội"));
        dsDulieu.add(new Cities("hcmcity","Thành phố Hồ Chí Minh"));
        dsDulieu.add(new Cities("danangcity","Thành phố Đà Nẵng"));
        dsDulieu.add(new Cities("camau","Thành phố Cà Mau"));
        dsDulieu.add(new Cities("haiphong","Thành phố Hải Phòng"));
        return dsDulieu;
    }
}