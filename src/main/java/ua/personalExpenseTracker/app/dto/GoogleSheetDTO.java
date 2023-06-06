package ua.personalExpenseTracker.app.dto;

import java.util.List;

public class GoogleSheetDTO {
    private String sheetName;
    private List<List<Object>> dataToBeUpdated;

    public String getSheetName() {
        return sheetName;
    }

    public List<List<Object>> getDataToBeUpdated() {
        return dataToBeUpdated;
    }
}
