package edu.cnm.deepdive.fizzbuzzandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FizzBuzzActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fizz_buzz);// sets the xml layout to the contentview
    final TextView text = (TextView) findViewById(R.id.text_view);//using classes findview find the thing called text view in the xml file
    text.setText(FizzBuzz.count (50));//cast is basically saying trust me..in that textview there is something called settext

    final EditText limit = (EditText) findViewById(R.id.limit);
    Button button = (Button) findViewById(R.id.button);
    button.setOnClickListener (new OnClickListener(){
        @Override
      public void onClick(View v) {
          int limitInt = 0;
          try {
            limitInt = Integer.parseInt(limit.getText().toString());
          } catch (NumberFormatException e) {
            e.printStackTrace();
          }
          text.setText(FizzBuzz.count(limitInt));
        }

    } );

  }
}

