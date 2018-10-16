package cadb.gov.zipvote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GregActivity extends AppCompatActivity {

    private Button RepublicanButton;

    private Button DemocratButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greg);

        RepublicanButton = (Button) findViewById(R.id.partyRepub);

        RepublicanButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen1();
            }
        });

        DemocratButton = (Button) findViewById(R.id.partyDemo);

        RepublicanButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen2();
            }
        });

    }

    private void openNextScreen1() {
        Intent i = new Intent(this, djd6621.class);
        startActivity(i);
    }


    private void openNextScreen2() {
        Intent i = new Intent(this, djd6621second.class);
        startActivity(i);
    }
}