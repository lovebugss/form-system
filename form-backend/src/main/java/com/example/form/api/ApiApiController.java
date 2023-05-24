package com.example.form.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.form.model.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.math.BigDecimal;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:41:30.396412425Z[GMT]")
@RestController
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<RuleListItem> addRule() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RuleListItem>(objectMapper.readValue("{\n  \"owner\" : \"owner\",\n  \"createdAt\" : \"createdAt\",\n  \"callNo\" : 6,\n  \"name\" : \"name\",\n  \"progress\" : 5,\n  \"disabled\" : true,\n  \"href\" : \"href\",\n  \"avatar\" : \"avatar\",\n  \"key\" : 0,\n  \"desc\" : \"desc\",\n  \"status\" : 1,\n  \"updatedAt\" : \"updatedAt\"\n}", RuleListItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RuleListItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RuleListItem>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CurrentUser> currentUser() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CurrentUser>(objectMapper.readValue("{\n  \"country\" : \"country\",\n  \"access\" : \"access\",\n  \"address\" : \"address\",\n  \"signature\" : \"signature\",\n  \"unreadCount\" : 6,\n  \"avatar\" : \"avatar\",\n  \"title\" : \"title\",\n  \"userid\" : \"userid\",\n  \"tags\" : [ {\n    \"label\" : \"label\",\n    \"key\" : \"key\"\n  }, {\n    \"label\" : \"label\",\n    \"key\" : \"key\"\n  } ],\n  \"notifyCount\" : 0,\n  \"geographic\" : {\n    \"province\" : {\n      \"label\" : \"label\",\n      \"key\" : \"key\"\n    }\n  },\n  \"phone\" : \"phone\",\n  \"name\" : \"name\",\n  \"email\" : \"email\",\n  \"group\" : \"group\"\n}", CurrentUser.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CurrentUser>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CurrentUser>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FakeCaptcha> getFakeCaptcha(@Parameter(in = ParameterIn.QUERY, description = "手机号", schema = @Schema()) @Valid @RequestParam(value = "phone", required = false) String phone) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FakeCaptcha>(objectMapper.readValue("{\n  \"code\" : 0,\n  \"status\" : \"status\"\n}", FakeCaptcha.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FakeCaptcha>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FakeCaptcha>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<NoticeIconList> getNotices() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<NoticeIconList>(objectMapper.readValue("{\n  \"total\" : 0,\n  \"data\" : [ {\n    \"datetime\" : \"2000-01-23\",\n    \"read\" : true,\n    \"extra\" : \"extra\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"avatar\" : \"avatar\",\n    \"title\" : \"title\",\n    \"type\" : \"notification\",\n    \"key\" : \"key\",\n    \"status\" : \"status\"\n  }, {\n    \"datetime\" : \"2000-01-23\",\n    \"read\" : true,\n    \"extra\" : \"extra\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"avatar\" : \"avatar\",\n    \"title\" : \"title\",\n    \"type\" : \"notification\",\n    \"key\" : \"key\",\n    \"status\" : \"status\"\n  } ],\n  \"success\" : true\n}", NoticeIconList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<NoticeIconList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<NoticeIconList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LoginResult> login(@Parameter(in = ParameterIn.DEFAULT, description = "登录系统", required = true, schema = @Schema()) @Valid @RequestBody LoginParams body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LoginResult>(objectMapper.readValue("{\n  \"type\" : \"type\",\n  \"status\" : \"status\",\n  \"currentAuthority\" : \"currentAuthority\"\n}", LoginResult.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LoginResult>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LoginResult>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> outLogin() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> removeRule() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RuleList> rule(@Parameter(in = ParameterIn.QUERY, description = "当前的页码", schema = @Schema()) @Valid @RequestParam(value = "current", required = false) BigDecimal current, @Parameter(in = ParameterIn.QUERY, description = "页面的容量", schema = @Schema()) @Valid @RequestParam(value = "pageSize", required = false) BigDecimal pageSize) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RuleList>(objectMapper.readValue("{\n  \"total\" : 5,\n  \"data\" : [ {\n    \"owner\" : \"owner\",\n    \"createdAt\" : \"createdAt\",\n    \"callNo\" : 6,\n    \"name\" : \"name\",\n    \"progress\" : 5,\n    \"disabled\" : true,\n    \"href\" : \"href\",\n    \"avatar\" : \"avatar\",\n    \"key\" : 0,\n    \"desc\" : \"desc\",\n    \"status\" : 1,\n    \"updatedAt\" : \"updatedAt\"\n  }, {\n    \"owner\" : \"owner\",\n    \"createdAt\" : \"createdAt\",\n    \"callNo\" : 6,\n    \"name\" : \"name\",\n    \"progress\" : 5,\n    \"disabled\" : true,\n    \"href\" : \"href\",\n    \"avatar\" : \"avatar\",\n    \"key\" : 0,\n    \"desc\" : \"desc\",\n    \"status\" : 1,\n    \"updatedAt\" : \"updatedAt\"\n  } ],\n  \"success\" : true\n}", RuleList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RuleList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RuleList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RuleListItem> updateRule() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RuleListItem>(objectMapper.readValue("{\n  \"owner\" : \"owner\",\n  \"createdAt\" : \"createdAt\",\n  \"callNo\" : 6,\n  \"name\" : \"name\",\n  \"progress\" : 5,\n  \"disabled\" : true,\n  \"href\" : \"href\",\n  \"avatar\" : \"avatar\",\n  \"key\" : 0,\n  \"desc\" : \"desc\",\n  \"status\" : 1,\n  \"updatedAt\" : \"updatedAt\"\n}", RuleListItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RuleListItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RuleListItem>(HttpStatus.NOT_IMPLEMENTED);
    }

}
