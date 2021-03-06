package kru.somwang.makwat.weightcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText, passwordEditText, nameEditText;
    private String userString, passwordString, nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Bind Widget
        bindWidget();



    } // Main Method

    private void bindWidget() {

        userEditText = (EditText) findViewById(R.id.UserText);
        passwordEditText = (EditText) findViewById(R.id.PassText);
        nameEditText = (EditText) findViewById(R.id.NameText);
    }

    public void clickRegis(View view) {
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        nameString = nameEditText.getText().toString().trim();

        if (userString.equals("") || passwordString.equals("") || nameString.equals("")) {
            //have space
            Toast.makeText(RegisterActivity.this, getResources().getString(R.string.have_space),
                    Toast.LENGTH_SHORT).show();


        }else {
            //no space
            MyManage objMyManage = new MyManage(this);
            objMyManage.addUserTable(userString, passwordString, nameString);
            Toast.makeText(RegisterActivity.this,
                    getResources().getString(R.string.success_regis),
                    Toast.LENGTH_SHORT).show();
            finish();

        } //if

    } //Click Regis

} //Main Class
