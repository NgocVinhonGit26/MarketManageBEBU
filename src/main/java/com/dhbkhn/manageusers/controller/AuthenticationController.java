package com.dhbkhn.manageusers.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhbkhn.manageusers.DTO.AuthenticationResponse;
import com.dhbkhn.manageusers.model.ShopBoat;
import com.dhbkhn.manageusers.model.User;
import com.dhbkhn.manageusers.service.AuthenticationService;
import com.dhbkhn.manageusers.service.ShopBoat.ShopBoatService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AuthenticationController {

    private final AuthenticationService authService;
    private final ShopBoatService shopBoatService;

    public AuthenticationController(AuthenticationService authService, ShopBoatService shopBoatService) {
        this.authService = authService;
        this.shopBoatService = shopBoatService;
    }

    @GetMapping("/signup/checkEmail/{email}")
    public ResponseEntity<Boolean> checkEmail(@PathVariable String email) {
        if (authService.checkEmail(email).getBody()) {
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.ok(false);
    }

    @PostMapping("/signup")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody User request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/signin")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody User request) {
        return ResponseEntity.ok(authService.authenticate(request));
    }

    @GetMapping("/signout")
    public ResponseEntity<String> logout() {
        return ResponseEntity.ok("Logout successfully");
    }

    @PostMapping("/signup/isMerchant")
    public ResponseEntity<ShopBoat> saveShopBoat(
            @RequestBody ShopBoat request) {
        return ResponseEntity.ok(shopBoatService.createNewSB(request));
    }
}
