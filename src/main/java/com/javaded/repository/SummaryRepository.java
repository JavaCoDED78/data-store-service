package com.javaded.repository;

import com.javaded.model.MeasurementType;
import com.javaded.model.Summary;
import com.javaded.model.SummaryType;

import java.util.Optional;

public interface SummaryRepository {

    Optional<Summary> findBySensorId(
            long sensorId,
            MeasurementType measurementType,
            SummaryType summaryType
    );

}
