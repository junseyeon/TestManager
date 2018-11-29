package black.kr.hs.mirim.testmanager;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        ImageButton b = (ImageButton)findViewById(R.id.alarm_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplication(),
                        sohee.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton b1 = (ImageButton)findViewById(R.id.note_btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplication(),
                        b.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton b2 = (ImageButton)findViewById(R.id.memo_btn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplication(),
                        c.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
