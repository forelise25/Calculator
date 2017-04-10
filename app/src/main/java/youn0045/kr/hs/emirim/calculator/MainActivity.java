package youn0045.kr.hs.emirim.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button[] butNums=new Button[10];
        Button[] butOps=new Button[4];
        public static final int SELECT_EDIT1=0;
        public static final int SELECT_EDIT2=1;
        int SelectEdit =SELECT_EDIT1;
        String numStr="";
        TextView textResult;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            edit1 = (EditText)findViewById(R.id.edit1); //
        edit2 = (EditText)findViewById(R.id.edit2);
        edit1.setOnTouchListener(editHandler);
        edit2.setOnTouchListener(editHandler);
        textResult= (TextView)findViewById(R.id.textresult);

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
            Button but=(Button)v;
            numStr+=but.getText();
            switch(SelectEdit){
                case SELECT_EDIT1:
                    edit1.setText(numStr);
                    break;
                case SELECT_EDIT2:
                    edit2.setText(numStr);
                    break;
            }
        }
    };
    View.OnClickListener butOpHandler=new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            int num1= Integer.parseInt(edit1.getText().toString());
            int num2= Integer.parseInt(edit1.getText().toString());
            double result =0;
            switch(view.getId()){
                case R.id.btnadd:
                    result=num1+num2;
                case R.id.btnminus:
                    result=num1-num2;
                case R.id.btnmultiple:
                    result=num1*num2;
                case R.id.btndivision:
                    result= num1/(double)num2;
            }//endswitch
            textResult.setText(""+result);
        }
    };

    View.OnTouchListener editHandler = new View.OnTouchListener(){
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            numStr ="";
            switch (view.getId()){
                case R.id.edit1:
                    SelectEdit=SELECT_EDIT1;
                    break;
                case R.id.edit2:
                    SelectEdit=SELECT_EDIT1;
                    break;
            }
            return true;
        }
    };

}