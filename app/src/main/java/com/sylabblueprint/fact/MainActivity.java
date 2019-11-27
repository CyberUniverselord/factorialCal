package com.sylabblueprint.fact;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;
public class MainActivity extends AppCompatActivity {

    EditText textField;
    Button btn;
    TextView textView;

    private double fact(double val) {
        if (val < 2){
            return 1;
        }
        else {
            return val * fact(val - 1);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textField = (EditText) findViewById(R.id.textField);
        textView = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    int val = Integer.parseInt(textField.getText().toString());
                    textView.setText(" " + String.format(Locale.getDefault(), "%.0f", fact(val)));
                }

        });

    }
}