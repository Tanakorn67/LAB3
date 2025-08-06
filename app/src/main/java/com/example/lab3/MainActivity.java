package com.example.lab3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Textnote textNote1 = new Textnote();
        textNote1.title = "OOP HomeWork";
        textNote1.createdDate = "31-07-2025";
        textNote1.setTextContent("Do Lab4 and sent in the Google Classroom");
        textNote1.getSummary();

        User user1 = new User();
        user1.setFirst_Name("Tanakorn");
        user1.setLast_Name("Thongpao");
        user1.setPhone_Number("0000000000");
        user1.view_profile();
    }
}
