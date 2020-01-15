package ht.inutech.firstlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText et_utilisateur, et_password;
    public Button bt_connecter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialisation des controles
        et_utilisateur=(EditText) findViewById(R.id.et_utilisateur);
        et_password=(EditText)findViewById(R.id.et_password);
        bt_connecter=(Button)findViewById(R.id.bt_connecter);

        bt_connecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String utilisateur=et_utilisateur.getText().toString();
                Toast.makeText(MainActivity.this,utilisateur,Toast.LENGTH_LONG).show();
            }
        });
    }
}
