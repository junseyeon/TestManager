package black.kr.hs.mirim.testmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by LG on 2018-11-22.
 */

public class b extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutlist);
        ImageButton b1 = (ImageButton)findViewById(R.id.fadd_btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplication(),
                        a.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
