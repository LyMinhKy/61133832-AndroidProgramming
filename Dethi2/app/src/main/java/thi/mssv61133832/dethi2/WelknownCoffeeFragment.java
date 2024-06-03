package thi.mssv61133832.dethi2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class WelknownCoffeeFragment extends Fragment {
    CitiesAdapter citiesAdapter;
    ArrayList<Cities> citiesList;
    RecyclerView recyclerViewCities;
    public WelknownCoffeeFragment() {
        // Required empty public constructor
    }
    public static WelknownCoffeeFragment newInstance(String param1, String param2) {
        WelknownCoffeeFragment fragment = new WelknownCoffeeFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        citiesList = new ArrayList<Cities>();
        citiesList.add(new Cities("accoffee","A&C Homestay Coffee"));
        citiesList.add(new Cities("honchongcoffe","Hòn Chồng Coffee"));
        citiesList.add(new Cities("nora","Nora Coffee"));
        citiesList.add(new Cities("sea50","Sea 50 Coffee"));
        citiesList.add(new Cities("sailing","Sailing Club"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewcau3=inflater.inflate(R.layout.fragment_welknown_coffee, container, false);
        //Tìm đều khiển cho recycler
        recyclerViewCities = viewcau3.findViewById(R.id.cau3);
        //Tạo Layout Manager đặt bố cục cho recycler
        // Theo chiều dọc
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewcau3.getContext());
        recyclerViewCities.setLayoutManager(layoutLinear);
        //Tạo Adapter
        citiesAdapter = new CitiesAdapter(viewcau3.getContext(),citiesList);
        //Gắn Adapter với Recycler
        recyclerViewCities.setAdapter(citiesAdapter);
        return viewcau3;
    }
}