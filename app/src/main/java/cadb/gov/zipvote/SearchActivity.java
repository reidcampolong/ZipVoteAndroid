package cadb.gov.zipvote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    private Button individualButton;
    private Button issueButton;
    private Button partyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        individualButton = (Button) findViewById(R.id.indivualButton);
        issueButton = (Button) findViewById(R.id.issueButton);
        partyButton = (Button) findViewById(R.id.partyButton);

        individualButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen(IndividualsActivity.class);
            }
        });

        issueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen(Greg2Activity.class);
            }
        });

        partyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNextScreen(GregActivity.class);
            }
        });
    }

    private void openNextScreen(Class c){
        Intent i = new Intent(this, c);
        startActivity(i);
    }


}
