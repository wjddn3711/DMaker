package com.spring.dmaker.type;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum DeveloperSkillType {
    // 개발자들의 스킬 타입을 지정한다
    BACK_END("백엔드 개발자"),
    FRONT_END("프론트엔드 개발자"),
    FULL_STACK("풀스텍 개발자");

    private final String description;
}
