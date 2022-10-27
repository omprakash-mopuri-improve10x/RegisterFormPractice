package com.example.registerformpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        handleNextButton();
        handleBackButton();
    }

    public void handleNextButton() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String email = intent.getStringExtra("email");
        //String password = intent.getStringExtra("password");
        //String confirmPassword = intent.getStringExtra("confirmPassword");
        //String userName = intent.getStringExtra("userName");
        //String firstName = intent.getStringExtra("firstName");
        //String lastName = intent.getStringExtra("lastName");
        Button nextBtn5 = findViewById(R.id.next_btn5);
        nextBtn5.setOnClickListener(view -> {
            Intent nextBtnIntent = new Intent(this, ProfessionalInfoActivity.class);
            EditText dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
            String dateOfBirth = dateOfBirthTxt.getText().toString();
            EditText placeOfBirthTxt = findViewById(R.id.place_of_birth_txt);
            String placeOfBirth = placeOfBirthTxt.getText().toString();
            //nextBtnIntent.putExtra("email", email);
            //nextBtnIntent.putExtra("password", password);
            //nextBtnIntent.putExtra("confirmPassword",confirmPassword);
            //nextBtnIntent.putExtra("userName", userName);
            //nextBtnIntent.putExtra("firstName", firstName);
            //nextBtnIntent.putExtra("lastName", lastName);
            nextBtnIntent.putExtras(bundle);
            nextBtnIntent.putExtra("dateOfBirth", dateOfBirth);
            nextBtnIntent.putExtra("placeOfBirth", placeOfBirth);
            startActivity(nextBtnIntent);
        });
    }

    public void handleBackButton() {
        Button backBtn5 = findViewById(R.id.back_btn5);
        backBtn5.setOnClickListener(view -> {
            finish();
        });
    }
}