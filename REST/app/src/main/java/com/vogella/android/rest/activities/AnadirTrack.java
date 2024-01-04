package com.vogella.android.rest.activities;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.vogella.android.rest.R;

import models.Track;

public class AnadirTrack extends AppCompatActivity {
    private Api apiService;
    private TextInputEditText idText;
    private TextInputEditText titleText;
    private TextInputEditText singerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_track);

        apiService = RetrofitClient.getInstance().getMyApi();

        idText = findViewById(R.id.idAdd);
        titleText = findViewById(R.id.titleAdd);
        singerText = findViewById(R.id.singerAdd);
    }

    public void addTrack(View view) {
        String id = idText.getText().toString();
        String title = titleText.getText().toString();
        String singer = singerText.getText().toString();


    }

    public void returnTracks(View view) {
        Intent intentTracks = new Intent(AnadirTrack.this, ListaTracks.class);
        startActivity(intentTracks);
    }
}