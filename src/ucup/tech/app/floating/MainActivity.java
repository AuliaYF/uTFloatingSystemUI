package ucup.tech.app.floating;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class MainActivity extends SherlockFragmentActivity {
	private FragmentManager fm;
	private FragmentTransaction ft;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		fm = getSupportFragmentManager();
		if (fm.findFragmentById(R.id.content) == null) {  
			ft = fm.beginTransaction();
			ft.setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
			ft.replace(R.id.content, new MainFragment());
			ft.commit();
		}  
	}
}
