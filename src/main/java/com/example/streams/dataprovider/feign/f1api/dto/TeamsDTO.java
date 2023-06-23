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
public class TeamsDTO {

    private Long id;
    private String name;
    private String logo;
    private String base;

    @JsonProperty("first_team_entry")
    private Long firstTeamEntry;

    @JsonProperty("world_championships")
    private Long worldChampionships;

    @JsonProperty("highest_race_finish")
    private HighestRaceFinishDTO highestRaceFinish;

    @JsonProperty("pole_positions")
    private Long polePosition;

    @JsonProperty("fastest_laps")
    private Long fastestLaps;
    private String president;
    private String director;

    @JsonProperty("technical_manager")
    private String technicalManager;
    private String chassis;
    private String engine;
    private String tyres;


}
