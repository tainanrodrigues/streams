package com.example.streams.dataprovider.feign.f1api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class CompetitionResponseDTO {

    private String get;
    private List<?> parameters;
    private List<?> errors;
    private Long results;
    private List<CompetitionDTO> response;

}
