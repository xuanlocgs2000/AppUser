package com.example.appuser;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.appuser.databinding.ActivityHomeBinding;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.av1,R.drawable.av2,R.drawable.av3,
                R.drawable.av4,R.drawable.av5, R.drawable.av6,R.drawable.av7};
        String[] name ={"Huy","Phuong","Loc","Vu","Thinh","Cong","Hieu"};
        String[] lastMessage ={"Hey","Alo","Hey","Alo","Hey","Alo","LMHT"};
        String[] lastmsgTime = {"8:15 pm","8:14 pm","8:12 pm","8:10 pm","8:05 pm","8:02 pm","8:00 pm"};
        String[] phoneNo = {"0235113226","0237113226","0235113228","0235113229","0235113266","0235113286","0235113586"};
        String[] adress ={"Thai Binh","Ha Noi","Ha noi","Hung Yen","Ha noi","Ha noi","Ha noi"};

        ArrayList<User> userArrayList = new ArrayList<>();
        for (int i=0; i<imageId.length; i++){
            User user = new User(name[i],lastMessage[i],lastmsgTime[i],phoneNo[i],adress[i],imageId[i] );
            userArrayList.add(user);
        }
        ListAdapter listAdapter = new ListAdapter(HomeActivity.this, userArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(HomeActivity.this, UserActivity.class);
                intent.putExtra("name", name[position]);
                intent.putExtra("phone", phoneNo[position]);
                intent.putExtra("adress", adress[position]);
                intent.putExtra("imageid", imageId[position]);
                startActivity(intent);

            }
        });


    }
}