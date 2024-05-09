package ky.lm.vidu_sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Khai báo các biến Database
    String DbPathSuffix= "/databases/";//thư mục chứa csdl
    SQLiteDatabase database=null;//khai báo tên csdl
    String DbName="qlsach.db";//tên file chứa csdl
    //Khai báo ListView
    ListView lv;
    ArrayList<String> ds;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Tao cac tham so
        lv=findViewById(R.id.lv);
        ds = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ds);
        lv.setAdapter(adapter);
        //Gọi hàm tiến hành copy csdl từ Assets vào thư mục db trong bo nhớ cài đặt ứng dụng
        processCopy();
        database = openOrCreateDatabase("qlsach.db",MODE_PRIVATE,null);
        //Truy vấn
        Cursor cursor = database.query("tbsach",null,null,null,null,null,null);
        String data = "";
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            data = cursor.getString(0)+" - "+cursor.getString(1)+" - "+cursor.getString(2)+" - "+cursor.getString(3);
            ds.add(data);
            cursor.moveToNext();
        }
        cursor.close();
        //cập nhật adapter
        adapter.notifyDataSetChanged();
    }

    private void processCopy() {
//private app
        File dbFile = getDatabasePath(DbName);
        if (!dbFile.exists())
        {
            try{CopyDataBaseFromAsset();
                Toast.makeText(this, "Copying sucess from Assets folder",
                        Toast.LENGTH_LONG).show();
            }
            catch (Exception e){
                Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
            }
        }
    }
    private String getDatabasePath() {
        return getApplicationInfo().dataDir + DbPathSuffix+ DbName;
    }
    public void CopyDataBaseFromAsset() {
        // TODO Auto-generated method stub
        try {
            InputStream myInput;
            myInput = getAssets().open(DbName);
            // Path to the just created empty db
            String outFileName = getDatabasePath();
            // if the path doesn't exist first, create it
            File f = new File(getApplicationInfo().dataDir + DbPathSuffix);
            if (!f.exists())
                f.mkdir();
            // Open the empty db as the output stream
            OutputStream myOutput = new FileOutputStream(outFileName);
            // transfer bytes from the inputfile to the outputfile
            // Truyền bytes dữ liệu từ input đến output
            int size = myInput.available();
            byte[] buffer = new byte[size];
            myInput.read(buffer);
            myOutput.write(buffer);
            // Close the streams
            myOutput.flush();
            myOutput.close();
            myInput.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}