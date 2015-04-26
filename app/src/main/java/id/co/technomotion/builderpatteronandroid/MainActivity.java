package id.co.technomotion.builderpatteronandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    //e- for represent as editText
    EditText eFirstName,eMiddleName,eLastName,eAddress,ePhone,eBirthDay,eBirthPlace,eJob,eSalary,eHeight,eWeight;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eFirstName= (EditText) findViewById(R.id.editText1);
        eMiddleName= (EditText) findViewById(R.id.editText2);
        eLastName= (EditText) findViewById(R.id.editText3);
        eAddress= (EditText) findViewById(R.id.editText4);
        ePhone= (EditText) findViewById(R.id.editText5);
        eBirthDay= (EditText) findViewById(R.id.editText6);
        eBirthPlace= (EditText) findViewById(R.id.editText7);
        eJob= (EditText) findViewById(R.id.editText8);
        eSalary= (EditText) findViewById(R.id.editText9);
        eHeight= (EditText) findViewById(R.id.editText10);
        eWeight= (EditText) findViewById(R.id.editText11);
        btnSave= (Button) findViewById(R.id.button);

        // register this activity as button controller
        btnSave.setOnClickListener(this);

    }

    /*
     * =========================================
     *            below are controller
     * =========================================
     * */

    @Override
    public void onClick(View v) {
        Person person=new Person.Builder()
                .address(eAddress.getText().toString())
                .birthDay(eBirthDay.getText().toString())
                .birthPlace(eBirthPlace.getText().toString())
                .bodyHeight(Double.parseDouble(eHeight.getText().toString().isEmpty()?"0":eHeight.getText().toString()))
                .bodyWedight(Double.parseDouble(eWeight.getText().toString().isEmpty()?"0":eWeight.getText().toString()))
                .firstName(eFirstName.getText().toString())
                .job(eJob.getText().toString())
                .lastName(eLastName.getText().toString())
                .middleName(eMiddleName.getText().toString())
                .phone(ePhone.getText().toString())
                .salary(eSalary.getText().toString())
                .build();

        System.out.println("person was created : "+person.toString());
    }
}
