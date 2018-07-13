package digitalhouse.com.botaodeacao;

import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Snackbar snackbar = Snackbar.make(coordinatorLayout, "www.journaldev.com", Snackbar.LENGTH_LONG);
        snackbar.show();
    }

}
