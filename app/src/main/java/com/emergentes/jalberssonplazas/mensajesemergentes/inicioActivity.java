package com.emergentes.jalberssonplazas.mensajesemergentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class inicioActivity extends AppCompatActivity implements View.OnClickListener
{

    Button btnTcorto, btnTlargo, btnAlertOk, btnAlertCan;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnAlertCan=(Button) findViewById(R.id.btnAlertaOkCancelar);
        btnAlertOk=(Button) findViewById(R.id.btnAlertaOk);
        btnTcorto=(Button) findViewById(R.id.btnToastCorto);
        btnTlargo=(Button) findViewById(R.id.btnToastLargo);

        btnAlertCan.setOnClickListener(this);
        btnAlertOk.setOnClickListener(this);
        btnTlargo.setOnClickListener(this);
        btnTcorto.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnAlertaOk:
                break;

            case R.id.btnAlertaOkCancelar:
                break;

            case R.id.btnToastCorto:
                Toast.makeText(getApplicationContext(), "No voy a durar mucho", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnToastLargo:
                Toast.makeText(getApplicationContext(), "Voy a durar mucho jejeje", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
