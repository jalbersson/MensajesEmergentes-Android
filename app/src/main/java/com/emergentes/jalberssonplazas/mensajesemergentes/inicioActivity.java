package com.emergentes.jalberssonplazas.mensajesemergentes;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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
                AlertDialog.Builder builder= new AlertDialog.Builder(this);
                builder.setTitle("Alert con OK");
                builder.setMessage("Alerta, este mensaje sólo tiene OK");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(getApplicationContext(), "Seleccionó OK", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
                break;

            case R.id.btnAlertaOkCancelar:
                AlertDialog.Builder builder2= new AlertDialog.Builder(this);
                builder2.setTitle("Alert con OK y Cancelar");
                builder2.setMessage("Alerta, este mensaje tiene OK y Cancelar");
                builder2.setPositiveButton("OK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(getApplicationContext(), "Seleccionó OK", Toast.LENGTH_SHORT).show();
                    }
                });
                builder2.setNegativeButton("Cancelar", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(getApplicationContext(), "Seleccionó Cancelar", Toast.LENGTH_SHORT).show();
                    }
                });
                builder2.show();
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
