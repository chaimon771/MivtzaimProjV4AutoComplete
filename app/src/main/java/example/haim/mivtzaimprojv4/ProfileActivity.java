package example.haim.mivtzaimprojv4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.etFirstName)
    EditText etFirstName;
    @BindView(R.id.etLastName)
    EditText etLastName;
    @BindView(R.id.etPhone)
    EditText etPhone;
    @BindView(R.id.etSearchAddressProfile)
    EditText etSearchAddressProfile;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        new DaySpiner().invoke();
        new HourSpiner().invoke();
        new MinuteSpiner().invoke();

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            String item = parent.getItemAtPosition(position).toString();
            // Showing selected spinner item
//        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
//
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub

    }

    private class DaySpiner {
        private void invoke() {
            spinner = (Spinner) findViewById(R.id.daySpinner);

            // Spinner click listener
            spinner.setOnItemSelectedListener(ProfileActivity.this);

            List<String> categories = new ArrayList<String>();
            categories.add("שישי");
            categories.add("ראשון");
            categories.add("שני");
            categories.add("שלישי");
            categories.add("רביעי");
            categories.add("חמישי");

            // Creating adapter for spinner
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(ProfileActivity.this, android.R.layout.simple_spinner_item, categories);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // attaching data adapter to spinner
            spinner.setAdapter(dataAdapter);


        }
    }

    private class HourSpiner {
        public void invoke() {
            spinner = (Spinner) findViewById(R.id.hourSpiner);

            // Spinner click listener
            spinner.setOnItemSelectedListener(ProfileActivity.this);

            List<String> categories = new ArrayList<String>();
            categories.add("7");
            categories.add("8");
            categories.add("9");
            categories.add("10");
            categories.add("11");
            categories.add("12");
            categories.add("13");
            categories.add("14");
            categories.add("15");
            categories.add("16");
            categories.add("17");


            // Creating adapter for spinner
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(ProfileActivity.this, android.R.layout.simple_spinner_item, categories);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // attaching data adapter to spinner
            spinner.setAdapter(dataAdapter);
        }
    }

    private class MinuteSpiner {
        public void invoke() {
            spinner = (Spinner) findViewById(R.id.minuteSpiner);

            // Spinner click listener
            spinner.setOnItemSelectedListener(ProfileActivity.this);

            List<String> categories = new ArrayList<String>();
            categories.add("00");
            categories.add("05");
            categories.add("10");
            categories.add("15");
            categories.add("20");
            categories.add("25");
            categories.add("30");
            categories.add("35");
            categories.add("40");
            categories.add("45");
            categories.add("50");
            categories.add("55");


            // Creating adapter for spinner
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(ProfileActivity.this, android.R.layout.simple_spinner_item, categories);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // attaching data adapter to spinner
            spinner.setAdapter(dataAdapter);
        }
    }
}

