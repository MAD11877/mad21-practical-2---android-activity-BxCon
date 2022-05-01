package com.example.mad_practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User test = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Name = findViewById(R.id.Heading);
        TextView Description = findViewById(R.id.Main_Text);
        Button Follow_Button = findViewById(R.id.Follow_Button);

        Name.setText(test.name);
        Description.setText(test.description);
        Follow_Button.setText(test.followed ? "Follow": "Unfollow");
    }

    public void F_But(View v) {
        test.followed = !test.followed;

        Button Follow_Button = findViewById(R.id.Follow_Button);
        Follow_Button.setText(test.followed ? "Follow": "Unfollow");
    }

}