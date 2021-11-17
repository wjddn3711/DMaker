package com.spring.dmaker.service;

import com.spring.dmaker.entity.Developer;
import com.spring.dmaker.repository.DeveloperRepository;
import com.spring.dmaker.type.DeveloperLevel;
import com.spring.dmaker.type.DeveloperSkillType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class DMakerService {
    private final DeveloperRepository developerRepository;
    private final EntityManager em; // db를 추상화한것

    @Transactional
    public void createDeveloper() {
        EntityTransaction transaction = em.getTransaction();


            // business logic start
            Developer developer = Developer.builder()
                    .developerLevel(DeveloperLevel.JUNIOR)
                    .developerSkillType(DeveloperSkillType.FRONT_END)
                    .experienceYears(2)
                    .name("OLAF")
                    .build();

            // a->b 계좌로 1만원 송금
            // A 계좌에서 1만원 줄임
            developerRepository.save(developer);
            // B 계좌에서 1만원 늘림
            // business logic end

    }
}
