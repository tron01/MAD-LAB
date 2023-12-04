package com.example.regform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText first,last,mail,pass,dob;
    Boolean val;
    RadioGroup rdgp;
    RadioButton male;
    RadioButton fmale;
    RadioButton oth;
    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first=findViewById(R.id.Fname);
        last=findViewById(R.id.Lname);
        mail=findViewById(R.id.mailfield);
        dob=findViewById(R.id.dobs);
        pass=findViewById(R.id.passwordfield);
        male=findViewById(R.id.malebutton);
        fmale=findViewById(R.id.femalebutton);
        oth=findViewById(R.id.otherbutton);
        rdgp=findViewById(R.id.rdg);
        check=findViewById(R.id.checkBox);

    }

    public void registerl(View view) {
        val=validate();

        if (val)
        {
            Toast.makeText(this, "SUCCESFULLY REGISTERED", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validate()
    {
        if(first.length()==0)
        {
            first.setError("required");
            return false;
        }

        if(last.length()==0)
        {
            last.setError("Required");
            return false;
        }

        if(dob.length()==0)
        {
            dob.setError("DOB IS REQUIRED");
            return false;
        }

        if(pass.length()==0)
        {
            pass.setError("ENTER A VALID PASSWORD");
            return false;
        }
        else if (pass.length() < 8 )
        {
            pass.setError("Enter a password of Minimum 8 Characters");
            return false;
        }

        if(mail.length()==0)
        {
            mail.setError("ENTER A VALID MAIL ID");
            return false;
        }
        else
        {
            String semail=mail.getText().toString();
            String checkMail="[a-zA-Z0-9._-]+@[a-z]+.+[a-z]+";
            if(!semail.matches(checkMail))
            {
                mail.setError("Invalid Mail");
                return false;
            }
        }

        if(rdgp.getCheckedRadioButtonId()== -1)
        {
            oth.setError("Select Gender");
            oth.requestFocus();
            return false;
        }

        if(!check.isChecked())
        {
            check.setError("AGREE");
            check.requestFocus();
            return false;
        }

        return true;
    }
}