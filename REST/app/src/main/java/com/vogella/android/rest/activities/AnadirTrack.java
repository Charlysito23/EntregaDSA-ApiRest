package com.vogella.android.rest.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.common.api.Api;
import com.google.android.material.textfield.TextInputEditText;
import com.vogella.android.rest.R;

public class AnadirTrack extends AppCompatActivity {
    private Api apiService;
    private TextInputEditText idtext;
    private TextInputEditText titulo;
    private TextInputEditText cantante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_track);

        apiService = RetrofitClient.getInstance().getMyApi();

        idtext = findViewById(R.id.idAdd);
        titulo = findViewById(R.id.titleAdd);
        cantante = findViewById(R.id.singerAdd);
    }

    public void addTrack(View view) {
        String id = idtext.getText().toString();
        String title = titulo.getText().toString();
        String singer = cantante.getText().toString();


    }

    public void returnTracks(View view) {
        Intent intentTracks = new Intent(AnadirTrack.this, ListaTracks.class);
        startActivity(intentTracks);
    }
}