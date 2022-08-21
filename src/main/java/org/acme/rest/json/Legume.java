package org.acme.rest.json;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
/*
TODO Эта аннотация обязательна, смотри внимательно,
     после нативной компиляции при использовании Response JSON не сериализуется и получаем на проде пустую страницу,
     вместо списка (смотри класс LegumeResource)
     при запуске в dev работает и без неё, так как JVM работает с использованием рефлексии и прокси
*/
public class Legume {

    public String name;
    public String description;

    public Legume() {
    }

    public Legume(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
