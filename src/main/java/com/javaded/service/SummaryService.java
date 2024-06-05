package com.javaded.service;

import com.javaded.model.Summary;
import com.javaded.model.SummaryCriteria;

public interface SummaryService {

    Summary get(Long sensorId, SummaryCriteria criteria);

}
