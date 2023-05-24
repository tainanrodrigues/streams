package com.example.streams.dataprovider.feign.f1api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class CircuitsDTO {

    private Long id;
    private String name;
    private String image;
    private CompetitionDTO competition;
    private Long firstGrandPrix;
    private Long laps;
    private String length;
    private String raceDistance;
    private LapRecordDTO lapRecord;
    private Long capacity;
    private Long opened;
}
