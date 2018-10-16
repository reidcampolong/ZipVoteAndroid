package cadb.gov.zipvote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IndividualsActivity extends AppCompatActivity {

    private ImageView candidate1;
    private ImageView candidate2;
    private ImageView candidate3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individuals);

        ImageView candidate1 = findViewById(R.id.imageDem1);
        ImageView candidate2 = findViewById(R.id.imageDem2);
        ImageView candidate3 = findViewById(R.id.imageCan3);

        candidate1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen("Candidate1", "Republican", "This is an example of Candidate 1's view points on different issues.");
            }
        });

        candidate2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen("Candidate2", "Republican", "This is an example of Candidate 2's view points on different issues.");
            }
        });

        candidate3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen("Candidate3", "Democrat", "This is an example of Candidate 3's view points on different issues.");
            }
        });
    }

    private void openNextScreen(String candidateName, String candidateParty, String candidateData) {
        Intent i = new Intent(this, IndividualActivity.class);
        i.putExtra("NAME", candidateName);
        i.putExtra("PARTY", candidateParty);
        i.putExtra("DATA", candidateData);
        startActivity(i);
    }
}
