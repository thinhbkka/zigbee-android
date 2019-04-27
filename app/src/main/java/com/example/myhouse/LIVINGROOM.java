package com.example.myhouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LIVINGROOM extends AppCompatActivity {
    TextView txtv1Livingroom;
    TextView txtv1Nhietdo;
    TextView txtv1Doam;
    TextView txtv1ShowNhietdo;
    TextView txtv1ShowDoam;
    TextView txtv1Device1;
    TextView txtv1Timer1;
    TextView txtv1Device2;
    TextView txtv1Timer2;
    TextView txtv1Device3;
    TextView txtv1Timer3;
    EditText edt1Timer1;
    EditText edt1Timer2;
    EditText edt1Timer3;
    Button btn1Device1on;
    Button btn1Device1off;
    Button btn1Device2on;
    Button btn1Device2off;
    Button btn1Device3on;
    Button btn1Device3off;
    Button btn1Timer1;
    Button btn1Timer2;
    Button btn1Timer3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livingroom);
        txtv1Livingroom = (TextView)findViewById(R.id.textView1Livingroom);
        txtv1Nhietdo = (TextView)findViewById(R.id.textView1Nhietdo);
        txtv1Doam = (TextView)findViewById(R.id.textView1Doam);
        txtv1ShowNhietdo = (TextView)findViewById(R.id.textView1ShowNhietdo);
        txtv1ShowDoam = (TextView)findViewById(R.id.textView1ShowDoam);
        txtv1Device1 = (TextView)findViewById(R.id.textView1Device1);
        txtv1Timer1 = (TextView)findViewById(R.id.textView1Timer1);
        txtv1Device2 = (TextView)findViewById(R.id.textView1Device2);
        txtv1Timer2 = (TextView)findViewById(R.id.textView1Timer2);
        txtv1Device3 = (TextView)findViewById(R.id.textView1Device3);
        txtv1Timer3 = (TextView)findViewById(R.id.textView1Timer3);
        edt1Timer1 = (EditText)findViewById(R.id.editText1Timer1);
        edt1Timer2 = (EditText)findViewById(R.id.editText1Timer2);
        edt1Timer3 = (EditText)findViewById(R.id.editText1Timer3);
        btn1Device1on = (Button)findViewById(R.id.button1Device1on);
        btn1Device1off = (Button)findViewById(R.id.button1Device1off);
        btn1Device2on = (Button)findViewById(R.id.button1Device2on);
        btn1Device2off = (Button)findViewById(R.id.button1Device2off);
        btn1Device3on = (Button)findViewById(R.id.button1Device3on);
        btn1Device3off = (Button)findViewById(R.id.button1Device3off);
        btn1Timer1 = (Button)findViewById(R.id.button1Timer1);
        btn1Timer2 = (Button)findViewById(R.id.button1Timer2);
        btn1Timer3 = (Button)findViewById(R.id.button1Timer3);



    }
}
