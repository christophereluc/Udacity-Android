package luc.chris.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Main activity that serves as a launch pad for the app portfolio
 */
public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }


    public void onButtonClick(View v) {
        if (v instanceof Button) {
            String text = ((Button) v).getText().toString();
            if (!TextUtils.isEmpty(text)) {
                Toast.makeText(this, getString(R.string.toast_launcher, text), Toast.LENGTH_LONG).show();
            }
        }
    }
}
