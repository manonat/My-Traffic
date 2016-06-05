package com.watjakdeng.manonat.mytraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


        // Explicit ส่วนของการประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // นี่คือ คำสั่ง หรือ Statement
        setContentView(R.layout.activity_main);

        // การทำBind Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        // การทำcontroller  buttom ไอ้ข้างล่างตั้งชื่อเอาเองนะ -ที่นี้ conv
        // ข้างหลังเซมิ กด alt enter จะมีตัวช่วยขึ้นมาเลือกมัน
        controllerButton();



    }  // Main Method จบส่วนของเมธอดหลัก

    private void controllerButton() {

      aboutMeButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              // การใส่เสียงทำซาวด์เอฟเฟคประกอบการคลิกปุ่ม
              MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cat);
              mediaPlayer.start();



          }
      });



    }//controller button




} //Main class จบส่วนของคลาสหลักจร้า
