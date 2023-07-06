package com.example.bmi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtResult;
        Button buttons;
        EditText editwt;
        EditText editft;
        EditText editin;
        LinearLayout linear;

         editwt= findViewById(R.id.editwt);
        linear= findViewById(R.id.linear);
         editft=findViewById(R.id.editft);
         editin=findViewById(R.id.editin);
        buttons=findViewById(R.id.buttons);
         txtResult=findViewById(R.id.txtResult);
         buttons.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view) {
                 int wt=Integer.parseInt(editwt.getText().toString());
                 int ft=Integer.parseInt(editft.getText().toString());
                 int in=Integer.parseInt(editin.getText().toString());
                 int totalIn=ft*12+in;
                 double totalCm=totalIn*2.53;
                 double totalM=totalCm/100;
                 double bmi=wt/(totalM*totalM);
                 if (bmi>25){
                     txtResult.setText("ITNA MET KHAIYA KER /SAALE MOTE😂😂😂😂😂🤣🤣🤣🤣🤣🤣🤣😜😜!");
                     linear.setBackgroundColor(getResources().getColor(R.color.ow));
                     

                 } else if (bmi<18) {
                     txtResult.setText("ABE KUCH TO DHANKA KHAIYA KER SUKHA BONE🤦‍♂️😒😒😒😒🙁🙁😓😓😓😓😓😓");
                     linear.setBackgroundColor(getResources().getColor(R.color.uw));
                 } else  {
                     txtResult.setText("ARE WAH KYA FIGURE HAI KONSI CHAKKI KA AATA KHATE HO BHAI😘😘💕💕💕😍!");
                     linear.setBackgroundColor(getResources().getColor(R.color.ha));
                 }

             }


         });
    }
}