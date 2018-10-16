package cadb.gov.zipvote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Greg2Activity extends AppCompatActivity {

    private Button IssueButton1;

    private Button IssueButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greg2);

        IssueButton1 = (Button) findViewById(R.id.issueButton1);

        IssueButton2 = (Button) findViewById(R.id.issueButton2);

        IssueButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen("Equal Rights", "This is a short description about equal rights. Click to view candidates stances on this issue.", "Candidate 1, Candidate 2", "Candidate 3");
            }
        });

        IssueButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen("Abortion", "This is a short description about abortion. Click to view candidates stances on this issue.", "Candidate 1, Candidate 2", "Candidate 3");
            }
        });

    }

    private void openNextScreen(String issueName, String issueDesc, String proCan, String redCan) {
        Intent i = new Intent(this, jpa.class);
        i.putExtra("NAME", issueName);
        i.putExtra("DESC", issueDesc);
        i.putExtra("PRO", proCan);
        i.putExtra("RED", redCan);
        startActivity(i);
    }
}
