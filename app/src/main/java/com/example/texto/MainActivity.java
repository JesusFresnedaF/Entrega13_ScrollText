    package com.example.texto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addComment = findViewById(R.id.addCommentButton);
        EditText article = findViewById(R.id.article);
        article.setEnabled(false);

        EditText commentTxt = findViewById(R.id.comment);
        commentTxt.setEnabled(false);

        addComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addComment.getText().equals("Add Comment")){
                    commentTxt.setEnabled(true);
                    addComment.setText("Save Comment");
                }
                else if(addComment.getText().equals("Save Comment")){
                    commentTxt.setEnabled(false);
                    addComment.setText("Add Comment");
                }
            }
        });


    }
}