package project;

import com.fasterxml.jackson.databind.ObjectMapper;
import project.engine.ConsoleInput;
import project.engine.RequestBody;
import project.engine.Service;
import project.engine.StartMethod;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;
import java.util.Set;

public class AnnotationEngineApp {

    @SneakyThrows
    public static void main(String[] args) {
        //ComponentScan("com.telran")
        Reflections reflections = new Reflections();

        Set<Class<?>> services = reflections.getTypesAnnotatedWith(Service.class);

        services.forEach(System.out::println);

        for (Class<?> clazz : services) {

            Object serviceInstance = clazz.newInstance();

            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                if (!method.isAnnotationPresent(StartMethod.class)) {
                    continue;
                }

                Parameter[] parameters = method.getParameters();

                String input = null;
                Object requestBodyInput = null;
                for (Parameter parameter : parameters) {
                    if (parameter.isAnnotationPresent(ConsoleInput.class) && parameter.getType().equals(String.class)) {

                        ConsoleInput consoleInput = parameter.getAnnotation(ConsoleInput.class);
                        System.out.println(consoleInput.displayMessage());
                        Scanner scanner = new Scanner(System.in);
                        input = scanner.nextLine();
                        scanner.close();
                    }

                    if (parameter.isAnnotationPresent(RequestBody.class)) {

                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter JSON:");
                        String jsonInput = scanner.nextLine();
                        ObjectMapper om = new ObjectMapper();
                        requestBodyInput = om.readValue(jsonInput, parameter.getType());
                    }
                }
                if (input == null && requestBodyInput == null) {
                    Object [] params = new Object[parameters.length];
                    method.invoke(serviceInstance, params);
                } else if (input != null){
                    method.invoke(serviceInstance, input);
                } else if (requestBodyInput != null) {
                    method.invoke(serviceInstance, requestBodyInput);
                }
            }
        }
    }
}
