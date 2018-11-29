package black.kr.hs.mirim.testmanager;

import android.Manifest;
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
import android.widget.Toast;

public class AddQuestion extends AppCompatActivity {
    public static final String TAG = "권한";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCamera = findViewById(R.id.btn_camera);
        btnCamera.setOnClickListener(btnHandler);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("액티비티가 종료딜 때 : ","onPuase() 호출");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("액티비티가 종료딜 때 : ","onStop() 호출");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("액티비티가 종료딜 때 : ","onDestroy() 호출");
    }

    private boolean grantCameraPermission(){
        if(Build.VERSION.SDK_INT>=23){
            if(checkSelfPermission(Manifest.permission.CAMERA)== PackageManager.PERMISSION_GRANTED){
                Log.v(TAG,"permission is revoked");
                return true;
            }else{
                Log.v(TAG,"permission is revoked");
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA},1);
                return false;
            }
        }else{
            Toast.makeText(this, "Camera Permission is Grant", Toast.LENGTH_SHORT).show();
            Log.d(TAG,"Camera Permission is Grant");
            return true;
        }
    }

    View.OnClickListener btnHandler = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent intent = null;
            Uri uri = null;

            if(v.getId()==R.id.btn_camera){
                Log.v("미림","카메라");
                boolean isGrantCamera = grantCameraPermission();
                if(isGrantCamera){
                    intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                }
            }
        }
    };

}
