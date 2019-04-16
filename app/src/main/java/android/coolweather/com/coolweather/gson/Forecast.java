package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pc on 2019/4/11.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public  Temperature tempperature;

    @SerializedName("cond")
    public  More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
