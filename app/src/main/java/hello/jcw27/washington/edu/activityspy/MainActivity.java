package hello.jcw27.washington.edu.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate event fired");
    }

    protected void onStart(){
        Log.i(TAG, "onStart event fired");
        super.onStart();
    }

    protected void onStop(){
        Log.i(TAG, "onSOP event fired");
        super.onStop();
    }

    protected void onRestart(){
        Log.i(TAG, "onRestart event fired");
        super.onRestart();
    }

    protected void onResume(){
        Log.i(TAG, "onResume event fired");
        super.onResume();
    }

    protected void onPause(){
        Log.i(TAG, "onPause event fired");
        super.onPause();
    }

    protected void onDestroy(){
        Log.e(TAG, "We're going down, Captain!");
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
