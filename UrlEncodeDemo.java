package com.sggdv.demo.urlencode;

import java.net.URLEncoder;

public class UrlEncodeDemo {

	public static void main(String[] args) throws Exception {
		String str = "gQH47joAAAAAAAAAASxodHRwOi8vd2VpeGluLnFxLmNvbS9xL2taZ2Z3TVRtNzJXV1Brb3ZhYmJJAAIEZ23sUwMEmm3sUw==";
		String url = URLEncoder.encode(str, "utf-8");
		System.out.println("url=" + url);
	}

}