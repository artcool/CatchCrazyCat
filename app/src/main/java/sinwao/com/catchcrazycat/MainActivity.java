package sinwao.com.catchcrazycat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sinwao.com.catchcrazycat.view.GameGround;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameGround(this));
    }
}
