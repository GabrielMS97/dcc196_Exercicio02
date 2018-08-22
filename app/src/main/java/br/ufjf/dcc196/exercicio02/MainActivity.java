package br.ufjf.dcc196.exercicio02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblResultado;
    private EditText txtN1;
    private EditText txtN2;
    private Button btnSoma;
    private Button btnSub;
    private Button btnMult;
    private Button btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblResultado = (TextView) findViewById(R.id.lbl_res);
        txtN1 = (EditText) findViewById(R.id.txt_n1);
        txtN2 = (EditText) findViewById(R.id.txt_n2);
        btnSoma = (Button) findViewById(R.id.btn_soma);
        btnSub = (Button) findViewById(R.id.btn_sub);
        btnMult = (Button) findViewById(R.id.btn_mult);
        btnDiv = (Button) findViewById(R.id.btn_di);

        btnSoma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float res = Float.parseFloat(txtN1.getText().toString()) + Float.parseFloat(txtN2.getText().toString());
                lblResultado.setText("Resultado: " + String.valueOf(res));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float res = Float.parseFloat(txtN1.getText().toString()) - Float.parseFloat(txtN2.getText().toString());
                lblResultado.setText("Resultado: " + String.valueOf(res));
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float res = Float.parseFloat(txtN1.getText().toString()) * Float.parseFloat(txtN2.getText().toString());
                lblResultado.setText("Resultado: " + String.valueOf(res));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float res = Float.parseFloat(txtN1.getText().toString()) / Float.parseFloat(txtN2.getText().toString());
                lblResultado.setText("Resultado: " + String.valueOf(res));
            }
        });

    }
}
