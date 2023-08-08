package plus.proptech.recruitment.resource;

import lombok.Value;
import lombok.experimental.Accessors;

/**
 * スキルチェック用の結果を返すオブジェクト
 *
 * @author sho-yamashita
 *
 */
@Value(staticConstructor = "of")
public class SkillCheckResource {
	// 名称
	private final String name;

	// 年齢
	private final Integer age;

	/*
	 * スキルを持ってるかどうか
	 */
	@Accessors(fluent = true)
	private final boolean hasSkill;
}
