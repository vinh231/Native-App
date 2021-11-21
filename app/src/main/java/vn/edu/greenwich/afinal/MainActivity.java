package vn.edu.greenwich.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String btnCreateName = getResources(). getString(R.string.btn_create);
        String notification_01 = getResources(). getString (R.string.notification_01);

        Toast.makeText(this, notification_01, Toast.LENGTH_SHORT).show();

        Button btnCreate = findViewById(R.id.btnCreate);
        btnCreate.setText (btnCreateName);
        btnCreate.setOnClickListener (btnCreate_Click);
    }

    private View.OnClickListener btnCreate_Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Boolean isValid = true;

            TextView tvError = findViewById(R.id.tvError);
            TextView tvProname = findViewById(R.id.tvProname);
            TextView tvAddress = findViewById(R.id.tvAddress);
            TextView tvType = findViewById(R.id.tvType);
            TextView tvFur = findViewById(R.id.tvFur);
            TextView tvBed = findViewById(R.id.tvBed);
            TextView tvPrice = findViewById(R.id.tvPrice);
            TextView tvReporter = findViewById(R.id.tvReporter);
            TextView tvNote = findViewById(R.id.tvNote);


            String error ="";
            String propertyname = tvProname.getText().toString();
            String address = tvAddress.getText().toString();
            String propertytype = tvType.getText().toString();
            String furniture = tvFur.getText().toString();
            String numberofbed = tvBed.getText().toString();
            String price = tvPrice.getText().toString();
            String reporter = tvReporter.getText().toString();
            String note = tvNote.getText().toString();
            String notification_02 = getResources(). getString (R.string.notification_02);


            Toast.makeText(v.getContext (), notification_02, Toast.LENGTH_LONG).show ();

            if (TextUtils.isEmpty(propertyname)) {
                isValid = false;
                error += "* Property Name cannot be blank. \n";
            }
            if (TextUtils.isEmpty(address)) {
                isValid = false;
                error += "* Property Address cannot be blank. \n";
            }
            if (TextUtils.isEmpty(propertytype)) {
                isValid = false;
                error += "* Property Type Name cannot be blank. \n";
            }
            if (TextUtils.isEmpty(numberofbed)) {
                isValid = false;
                error += "* Number of Bedrooms cannot be blank. \n";
            }
            if (TextUtils.isEmpty(price)) {
                isValid = false;
                error += "* Monthly Price cannot be blank. \n";
            }
            if (TextUtils.isEmpty(reporter)) {
                isValid = false;
                error += "* Reporter cannot be blank. \n";
            }

            if  (isValid) {
                Toast.makeText(v.getContext(), propertyname + "", Toast.LENGTH_LONG).show();


                Log.w("Main Activity", "This is an Information Log. ");
                Log.i("Hain Activity", "This is a Debug Log.");
                Log.d("Main Activity", "This is a Verbose Log. ");
                Log.v("Main Activity", "This is an Error Log. ");

                Intent page2Activity = new Intent(v.getContext(), Page2.class);

                page2Activity.putExtra("propertyname", propertyname);
                page2Activity.putExtra("address", address);
                page2Activity.putExtra("propertytype", propertytype);
                page2Activity.putExtra("furniture", furniture);
                page2Activity.putExtra("numberofbed", numberofbed);
                page2Activity.putExtra("price", price);
                page2Activity.putExtra("reporter", reporter);
                page2Activity.putExtra("note", note);

                startActivity(page2Activity);
//                finish();
            }
            else{
                tvError.setText(error);
                Log.e("Main Activity", "This is a Warning Log. ");
            };
        };
    };
}