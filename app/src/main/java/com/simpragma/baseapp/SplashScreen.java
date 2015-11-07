package com.simpragma.baseapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;
import com.google.gson.Gson;
import com.simpragma.baseapp.models.GsonData;
import com.squareup.picasso.Picasso;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.fabric.sdk.android.Fabric;

public class SplashScreen extends Activity {

    private Logger LOG = LoggerFactory.getLogger(SplashScreen.class);

    @Bind(R.id.text_view)
    TextView title;

    @Bind(R.id.image_logo)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.splash_screen);
        ButterKnife.bind(this);
        title.setText("Hello");
        Picasso.with(SplashScreen.this).load("http://i.imgur.com/DvpvklR.png").error(R.mipmap.ic_launcher).into(imageView);
        LOG.debug("This is a fine start {}",getApplicationContext().getApplicationInfo().className);

        //--- GSON example ---------//
        GsonData data = new GsonData();
        data.setId("1");
        data.setName("Swagata");
        Gson gson = new Gson();
        LOG.debug("GsonData {}",gson.toJson(data));
    }
}
