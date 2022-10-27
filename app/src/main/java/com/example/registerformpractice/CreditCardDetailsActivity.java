package com.example.registerformpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
        handleNextButton();
        handleBackButton();
    }
    public void handleNextButton() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button nextBtn8 = findViewById(R.id.next_btn8);
        nextBtn8.setOnClickListener(view -> {
            EditText cardNumberTxt = findViewById(R.id.card_number_txt);
            String cardNumber = cardNumberTxt.getText().toString();
            EditText cardHolderTxt = findViewById(R.id.card_holder);
            String cardHolder = cardHolderTxt.getText().toString();
            EditText expiryTxt = findViewById(R.id.expiry_txt);
            String expiry = expiryTxt.getText().toString();
            EditText cwTxt = findViewById(R.id.cw_txt);
            String cw = cwTxt.getText().toString();
            Intent nextBtnIntent = new Intent(this, IdentityActivity.class);
            nextBtnIntent.putExtras(bundle);
            nextBtnIntent.putExtra("cardNumber", cardNumber);
            nextBtnIntent.putExtra("cardHolder", cardHolder);
            nextBtnIntent.putExtra("expiry", expiry);
            nextBtnIntent.putExtra("cw", cw);
            startActivity(nextBtnIntent);
        });
    }

    public void handleBackButton() {
        Button backBtn8 = findViewById(R.id.back_btn8);
        backBtn8.setOnClickListener(view -> {
            finish();
        });
    }
}