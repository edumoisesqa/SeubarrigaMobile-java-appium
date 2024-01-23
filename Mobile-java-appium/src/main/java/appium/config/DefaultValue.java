package appium.config;

public class DefaultValue {
    // Nomes do APP
    public static final String CTAppium_1_2 = "CTAppium_1_2.apk";

    // Nomes device
    //public static final String VERSAO_ANDROID = "6.0";
    public static final String NAME_DEVICE = "emulador-554";

    // Config Path
    public static final String PATH_APP = "C:\\Users\\User\\Desktop\\ProjetosEstudos\\automacao_mobile\\calculadoraAppium\\src\\main\\java\\appium\\apk\\" + CTAppium_1_2;
        public static final String PATH_URL_APPIUM = "http://127.0.0.1:4723/wd/hub";

    // Config Plataforma
    public static final String PLATFORM_ANDROID = "Android";
    public static final String PLATFORM_IOS = "Ios";

    // Config de erro
    public static final String ERRO_1 = "Erro-1: Erro ao tentar se conectar com o serviço Appium";
    public static final String ERRO_2 = "Erro ao tentar se conectar com a aplicação";

    // Config Time
    public static final int TIME_SERVER = 30;
    public static final int TIME_DEFAULT = 5;

}
