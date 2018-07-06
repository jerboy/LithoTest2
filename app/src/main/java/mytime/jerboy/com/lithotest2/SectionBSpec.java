package mytime.jerboy.com.lithotest2;

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
public class SectionBSpec {


  @OnCreateInitialState
  static void onCreateInitState(ComponentContext c){

  }

  @OnCreateLayout
  static Component onCreateLayout(ComponentContext c, @TreeProp MyLog log){
    Log.e("SectionBSpec", "onCreateLayout" + " " + (log == null));
    return Text.create(c)
        .text("HElloA")
        .build();
  }

}
