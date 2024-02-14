package com.example.picasso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3)); // 3 columns

        List<String> urls = Arrays.asList(
                "https://media.cntraveler.com/photos/58a5d89287666e798dbdb573/master/pass/antarctica-scotia-sea-chinstrap-penguins-GettyImages-126249208.jpg",
                "https://www.africaendeavours.com/wp-content/uploads/2015/02/homepage-hero-1-herd-elephants-african-savanna-sunset-2000x1125.jpg",
                "https://images.hdqwalls.com/wallpapers/landscape-alpine-mountains-landscape-5k-1k.jpg",
                "https://www.spafinder.com/wp-content/uploads/2016/05/Sunrise-Beach.jpg",
                "https://www.legendarymage.com/wp-content/uploads/2020/11/ENB-Skyrim.jpg",
                "https://wallpapers.com/images/hd/the-witcher-3-wild-hunt-game-wallpaper-all-hd-wallpaper-dxuajqqs6d1v6cqm.jpg",
                "https://www.minecraft.net/content/dam/archive/729d06e3c48f451863051ef2ea3c054e-odplanet.png",
                "https://usaherald.com/wp-content/uploads/2021/01/spacex-9dF7pCyaM9s-unsplash-scaled.jpg",
                "https://cdn.geekwire.com/wp-content/uploads/2020/12/201210-spacex.jpg",
                "https://scitechdaily.com/images/Hubble-Veil-Nebula-scaled.jpg",
                "https://s3.amazonaws.com/eb-blog-wpmulti/wp-content/uploads/wpmulti/sites/3/2017/03/09123720/EDM-lights-EDC.jpg",
                "https://www.architecturelab.net/wp-content/uploads/2022/03/Image-13.jpg",
                "https://www.pcgamesn.com/wp-content/uploads/2022/02/elden-ring-review-5.jpg",
                "https://wallpapercave.com/wp/IFVGVdz.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/b/b4/Golden_Retriever_puppy_standing.jpg",
                "https://www.discoverboating.com/sites/default/files/best-offshore-fishing-boats.jpg",
                "https://www.fishing.net.nz/forum/uploads/80000/march-fishing-sunrise-in-Puerto-Vallarta.jpg",
                "https://images.purexbox.com/9d1936c1d9502/elden-ring-screenshot-4.original.jpg",
                "https://d.newsweek.com/en/full/1185689/moon.jpg",
                "https://images4.alphacoders.com/702/702142.jpg",
                "https://highlandexpeditions.com/wp-content/uploads/2017/05/Everest-south-summit-1-1.jpg",
                "https://wallpaperaccess.com/full/254381.jpg",
                "https://vicadia.com/wp-content/uploads/2020/12/ekwb201ce.jpg",
                "https://i.pinimg.com/originals/6a/84/8f/6a848f75a03b35d6e8de3a614e3fd3d8.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/1/17/Mountain_bike_in_downhill_race.jpg",
                "https://images.wallpapersden.com/image/download/climber-slide-rock_22384_5100x3400.jpg",
                "https://wallpaperaccess.com/full/328065.jpg",
                "https://s-media-cache-ak0.pinimg.com/originals/8a/bd/e8/8abde83cb3da5a083f2ab8301aef13a8.jpg",
                "https://wallpaperaccess.com/full/482935.jpg"
        );
        ImageAdapter adapter = new ImageAdapter(this, urls);
        recyclerView.setAdapter(adapter);
    }
}
