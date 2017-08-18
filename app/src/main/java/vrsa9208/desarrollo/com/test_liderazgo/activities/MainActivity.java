package vrsa9208.desarrollo.com.test_liderazgo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import vrsa9208.desarrollo.com.test_liderazgo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_start_test).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_start_test:
                startTest();
                break;
        }
    }

    private void startTest(){
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
        finish();
    }
}
