package calcLib;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FetchLib {

	private final static String BASEURI = "https://wikiwiki.jp/arcaea/";
	private final static String SONGURI = "パック順";
	private final static String PERMANENTPARTNERURI = "パートナー/恒常";
	private final static String LIMITEDPARTNERURI = "パートナー/期間限定";
	private final static String PARTNERDBPATH = "db/partner.json";
	private final static String SONGDBFOLDERPATH = "db/songs";

	//パートナー名は document.getElementsByClassName("anchor-super")[インデックス].idから取得、空白を検知したら取得完了
	//楽曲名は document.getElementsByClassName("nobr")[インデックス>=1].getElementsByTagName("tbody").item(0).getElementsByTagName("tr")[0].getElementsByTagName("td")[0].innerTextから取得

	public static boolean isDatabaseExist() {
		Path allDbPath = Paths.get("db");
		if (!Files.exists(allDbPath))
			return false;
		Path partnerPath = Paths.get(PARTNERDBPATH);
		Path songsPath = Paths.get(SONGDBFOLDERPATH);
		return (Files.exists(partnerPath)) && (Files.exists(songsPath));
	}

	public static String[] fetchPackNames() {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("started to fetch...");
		String fetchURI = BASEURI + SONGURI;
		try {
			Document document = Jsoup.parse(new URL(fetchURI), 0);
			for(int i = 0; document.getElementsByTag("table").first().getElementsByTag("a").size() > i; i++) {
				String href = document.getElementsByTag("table").first().getElementsByTag("a").get(i).attr("href");
				System.out.println("fetched " + href.substring(1));
				list.add(href.substring(1));
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Array size is " + list.size());
		String[] res = new String[list.size()];
		for(int i = 0; list.size() > i; i++) {
			res[i] = list.get(i);
		}
		System.out.println("success to arrayed");
		return res;
	}

	public static String[] fetchPartnerNames() {
		ArrayList<String> limitedList = new ArrayList<String>();
		ArrayList<String> permanentList = new ArrayList<String>();
		System.out.println("started to fetch");
		String fetchLimitedURI = BASEURI + LIMITEDPARTNERURI;
		String fetchPermanentURI = BASEURI + PERMANENTPARTNERURI;
		try {
			Document limitedDocument = Jsoup.parse(new URL(fetchLimitedURI), 0);
			Document permanentDocument = Jsoup.parse(new URL(fetchPermanentURI), 0);
			for(int i = 0; limitedDocument.getElementsByClass("anchor_super").size() > i; i = i + 2) {
				String tmpString = limitedDocument.getElementsByClass("anchor_super").get(i).id();
				System.out.println("fetched " + tmpString);
				limitedList.add(tmpString);
			}
			for(int i = 0; permanentDocument.getElementsByClass("anchor_super").size() > i; i = i + 2) {
				String tmpString = permanentDocument.getElementsByClass("anchor_super").get(i).id();
				System.out.println("fetched " + tmpString);
				permanentList.add(tmpString);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("array sizes are " + limitedList.size() + " and " + permanentList.size());
		permanentList.addAll(limitedList);
		String[] res = new String[permanentList.size()];
		permanentList.toArray(res);
		System.out.println("success to arrayed");
		return res;
	}

}
