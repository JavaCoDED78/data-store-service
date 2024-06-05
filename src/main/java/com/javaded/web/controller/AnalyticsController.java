package com.javaded.web.controller;

import com.javaded.model.MeasurementType;
import com.javaded.model.Summary;
import com.javaded.model.SummaryCriteria;
import com.javaded.model.SummaryType;
import com.javaded.service.SummaryService;
import com.javaded.web.dto.SummaryDto;
import com.javaded.web.mapper.SummaryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/analytics")
@RequiredArgsConstructor
public class AnalyticsController {

    private final SummaryService summaryService;
    private final SummaryMapper summaryMapper;

    @GetMapping("/summary/{sensorId}")
    public SummaryDto getSummary(
            @PathVariable long sensorId,
            @RequestParam("measurementType") MeasurementType measurementType,
            @RequestParam("summaryType") SummaryType summaryType
    ) {
        Summary summary = summaryService.get(
                sensorId,
                SummaryCriteria.builder()
                        .measurementType(measurementType)
                        .summaryType(summaryType)
                        .build()
        );
        return summaryMapper.toDto(summary);
    }

}
