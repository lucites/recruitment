package plus.proptech.recruitment.component;

import java.util.List;

import org.springframework.stereotype.Component;

import plus.proptech.recruitment.resource.SkillCheckResource;

/**
 * スキルチェック用の結果を生成するクラス
 * 
 * @author sho-yamashita
 *
 */
@Component
public class SkillCheckObjectFactory {

	public List<SkillCheckResource> create() {
		var taro = SkillCheckResource.of("taro yamada", 28, true);
		var shiori = SkillCheckResource.of("shiori yamada", 24, true);
		var sho = SkillCheckResource.of("sho yamada", 38, false);
		var kazumasa = SkillCheckResource.of("kazumasa yamada", 44, false);
		return List.of(taro, shiori, sho, kazumasa);
	}
}
