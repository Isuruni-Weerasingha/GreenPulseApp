package com.example.feedbackform;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize fields with correct IDs
        EditText nameField = findViewById(R.id.name_field);  // Corrected ID here
        EditText emailField = findViewById(R.id.email_field);  // Corrected ID here
        EditText subjectField = findViewById(R.id.subject_field);  // Corrected ID here
        EditText messageField = findViewById(R.id.message_field);  // Corrected ID here
        Button submitButton = findViewById(R.id.submit_button);

        // Submit button functionality
        submitButton.setOnClickListener(v -> {
            String name = nameField.getText().toString();
            String email = emailField.getText().toString();
            String subject = subjectField.getText().toString();
            String message = messageField.getText().toString();

            // Check if fields are empty
            if (name.isEmpty() || email.isEmpty() || subject.isEmpty() || message.isEmpty()) {
                Toast.makeText(com.example.feedbackform.MainActivity1.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(com.example.feedbackform.MainActivity1.this, "Feedback Submitted!", Toast.LENGTH_SHORT).show();
                // Optionally, clear the fields
                nameField.setText("");
                emailField.setText("");
                subjectField.setText("");
                messageField.setText("");
            }
        });
    }
}
