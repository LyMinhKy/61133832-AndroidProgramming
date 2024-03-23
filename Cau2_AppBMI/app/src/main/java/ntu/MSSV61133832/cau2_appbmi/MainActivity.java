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

        double BMI=Math.round((canNang/Math.pow(chieuCao,2))*10.0)/10.0;

        if(gtNam.isChecked()){
            if(BMI<18.5){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Cân nặng thấp (gầy)");
            }
            if(BMI>=18.5 && BMI <= 24.9){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Bình thường");
            }
            if(BMI == 25){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Thừa cân");
            }
            if(BMI > 25 && BMI <= 29.9){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Tiền béo phì");
            }
            if(BMI > 30 && BMI <= 34.9){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Béo phì độ I");
            }
            if(BMI > 35 && BMI <= 39.9){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Béo phì độ II");
            }
            if(BMI>=40){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Béo phì độ III");
            }
        }
        else if(gtNu.isChecked()){
            if(BMI<18.5){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Cân nặng thấp (gầy)");
            }
            if(BMI>=18.5 && BMI <= 24.9){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Bình thường");
            }
            if(BMI == 25){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Thừa cân");
            }
            if(BMI > 25 && BMI <= 29.9){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Tiền béo phì");
            }
            if(BMI > 30 && BMI <= 34.9){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Béo phì độ I");
            }
            if(BMI > 35 && BMI <= 39.9){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Béo phì độ II");
            }
            if(BMI>=40){
                String Kq = String.valueOf(BMI);
                KQ.setText(Kq);
                DG.setText("Béo phì độ III");
            }
        }
    }
}