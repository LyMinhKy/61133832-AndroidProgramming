package ntu.MSSV61133832.cau2_appbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai báo các đối tượng
    EditText Chieuccao,Cannang;
    RadioButton gtNam,gtNu;
    Button Tinh;
    TextView KQ,DG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }
    void TimDieuKhien(){
        Chieuccao=(EditText) findViewById(R.id.edtChieucao);
        Cannang = (EditText) findViewById(R.id.edtCannang);
        gtNam=(RadioButton) findViewById(R.id.btnNam);
        gtNu=(RadioButton) findViewById(R.id.btnNu);
        Tinh=(Button) findViewById(R.id.btnTinh);
        KQ=(TextView) findViewById(R.id.txtKQ);
        DG=(TextView) findViewById(R.id.txtDG);
    }
    void TinhBMI(View v){
        //Chuyển dữ liệu sang chuỗi
        String chieucao = Chieuccao.getText().toString();
        String cannang = Cannang.getText().toString();
        //Chuyển dữ liệu chuỗi sang số
        double chieuCao = Double.parseDouble(chieucao);
        double canNang = Double.parseDouble(cannang);

        double KQ=Math.round((canNang/Math.pow(chieuCao,2))*10.0)/10.0;
    }
}