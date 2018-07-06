package mytime.jerboy.com.lithotest2;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateInitialState;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.OnCreateTreeProp;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.widget.ListRecyclerConfiguration;
import com.facebook.litho.sections.widget.RecyclerBinderConfiguration;
import com.facebook.litho.sections.widget.RecyclerCollectionComponent;

/**
 * Created by caojianbo on 2018/7/6.
 */

@LayoutSpec
public class ASpec {

  @OnCreateTreeProp
  static MyLog onCreateMyLog(ComponentContext c){
    return new MyLog();
  }

  @OnCreateInitialState
  static void onCreateInitState(ComponentContext c){

  }

  @OnCreateLayout
  static Component onCreateLayout(ComponentContext c){
    SectionContext sectionContext = new SectionContext(c);
    return RecyclerCollectionComponent.create(c)
        .backgroundColor(0xff00ff00)
        .canMeasureRecycler(true)
        .recyclerConfiguration(ListRecyclerConfiguration.createWithRecyclerBinderConfiguration(new RecyclerBinderConfiguration(4, null, false, false, true)))
        .section(TopGroupSection.create(sectionContext))
        .build();
  }

}
