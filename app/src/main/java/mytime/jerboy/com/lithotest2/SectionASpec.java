package mytime.jerboy.com.lithotest2;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateInitialState;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.TreeProp;
import com.facebook.litho.widget.Text;

/**
 * Created by caojianbo on 2018/7/6.
 */

@LayoutSpec
public class SectionASpec {


  @OnCreateInitialState
  static void onCreateInitState(ComponentContext c){

  }

  @OnCreateLayout
  static Component onCreateLayout(ComponentContext c, @TreeProp MyLog log){
    Log.e("SectionASpec", "onCreateLayout" + " " + (log == null));
    return SectionB.create(c).build();
  }

}
