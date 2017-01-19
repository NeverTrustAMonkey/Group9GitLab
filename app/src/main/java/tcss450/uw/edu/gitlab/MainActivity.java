package tcss450.uw.edu.gitlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"Genji", "McCree", "Pharah", "Soldier: 76", "Sombra", "Tracer",
        "Bastion", "Hanzo", "Junkrat", "Mei", "Torbjorn", "Widowmaker",
        "D.Va", "Reinhardt", "Roadhog", "Winston", "Zarya",
        "Ana", "Lucio", "Mercy", "Symmetra", "Zenyatta"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }


}
