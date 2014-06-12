package com.example.UserLogin;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity {
    String userName;
    String password;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final EditText enteredUserName = (EditText) findViewById(R.id.userName);
        final EditText enteredPassword = (EditText) findViewById(R.id.password);
        Button submitButton = (Button) findViewById(R.id.submitButton);
        final TextView displayMessage = (TextView) findViewById(R.id.DisplayErrorMessage);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To change body of implemented methods use File | Settings | File Templates.
                userName = enteredUserName.getText().toString();
                password = enteredPassword.getText().toString();
                if (userName.equals(("eggheadcreative").trim()) && password.equals(("ehc4eva").trim())) {
                     Intent intent=new Intent(MyActivity.this,CredentialActivity.class);
                    intent.putExtra("username",userName);
                    startActivity(intent);
                   /* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/place/The+Egghead+Creative/@17.44176,78.39878,17z/data=!3m1!4b1!4m2!3m1!1s0x0:0x5fa56c2c36d7106d"));*/

                } else {
                    /*Toast t = Toast.makeText(getApplicationContext(), "Please Check User Name/Password", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER, 20, -100);
                    t.show();*/
                    displayMessage.setText("Please Check User Name/Password");
                }


            }
        });

    }
}
