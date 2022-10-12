package mxl.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_enviar;

    private TextView text_respuesta;

    private EditText editText_n1;
    private EditText editText_n1_;
    private EditText editText_n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_respuesta = findViewById(R.id.respuesta);

        editText_n1=findViewById(R.id.editText_n1);
        editText_n1_=findViewById(R.id.editText_n1_);
        editText_n2=findViewById(R.id.editText_n2);

        btn_enviar = findViewById(R.id.button_enviar);
        btn_enviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text_respuesta.setText(Enviar(Integer.parseInt(editText_n1.getText().toString()),Integer.parseInt(editText_n1_.getText().toString()),Integer.parseInt(editText_n2.getText().toString())) + "");
            }
        });
    }
}
