package com.javaded.web.dto;

import com.javaded.model.MeasurementType;
import com.javaded.model.SummaryType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class SummaryDto {

    private long sensorId;
    private MeasurementType measurementType;
    private SummaryType summaryType;
    private double value;

}
