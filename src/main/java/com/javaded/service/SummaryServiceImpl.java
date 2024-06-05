package com.javaded.service;

import com.javaded.model.exception.SensorNotFoundException;
import com.javaded.model.Summary;
import com.javaded.model.SummaryCriteria;
import com.javaded.repository.SummaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepository summaryRepository;

    @Override
    public Summary get(Long sensorId, SummaryCriteria criteria) {
        return summaryRepository.findBySensorId(
                        sensorId,
                        criteria.getMeasurementType(),
                        criteria.getSummaryType()
                )
                .orElseThrow(SensorNotFoundException::new);
    }

}
