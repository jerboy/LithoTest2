package mytime.jerboy.com.lithotest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.soloader.SoLoader;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    SoLoader.init(this, false);
//    setContentView(R.layout.activity_main);
    ComponentContext c = new ComponentContext(this);
    LithoView view = LithoView.create(c, A.create(c).build());
    view.setBackgroundColor(0x33ff0000);
    FrameLayout frameLayout = new FrameLayout(this);

    frameLayout.addView(view, new LayoutParams(-2, -2));
    setContentView(frameLayout);
  }
}
