package mvp.itcast.cn.mvp_simpprojecty.presenter;

import java.lang.ref.WeakReference;
import java.util.List;

import mvp.itcast.cn.mvp_simpprojecty.bean.Girl;
import mvp.itcast.cn.mvp_simpprojecty.model.IGirlModel;
import mvp.itcast.cn.mvp_simpprojecty.model.IGirlModelImpl;
import mvp.itcast.cn.mvp_simpprojecty.view.IGirlView;

/**
 * 所有的业务逻辑都在表示层完成
 */
public class GirlPresenter<T extends IGirlView> {
    //    view层
    WeakReference<T> view;
    //model层
    private IGirlModelImpl girlModel = new IGirlModelImpl();

    public GirlPresenter(T view) {
        this.view = new WeakReference<>(view);
    }

    public void fitch() {
        girlModel.loadGirl(new IGirlModel.OnGirlLoadListener() {
            @Override
            public void onComplete(List<Girl> girlList) {
                view.get().showGirls(girlList);
            }
        });
    }
}
