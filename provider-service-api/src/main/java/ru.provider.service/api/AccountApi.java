/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ru.provider.service.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.provider.service.model.AccountResponse;
import ru.provider.service.model.CreateAccountRequest;
import ru.provider.service.model.FilterRequest;
import ru.provider.service.model.PageAccountResponse;
import ru.provider.service.model.UpdateAccountRequest;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.UUID;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "Account", description = "the Account API")
public interface AccountApi {

    /**
     * POST /api/v1/account : Create Account
     *
     * @param createAccountRequest  (optional)
     * @return CREATED (status code 201)
     */
    @Operation(
        operationId = "createAccount",
        summary = "Create Account",
        tags = { "Account" },
        responses = {
            @ApiResponse(responseCode = "201", description = "CREATED", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AccountResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/account",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<AccountResponse> createAccount(
        @Parameter(name = "CreateAccountRequest", description = "") @Valid @RequestBody(required = false) CreateAccountRequest createAccountRequest
    );


    /**
     * DELETE /api/v1/account/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "deleteAccount",
        tags = { "Account" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/account/{id}"
    )
    ResponseEntity<Void> deleteAccount(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") UUID id
    );


    /**
     * GET /api/v1/account/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "findAccountById",
        tags = { "Account" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AccountResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/account/{id}",
        produces = { "application/json" }
    )
    ResponseEntity<AccountResponse> findAccountById(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") UUID id
    );


    /**
     * GET /api/v1/account
     *
     * @param filter  (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "findAllAccount",
        tags = { "Account" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PageAccountResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/account",
        produces = { "application/json" }
    )
    ResponseEntity<PageAccountResponse> findAllAccount(
        @Parameter(name = "filter", description = "") @Valid FilterRequest filter
    );


    /**
     * POST /api/v1/account/{id}
     *
     * @param id  (required)
     * @param updateAccountRequest  (optional)
     * @return CREATED (status code 201)
     */
    @Operation(
        operationId = "updateAccount",
        tags = { "Account" },
        responses = {
            @ApiResponse(responseCode = "201", description = "CREATED", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AccountResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/account/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<AccountResponse> updateAccount(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") UUID id,
        @Parameter(name = "UpdateAccountRequest", description = "") @Valid @RequestBody(required = false) UpdateAccountRequest updateAccountRequest
    );

}
