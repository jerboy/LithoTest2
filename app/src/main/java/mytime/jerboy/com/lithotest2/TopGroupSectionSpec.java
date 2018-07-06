package mytime.jerboy.com.lithotest2;

import com.facebook.litho.Component;
import com.facebook.litho.sections.Children;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.annotations.GroupSectionSpec;
import com.facebook.litho.sections.annotations.OnCreateChildren;
import com.facebook.litho.sections.common.SingleComponentSection;

@GroupSectionSpec
public class TopGroupSectionSpec {

  @OnCreateChildren
  protected static Children onCreateChildren(SectionContext c) {
    return Children.create()
        .child(
            SingleComponentSection.create(c).component(SectionA.create(c))
        )
        .build();
  }

}