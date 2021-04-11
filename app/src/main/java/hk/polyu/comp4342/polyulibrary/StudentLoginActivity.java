package hk.polyu.comp4342.polyulibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentLoginActivity extends AppCompatActivity {

    private EditText ETStudentID;
    private EditText ETPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        Button BNBack = findViewById(R.id.BNBack);
        Button BNLogin = findViewById(R.id.BNLogin);

        //Back to the welcome page
        if(BNBack!=null) {
            BNBack.setOnClickListener(view -> {
                startActivity(new Intent(StudentLoginActivity.this,
                        MainActivity.class));
                finish();
            });
        }

        //Login
        //Receive the uid and pwd
        ETStudentID = findViewById(R.id.ETStudentID);
        ETPassword = findViewById(R.id.ETPassword);

        if (BNLogin != null) {
            BNLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    /*Here missing code.
                    You have to pass the data to the server by clicking the button.
                    If access denied, refuse to login.
                    If access success, turn to another page. How to realize?
                     */
                    startActivity(new Intent(StudentLoginActivity.this,
                            UserSearchBook.class));
                    finish();
                }
            });
        }
    }
}