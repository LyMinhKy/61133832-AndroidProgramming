package thi.mssv61133832.dethi2;

public class Cities {
    String CitiesImageFileName;
    String CitiesCaption;

    public Cities(String citiesImageFileName, String citiesCaption) {
        CitiesImageFileName = citiesImageFileName;
        CitiesCaption = citiesCaption;
    }

    public String getCitiesImageFileName() {
        return CitiesImageFileName;
    }

    public void setCitiesImageFileName(String citiesImageFileName) {
        CitiesImageFileName = citiesImageFileName;
    }

    public String getCitiesCaption() {
        return CitiesCaption;
    }

    public void setCitiesCaption(String citiesCaption) {
        CitiesCaption = citiesCaption;
    }
}
