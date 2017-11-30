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

/**
 * Created by KhoaPhamPC on 30/11/2017.
 */

public class Fragment_A extends Fragment {

    View view;
    TextView txttitlea;
    EditText edta;
    Button btna;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_a,container,false);
        txttitlea = view.findViewById(R.id.textviewfragmenta);
        edta = view.findViewById(R.id.edittextfragmenta);
        btna = view.findViewById(R.id.buttonfragmenta);
        return view;
    }
}
