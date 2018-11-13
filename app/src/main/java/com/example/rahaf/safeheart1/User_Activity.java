package com.example.rahaf.safeheart1;

import android.app.Notification;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class User_Activity extends AppCompatActivity {
    ImageButton   notification_button ;

    Button location , patient_button,Status_button;
    TextView heart_rate_reading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);



        location=(Button)findViewById(R.id.Location);

        patient_button=(Button) findViewById(R.id.chating);

        notification_button=(ImageButton) findViewById(R.id.notification);

    }




    public void MapsActivity(View view)
    {
        location.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(User_Activity.this,MapsActivity.class);
                        startActivity(intent);

                    }
                }
        );
    }

    public void NotificationActivity()
    {
        notification_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(),NotificatinActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }


    public void PatientAcivity(View view) {


        patient_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(User_Activity.this,PatientAcivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
