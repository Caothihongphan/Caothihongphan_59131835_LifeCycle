package vn.edu.ntu.caothihongphan.caothihongphan_59131835_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart ");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("LifeCycle","onRestart ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView txtTG;
        Log.d("LifeCycle","onResume ");
        txtTG=findViewById(R.id.txtTG);
        SimpleDateFormat spF = new SimpleDateFormat( "HH:mm:ss");
        String date =spF.format(new Date());
        txtTG.setText(date);
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy");
    }
}
