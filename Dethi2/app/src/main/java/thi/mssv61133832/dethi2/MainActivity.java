package thi.mssv61133832.dethi2;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        frameLayout = findViewById(R.id.fragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
                int itemId=Item.getItemId();
                if(itemId==R.id.cau1){
                    loadFragment(new WelcomeFragment(),false );
                }else if(itemId==R.id.cau2){
                    loadFragment(new UnitConverterFragment(),false );
                }else if(itemId==R.id.cau3){
                    loadFragment(new WelknownCoffeeFragment(),false );
                }else if(itemId==R.id.cau4){
                    loadFragment(new SubjectsFragment(),false );
                }else{
                    loadFragment(new MyCVFragment(),false );
                }
                return true;
            }
        });
        loadFragment(new WelcomeFragment(), true);
    }
    private void loadFragment(Fragment fragment, boolean isAppInitialized){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(isAppInitialized){
            fragmentTransaction.add(R.id.fragment, fragment);
        }else{
            fragmentTransaction.replace(R.id.fragment, fragment);
        }
        fragmentTransaction.commit();
    }
}