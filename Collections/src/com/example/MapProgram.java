package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tianran on 9/21/2017.
 */
public class MapProgram {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "a compiled high level, object-oriented, platform independant language");
		languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
		languages.put("Algol", "an algorithmic language");
		languages.put("BASIC", "Beginners all purposes symbolic instruction code");
		languages.put("Lisp", "Therein lies madness");

		System.out.println(languages.get("Java"));
	}
}
