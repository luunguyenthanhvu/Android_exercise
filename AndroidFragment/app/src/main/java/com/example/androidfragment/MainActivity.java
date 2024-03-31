package com.example.androidfragment;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements DemoFragmentInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment1 fragment1 = new Fragment1();
        fragmentTransaction.add(R.id.containerTop, fragment1);

        Fragment2 fragment2 = new Fragment2();
        fragmentTransaction.add(R.id.containerBottom, fragment2);
        fragmentTransaction.commit();
    }

    @Override
    public void sendData(String name, String age) {
        Fragment2 fragment2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.containerBottom);
        if(fragment2 != null || fragment2.isInLayout()) {
            fragment2.showInfo(name, age);
        } else {
            Toast.makeText(getApplicationContext(), "???", Toast.LENGTH_LONG).show();
        }
    }
}