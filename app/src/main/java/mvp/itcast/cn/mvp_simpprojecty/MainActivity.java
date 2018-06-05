package mvp.itcast.cn.mvp_simpprojecty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.List;

import mvp.itcast.cn.mvp_simpprojecty.adapter.GirlAdapter;
import mvp.itcast.cn.mvp_simpprojecty.bean.Girl;
import mvp.itcast.cn.mvp_simpprojecty.presenter.GirlPresenter;
import mvp.itcast.cn.mvp_simpprojecty.view.IGirlView;

public class MainActivity extends AppCompatActivity implements IGirlView {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        GirlPresenter<MainActivity> mainActivityGirlPresenter = new GirlPresenter<>(this);
        mainActivityGirlPresenter.fitch();
    }

    @Override
    public void showGirls(List<Girl> girlList) {
        listView.setAdapter(new GirlAdapter(this, girlList));
    }
}
