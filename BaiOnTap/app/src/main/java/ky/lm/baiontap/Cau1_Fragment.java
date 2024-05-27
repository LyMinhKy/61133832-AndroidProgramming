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
        return inflater.inflate(R.layout.fragment_cau1_, container, false);
    }
}