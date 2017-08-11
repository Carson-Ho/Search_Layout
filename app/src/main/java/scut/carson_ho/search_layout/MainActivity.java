package scut.carson_ho.search_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import scut.carson_ho.searchview.SearchView;

public class MainActivity extends AppCompatActivity {


    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = (SearchView) findViewById(R.id.search_layout);

//        searchView.setOnClickSearch(new ICallBack() {
//            @Override
//            public void SearchAciton(String string) {
//                System.out.println("我收到了" + string);
//            }
//        });



    }
}
