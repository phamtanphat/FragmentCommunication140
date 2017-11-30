package com.ptp.phamtanphat.fragmentcommunication140;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtmain;
    Button btnmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtmain = findViewById(R.id.textviewtitlemain);
        btnmain = findViewById(R.id.buttonmain);
        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment_A fragment_a = new Fragment_A();
                Bundle bundle = new Bundle();
                bundle.putString("Main","Main Activity");
                fragment_a.setArguments(bundle);
                fragmentTransaction.add(R.id.framelayout,fragment_a);
                fragmentTransaction.commit();
            }
        });
    }
}
