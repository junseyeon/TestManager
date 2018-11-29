package black.kr.hs.mirim.testmanager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by LG on 2018-11-22.
 */

public class hyuneun extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        ImageButton b = (ImageButton)findViewById(R.id.alarm_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        sohee.class);
                startActivity(intent);
            }
        });
    }
}
