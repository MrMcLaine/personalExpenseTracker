package ua.personalExpenseTracker.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.personalExpenseTracker.app.config.SheetsQuickstart;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Service
public class GoogleApiService {

    @Autowired
    SheetsQuickstart sheetsQuickstart;
    public String readDataFromGoogleSheet() throws GeneralSecurityException, IOException {
        return sheetsQuickstart.getDataFromGoogleSheet();
    }
}
