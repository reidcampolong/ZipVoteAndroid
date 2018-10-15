package cadb.gov.zipvote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class djd6621second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djd6621second);

        button2 = FindViewById(R.id.button2);

        button2.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick (View v) {
                opendjd6621 ();
            }
        });
    }

    public void opendjd6621 (){
        Intent intent = new Intent (packageContext: this, djd6621.class);
        startActivity(intent);
    }
}
