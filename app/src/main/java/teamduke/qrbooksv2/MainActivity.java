package teamduke.qrbooksv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Book_Activity(View view) {
        Intent getBookActivity = new Intent(this,BookActivity.class);

        final int result = 1;
        getBookActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getBookActivity, result);

    }
}
