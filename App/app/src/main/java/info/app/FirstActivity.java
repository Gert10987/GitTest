package info.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import info.x.R;


/*
 * Created by Paweł on 2016-01-08.
 */
public class FirstActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void StartProgram(View obiekt1) {
        startActivity(new Intent(FirstActivity.this, SecondActivity.class));

    }

}
