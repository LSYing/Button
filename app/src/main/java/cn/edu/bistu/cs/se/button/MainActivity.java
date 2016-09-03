package cn.edu.bistu.cs.se.button;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOne=(Button)findViewById(R.id.button);
        final EditText editResult=(EditText) findViewById(R.id.editText);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText("文字改变了");
            }
        });

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        TextView txtResult=(TextView) findViewById(R.id.textView);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio1:
                if (checked)
                    txtResult.setText("你选择了Radio1");
                break;
            case R.id.radio2:
                if (checked)
                    txtResult.setText("你选择了Radio2");
                break;
        }
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        TextView txtResult = (TextView)findViewById(R.id.textView);
        txtResult.setText("你选择了");

        switch(view.getId()){
            case  R.id.check1:
                if(checked)
                    txtResult.setText("你选择了check1");
                else
                    txtResult.setText("你取消了check1");
                break;
            case  R.id.check2:
                if(checked)
                    txtResult.setText("你选择了check2");
                else
                    txtResult.setText("你取消了check2");
                break;
            case  R.id.check3:
                if(checked)
                    txtResult.setText("你选择了check3");
                else
                    txtResult.setText("你取消了check3");
                break;
            case  R.id.check4:
                if(checked)
                    txtResult.setText("你选择了check4");
                else
                    txtResult.setText("你取消了check4");
                break;
        }
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
