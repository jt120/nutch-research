/**
 * @author liuze
 *
 * Feb 13, 2014
 */
package com.jt.research.crawler.start;

import org.junit.Test;

import crawlercommons.fetcher.BaseFetchException;
import crawlercommons.fetcher.FetchedResult;
import crawlercommons.fetcher.http.SimpleHttpFetcher;
import crawlercommons.fetcher.http.UserAgent;

public class GetFetchResult {
	
	@Test
	public void test01() {
		try {
			UserAgent userAgent = new UserAgent("jt120", "jt120lz@gmail.com", "http://www.csdn.net/");
			SimpleHttpFetcher simpleHttpFetcher = new SimpleHttpFetcher(userAgent);
			FetchedResult f = simpleHttpFetcher.fetch("http://www.csdn.net/");
			byte[] result = f.getContent();
			String s = new String(result);
			System.out.println(s);
		} catch (BaseFetchException e) {
			e.printStackTrace();
		}
	}

}
