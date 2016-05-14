package net.maarti.simpleweather;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.maarti.simpleweather.R;

public class CreditsActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.credits, menu);
        return true;
    }

    public void onClickSettings(MenuItem item) {
        startActivity(new Intent(this, SettingsActivity.class));
    }

    public void onClickContact(View view) {
        String devMail = getString(R.string.devMail);
        String objectMail = getString(R.string.contactMailObject);
        String appName = getString(R.string.app_name);
        Uri mail = Uri.parse("mailto:" + devMail + "?subject=" + Uri.encode(objectMail + " " + appName));
        Intent mailActivity = new Intent(Intent.ACTION_SENDTO, mail);
        startActivity(mailActivity);
    }

    public void onClickAppSite(View view) {
        String appSite = getString(R.string.appWebSiteUrl)+"#simpleweather";
        Uri uri = Uri.parse(appSite);
        Intent webActivity = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(webActivity);
    }

    public void onClickImagesAuthor(View view) {
        String appSite = getString(R.string.appImagesAuthorSiteUrl);
        Uri uri = Uri.parse(appSite);
        Intent webActivity = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(webActivity);
    }

    public void onClickOpenWeather(View view) {
        String appSite = getString(R.string.open_weather_url);
        Uri uri = Uri.parse(appSite);
        Intent webActivity = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(webActivity);
    }
}
