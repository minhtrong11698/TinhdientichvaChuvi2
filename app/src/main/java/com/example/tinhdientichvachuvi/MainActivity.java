package com.example.tinhdientichvachuvi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText chieudai,chieurong;
    Button tinhdientich,tinhchuvi;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chieudai=(EditText)findViewById(R.id.editText_chieudai);
        chieurong=(EditText)findViewById(R.id.editText_chieurong);
        tinhdientich=(Button)findViewById(R.id.btn_dientich);
        tinhchuvi=(Button)findViewById(R.id.btn_chuvi);
        ketqua=(TextView)findViewById(R.id.TextView_ketqua);
        tinhdientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tinhdientich;
                int d=Integer.parseInt(chieudai.getText().toString());
                int r=Integer.parseInt(chieurong.getText().toString());
                tinhdientich=d*r;
                ketqua.setText("KetQua: " +tinhdientich);
            }
        });
        tinhchuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tinhchuvi;
                int d=Integer.parseInt(chieudai.getText().toString());
                int r=Integer.parseInt(chieurong.getText().toString());
                if(d==r){
                    tinhchuvi=d*4;
                }
                else{
                     tinhchuvi=(d+r)*2;
                }
                ketqua.setText("KetQua: "+tinhchuvi);
            }
        });
    }
}
