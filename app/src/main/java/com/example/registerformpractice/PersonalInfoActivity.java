package com.example.registerformpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        handleNextButton();
        handleBackButton();
    }

    public void handleNextButton(){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String email = intent.getStringExtra("email");
        //String password = intent.getStringExtra("password");
        //String conformPassword = intent.getStringExtra("confirmPassword");
        Button nextBtn2 = findViewById(R.id.next_btn2);
        nextBtn2.setOnClickListener(view -> {
            Intent nextBtnIntent = new Intent(this, AddressActivity.class);
            EditText userNameTxt = findViewById(R.id.user_name_txt);
            String userName = userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.first_name_txt);
            String firstName = firstNameTxt.getText().toString();
            EditText lastnameTxt = findViewById(R.id.last_name_txt);
            String lastName = lastnameTxt.getText().toString();
            nextBtnIntent.putExtras(bundle);
            //nextBtnIntent.putExtra("email", email);
            //nextBtnIntent.putExtra("password", password);
            //nextBtnIntent.putExtra("confirmPassword", conformPassword);
            nextBtnIntent.putExtra("userName", userName);
            nextBtnIntent.putExtra("firstName", firstName);
            nextBtnIntent.putExtra("lastName", lastName);
            startActivity(nextBtnIntent);
        });
    }

    public void handleBackButton() {
        Button backBtn1 = findViewById(R.id.back_btn1);
        backBtn1.setOnClickListener(view -> {
           finish();
        });
    }
}