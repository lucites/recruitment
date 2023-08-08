package plus.proptech.recruitment.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * スキルチェックデータ検索条件
 *
 * @author sho-yamashita
 *
 */
@Builder
@Getter
@AllArgsConstructor
public class SkillCheckResourceCriteria {
	// 名称
	private final String name;

	// 年齢
	private final Integer age;

	// スキルがあるかどうか
	@Accessors(fluent = true)
	private final Boolean hasSkill;
}
