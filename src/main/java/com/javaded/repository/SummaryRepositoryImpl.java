package com.javaded.repository;

import com.javaded.model.MeasurementType;
import com.javaded.model.Summary;
import com.javaded.model.SummaryType;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SummaryRepositoryImpl implements SummaryRepository {

    @Override
    public Optional<Summary> findBySensorId(
            long sensorId,
            MeasurementType measurementType,
            SummaryType summaryType
    ) {
        return Optional.empty();
    }

}
