package com.example.streams.dataprovider.feign.f1api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class CompetitionDTO {

    private Long id;
    private String name;
    private LocationDTO location;
}
