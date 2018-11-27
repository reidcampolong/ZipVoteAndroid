package cadb.gov.zipvote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class jpa extends AppCompatActivity {

    private TextView issueDescription;
    private Button stancesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jpa);

        issueDescription = findViewById(R.id.issueDescription);
        stancesButton = findViewById(R.id.stancesButton);

        String desc = getIntent().getStringExtra("DESC");
        String green = getIntent().getStringExtra("PRO");
        String red = getIntent().getStringExtra("RED");

        issueDescription.setText(desc);

        stancesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
    }

    private void openActivity(){
        Intent i = new Intent(this, John_Candidates_by_color.class);
        startActivity(i);
    }
}
