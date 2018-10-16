package cadb.gov.zipvote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GregActivity extends AppCompatActivity {

    private Button republicanButton;
    private Button democratButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greg);

        republicanButton = (Button) findViewById(R.id.partyRepub);
        democratButton = (Button) findViewById(R.id.partyDemo);

        republicanButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen(djd6621.class);
            }
        });

        democratButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen(djd6621second.class);
            }
        });

    }

    private void openNextScreen(Class c) {
        Intent i = new Intent(this, c);
        startActivity(i);
    }
}