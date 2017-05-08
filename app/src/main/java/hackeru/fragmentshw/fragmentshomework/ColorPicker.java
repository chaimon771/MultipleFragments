package hackeru.fragmentshw.fragmentshomework;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.SeekBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorPicker extends Fragment implements SeekBar.OnSeekBarChangeListener {

    EditText etRed, etGreen, etBlue, etResult;
    SeekBar sbBlue, sbRed, sbGreen;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_color_picker, container, false);

        etBlue = (EditText) v.findViewById(R.id.etBlue);
        etGreen = (EditText) v.findViewById(R.id.etGreen);
        etRed = (EditText) v.findViewById(R.id.etRed);
        etResult = (EditText) v.findViewById(R.id.etResult);

        sbBlue = (SeekBar) v.findViewById(R.id.sbBlue);
        sbGreen = (SeekBar) v.findViewById(R.id.sbGreen);
        sbRed = (SeekBar) v.findViewById(R.id.sbRed);

        sbBlue.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbRed.setOnSeekBarChangeListener(this);



        return v;
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int red = sbRed.getProgress();
        int green = sbGreen.getProgress();
        int blue = sbBlue.getProgress();

        int color = Color.rgb(red,green,blue);
        String hex = Integer.toHexString(color);

        etResult.setText(hex);
        etResult.setBackgroundColor(color);

        MainActivity main = (MainActivity) getActivity();
        main.replaceTheTextFragmentWithThisNewColor(color);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
