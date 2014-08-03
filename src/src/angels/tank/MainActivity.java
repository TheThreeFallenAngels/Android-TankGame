package angels.tank;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.view.Menu;
//import android.view.MenuItem;

public class MainActivity extends Activity {

	private Button m_exit_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        m_exit_btn = (Button) findViewById(R.id.exit_game_btn);
        
        m_exit_btn.setOnClickListener(new Button.OnClickListener()
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				MainActivity.this.finish();
			}
        	
        });
        
        
        
    }
}
