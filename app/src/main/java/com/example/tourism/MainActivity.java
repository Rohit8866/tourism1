    package com.example.tourism;

    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        private EditText name;
        private EditText password;
        private Button login;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            name = (EditText)findViewById(R.id.name);
            password = (EditText)findViewById(R.id.password);
            login = (Button)findViewById(R.id.login);



            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    validate(name.getText().toString(), password.getText().toString());
                }
            });
        }

        private void validate(String userName, String userPassword){
            if((userName.equals("Admin")) && (userPassword.equals("1234"))){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }else{

                }
            }
        }

    }