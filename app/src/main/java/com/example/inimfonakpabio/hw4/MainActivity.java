package com.example.inimfonakpabio.hw4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button display = (Button) findViewById(R.id.display);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final TextView textView = (TextView) findViewById(R.id.textView);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText((CharSequence) editText.getText());
            }
        });
    }
}
