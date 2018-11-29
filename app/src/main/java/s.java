import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.design.widget.FloatingActionButton;
import black.kr.hs.mirim.testmanager.R;

/**
 * Created by 정효은 on 2018-11-27.
 */

public class s extends AppCompatActivity {
    FloatingActionButton fadd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s);
        fadd = (FloatingActionButton)findViewById(R.id.fadd_btn);
        fadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), a.class);
                startActivity(intent);

            }
        });
    }
}
