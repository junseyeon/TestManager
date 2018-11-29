package black.kr.hs.mirim.testmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.List;

/**
 * Created by LG on 2018-11-22.
 */

public class c extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.olist);
//        ListView b2 = (ListView)findViewById(R.id.memo_contents);
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(
//                        getApplication(),
//                        show.class);
//                startActivity(intent);
//                finish();
//            }
//        });
        ImageButton b1 = (ImageButton)findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplication(),
                        AddQuestion.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
