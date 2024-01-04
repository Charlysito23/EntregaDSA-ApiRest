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

        if (!id.isEmpty() && !title.isEmpty() && !singer.isEmpty()) {
            Call<Track> call = apiService.createTrack(new Track(id, title, singer));
            call.enqueue(new Callback<Track>() {
                @Override
                public void onResponse(Call<Track> call, Response<Track> response) {
                    // Handle the response if needed
                }

                @Override
                public void onFailure(Call<Track> call, Throwable t) {
                    // Handle failure if needed
                }
            });

            Intent intentTracks = new Intent(AñadirTrackActivity.this, TrackListActivity.class);
            startActivity(intentTracks);
        } else {
            Toast.makeText(AñadirTrackActivity.this, "Missing fields", Toast.LENGTH_SHORT).show();
        }
    }

    public void returnTracks(View view) {
        Intent intentTracks = new Intent(AñadirTrackActivity.this, TrackListActivity.class);
        startActivity(intentTracks);
    }
}