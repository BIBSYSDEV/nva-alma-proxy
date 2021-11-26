package no.unit.nva.alma;


public class Config {

    public static final String CORS_ALLOW_ORIGIN_HEADER_ENVIRONMENT_NAME = "ALLOWED_ORIGIN";
    public static final String ALMA_HOST_DEFAULT = "bibsys.alma.exlibrisgroup.com";
    public static final String ALMA_SRU_QUERY_PATH = "view/sru/47BIBSYS_NETWORK";

    private String corsHeader;
    private String almaSruHost;


    private Config() {
    }

    private static class LazyHolder {

        private static final Config INSTANCE = new Config();

        static {
            INSTANCE.setAlmaSruHost(ALMA_HOST_DEFAULT);
            INSTANCE.setCorsHeader(System.getenv(CORS_ALLOW_ORIGIN_HEADER_ENVIRONMENT_NAME));
        }
    }

    public static Config getInstance() {
        return LazyHolder.INSTANCE;
    }

    public void setAlmaSruHost(String almaSruHost) {
        this.almaSruHost = almaSruHost;
    }

    public String getAlmaSruHost() {
        return almaSruHost;
    }

    public String getCorsHeader() {
        return corsHeader;
    }

    public void setCorsHeader(String corsHeader) {
        this.corsHeader = corsHeader;
    }

}
