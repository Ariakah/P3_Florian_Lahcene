package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;

import java.io.Serializable;

public class ProfilNeighbourActivity extends AppCompatActivity implements Serializable {

    private ImageView mAvatar;
    private TextView mName1, mName2, mCity, mPhone, mAbout, mFbUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_neighbour);

        mAvatar = findViewById(R.id.profil_neighbour_image);
        mName1 = findViewById(R.id.profil_neighbour_name1);
        mName2 = findViewById(R.id.profil_neighbour_name2);
        mCity = findViewById(R.id.profil_neighbour_city);
        mPhone = findViewById(R.id.profil_neighbour_phone);
        mAbout = findViewById(R.id.profil_neighbour_about);
        mFbUrl = findViewById(R.id.profil_neighbour_fbUrl);

        Intent i = getIntent();
        String image = i.getStringExtra("avatar");
        String name = i.getStringExtra("name");
        String city = i.getStringExtra("city");
        String phone = i.getStringExtra("phone");
        String about = i.getStringExtra("about");
        String fbUrl = i.getStringExtra("fbUrl");
        Glide.with(this).asBitmap().load(image).fitCenter().into(mAvatar);
        mName1.setText(name);
        mName2.setText(name);
        mCity.setText(city);
        mPhone.setText(phone);
        mFbUrl.setText(fbUrl + name);
        mAbout.setText(about);

    }

}