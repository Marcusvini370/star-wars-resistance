package com.starwarsresistence.starWarsResistence.gateways.controllers.swagger;


import com.starwarsresistence.starWarsResistence.gateways.controllers.responses.MessageResponseDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Reports")
public interface ReportsControllerSwagger {

    @ApiOperation("Traitor percentage report")
    MessageResponseDTO traitorPercentageReport();

    @ApiOperation("Relatório de itens")
    MessageResponseDTO itemsAverageReport();

     @ApiOperation("MLost points report")
     MessageResponseDTO lostPointsReport();
}
