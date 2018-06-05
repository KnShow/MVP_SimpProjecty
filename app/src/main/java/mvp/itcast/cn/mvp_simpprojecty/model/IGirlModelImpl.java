package mvp.itcast.cn.mvp_simpprojecty.model;

import java.util.ArrayList;
import java.util.List;

import mvp.itcast.cn.mvp_simpprojecty.R;
import mvp.itcast.cn.mvp_simpprojecty.bean.Girl;

public class IGirlModelImpl implements IGirlModel {
    @Override
    public void loadGirl(OnGirlLoadListener onGirlLoadListener) {
        List<Girl> girlList = new ArrayList<>();
        girlList.add(new Girl(R.drawable.f1, "*****", "123潮流女个性字母印花无袖露脐上衣"));
        girlList.add(new Girl(R.drawable.f2, "231412星", "迷依诗诺夏天新款韩版女装性感夜店欧美风字母印花牛仔露脐背心上衣"));
        girlList.add(new Girl(R.drawable.f3, "五颗星", "迷依诗诺春夏欧美新款性感女装单排扣牛仔背心露脐上衣"));
        girlList.add(new Girl(R.drawable.f4, "三颗星", "美莉丹 新款欧美单排扣牛仔背心露脐上衣"));
        girlList.add(new Girl(R.drawable.f5, "五颗星", "夏季新款韩版时尚个性字母无袖露脐上衣"));
        girlList.add(new Girl(R.drawable.f6, "三颗星", "新款欧美单排扣牛仔背心露脐上衣"));
        girlList.add(new Girl(R.drawable.f7, "四颗星", "夏装新款下摆波浪边挂脖露肩"));
        girlList.add(new Girl(R.drawable.f8, "五颗星", "夏天新款欧美时尚潮流休闲百"));
        girlList.add(new Girl(R.drawable.f9, "四颗星", "迷依诗诺夏季新款小香风甜美性感夜"));
        girlList.add(new Girl(R.drawable.f10, "三颗星", "安巴克夏季新款韩版时尚套"));
        onGirlLoadListener.onComplete(girlList);
    }
}
