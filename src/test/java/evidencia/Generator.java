package evidencia;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
    public static String geracaoDataHoraParaArquivo(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("ddMMyyyyhhmmss").format(timestamp);
    }
}