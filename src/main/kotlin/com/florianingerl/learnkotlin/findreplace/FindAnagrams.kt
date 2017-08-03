package com.florianingerl.learnkotlin.findreplace

import com.florianingerl.util.regex.*;

fun main(args: Array<String>) {
    println("Please enter some text:");
	val input : String? = readLine();
	
	var p : Pattern = Pattern.compile("\\b(([a-zA-Z])(?1)?\\2|[a-zA-Z])\\b");
	var m : Matcher = p.matcher(input);
	
	val anagrams : ArrayList<String> = arrayListOf();
	while( m.find() ){
		anagrams.add( m.group() );
	}
	println("${anagrams.size} anagrams were found in your text!");
	for(anagram: String in anagrams){
		println(anagram);
	}
}

