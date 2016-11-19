package scut.carson_ho.search_layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Carson_Ho on 16/11/15.
 */
//解决ListView和ScrollView的冲突
public class Search_Listview extends ListView {
    public Search_Listview(Context context) {
        super(context);
    }

    public Search_Listview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Search_Listview(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    //通过复写其onMeasure方法、达到对ScrollView适配的效果

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
