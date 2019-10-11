package com.sahil.practise.RemoveCharacter;

public class solution {

	public static String removeAllOccurrencesOfChar(String input, char c) {
		String str;
		str = String.valueOf(c);

		input = input.replaceAll(str, "");

		return input;

	}

}
