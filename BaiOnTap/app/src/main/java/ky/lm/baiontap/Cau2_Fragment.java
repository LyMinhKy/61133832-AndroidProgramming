package ky.lm.baiontap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Cau2_Fragment extends Fragment {
    CitiesAdapter citiesAdapter;
    ArrayList<Cities> citiesList;
    RecyclerView recyclerViewCities;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        citiesList = new ArrayList<Cities>();
        citiesList.add(new Cities("hn1","Thành phố Hà Nội"));
        citiesList.add(new Cities("hcmcity","Thành phố Hồ Chí Minh"));
        citiesList.add(new Cities("danangcity","Thành phố Đà Nẵng"));
        citiesList.add(new Cities("camau","Thành phố Cà Mau"));
        citiesList.add(new Cities("haiphong","Thành phố Hải Phòng"));

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewcau2=inflater.inflate(R.layout.fragment_cau2_, container, false);
        //Tìm đều khiển cho recycler
        recyclerViewCities = viewcau2.findViewById(R.id.recycau2);
        //Tạo Layout Manager đặt bố cục cho recycler
        // Theo chiều dọc
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewcau2.getContext());
        recyclerViewCities.setLayoutManager(layoutLinear);
        //Tạo Adapter
        citiesAdapter = new CitiesAdapter(viewcau2.getContext(),citiesList);
        //Gắn Adapter với Recycler
        recyclerViewCities.setAdapter(citiesAdapter);
        return viewcau2;
    }
}