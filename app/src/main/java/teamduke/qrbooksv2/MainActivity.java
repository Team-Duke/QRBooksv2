package teamduke.qrbooksv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.io.File;
import java.net.URI;
import java.util.Date;


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
