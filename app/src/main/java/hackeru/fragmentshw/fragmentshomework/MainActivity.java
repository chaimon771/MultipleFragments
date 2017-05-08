package hackeru.fragmentshw.fragmentshomework;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //The Dynamic Aproach
        //1) get a reference to the fragment manager:

        // add, remove, replace, find.

    }

    public void color(View view) {
        manager.beginTransaction()
                .replace(R.id.frame1,new ColorPicker())
                .commit();
    }

    public void text(View view) {
        manager.beginTransaction()
                .replace(R.id.frame1,new TextFragment())
                .commit();
    }


    public void replaceTheTextFragmentWithThisNewColor(int color) {
        
    }
}
