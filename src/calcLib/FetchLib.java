package calcLib;

public class FetchLib {

	private final static String BASEURI = "https://wikiwiki.jp/arcaea/";
	private final static String SONGURI = "パック順";
	private final static String PERMANENTPARTNERURI = "パートナー/恒常";
	private final static String LIMITEDPARTNERURI = "パートナー/期間限定";

	//パートナー名は document.getElementsByClassName("anchor-super")[インデックス].idから取得、空白を検知したら取得完了
	//楽曲名は document.getElementsByClassName("nobr")[インデックス>=1].getElementsByTagName("tbody").item(0).getElementsByTagName("tr")[0].getElementsByTagName("td")[0].innerTextから取得


}
