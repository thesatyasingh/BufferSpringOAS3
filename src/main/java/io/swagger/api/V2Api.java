/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-07-01T19:17:39.704Z[GMT]")
@Validated
public interface V2Api {

    @Operation(summary = "AePS Transaction API", description = "This is an example operation to show how fund transfers can be initiated", tags={ "AEPS APIs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
    @RequestMapping(value = "/v2/aeps",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Object> v2AepsPost(@NotNull @Parameter(in = ParameterIn.QUERY, description = "2-Cash;3-Balance;4-Stat" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "service_type", required = true) Integer serviceType, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Your EKOs unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique code of the user on the platform" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Value of customer's mobile number who wants the cash" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id", required = true) Integer customerId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Refer API Docs" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "bank_code", required = true) String bankCode, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Amount or 0 for Bal" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "amount", required = true) Integer amount, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Unique transaction ID" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "client_ref_id", required = true) String clientRefId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Default Value= 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "pipe", required = true) Integer pipe, @NotNull @Parameter(in = ParameterIn.QUERY, description = "1- SMS, Default- 0" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "notify_customer", required = true) String notifyCustomer, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Encrypted AADHAR number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "aadhar", required = true) String aadhar, @NotNull @Parameter(in = ParameterIn.QUERY, description = "PID Data of the biometric device" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "piddata", required = true) String piddata, @NotNull @Parameter(in = ParameterIn.QUERY, description = "latlon of requesting user" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "latlong", required = true) String latlong, @NotNull @Parameter(in = ParameterIn.QUERY, description = "IP of merchant" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "real_source_ip", required = true) String realSourceIp, @Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey, @Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey, @Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp, @Parameter(in = ParameterIn.HEADER, description = "Refer to API Docs" ,required=true,schema=@Schema()) @RequestHeader(value="request_hash", required=true) String requestHash);

}

