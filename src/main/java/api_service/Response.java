package api_service;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Response extends ResponseEntity<Map<String, Object>> {    
    public Response(HttpStatus status) {
        super(status);        
    }    
}