package com.ajayam.activity_2_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ajayam.activity_2_fragment.fragment.FirstFragment;

public class MainActivity extends AppCompatActivity {

    EditText name, phone;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendDataToFragment();
            }
        });
        }
        private void SendDataToFragment() {
            String passName, passPhone = "";

            passName = name.getText().toString();
            passPhone = phone.getText().toString();

            Fragment frag = new FirstFragment();

            Bundle bundle = new Bundle();

            bundle.putString("name",passName);
            bundle.putString("phone",passPhone);

            frag.setArguments(bundle);


            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.ActivityMain, frag).commit();

//            fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new DefaultFragment()).commit();

//            fragmentTransaction.replace(R.id.ActivityMain, fragment).addToBackStack()
//
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container, fragmentB)
//                    .addToBackStack(MyFragmentA.class.getSimpleName())
//                    .commit();
        }
}