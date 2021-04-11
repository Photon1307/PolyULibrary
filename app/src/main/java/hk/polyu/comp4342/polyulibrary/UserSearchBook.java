package hk.polyu.comp4342.polyulibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserSearchBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_search_book);

        Button BNProfile = findViewById(R.id.BNProfile);
        if (BNProfile != null) {
            BNProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(UserSearchBook.this,
                            UserProfile.class));
                    finish();
                }
            });
        }
    }
}