package ua.personalExpenseTracker.app.dto;

import java.util.List;

public class GoogleSheetDTO {
    private String sheetName;
    private List<List<String>> dataToBeUpdated;

    public String getSheetName() {
        return sheetName;
    }

    public List<List<String>> getDataToBeUpdated() {
        return dataToBeUpdated;
    }
}
