package project.bean;

import project.processor.annotations.SettingsMapping;
import project.shared.CommonSettings;

/**
 * Created by Rogov on 12.11.2017.
 */
public class InboundChannel implements CommonSettings {

    @SettingsMapping(key = "InboundChannel")
    public void getSettings() {
        System.out.println("InboundChannel");
    }

    public void setInboundChannelConfiguration(){
        System.out.println("Some configuration");
    }
}
