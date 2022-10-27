package com.example.registerformpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info);
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
        //String dateOfBirth = intent.getStringExtra("dateOfBirth");
        //String placeOfBirth = intent.getStringExtra("placeOfBirth");
        Button nextBtn4 = findViewById(R.id.next_btn4);
        nextBtn4.setOnClickListener(view -> {
            Intent nextBtnIntent = new Intent(this, BankAccountActivity.class);
            EditText currentCompanyTxt = findViewById(R.id.current_company_txt);
            String currentCompany = currentCompanyTxt.getText().toString();
            EditText totalExperienceTxt = findViewById(R.id.total_experience_txt);
            String totalExperience = totalExperienceTxt.getText().toString();
            EditText designationTxt = findViewById(R.id.designation_txt);
            String designation = designationTxt.getText().toString();
            nextBtnIntent.putExtras(bundle);
            //nextBtnIntent.putExtra("email", email);
            //nextBtnIntent.putExtra("password", password);
            //nextBtnIntent.putExtra("confirmPassword", confirmPassword);
            //nextBtnIntent.putExtra("userName", userName);
            //nextBtnIntent.putExtra("firstName", firstName);
            //nextBtnIntent.putExtra("lastName", lastName);
            //nextBtnIntent.putExtra("dateOfBirth", dateOfBirth);
            //nextBtnIntent.putExtra("placeOfBirth", placeOfBirth);
            nextBtnIntent.putExtra("currentCompany", currentCompany);
            nextBtnIntent.putExtra("totalExperience", totalExperience);
            nextBtnIntent.putExtra("designation", designation);
            startActivity(nextBtnIntent);
        });
    }

    public void handleBackButton() {
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}