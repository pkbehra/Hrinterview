package centriotech.hrinterview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    CardView fresher,experience,rember,aboutus,share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fresher = findViewById(R.id.crdroomlist);
        experience= findViewById(R.id.crdroomlist1);
        rember=findViewById(R.id.crdroomlist2);
        aboutus=findViewById(R.id.crdroomlist3);
        share=findViewById(R.id.crdroomlist4);

        fresher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Fresher Questions", Toast.LENGTH_SHORT).show();
            }
        });

        experience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Exprience Questions", Toast.LENGTH_SHORT).show();
            }
        });

        rember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Things to Remember", Toast.LENGTH_SHORT).show();
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "About Us", Toast.LENGTH_SHORT).show();
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Share", Toast.LENGTH_SHORT).show();
            }
        });

    }
}