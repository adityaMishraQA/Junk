package utilities;

import baseCase.BaseTest;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class dataProvide extends BaseTest {
    @DataProvider(name = "dataGiver")
    public String[][] dataSetup()
    {
        try {
            workbook= WorkbookFactory.create(inputStream1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet=workbook.getSheetAt(0);
        Row row=sheet.getRow(0);
        Cell cell=row.getCell(0);
        DataFormatter dataFormatter=new DataFormatter();
        String[][] search=new String[1][2];
        for (int i=0;i<1;i++)
        {
            for (int j=0;j<2;j++)
            {
                search[i][j]=dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
            }
        }
        return search;

    }
}
