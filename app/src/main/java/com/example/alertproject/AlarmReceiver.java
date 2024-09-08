package com.example.alertproject;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // 알람이 울릴 때 실행할 작업 (예: 토스트 메시지 표시)
        Toast.makeText(context, "알람이 울렸습니다!", Toast.LENGTH_SHORT).show();

        // 알림(Notification)을 띄우는 등의 추가 작업도 가능
    }
}
