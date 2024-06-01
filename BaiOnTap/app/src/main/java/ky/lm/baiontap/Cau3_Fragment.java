package ky.lm.baiontap;

import static android.content.Context.MODE_PRIVATE;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;


public class Cau3_Fragment extends Fragment {
    //Khai báo các biến Database
    String DbPathSuffix= "/databases/";//thư mục chứa csdl
    SQLiteDatabase database=null;//khai báo tên csdl
    String DbName="qlsach.db";//tên file chứa csdl
    //Khai báo ListView
    ListView lv;
    ArrayList<String> ds;
    ArrayAdapter<String> adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewcau3 = inflater.inflate(R.layout.fragment_cau3_, container, false);
        lv=viewcau3.findViewById(R.id.lv);
        ds = new ArrayList<>();
        adapter = new ArrayAdapter<>(viewcau3.getContext(), android.R.layout.simple_list_item_1,ds);
        lv.setAdapter(adapter);
        //Gọi hàm tiến hành copy csdl từ Assets vào thư mục db trong bo nhớ cài đặt ứng dụng
        //processCopy();
        database = getActivity().openOrCreateDatabase("qlsach.db",MODE_PRIVATE,null);
        return viewcau3;

         
    }

}