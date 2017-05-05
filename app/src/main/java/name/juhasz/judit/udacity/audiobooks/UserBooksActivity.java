package name.juhasz.judit.udacity.audiobooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_books);

        Button discoverButton = (Button) findViewById(R.id.b_discover);

        discoverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discoverIntent = new Intent(UserBooksActivity.this, DiscoverBooksActivity.class);
                startActivity(discoverIntent);
            }
        });
    }
}
