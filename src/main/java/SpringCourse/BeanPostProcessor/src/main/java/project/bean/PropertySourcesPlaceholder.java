package project.bean;

import project.processor.annotations.SettingsMapping;
import project.shared.CommonSettings;

/**
 * Created by Rogov on 12.11.2017.
 */
public class PropertySourcesPlaceholder implements CommonSettings {

    @SettingsMapping(key = "PropertySourcesPlaceholder")
    public void getSettings() {
        System.out.println("PropertySourcesPlaceholder");
        getProperties();
    }

    public void getProperties(){
        System.out.println("Some properties");
    }
}
