package com.example.registerformpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        handleNextButton();
        handleBackButton();
    }

    public void handleNextButton() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent nextBtnIntent = new Intent(this, SuccessActivity.class);
            nextBtnIntent.putExtras(bundle);
            EditText panNumberTxt = findViewById(R.id.pan_number_txt);
            String panNumber = panNumberTxt.getText().toString();
            EditText aadharNumberTxt = findViewById(R.id.aadhar_number_txt);
            String aadharNumber = aadharNumberTxt.getText().toString();
            nextBtnIntent.putExtra("panNumber", panNumber);
            nextBtnIntent.putExtra("aadharNumber", aadharNumber);
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