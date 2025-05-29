package edu.uph.m23si3.feliciaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorActivity extends AppCompatActivity {

    TextView txvHasil;
    Button btnTambah, btnKali, btnBagi;
    EditText edt1, edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btnTambah = findViewById(R.id.btnTambah);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        txvHasil = findViewById(R.id.txvHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());
                int hasil = a + b;

                txvHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());
                int hasil = a * b;

                txvHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());
                int hasil = a / b;

                txvHasil.setText(String.valueOf(hasil));
            }
        });
    }
}