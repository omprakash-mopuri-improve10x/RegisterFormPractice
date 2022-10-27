package com.example.registerformpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String conformPassword = intent.getStringExtra("confirmPassword");
        String userName = intent.getStringExtra("userName");
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        String placeOfBirth = intent.getStringExtra("placeOfBirth");
        String currentCompany = intent.getStringExtra("currentCompany");
        String totalExperience = intent.getStringExtra("totalExperience");
        String designation = intent.getStringExtra("designation");
        String bankName = intent.getStringExtra("bankName");
        String accountHolderName = intent.getStringExtra("accountHolderName");
        String accountNumber = intent.getStringExtra("accountNumber");
        String ifscCode = intent.getStringExtra("ifscCode");
        String panNumber = intent.getStringExtra("panNumber");
        String aadharNumber = intent.getStringExtra("aadharNumber");
        String houseNo = intent.getStringExtra("houseNo");
        String street = intent.getStringExtra("street");
        String city = intent.getStringExtra("city");
        String state = intent.getStringExtra("state");
        String country = intent.getStringExtra("country");
        String cardNumber = intent.getStringExtra("cardNumber");
        String cardHolder = intent.getStringExtra("cardHolder");
        String expiry = intent.getStringExtra("expiry");
        String cw = intent.getStringExtra("cw");

        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(email);
        TextView userNameTxt1 = findViewById(R.id.user_name_txt1);
        userNameTxt1.setText(userName);
        TextView firstNameTxt1 = findViewById(R.id.first_name_txt1);
        firstNameTxt1.setText(firstName);
        TextView lastNameTxt1 = findViewById(R.id.last_name_txt1);
        lastNameTxt1.setText(lastName);
        TextView currentCompanyTxt1 = findViewById(R.id.current_company_txt1);
        currentCompanyTxt1.setText(currentCompany);
        TextView totalExperienceTxt1 = findViewById(R.id.total_experience_txt1);
        totalExperienceTxt1.setText(totalExperience);
        TextView designationTxt1 = findViewById(R.id.designation_txt1);
        designationTxt1.setText(designation);
        TextView bankNameTxt = findViewById(R.id.bank_name_txt1);
        bankNameTxt.setText(bankName);
        TextView accountHolderNameTxt = findViewById(R.id.account_holder_name_txt1);
        accountHolderNameTxt.setText(accountHolderName);
        TextView accountNumberTxt = findViewById(R.id.account_number_txt1);
        accountNumberTxt.setText(accountNumber);
        TextView ifscCodeTxt = findViewById(R.id.ifsc_code_txt1);
        ifscCodeTxt.setText(ifscCode);
        TextView dateOfBirthTxt1 = findViewById(R.id.date_of_birth_txt1);
        dateOfBirthTxt1.setText(dateOfBirth);
        TextView placeOfBirthTxt = findViewById(R.id.place_of_birth_txt1);
        placeOfBirthTxt.setText(placeOfBirth);
        TextView panNumberTxt1 = findViewById(R.id.pan_number_txt1);
        panNumberTxt1.setText(panNumber);
        TextView aadharNumberTxt1 = findViewById(R.id.aadhar_number_txt1);
        aadharNumberTxt1.setText(aadharNumber);
        TextView houseNoTxt1 = findViewById(R.id.house_no_txt1);
        houseNoTxt1.setText(houseNo);
        TextView streetTxt1 = findViewById(R.id.street_txt1);
        streetTxt1.setText(street);
        TextView cityTxt1 = findViewById(R.id.city_txt1);
        cityTxt1.setText(city);
        TextView stateTxt1 = findViewById(R.id.state_txt1);
        stateTxt1.setText(state);
        TextView countryTxt1 = findViewById(R.id.country_txt1);
        countryTxt1.setText(country);
        TextView cardNumberTxt1 = findViewById(R.id.card_number_txt1);
        cardNumberTxt1.setText(cardNumber);
        TextView cardHolderTxt1 = findViewById(R.id.card_holder_txt1);
        cardHolderTxt1.setText(cardHolder);
        TextView expiryTxt1 = findViewById(R.id.expiry_txt1);
        expiryTxt1.setText(expiry);
        TextView cwTxt1 = findViewById(R.id.cw_txt1);
        cwTxt1.setText(cw);
    }
}