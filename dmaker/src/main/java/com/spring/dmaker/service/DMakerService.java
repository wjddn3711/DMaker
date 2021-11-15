package com.spring.dmaker.service;

import com.spring.dmaker.entity.Developer;
import com.spring.dmaker.repository.DeveloperRepository;
import com.spring.dmaker.type.DeveloperLevel;
import com.spring.dmaker.type.DeveloperSkillType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class DMakerService {
    private final DeveloperRepository developerRepository;
    // DeveloperRepository 를 자동으로 developerRepository에 인젝션해주게 된다

    // 만들어진 생성자를 통해서 새로운 developer를 생성하기
    @Transactional // 엔티티 생성
    public void createDeveloper(){
        Developer developer = Developer.builder()
                .developerLevel(DeveloperLevel.JUNIOR)
                .developerSkillType(DeveloperSkillType.FRONT_END)
                .experienceYears(2)
                .name("Olaf")
                .age(5)
                .build(); // 각각의 데이터들을 세팅후 build
        // 엔티티를 save를 통해 영속화 (저장)
        developerRepository.save(developer); //developerRepository를 통해 DB에 저장
    }
}
