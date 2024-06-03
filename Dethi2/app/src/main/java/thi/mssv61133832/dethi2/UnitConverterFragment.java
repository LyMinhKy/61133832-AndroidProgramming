package thi.mssv61133832.dethi2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class UnitConverterFragment extends Fragment {
    EditText So;
    EditText KQ;
    Button btn1,btn2,btn3;


    public UnitConverterFragment() {
        // Required empty public constructor
    }



    public static UnitConverterFragment newInstance(String param1, String param2) {
        UnitConverterFragment fragment = new UnitConverterFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewcau2 = inflater.inflate(R.layout.fragment_unit_converter, container, false);
        So = viewcau2.findViewById(R.id.edtA);
        KQ = viewcau2.findViewById(R.id.edtKQ);
        btn1 = viewcau2.findViewById(R.id.btn1);
        btn2 = viewcau2.findViewById(R.id.btn2);
        btn3 = viewcau2.findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = So.getText().toString();
                if(!input.isEmpty()){
                    double km = Double.parseDouble(input);
                    double meters = km * 1000;
                    //KQ.setText(meters);
                }
            }
        });
        return viewcau2;
    }
}