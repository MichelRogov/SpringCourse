package project.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import project.processor.annotations.SettingsMapping;
import project.shared.CommonSettings;
import project.shared.CommonSettingsMapper;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class SettingsMappingAnnotationBeanPostProcessor implements BeanPostProcessor {

    private Map<String, Class> requiredBeans = new HashMap<>();
    private Map<String, CommonSettings> functionsMap = new HashMap<>();

    @Autowired
    private CommonSettingsMapper commonSettingsMapper;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();

        if(!checkIfMethodsHasAnnotation(clazz.getDeclaredMethods())) {
            return bean;
        }
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> currentInterface : interfaces) {
            if (CommonSettings.class.isAssignableFrom(currentInterface)) {
                requiredBeans.put(beanName, clazz);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class clazz = requiredBeans.get(beanName);
        if (clazz == null) {
            return bean;
        }
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            SettingsMapping annotation = method.getAnnotation(SettingsMapping.class);
            if (annotation != null) {
                functionsMap.put(annotation.key(), (CommonSettings) bean);
            }
        }
        commonSettingsMapper.setSettingsMap(functionsMap);

        return bean;
    }

   private boolean checkIfMethodsHasAnnotation(Method[] methods){
       for (Method method : methods) {
           if (method.getAnnotation(SettingsMapping.class) != null) {
               return true;
           }
       }
       return false;
   }

}
