import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import black.kr.hs.mirim.testmanager.R;

/**
 * Created by 정효은 on 2018-11-27.
 */

public class home extends AppCompatActivity {
    ImageButton memolist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        memolist = (ImageButton)findViewById(R.id.memo_btn);
        memolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), s.class);
                startActivity(intent);
            }
        });

    }
}
