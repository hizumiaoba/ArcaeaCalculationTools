package calcLib;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


/*
 * アプリケーションの設定を読み書きするためのクラス
 * JSON形式のファイル「Settings.json」で変更できる項目は以下の通り
 * ・起動時に毎回ライブラリの更新があるかどうか確認するか
 * ・起動直後に表示される画面
 * 今後、機能の追加に伴って項目を増やす可能性あり
 */
public class ApplicationConfigurator {

	private final static String FILEPATH = "Settings.json";


	public static boolean fileExists() {
		Path path = Paths.get(FILEPATH);
		return Files.exists(path);
	}

	//起動時に更新を確認するか（デフォルトはTrue）
	public static boolean confirmUpdates() throws NoSuchFileException {
		if(!fileExists())
			throw new NoSuchFileException(FILEPATH, "", "it's impossible you to see this message.\nThis is the bug.\nPlease report at https://github.com/hizumiaoba/ArcaeaCalculationTools/issues with app version.\nSorry for inconvience.");
		ObjectMapper mapper = new ObjectMapper();
		boolean res = true;
		try {
			JsonNode node = mapper.readTree(new File(FILEPATH));
			res = node.get("confirmUpdates").asBoolean();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return res;
	}

	//起動直後に表示するパネル（デフォルトはPotential）
	public static String showUpPanel() throws NoSuchFileException {
		if(!fileExists())
			throw new NoSuchFileException(FILEPATH, "", "it's impossible you to see this message.\nThis is the bug.\nPlease report at https://github.com/hizumiaoba/ArcaeaCalculationTools/issues with app version.\nSorry for inconvience.");
			ObjectMapper mapper = new ObjectMapper();
		String res = "Potential";
		try {
			JsonNode node = mapper.readTree(new File(FILEPATH));
			res = node.get("showUpPanel").asText();
		} catch (IOException e){
			e.printStackTrace();
		}
		return res;
	}

	//設定ファイルが存在しなかったときにファイルを作成するメソッド
	public static void makeSettingsFile() {
		Path path = Paths.get(FILEPATH);
		try {
			Files.createFile(path);
		} catch (IOException | SecurityException e) {
			e.printStackTrace();
		}
		return;
	}
}