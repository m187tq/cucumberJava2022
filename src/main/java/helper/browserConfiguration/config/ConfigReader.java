package helper.browserConfiguration.config;


import helper.browserConfiguration.BrowserType;


public interface ConfigReader {

    public int getImplicitWait();

    public int getExplicitWait();

    public int getPageLoadTime();

    public BrowserType getBrowserType();

    public String getUrl();

    public String getUserName();

    public String getPassword();

}
