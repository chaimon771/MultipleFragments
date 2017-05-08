package hackeru.fragmentshw.fragmentshomework;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class TextFragment extends Fragment {


    private static final String ARG_MIVZAKIM = "Mivzakim";
    ArrayList<String> mivzakim;
    TextView tvMivzakim;

    //newInstance -> Auto Complete this syntax without boaring coding...
    public static TextFragment newInstance(ArrayList<String> mivzakim) {
        //Factory Methode that replace the constructor
        TextFragment fragment = new TextFragment();
        Bundle args = new Bundle();
        args.putStringArrayList(ARG_MIVZAKIM, mivzakim);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle args = getArguments();

        if (args != null)
            mivzakim = args.getStringArrayList(ARG_MIVZAKIM);

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_text, container, false);
        tvMivzakim = (TextView) v.findViewById(R.id.tvMivzakim);

        Random r = new Random();
        int index = r.nextInt(mivzakim.size());
        tvMivzakim.setText(mivzakim.get(index));

        return v;
    }

}
