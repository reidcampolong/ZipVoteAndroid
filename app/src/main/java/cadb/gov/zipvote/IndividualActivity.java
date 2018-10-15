package cadb.gov.zipvote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class IndividualActivity extends AppCompatActivity {

    private ImageView profilePicture;

    private TextView candidateName;
    private TextView candidateBio;
    private TextView candidateParty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);

        String name = getIntent().getStringExtra("NAME");
        String party = getIntent().getStringExtra("PARTY");
        String data = getIntent().getStringExtra("DATA");

        candidateName = findViewById(R.id.indivName);
        candidateBio = findViewById(R.id.indivBio);
        candidateParty = findViewById(R.id.indivParty);
        profilePicture = findViewById(R.id.individualPhoto);

        switch (name) {
            case "Candidate1":
                profilePicture.setImageResource(R.drawable.man);
                break;
            case "Candidate2":
                profilePicture.setImageResource(R.drawable.ma2);
                break;
            case "Candidate3":
                profilePicture.setImageResource(R.drawable.girl);
                break;
        }

        candidateName.setText(name);
        candidateBio.setText(data);
        candidateParty.setText(party);

    }
}
