package com.example.registerformpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        handleNextButton();
    }

    public void handleNextButton() {
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, PersonalInfoActivity.class);
            EditText emailAddressTxt = findViewById(R.id.email_address_txt);
            String emailAddress = emailAddressTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String password = passwordTxt.getText().toString();
            EditText conformPasswordTxt = findViewById(R.id.confirm_password_txt);
            String conformPassword = conformPasswordTxt.getText().toString();
            intent.putExtra("email", emailAddress);
            intent.putExtra("password", password);
            intent.putExtra("confirmPassword", conformPassword);
            startActivity(intent);
        });
    }
}