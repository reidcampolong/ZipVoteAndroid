package cadb.gov.zipvote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class jpa extends AppCompatActivity {

    private TextView issueDescription;
    private TextView greenText;
    private TextView redText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jpa);

        issueDescription = findViewById(R.id.issueDescription);
        greenText = findViewById(R.id.issueGreenList);
        redText = findViewById(R.id.issueRedText);

        String desc = getIntent().getStringExtra("DESC");
        String green = getIntent().getStringExtra("PRO");
        String red = getIntent().getStringExtra("RED");

        issueDescription.setText(desc);
        greenText.setText(green);
        redText.setText(red);

        issueDescription.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    private void openActivity(){
        Intent i = new Intent(this, John_Candidates_by_color.class);
        startActivity(i);
    }
}
