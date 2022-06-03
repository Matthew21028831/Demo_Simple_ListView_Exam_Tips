package sg.edu.rp.c36.id21028831.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //ListView examTips;
    ArrayList<String> examTips;
    ListView lvExamTips;
    ArrayAdapter<String> aaExamTips;
//    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips=findViewById(R.id.listViewExamTips);
//        btn=findViewById(R.id.button);

        examTips=new ArrayList<>();
        examTips.add("Don't just read the code, code it as much as possible during each practical session");
        examTips.add("Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        examTips.add("Prepare your template source code for each topic");
        examTips.add("Create a few empty Android projects to speed up your coding during the exam");
        examTips.add("Ensure that your Android Studio is up and running before the exam");

        aaExamTips=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,examTips);
        lvExamTips.setAdapter(aaExamTips);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                examTips.add("Testing");
//                aaExamTips.notifyDataSetChanged();
//            }
//        });
    }
}