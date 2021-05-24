package plus.proptech.recruitment.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

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
	private final boolean hasSkill;
}
