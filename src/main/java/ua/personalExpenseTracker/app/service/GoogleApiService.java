package ua.personalExpenseTracker.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.personalExpenseTracker.app.config.GoogleApiUtil;
import ua.personalExpenseTracker.app.dto.GoogleSheetDTO;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Service
public class GoogleApiService {

    @Autowired
    GoogleApiUtil googleApiUtil;
    public String readDataFromGoogleSheet() throws GeneralSecurityException, IOException {
        return googleApiUtil.getDataFromGoogleSheet();
    }

    public String createSheet(GoogleSheetDTO sheetDTO) throws GeneralSecurityException, IOException {
        return googleApiUtil.createSheet(sheetDTO);
    }
}
