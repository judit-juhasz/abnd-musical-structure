package name.juhasz.judit.udacity.audiobooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DiscoverBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_books);

        findViewById(R.id.b_discover_list_item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookDetailsIntent = new Intent(DiscoverBooksActivity.this, BookDetailsActivity.class);
                startActivity(bookDetailsIntent);
            }
        });
    }
}
