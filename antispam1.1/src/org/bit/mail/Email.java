package org.bit.mail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.bit.util.SegmentWords;
import org.lionsoul.jcseg.core.JcsegException;

public class Email extends Mail{

	String subject;//主题
	String author;
	Date date;
	
	final static public String SUM_NAME = "^S^U^M^";
	
	/**
	 * Assume that input is already content. 
	 * */
	@Override//重写函数
	public void parseText() {
		try {
			wordlist = SegmentWords.segment(content);//切分内容
			if(wordlist.contains(SUM_NAME) == false) 
				wordlist.add(SUM_NAME);
		} catch (JcsegException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
