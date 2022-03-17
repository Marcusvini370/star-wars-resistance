package com.starwarsresistence.starWarsResistence.gateways.controllers.swagger;

import com.starwarsresistence.starWarsResistence.domains.Rebel;
import com.starwarsresistence.starWarsResistence.domains.itemTrade.Trade;
import com.starwarsresistence.starWarsResistence.gateways.controllers.requests.RebelRequest;
import com.starwarsresistence.starWarsResistence.gateways.controllers.responses.CoordinatesResponse;
import com.starwarsresistence.starWarsResistence.gateways.controllers.responses.RebelResponse;
import io.swagger.annotations.*;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Rebels")
public interface RebelControllerSwagger {

     @ApiOperation("Saves a rebel")
     @ApiResponses({ @ApiResponse(code = 201, message = "Registered rebel"), })
     RebelResponse save(@ApiParam(name = "body", value = "Representation of a new rebel") RebelRequest rebelRequest);

    @ApiResponses({ @ApiResponse(code = 301, message = "Rebels found"), })
     @ApiOperation("List the rebels")
     List<RebelResponse> list();

     @ApiOperation("Updates the existing coordinate")
     @ApiResponses({ @ApiResponse(code = 200, message = "Representation of a cordinate with new data"), })
     void updateCoordinates(@RequestBody CoordinatesResponse coordinatesResponse) ;


     @ApiOperation("Report Rebel")
     void reportRebel(@PathVariable("id") Long id);


    @ApiOperation("Makes an exchange")
    void tradeRebelItems(@RequestBody Trade trade);

    @ApiOperation("Search rebel by id")
    Rebel rebelById(Long rebelId);

}
