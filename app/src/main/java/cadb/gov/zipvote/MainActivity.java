package cadb.gov.zipvote;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = {Button} findViewById(R.id.button);

        button.setOnclickListener(new View.OnClickListener(){
            public void onClick(View v){
                opendjd6621second();
            }
        });
    }


public void opendjd6621second() {
    Intent intent = new Intent(packageContext:this, djd6621second.class);
    startActivity(intent);
    }
}
