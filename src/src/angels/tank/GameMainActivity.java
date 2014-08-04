package angels.tank;

import android.app.Activity;
import android.os.Bundle;
import angels.tank.view.GameBg;

public class GameMainActivity extends Activity {

	private GameBg game_view;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		game_view = new GameBg(this);
		setContentView(game_view);
	}
	
	
}
