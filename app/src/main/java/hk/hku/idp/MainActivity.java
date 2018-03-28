package hk.hku.idp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void goBasic(View v) {
        setContentView(R.layout.activity_basicbutton);
    }

    protected void onButtonPressed(View v) {
        String text_on_button = ((Button) findViewById(R.id.button_basic)).getText().toString();
        if (text_on_button.equals("ON")){
            text_on_button="OFF";
        }else{
            text_on_button="ON";
        }
        ((Button) findViewById(R.id.button_basic)).setText(text_on_button);
    }

}
