package plus.proptech.recruitment.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import plus.proptech.recruitment.component.SkillCheckObjectFactory;
import plus.proptech.recruitment.resource.SkillCheckResource;

/**
 * スキルチェックオブジェクト操作用のサービス
 *
 * @author sho-yamashita
 *
 */
@Service
@RequiredArgsConstructor
public class SkillCheckService {

	private final @NonNull SkillCheckObjectFactory skillCheckObjectFactory;

	public List<SkillCheckResource> search(SkillCheckResourceCriteria criteria) {
		var list = skillCheckObjectFactory.create();

		Predicate<SkillCheckResource> filterCondition = l -> {
			// 年齢条件のみ指定されている場合は年齢条件のみで判定する。検索対象上限付き
			// 2条件以上指定されていればAND条件として判定する
			if (criteria.getName() == null && criteria.hasSkill() == null && criteria.getAge() != null) {
				if (criteria.getAge() > 90) {
					throw new RuntimeException("90歳以上は検索対象外です");
				}
				return l.getAge() >= criteria.getAge();
			}
			if (criteria.getName() != null) {
				if (!l.getName().contains(criteria.getName())) {
					return false;
				}
			}
			if (criteria.getAge() != null) {
				if (l.getAge() < criteria.getAge()) {
					return false;
				}
			}
			if (criteria.hasSkill() != null) {
				return l.hasSkill()==criteria.hasSkill();
			}
			return true;
		};

		if (!CollectionUtils.isEmpty(list)) {
			return list.stream().filter(filterCondition).collect(Collectors.toList());
		}
		return list;
	}

}
