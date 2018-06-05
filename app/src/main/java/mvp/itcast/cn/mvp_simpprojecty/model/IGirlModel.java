package mvp.itcast.cn.mvp_simpprojecty.model;

import java.util.List;

import mvp.itcast.cn.mvp_simpprojecty.bean.Girl;
//model还是原来的model
public interface IGirlModel {
    //也通过回调的方式返回数据
    void loadGirl(OnGirlLoadListener onGirlLoadListener);
    //设置一个回调接口
    interface OnGirlLoadListener {
        void onComplete(List<Girl> girlList);
    }
}
