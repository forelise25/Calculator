package youn0045.kr.hs.emirim.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button[] butNums=new Button[10];
    Button[] butOps=new Button[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0; i<butNums.length;i++){
            butNums[i]=(Button)findViewById(R.id.btn0+i);
            butNums[i].setOnClickListener(butNumHandler);
        }
        for(int i=0; i<butOps.length;i++){
            butOps[i]=(Button)findViewById(R.id.btnadd+i);
            butOps[i].setOnClickListener(butOpHandler);
        }
    }
    View.OnClickListener butNumHandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    View.OnClickListener butOpHandler=new View.OnClickListener(){
        @Override
        public void onClick(View view) {

        }
    };
}