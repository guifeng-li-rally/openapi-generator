package io.swagger.api;

import java.util.Map;
import io.swagger.model.Order;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Controller
public class StoreApiController implements StoreApi {
    private final StoreApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public StoreApiController(StoreApiDelegate delegate) {
        this.delegate = delegate;
    }

    @RequestHeader("Accept")
    public ResponseEntity<Void> deleteOrder(@ApiParam(value = "ID of the order that needs to be deleted",required=true ) @PathVariable("order_id") String orderIdString accept) {
        // do some magic!
        return delegate.deleteOrder(orderId);
    }

    @RequestHeader("Accept")
    public ResponseEntity<Map<String, Integer>> getInventory(String accept) throws IOException {
        // do some magic!
        return delegate.getInventory();
    }

    @RequestHeader("Accept")
    public ResponseEntity<Order> getOrderById( @Min(1) @Max(5)@ApiParam(value = "ID of pet that needs to be fetched",required=true ) @PathVariable("order_id") Long orderIdString accept) throws IOException {
        // do some magic!
        return delegate.getOrderById(orderId);
    }

    @RequestHeader("Accept")
    public ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true )  @Valid @RequestBody Order bodyString accept) throws IOException {
        // do some magic!
        return delegate.placeOrder(body);
    }

}
