package project.shared;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rogov on 12.11.2017.
 */
@Service
public class CommonSettingsMapperImpl implements CommonSettingsMapper {

    private Map<String,CommonSettings> settingsMap = new HashMap<>();

    public Map<String, CommonSettings> getSettingsMap() {
        return settingsMap;
    }

    public void setSettingsMap(Map<String, CommonSettings> settingsMap) {
        this.settingsMap = settingsMap;
    }
}
