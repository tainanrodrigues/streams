package com.example.streams.dataprovider.feign.f1api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("first_grand_prix")
    private Long firstGrandPrix;
    private Long laps;
    private String length;

    @JsonProperty("race_distance")
    private String raceDistance;

    @JsonProperty("lap_record")
    private LapRecordDTO lapRecord;
    private Long capacity;
    private Long opened;
}
