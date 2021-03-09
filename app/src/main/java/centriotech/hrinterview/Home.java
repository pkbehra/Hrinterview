package centriotech.hrinterview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
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
              Intent intent=new Intent(Home.this,Remember.class);
              startActivity(intent);
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(Home.this).create(); //Read Update
                alertDialog.setTitle("hi");
                alertDialog.setMessage("We are an IT Company work on different sectors such as Web Development, Web Designing, Android Development, Software Development, Hosting Solution, Etc ");
                alertDialog.show();

            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent =new Intent((Intent.ACTION_SEND));
                sharingIntent.setType("text/plain");
                String shareBody="https://play.google.com/store/apps/details?id=com.centriotech.centriotech";
                String shareSubject="HR Interview";
                sharingIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT,shareSubject);
                startActivity(Intent.createChooser(sharingIntent,"Share Using"));
            }
        });

    }
}