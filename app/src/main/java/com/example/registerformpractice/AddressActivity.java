package com.example.registerformpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        handleNextButton();
        handleBackButton();
    }

    public void handleNextButton() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button nextBtn7 = findViewById(R.id.next_btn7);
        nextBtn7.setOnClickListener(view -> {
            EditText houseNoTxt = findViewById(R.id.house_no_txt);
            String houseNo = houseNoTxt.getText().toString();
            EditText streetTxt = findViewById(R.id.street_txt);
            String street = streetTxt.getText().toString();
            EditText cityTxt = findViewById(R.id.city_txt);
            String city = cityTxt.getText().toString();
            EditText stateTxt = findViewById(R.id.state_txt);
            String state = stateTxt.getText().toString();
            EditText countryTxt = findViewById(R.id.country_txt);
            String country = countryTxt.getText().toString();
            Intent nextBtnIntent = new Intent(this, BirthDetailsActivity.class);
            nextBtnIntent.putExtras(bundle);
            nextBtnIntent.putExtra("houseNo", houseNo);
            nextBtnIntent.putExtra("street", street);
            nextBtnIntent.putExtra("city", city);
            nextBtnIntent.putExtra("state", state);
            nextBtnIntent.putExtra("country", country);
            startActivity(nextBtnIntent);
        });
    }

    public void handleBackButton() {
        Button backBtn7 = findViewById(R.id.back_btn7);
        backBtn7.setOnClickListener(view -> {
            finish();
        });
    }
}