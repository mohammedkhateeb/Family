package com.example.rahaf.safeheart1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    Button loginBtn;
    TextView txtID, txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginButton();

    }

    public void LoginButton()
    {
        loginBtn=(Button) findViewById(R.id.loginBtn);
        txtID=(TextView)  findViewById(R.id.txtID);
        txtPassword=(TextView)  findViewById(R.id.txtPassword);

        loginBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (txtID.getText().toString().equals("21410092") && txtPassword.getText().toString().equals("0000"))
                        {
                            Toast.makeText(Login_Activity.this,"UserID and password is correct",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(v.getContext(),User_Activity.class);
                            startActivity(intent);

                        }
                        else {
                            Toast.makeText(Login_Activity.this,"UserID and password is NOT correct",
                                    Toast.LENGTH_SHORT).show();

                        }


                    }
                }

        );


    }

}
