package project.shared;

import java.util.Map;

/**
 * Created by Rogov on 12.11.2017.
 */
public interface CommonSettingsMapper {
    Map<String, CommonSettings> getSettingsMap();
    void setSettingsMap(Map<String, CommonSettings> settingsMap);
}
