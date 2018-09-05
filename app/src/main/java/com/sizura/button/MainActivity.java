package com.sizura.button;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //initialize component
    //kasih nama panggilan
    Button btn1, btn2;
    TextView txt;
    ImageView img;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declarate the component
        btn1 = (Button) findViewById(R.id.btnToast);
        btn2 = (Button) findViewById(R.id.btnAlert);
        txt = (TextView) findViewById(R.id.text);
        img = (ImageView) findViewById(R.id.image);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Ini Toast", Toast.LENGTH_SHORT).show();

                txt.setText(img.toString());
                img.setImageResource(R.drawable.aa);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Peringatan");
                builder.setMessage("Apakah anda ingin keluar?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();//for close the activity


                    }
                });
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(context, "cancel quit application", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });
    }
}
