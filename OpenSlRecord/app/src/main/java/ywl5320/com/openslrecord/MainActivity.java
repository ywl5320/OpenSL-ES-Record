package ywl5320.com.openslrecord;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public native void rdSound(String path);

    public native void rdStop();

    public void recourdsound(View view) {
        rdSound(Environment.getExternalStorageDirectory().getAbsolutePath() + "/temp.pcm");
    }

    public void recourdstop(View view) {
        rdStop();
    }
}
