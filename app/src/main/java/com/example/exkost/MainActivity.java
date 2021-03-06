package com.example.exkost;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

// get the reference of Button's
        firstFragment = (Button) findViewById(R.id.firstFragment);
        secondFragment = (Button) findViewById(R.id.secondFragment);

        FragmentManager fm = getFragmentManager();

// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, new LogFirstFragment());
        fragmentTransaction.commit(); // save the changes

// perform setOnClickListener event on First Button
        firstFragment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

// load First Fragment
                loadFragment(new LogFirstFragment());

            }
        });

// perform setOnClickListener event on Second Button
        secondFragment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

// load Second Fragment
                loadFragment(new LogSecondFragment());
            }
        });

    }


    private void loadFragment(Fragment fragment) {

// create a FragmentManager
        FragmentManager fm = getFragmentManager();

// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes

    }
}


