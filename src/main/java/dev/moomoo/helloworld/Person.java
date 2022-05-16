package dev.moomoo.helloworld;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Person {
    private String a;
	private String b;
	private String c;
	
    Person(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
