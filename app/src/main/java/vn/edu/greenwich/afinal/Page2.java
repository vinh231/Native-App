package vn.edu.greenwich.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        TextView tvProname = findViewById(R.id.tvProname_show);
        TextView tvAddress = findViewById(R.id.tvAddress_show);
        TextView tvType = findViewById(R.id.tvType_show);
        TextView tvFur = findViewById(R.id.tvFur_show);
        TextView tvBed = findViewById(R.id.tvBed_show);
        TextView tvPrice = findViewById(R.id.tvPrice_show);
        TextView tvReporter = findViewById(R.id.tvReporter_show);
        TextView tvNote = findViewById(R.id.tvNote_show);

        String propertyname = "", address = "", propertytype = "", reporter = "", numberofbed = "", price = "", furniture = "", note = "";
//        Integer numberofbed = 0, price = 0;

        Intent intent = getIntent();

        propertyname = intent.getStringExtra("propertyname");
        address = intent.getStringExtra("address");
        propertytype = intent.getStringExtra("propertytype");
        reporter = intent.getStringExtra("reporter");
        numberofbed = intent.getStringExtra("numberofbed");
        price = intent.getStringExtra("price");
        note = intent.getStringExtra("note");
        furniture = intent.getStringExtra("furniture");


//        numberofbed = intent.getIntExtra("numberofbed", 0);
//        price = intent.getIntExtra("price", 0);

        tvProname.setText(propertyname);
        tvAddress.setText(address);
        tvType.setText(propertytype);
        tvBed.setText(numberofbed);
        tvPrice.setText(price);
        tvReporter.setText(reporter);
        tvNote.setText(note);
        tvFur.setText(furniture);

//        findViewById (R.id.button).setOnClickListener(page2);

        getSupportActionBar ().setDisplayHomeAsUpEnabled (true);
        Log.e("Activity Life Cycle", "--- onCreate ---");
    }
//        private View.OnClickListener page2 = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
////            Intent intent = new Intent(v.getContext(), MainActivity.class);
////            startActivity(intent);
//
//            //finish();
//        }
//    };

        @Override
        protected void onStart() {
            super.onStart();
            Log.e("Activity Life Cycle", "--- onStart ---");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.e("Activity Life Cycle", "--- onRestart --- --");
        }
        @Override
        protected void onResume() {
            super.onResume();
            Log.e("Activity Life Cycle", "--- onResume --- ");
        }
        @Override
        protected void onPause() {
            super.onPause();
            Log.e("Activity Life Cycle", "--- onPause --- ");
        }
        @Override
        protected void onStop() {
            super.onStop();
            Log.e("Activity Life Cycle", "--- onStop --- ");
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.e("Activity Life Cycle", "--- onDestroy --- ");
        }

        @Override
        public boolean onSupportNavigateUp() {
            finish();
            return true;
        }
}