package com.cookandroid.cartoon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;



public class Next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);
        setTitle("그리드뷰 테스트");

        final GridView gv = (GridView) findViewById(R.id.gridView1);
        MyGridAdapter  gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);


    }

    public class MyGridAdapter extends BaseAdapter {
        Context context;
        public MyGridAdapter(Context c){
            context = c;
        }
        public int getCount(){
            return userDraw.length;
        }

        public Object getItem(int arg0){
            return null;
        }

        public long getItemId(int arg0){
            return 0;
        }

        Integer[] userDraw = {R.drawable.user_draw1, R.drawable.user_draw2, R.drawable.user_draw3,
                R.drawable.user_draw4, R.drawable.user_draw5, R.drawable.user_draw6, R.drawable.user_draw7,};

        public View getView(int position, View convertView, ViewGroup parent){

            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(200,300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5,5,5,5);


            imageview.setImageResource(userDraw[position]);

            final int pos = position;
            imageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    View dialogView = (View) View.inflate(Next.this, R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(Next.this);
                    ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.ivPoster);
                    ivPoster.setImageResource(userDraw[pos]);
                    dlg.setTitle("크게 보기");
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기" , null);
                    dlg.show();
                }
            });

            return imageview;
        }
    }
}
