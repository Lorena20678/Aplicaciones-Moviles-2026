package com.example.evalproytextos9d;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editPrecio, editPrecio2;
    Button btnTotal;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecio = findViewById(R.id.editPrecio);
        editPrecio2 = findViewById(R.id.editPrecio2);

        btnTotal = findViewById(R.id.btnTotal);
        txtResultado = findViewById(R.id.txtResultado);

        btnTotal.setOnClickListener(v -> {

            double precio1 = Double.parseDouble(editPrecio.getText().toString());
            double precio2 = Double.parseDouble(editPrecio2.getText().toString());

            double total = precio1 + precio2;

            txtResultado.setText(String.valueOf(total));
        });
    }
}