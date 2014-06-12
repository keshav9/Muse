package com.example.UserLogin;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created with IntelliJ IDEA.
 * User: ehc
 * Date: 12/6/14
 * Time: 10:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class CredentialActivity extends Activity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
        setContentView(R.layout.credential);
        TextView displayMesage=(TextView)findViewById(R.id.DisplayMessage);
        displayMesage.setText("Welcome "+getIntent().getExtras().get("username")+" !");
        Button showLocation=(Button)findViewById(R.id.showLocation);
        showLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To change body of implemented methods use File | Settings | File Templates.
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/place/17%C2%B026'31.4%22N+78%C2%B023'55.6%22E/@17.442067,78.398791,15z/data=!3m1!4b1!4m2!3m1!1s0x0:0x0"));
                startActivity(intent);
            }
        });

    }
}
