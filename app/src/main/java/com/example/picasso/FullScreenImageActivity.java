package com.example.picasso;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import org.apache.log4j.Logger;

public class FullScreenImageActivity extends AppCompatActivity {
    private static final Logger log = Logger.getLogger(FullScreenImageActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        try {
            ImageView imageView = findViewById(R.id.full_screen_image_view);
            String url = getIntent().getStringExtra("image_url");
            Picasso.with(this).load(url).into(imageView);

            Button backButton = findViewById(R.id.back_button);
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        } catch (Exception e) {
            log.error("Error occurred in FullScreenImageActivity: ", e);
        }
    }
}

