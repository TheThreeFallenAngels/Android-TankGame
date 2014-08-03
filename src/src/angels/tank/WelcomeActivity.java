package angels.tank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class WelcomeActivity extends Activity implements AnimationListener {
	
	
	
	  private ImageView  imageView = null;  
	  private Animation alphaAnimation = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.weclome_layout);
		
		imageView = (ImageView)findViewById(R.id.welcome_image_view);  
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.welcome_alpha);  
        alphaAnimation.setFillEnabled(true); //启动Fill保持  
        alphaAnimation.setFillAfter(true);  //设置动画的最后一帧是保持在View上面  
        imageView.setAnimation(alphaAnimation);  
        alphaAnimation.setAnimationListener(this);  //为动画设置监听  
		
		
		
	}
	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onAnimationEnd(Animation animation) {
		// TODO Auto-generated method stub
		
		Intent intent = new Intent(this, MainActivity.class);  
        startActivity(intent);  
        this.finish(); 
		
	}
	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub
		
	}

}
