package com.googletv.kumanda;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int vol = 24;
    int ch = 7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 40, 40, 40);
        TextView title = new TextView(this);
        title.setText("GTV Kumanda v2.1\nSes: " + vol + " Kanal: " + ch);
        title.setTextSize(22);
        layout.addView(title);
        Button volUp = new Button(this);
        volUp.setText("Ses +");
        volUp.setOnClickListener(v -> { if (vol < 100) vol++; title.setText("Ses: " + vol + " Kanal: " + ch); });
        layout.addView(volUp);
        Button volDown = new Button(this);
        volDown.setText("Ses -");
        volDown.setOnClickListener(v -> { if (vol > 0) vol--; title.setText("Ses: " + vol + " Kanal: " + ch); });
        layout.addView(volDown);
        Button chUp = new Button(this);
        chUp.setText("Kanal +");
        chUp.setOnClickListener(v -> { ch++; title.setText("Ses: " + vol + " Kanal: " + ch); });
        layout.addView(chUp);
        Button chDown = new Button(this);
        chDown.setText("Kanal -");
        chDown.setOnClickListener(v -> { if (ch > 1) ch--; title.setText("Ses: " + vol + " Kanal: " + ch); });
        layout.addView(chDown);
        for (int i = 0; i <= 9; i++) {
            Button b = new Button(this);
            b.setText(String.valueOf(i));
            int num = i;
            b.setOnClickListener(v -> Toast.makeText(this, "Kanal " + num, Toast.LENGTH_SHORT).show());
            layout.addView(b);
        }
        setContentView(layout);
    }
}
