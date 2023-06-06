package ua.personalExpenseTracker.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.personalExpenseTracker.app.dto.GoogleSheetDTO;
import ua.personalExpenseTracker.app.dto.GoogleSheetResponseDTO;
import ua.personalExpenseTracker.app.service.GoogleApiService;

import java.io.IOException;
import java.security.GeneralSecurityException;

@RestController
public class ExpenseController {

    @Autowired
    GoogleApiService googleApiService;

    @GetMapping("/getData")
    public String readDataFromGoogleSheet() throws GeneralSecurityException, IOException {
        return googleApiService.readDataFromGoogleSheet();
    }

    @PostMapping("/createSheet")
    public GoogleSheetResponseDTO createGoogleSheet(@RequestBody GoogleSheetDTO request) throws GeneralSecurityException, IOException {
        return googleApiService.createSheet(request);
    }
}
