package hackeru.fragmentshw.fragmentshomework;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class TheMainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView navigationView;
    FragmentManager manager;
    ColorPicker mColorPicker;
    TextFragment mTextFragmen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_main);

        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(this);

        mColorPicker = new ColorPicker();
        mTextFragmen = new TextFragment();


        manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.frame1, mColorPicker)
                .commit();


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.navigation_color:

                manager.beginTransaction()
                        .replace(R.id.frame1, mColorPicker)
                        .commit();

                return true;
            case R.id.navigation_text:
                ArrayList<String> mivzakim = new ArrayList<>();
                mivzakim.add("Mivzak1");
                mivzakim.add("Mivzak2");
                mivzakim.add("Mivzak3");
                mivzakim.add("Mivzak4");
                manager.beginTransaction()
                        .replace(R.id.frame1, TextFragment.newInstance(mivzakim))
                        .commit();
                return true;
            case R.id.navigation_notifications:

                manager.beginTransaction()
                        .replace(R.id.frame1, mColorPicker)
                        .commit();
                return true;
        }

        return false;
    }
}
