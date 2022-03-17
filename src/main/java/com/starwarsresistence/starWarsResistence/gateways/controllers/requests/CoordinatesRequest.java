package com.starwarsresistence.starWarsResistence.gateways.controllers.requests;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor

@Setter
@Getter
@Builder
public class CoordinatesRequest {

    @ApiModelProperty(example = "1")
    private Long id;

    @ApiModelProperty(required = true, value = "Rebel's latitude", example = "455")
    private String latitude;

    @ApiModelProperty(required = true, value = "Rebel's longitude", example = "359")
    private String longitude;

    @ApiModelProperty(required = true, value = "Rebel's galaxy", example = "Via Láctea")
    private String galaxyName;


}
