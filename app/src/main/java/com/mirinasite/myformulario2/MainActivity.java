package com.mirinasite.myformulario2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout textInputUsername;
    CalendarView calendarView;
    TextView myDate;
    private TextInputLayout textInputPhoneNumber;
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputDescription;
    private Object Toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(Toolbar toolbar);

        textInputUsername = findViewById(R.id.text_input_fullname);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        myDate = (TextView) findViewById(R.id.myDate);
        textInputPhoneNumber = findViewById(R.id.phone_number);
        textInputEmail = findViewById(R.id.email);
        textInputDescription = findViewById(R.id.user_description);

        addNextBtn();

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = (month + 1) + "/" + dayOfMonth + "/" + year;
                myDate.setText(date);

            }
        });
    }

    private boolean validateUsername() {
        String usernameInput = textInputUsername.getEditText().getText().toString().trim();

        if (usernameInput.isEmpty()) {
            textInputUsername.setError("Este campo no puede quedar vacío");
            return false;

        } else if (usernameInput.length() > 15) {
            textInputUsername.setError("Nombre de usuario demasiado largo");
            return false;
        } else {
            textInputUsername.setError(null);
            return true;
        }
    }

    private boolean validatePhoneNumber() {
        String phoneInput = textInputPhoneNumber.getEditText().getText().toString().trim();

        if (phoneInput.isEmpty()) {
            textInputPhoneNumber.setError("Este campo no puede quedar vacío");
            return false;
        } else {
            textInputPhoneNumber.setError(null);
            return true;
        }
    }

    private boolean validateEmail() {
        String emailInput = textInputEmail.getEditText().getText().toString().trim();

        if (emailInput.isEmpty()) {
            textInputEmail.setError("Este campo no puede quedar vacío");
            return false;
        } else {
            textInputEmail.setError(null);
            return true;
        }
    }



    public void addNextBtn() {
        Button nextBtn = (Button) findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
                startActivity(intent);
            }
        });
    }
}