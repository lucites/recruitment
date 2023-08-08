package plus.proptech.recruitment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import plus.proptech.recruitment.resource.SkillCheckResource;
import plus.proptech.recruitment.service.SkillCheckResourceCriteria;
import plus.proptech.recruitment.service.SkillCheckService;

/**
 * スキルチェック用のコントローラー
 * 
 * @author sho-yamashita
 *
 */
@RestController
@RequestMapping(value = "/skillCheck")
@RequiredArgsConstructor
public class SkillCheckController {

	private final @NonNull SkillCheckService skillCheckService;

	@GetMapping
	public List<SkillCheckResource> search(final @RequestParam(value = "name") Optional<String> name,
			final @RequestParam(value = "age") Optional<Integer> age) {

		var criteriaBuilder = SkillCheckResourceCriteria.builder();
		if (name.isPresent()) {
			criteriaBuilder.name(name.get());
		}
		if (age.isPresent()) {
			criteriaBuilder.age(age.get());
		}
		var resources = skillCheckService.search(criteriaBuilder.build());
		return resources;
	}

}
