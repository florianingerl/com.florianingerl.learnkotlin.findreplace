package com.florianingerl.learnkotlin.findreplace;

import org.junit.Test;
import kotlin.test.assertEquals;
import kotlin.test.assertTrue;
import com.florianingerl.util.regex.*;

class FindAnagramsTest {
	
	@Test
	fun testMatchingOfAnagrams(){
		val p : Pattern = Pattern.compile("\\b(([a-zA-Z])(?1)?\\2|[a-zA-Z])\\b");
		val m : Matcher = p.matcher("otto");
		assertTrue(m.matches() );
	}
}
