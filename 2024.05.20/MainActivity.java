package com.example.todolist;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText taskEditText;
    private Button selectDateButton, addTaskButton;
    private LinearLayout taskListLayout;
    private String selectedDate = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskEditText = findViewById(R.id.taskEditText);
        selectDateButton = findViewById(R.id.selectDateButton);
        addTaskButton = findViewById(R.id.addTaskButton);
        taskListLayout = findViewById(R.id.taskListLayout);

        selectDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskText = taskEditText.getText().toString().trim();
                if (!taskText.isEmpty() && !selectedDate.isEmpty()) {
                    addTask(taskText, selectedDate);
                    taskEditText.setText("");
                    selectDateButton.setText("날짜 선택");
                    selectedDate = "";
                }
            }
        });
    }

    private void showDatePickerDialog() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                selectedDate = year + "-" + (month + 1) + "-" + dayOfMonth;
                selectDateButton.setText(selectedDate);
            }
        }, year, month, day);
        datePickerDialog.show();
    }

    private void addTask(String taskText, String date) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(date + ": " + taskText);
        checkBox.setChecked(false); // 초기 상태는 미완료로 설정

        // 체크 박스 클릭 시 완료/미완료 상태 전환
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox clickedCheckBox = (CheckBox) v;
                boolean isChecked = clickedCheckBox.isChecked();
                // 여기에서 완료 또는 미완료 상태에 대한 처리를 추가할 수 있습니다.
            }
        });

        taskListLayout.addView(checkBox);
    }
}