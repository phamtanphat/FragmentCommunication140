package com.ptp.phamtanphat.fragmentcommunication140;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by KhoaPhamPC on 30/11/2017.
 */

public class Fragment_B extends Fragment {

    View view;
    TextView txtb;
    EditText edtb;
    Button btnb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_b,container,false);
        txtb = view.findViewById(R.id.textviewfragmentb);
        edtb = view.findViewById(R.id.edittextfragmentb);
        btnb = view.findViewById(R.id.buttonfragmentb);
        return view;
    }
}
