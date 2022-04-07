package hello.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Duke {

    private String language;
    private int age;

    public Duke() {}

    public Duke(String language, int age) {
        this.language = language;
        this.age = age;
    }
} 