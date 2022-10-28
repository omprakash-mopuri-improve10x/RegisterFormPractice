package com.example.registerformpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
        handleNextButton();
        handleBackButton();
    }

    public void handleNextButton() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //String email = intent.getStringExtra("email");
        //String password = intent.getStringExtra("password");
        //String conformPassword = intent.getStringExtra("confirmPassword");
        //String userName = intent.getStringExtra("userName");
        //String firstName = intent.getStringExtra("firstName");
        //String lastName = intent.getStringExtra("lastName");
        //String dateOfBirth = intent.getStringExtra("dateOfBirth");
        //String placeOfBirth = intent.getStringExtra("placeOfBirth");
        //String currentCompany = intent.getStringExtra("currentCompany");
        //String totalExperience = intent.getStringExtra("totalExperience");
        //String designation = intent.getStringExtra("designation");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent nextBtnIntent = new Intent(this, CreditCardDetailsActivity.class);
            EditText bankNameTxt = findViewById(R.id.bank_name_txt);
            String bankName = bankNameTxt.getText().toString();
            EditText accountHolderNameTxt = findViewById(R.id.account_holder_name_txt);
            String accountHolderName =  accountHolderNameTxt.getText().toString();
            EditText accountNumberTxt = findViewById(R.id.account_number_txt);
            String accountNumber = accountNumberTxt.getText().toString();
            EditText ifscCodeTxt = findViewById(R.id.ifsc_code_txt);
            String ifscCode = ifscCodeTxt.getText().toString();
            nextBtnIntent.putExtras(bundle);
            //nextBtnIntent.putExtra("email", email);
            //nextBtnIntent.putExtra("password", password);
            //nextBtnIntent.putExtra("confirmPassword", conformPassword);
            //nextBtnIntent.putExtra("userName", userName);
            //nextBtnIntent.putExtra("firstName", firstName);
            //nextBtnIntent.putExtra("lastName", lastName);
            //nextBtnIntent.putExtra("dateOfBirth", dateOfBirth);
            //nextBtnIntent.putExtra("placeOfBirth", placeOfBirth);
            //nextBtnIntent.putExtra("currentCompany", currentCompany);
            //nextBtnIntent.putExtra("totalExperience", totalExperience);
            //nextBtnIntent.putExtra("designation", designation);
            nextBtnIntent.putExtra("bankName", bankName);
            nextBtnIntent.putExtra("accountHolderName", accountHolderName);
            nextBtnIntent.putExtra("accountNumber", accountNumber);
            nextBtnIntent.putExtra("ifscCode", ifscCode);
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