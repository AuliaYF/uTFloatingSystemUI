package ucup.tech.app.floating;

import android.os.Bundle;
import android.support.v4.preference.PreferenceFragment;

public class MainFragment extends PreferenceFragment{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.main);
	}
}
