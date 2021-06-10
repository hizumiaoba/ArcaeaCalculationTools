package calcLib;

public class FetchLib {

	private final static String BASEURI = "https://wikiwiki.jp/arcaea/";
	private final static String SONGURI = "%E3%83%91%E3%83%83%E3%82%AF%E9%A0%86";
	private final static String PERMANENTPARTNERURI = "%E3%83%91%E3%83%BC%E3%83%88%E3%83%8A%E3%83%BC/%E6%81%92%E5%B8%B8";
	private final static String LIMITEDPARTNERURI = "%E3%83%91%E3%83%BC%E3%83%88%E3%83%8A%E3%83%BC/%E6%9C%9F%E9%96%93%E9%99%90%E5%AE%9A";

	//パートナー名は document.getElementsByClassName("anchor-super")[インデックス].idから取得、空白を検知したら取得完了
	//楽曲名は document.getElementsByClassName("nobr")[インデックス>=1].getElementsByTagName("tbody").item(0).getElementsByTagName("tr")[0].getElementsByTagName("td")[0].innerTextから取得


}
