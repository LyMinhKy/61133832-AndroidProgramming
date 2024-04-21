package ky.lm.viewpager2_recyclerviewadapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CitiesAdapter citiesAdapter;
    ArrayList<Cities> citiesList;
    ViewPager2 viewPager2Cities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        citiesList = getDataForViewPager();
        viewPager2Cities = findViewById(R.id.vp2city);
        citiesAdapter = new CitiesAdapter(this,citiesList);
        viewPager2Cities.setAdapter(citiesAdapter);
        viewPager2Cities.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });

    }

    ArrayList<Cities> getDataForViewPager(){
        ArrayList<Cities> dsDulieu = new ArrayList<Cities>();
        dsDulieu.add(new Cities("hn1","Thành phố Hà Nội"));
        dsDulieu.add(new Cities("hcmcity","Thành phố Hồ Chí Minh"));
        dsDulieu.add(new Cities("danangcity","Thành phố Đà Nẵng"));
        dsDulieu.add(new Cities("camau","Thành phố Cà Mau"));
        dsDulieu.add(new Cities("haiphong","Thành phố Hải Phòng"));
        return dsDulieu;
    }
}