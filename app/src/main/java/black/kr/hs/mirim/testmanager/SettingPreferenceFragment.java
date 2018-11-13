package black.kr.hs.mirim.testmanager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.SwitchPreference;
import android.support.annotation.Nullable;

/**
 * Created by Owner on 2018-11-13.
 */

public class SettingPreferenceFragment extends PreferenceFragment {
    SwitchPreference roamingPreference;
    ListPreference networkTypePreference;
    SwitchPreference lteModePreference;

    SharedPreferences prefs;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.setting_preference);

        roamingPreference = (SwitchPreference) findPreference("roaming");
        networkTypePreference = (ListPreference) findPreference("nextwork_type");
        lteModePreference = (SwitchPreference) findPreference("lte_mode");

        prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());

        prefs.registerOnSharedPreferenceChangeListener(prefListener);

        if (!prefs.getString("network_type", "").equals("")) {
            networkTypePreference.setSummary(prefs.getString("network_type", "LTE(권장)"));
        }
    }

    SharedPreferences.OnSharedPreferenceChangeListener prefListener = new SharedPreferences.OnSharedPreferenceChangeListener() {
        @Override
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
            if (key.equals("network_type")) {
                networkTypePreference.setSummary(prefs.getString("network_type", "LTE(권장)"));
            }
        }
    };
}