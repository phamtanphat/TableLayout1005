package khoapham.ptp.phamtanphat.tablelayout1005;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;


public class MainActivity extends AppCompatActivity {

    //1 : Khai bao view can tuong tac
    TableLayout tblBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //anh xa
        tblBackground = findViewById(R.id.tablelayout);
        //viet code
        tblBackground.setBackgroundColor(Color.BLUE);
    }

}
