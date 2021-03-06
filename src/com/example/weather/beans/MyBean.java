package com.example.weather.beans;

import java.util.List;

public class MyBean {


    /**
     * aqi : {"city":{"aqi":"77","co":"1","no2":"33","o3":"50","pm10":"102","pm25":"31","qlty":"良","so2":"9"}}
     * basic : {"city":"北京","cnty":"中国","id":"CN101010100","lat":"39.904000","lon":"116.391000","update":{"loc":"2016-04-11 08:49","utc":"2016-04-11 00:49"}}
     * daily_forecast : [{"astro":{"sr":"05:42","ss":"18:48"},"cond":{"code_d":"104","code_n":"305","txt_d":"阴","txt_n":"小雨"},"date":"2016-04-11","hum":"18","pcpn":"0.0","pop":"8","pres":"1015","tmp":{"max":"17","min":"8"},"vis":"10","wind":{"deg":"182","dir":"无持续风向","sc":"微风","spd":"9"}},{"astro":{"sr":"05:40","ss":"18:49"},"cond":{"code_d":"104","code_n":"100","txt_d":"阴","txt_n":"晴"},"date":"2016-04-12","hum":"15","pcpn":"0.7","pop":"90","pres":"1003","tmp":{"max":"20","min":"8"},"vis":"10","wind":{"deg":"316","dir":"无持续风向","sc":"微风","spd":"7"}},{"astro":{"sr":"05:39","ss":"18:50"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2016-04-13","hum":"9","pcpn":"0.0","pop":"0","pres":"1004","tmp":{"max":"26","min":"11"},"vis":"10","wind":{"deg":"314","dir":"北风","sc":"3-4","spd":"14"}},{"astro":{"sr":"05:37","ss":"18:51"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2016-04-14","hum":"10","pcpn":"0.0","pop":"0","pres":"1011","tmp":{"max":"22","min":"10"},"vis":"10","wind":{"deg":"185","dir":"无持续风向","sc":"微风","spd":"0"}},{"astro":{"sr":"05:36","ss":"18:52"},"cond":{"code_d":"104","code_n":"104","txt_d":"阴","txt_n":"阴"},"date":"2016-04-15","hum":"12","pcpn":"0.0","pop":"4","pres":"1007","tmp":{"max":"23","min":"13"},"vis":"10","wind":{"deg":"205","dir":"无持续风向","sc":"微风","spd":"5"}},{"astro":{"sr":"05:34","ss":"18:53"},"cond":{"code_d":"104","code_n":"101","txt_d":"阴","txt_n":"多云"},"date":"2016-04-16","hum":"16","pcpn":"0.0","pop":"2","pres":"1012","tmp":{"max":"22","min":"10"},"vis":"10","wind":{"deg":"324","dir":"无持续风向","sc":"微风","spd":"4"}},{"astro":{"sr":"05:33","ss":"18:54"},"cond":{"code_d":"101","code_n":"104","txt_d":"多云","txt_n":"阴"},"date":"2016-04-17","hum":"11","pcpn":"0.0","pop":"19","pres":"1015","tmp":{"max":"22","min":"9"},"vis":"10","wind":{"deg":"293","dir":"无持续风向","sc":"微风","spd":"2"}}]
     * hourly_forecast : [{"date":"2016-04-11 10:00","hum":"22","pop":"0","pres":"1021","tmp":"12","wind":{"deg":"156","dir":"东南风","sc":"微风","spd":"15"}},{"date":"2016-04-11 13:00","hum":"18","pop":"0","pres":"1017","tmp":"16","wind":{"deg":"176","dir":"南风","sc":"3-4","spd":"19"}},{"date":"2016-04-11 16:00","hum":"20","pop":"0","pres":"1012","tmp":"18","wind":{"deg":"187","dir":"南风","sc":"3-4","spd":"21"}},{"date":"2016-04-11 19:00","hum":"27","pop":"2","pres":"1010","tmp":"16","wind":{"deg":"166","dir":"东南风","sc":"微风","spd":"15"}},{"date":"2016-04-11 22:00","hum":"37","pop":"6","pres":"1010","tmp":"12","wind":{"deg":"120","dir":"东南风","sc":"微风","spd":"10"}}]
     * now : {"cond":{"code":"101","txt":"多云"},"fl":"6","hum":"37","pcpn":"0","pres":"1023","tmp":"9","vis":"10","wind":{"deg":"130","dir":"东南风","sc":"3-4","spd":"13"}}
     * status : ok
     * suggestion : {"comf":{"brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"},"cw":{"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},"drsg":{"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},"flu":{"brf":"较易发","txt":"相对今天出现了较大幅度降温，较易发生感冒，体质较弱的朋友请注意适当防护。"},"sport":{"brf":"较适宜","txt":"阴天，较适宜进行各种户内外运动。"},"trav":{"brf":"适宜","txt":"天气较好，温度适宜，总体来说还是好天气哦，这样的天气适宜旅游，您可以尽情地享受大自然的风光。"},"uv":{"brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}}
     */

    private List<WeatherBean> weather;

    public List<WeatherBean> getWeather () {
        return weather;
    }

    public void setWeather (List<WeatherBean> weather) {
        this.weather = weather;
    }

    public static class WeatherBean {
        /**
         * city : {"aqi":"77","co":"1","no2":"33","o3":"50","pm10":"102","pm25":"31","qlty":"良","so2":"9"}
         */

        private AqiBean   aqi;
        /**
         * city : 北京
         * cnty : 中国
         * id : CN101010100
         * lat : 39.904000
         * lon : 116.391000
         * update : {"loc":"2016-04-11 08:49","utc":"2016-04-11 00:49"}
         */

        private BasicBean basic;
        /**
         * cond : {"code":"101","txt":"多云"}
         * fl : 6
         * hum : 37
         * pcpn : 0
         * pres : 1023
         * tmp : 9
         * vis : 10
         * wind : {"deg":"130","dir":"东南风","sc":"3-4","spd":"13"}
         */

        private NowBean   now;
        private String status;
        /**
         * comf : {"brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"}
         * cw : {"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"}
         * drsg : {"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"}
         * flu : {"brf":"较易发","txt":"相对今天出现了较大幅度降温，较易发生感冒，体质较弱的朋友请注意适当防护。"}
         * sport : {"brf":"较适宜","txt":"阴天，较适宜进行各种户内外运动。"}
         * trav : {"brf":"适宜","txt":"天气较好，温度适宜，总体来说还是好天气哦，这样的天气适宜旅游，您可以尽情地享受大自然的风光。"}
         * uv : {"brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}
         */

        private SuggestionBean           suggestion;
        /**
         * astro : {"sr":"05:42","ss":"18:48"}
         * cond : {"code_d":"104","code_n":"305","txt_d":"阴","txt_n":"小雨"}
         * date : 2016-04-11
         * hum : 18
         * pcpn : 0.0
         * pop : 8
         * pres : 1015
         * tmp : {"max":"17","min":"8"}
         * vis : 10
         * wind : {"deg":"182","dir":"无持续风向","sc":"微风","spd":"9"}
         */

        private List<DailyForecastBean>  daily_forecast;
        /**
         * date : 2016-04-11 10:00
         * hum : 22
         * pop : 0
         * pres : 1021
         * tmp : 12
         * wind : {"deg":"156","dir":"东南风","sc":"微风","spd":"15"}
         */

        private List<HourlyForecastBean> hourly_forecast;

        public AqiBean getAqi () {
            return aqi;
        }

        public void setAqi (AqiBean aqi) {
            this.aqi = aqi;
        }

        public BasicBean getBasic () {
            return basic;
        }

        public void setBasic (BasicBean basic) {
            this.basic = basic;
        }

        public NowBean getNow () {
            return now;
        }

        public void setNow (NowBean now) {
            this.now = now;
        }

        public String getStatus () {
            return status;
        }

        public void setStatus (String status) {
            this.status = status;
        }

        public SuggestionBean getSuggestion () {
            return suggestion;
        }

        public void setSuggestion (SuggestionBean suggestion) {
            this.suggestion = suggestion;
        }

        public List<DailyForecastBean> getDaily_forecast () {
            return daily_forecast;
        }

        public void setDaily_forecast (List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public List<HourlyForecastBean> getHourly_forecast () {
            return hourly_forecast;
        }

        public void setHourly_forecast (List<HourlyForecastBean> hourly_forecast) {
            this.hourly_forecast = hourly_forecast;
        }

        public static class AqiBean {
            /**
             * aqi : 77
             * co : 1
             * no2 : 33
             * o3 : 50
             * pm10 : 102
             * pm25 : 31
             * qlty : 良
             * so2 : 9
             */

            private CityBean city;

            public CityBean getCity () {
                return city;
            }

            public void setCity (CityBean city) {
                this.city = city;
            }

            public static class CityBean {
                private String aqi;
                private String co;
                private String no2;
                private String o3;
                private String pm10;
                private String pm25;
                private String qlty;
                private String so2;

                public String getAqi () {
                    return aqi;
                }

                public void setAqi (String aqi) {
                    this.aqi = aqi;
                }

                public String getCo () {
                    return co;
                }

                public void setCo (String co) {
                    this.co = co;
                }

                public String getNo2 () {
                    return no2;
                }

                public void setNo2 (String no2) {
                    this.no2 = no2;
                }

                public String getO3 () {
                    return o3;
                }

                public void setO3 (String o3) {
                    this.o3 = o3;
                }

                public String getPm10 () {
                    return pm10;
                }

                public void setPm10 (String pm10) {
                    this.pm10 = pm10;
                }

                public String getPm25 () {
                    return pm25;
                }

                public void setPm25 (String pm25) {
                    this.pm25 = pm25;
                }

                public String getQlty () {
                    return qlty;
                }

                public void setQlty (String qlty) {
                    this.qlty = qlty;
                }

                public String getSo2 () {
                    return so2;
                }

                public void setSo2 (String so2) {
                    this.so2 = so2;
                }
            }
        }

        public static class BasicBean {
            private String city;
            private String cnty;
            private String id;
            private String lat;
            private String lon;
            /**
             * loc : 2016-04-11 08:49
             * utc : 2016-04-11 00:49
             */

            private UpdateBean update;

            public String getCity () {
                return city;
            }

            public void setCity (String city) {
                this.city = city;
            }

            public String getCnty () {
                return cnty;
            }

            public void setCnty (String cnty) {
                this.cnty = cnty;
            }

            public String getId () {
                return id;
            }

            public void setId (String id) {
                this.id = id;
            }

            public String getLat () {
                return lat;
            }

            public void setLat (String lat) {
                this.lat = lat;
            }

            public String getLon () {
                return lon;
            }

            public void setLon (String lon) {
                this.lon = lon;
            }

            public UpdateBean getUpdate () {
                return update;
            }

            public void setUpdate (UpdateBean update) {
                this.update = update;
            }

            public static class UpdateBean {
                private String loc;
                private String utc;

                public String getLoc () {
                    return loc;
                }

                public void setLoc (String loc) {
                    this.loc = loc;
                }

                public String getUtc () {
                    return utc;
                }

                public void setUtc (String utc) {
                    this.utc = utc;
                }
            }
        }

        public static class NowBean {
            /**
             * code : 101
             * txt : 多云
             */

            private CondBean cond;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            /**
             * deg : 130
             * dir : 东南风
             * sc : 3-4
             * spd : 13
             */

            private WindBean wind;

            public CondBean getCond () {
                return cond;
            }

            public void setCond (CondBean cond) {
                this.cond = cond;
            }

            public String getFl () {
                return fl;
            }

            public void setFl (String fl) {
                this.fl = fl;
            }

            public String getHum () {
                return hum;
            }

            public void setHum (String hum) {
                this.hum = hum;
            }

            public String getPcpn () {
                return pcpn;
            }

            public void setPcpn (String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres () {
                return pres;
            }

            public void setPres (String pres) {
                this.pres = pres;
            }

            public String getTmp () {
                return tmp;
            }

            public void setTmp (String tmp) {
                this.tmp = tmp;
            }

            public String getVis () {
                return vis;
            }

            public void setVis (String vis) {
                this.vis = vis;
            }

            public WindBean getWind () {
                return wind;
            }

            public void setWind (WindBean wind) {
                this.wind = wind;
            }

            public static class CondBean {
                private String code;
                private String txt;

                public String getCode () {
                    return code;
                }

                public void setCode (String code) {
                    this.code = code;
                }

                public String getTxt () {
                    return txt;
                }

                public void setTxt (String txt) {
                    this.txt = txt;
                }
            }

            public static class WindBean {
                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg () {
                    return deg;
                }

                public void setDeg (String deg) {
                    this.deg = deg;
                }

                public String getDir () {
                    return dir;
                }

                public void setDir (String dir) {
                    this.dir = dir;
                }

                public String getSc () {
                    return sc;
                }

                public void setSc (String sc) {
                    this.sc = sc;
                }

                public String getSpd () {
                    return spd;
                }

                public void setSpd (String spd) {
                    this.spd = spd;
                }
            }
        }

        public static class SuggestionBean {
            /**
             * brf : 舒适
             * txt : 白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。
             */

            private ComfBean  comf;
            /**
             * brf : 不宜
             * txt : 不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。
             */

            private CwBean    cw;
            /**
             * brf : 较冷
             * txt : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
             */

            private DrsgBean  drsg;
            /**
             * brf : 较易发
             * txt : 相对今天出现了较大幅度降温，较易发生感冒，体质较弱的朋友请注意适当防护。
             */

            private FluBean   flu;
            /**
             * brf : 较适宜
             * txt : 阴天，较适宜进行各种户内外运动。
             */

            private SportBean sport;
            /**
             * brf : 适宜
             * txt : 天气较好，温度适宜，总体来说还是好天气哦，这样的天气适宜旅游，您可以尽情地享受大自然的风光。
             */

            private TravBean  trav;
            /**
             * brf : 最弱
             * txt : 属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。
             */

            private UvBean    uv;

            public ComfBean getComf () {
                return comf;
            }

            public void setComf (ComfBean comf) {
                this.comf = comf;
            }

            public CwBean getCw () {
                return cw;
            }

            public void setCw (CwBean cw) {
                this.cw = cw;
            }

            public DrsgBean getDrsg () {
                return drsg;
            }

            public void setDrsg (DrsgBean drsg) {
                this.drsg = drsg;
            }

            public FluBean getFlu () {
                return flu;
            }

            public void setFlu (FluBean flu) {
                this.flu = flu;
            }

            public SportBean getSport () {
                return sport;
            }

            public void setSport (SportBean sport) {
                this.sport = sport;
            }

            public TravBean getTrav () {
                return trav;
            }

            public void setTrav (TravBean trav) {
                this.trav = trav;
            }

            public UvBean getUv () {
                return uv;
            }

            public void setUv (UvBean uv) {
                this.uv = uv;
            }

            public static class ComfBean {
                private String brf;
                private String txt;

                public String getBrf () {
                    return brf;
                }

                public void setBrf (String brf) {
                    this.brf = brf;
                }

                public String getTxt () {
                    return txt;
                }

                public void setTxt (String txt) {
                    this.txt = txt;
                }
            }

            public static class CwBean {
                private String brf;
                private String txt;

                public String getBrf () {
                    return brf;
                }

                public void setBrf (String brf) {
                    this.brf = brf;
                }

                public String getTxt () {
                    return txt;
                }

                public void setTxt (String txt) {
                    this.txt = txt;
                }
            }

            public static class DrsgBean {
                private String brf;
                private String txt;

                public String getBrf () {
                    return brf;
                }

                public void setBrf (String brf) {
                    this.brf = brf;
                }

                public String getTxt () {
                    return txt;
                }

                public void setTxt (String txt) {
                    this.txt = txt;
                }
            }

            public static class FluBean {
                private String brf;
                private String txt;

                public String getBrf () {
                    return brf;
                }

                public void setBrf (String brf) {
                    this.brf = brf;
                }

                public String getTxt () {
                    return txt;
                }

                public void setTxt (String txt) {
                    this.txt = txt;
                }
            }

            public static class SportBean {
                private String brf;
                private String txt;

                public String getBrf () {
                    return brf;
                }

                public void setBrf (String brf) {
                    this.brf = brf;
                }

                public String getTxt () {
                    return txt;
                }

                public void setTxt (String txt) {
                    this.txt = txt;
                }
            }

            public static class TravBean {
                private String brf;
                private String txt;

                public String getBrf () {
                    return brf;
                }

                public void setBrf (String brf) {
                    this.brf = brf;
                }

                public String getTxt () {
                    return txt;
                }

                public void setTxt (String txt) {
                    this.txt = txt;
                }
            }

            public static class UvBean {
                private String brf;
                private String txt;

                public String getBrf () {
                    return brf;
                }

                public void setBrf (String brf) {
                    this.brf = brf;
                }

                public String getTxt () {
                    return txt;
                }

                public void setTxt (String txt) {
                    this.txt = txt;
                }
            }
        }

        public static class DailyForecastBean {
            /**
             * sr : 05:42
             * ss : 18:48
             */

            private AstroBean astro;
            /**
             * code_d : 104
             * code_n : 305
             * txt_d : 阴
             * txt_n : 小雨
             */

            private CondBean  cond;
            private String date;
            private String hum;
            private String pcpn;
            private String pop;
            private String pres;
            /**
             * max : 17
             * min : 8
             */

            private TmpBean tmp;
            private String vis;
            /**
             * deg : 182
             * dir : 无持续风向
             * sc : 微风
             * spd : 9
             */

            private WindBean wind;

            public AstroBean getAstro () {
                return astro;
            }

            public void setAstro (AstroBean astro) {
                this.astro = astro;
            }

            public CondBean getCond () {
                return cond;
            }

            public void setCond (CondBean cond) {
                this.cond = cond;
            }

            public String getDate () {
                return date;
            }

            public void setDate (String date) {
                this.date = date;
            }

            public String getHum () {
                return hum;
            }

            public void setHum (String hum) {
                this.hum = hum;
            }

            public String getPcpn () {
                return pcpn;
            }

            public void setPcpn (String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPop () {
                return pop;
            }

            public void setPop (String pop) {
                this.pop = pop;
            }

            public String getPres () {
                return pres;
            }

            public void setPres (String pres) {
                this.pres = pres;
            }

            public TmpBean getTmp () {
                return tmp;
            }

            public void setTmp (TmpBean tmp) {
                this.tmp = tmp;
            }

            public String getVis () {
                return vis;
            }

            public void setVis (String vis) {
                this.vis = vis;
            }

            public WindBean getWind () {
                return wind;
            }

            public void setWind (WindBean wind) {
                this.wind = wind;
            }

            public static class AstroBean {
                private String sr;
                private String ss;

                public String getSr () {
                    return sr;
                }

                public void setSr (String sr) {
                    this.sr = sr;
                }

                public String getSs () {
                    return ss;
                }

                public void setSs (String ss) {
                    this.ss = ss;
                }
            }

            public static class CondBean {
                private String code_d;
                private String code_n;
                private String txt_d;
                private String txt_n;

                public String getCode_d () {
                    return code_d;
                }

                public void setCode_d (String code_d) {
                    this.code_d = code_d;
                }

                public String getCode_n () {
                    return code_n;
                }

                public void setCode_n (String code_n) {
                    this.code_n = code_n;
                }

                public String getTxt_d () {
                    return txt_d;
                }

                public void setTxt_d (String txt_d) {
                    this.txt_d = txt_d;
                }

                public String getTxt_n () {
                    return txt_n;
                }

                public void setTxt_n (String txt_n) {
                    this.txt_n = txt_n;
                }
            }

            public static class TmpBean {
                private String max;
                private String min;

                public String getMax () {
                    return max;
                }

                public void setMax (String max) {
                    this.max = max;
                }

                public String getMin () {
                    return min;
                }

                public void setMin (String min) {
                    this.min = min;
                }
            }

            public static class WindBean {
                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg () {
                    return deg;
                }

                public void setDeg (String deg) {
                    this.deg = deg;
                }

                public String getDir () {
                    return dir;
                }

                public void setDir (String dir) {
                    this.dir = dir;
                }

                public String getSc () {
                    return sc;
                }

                public void setSc (String sc) {
                    this.sc = sc;
                }

                public String getSpd () {
                    return spd;
                }

                public void setSpd (String spd) {
                    this.spd = spd;
                }
            }
        }

        public static class HourlyForecastBean {
            private String date;
            private String hum;
            private String pop;
            private String pres;
            private String tmp;
            /**
             * deg : 156
             * dir : 东南风
             * sc : 微风
             * spd : 15
             */

            private WindBean wind;

            public String getDate () {
                return date;
            }

            public void setDate (String date) {
                this.date = date;
            }

            public String getHum () {
                return hum;
            }

            public void setHum (String hum) {
                this.hum = hum;
            }

            public String getPop () {
                return pop;
            }

            public void setPop (String pop) {
                this.pop = pop;
            }

            public String getPres () {
                return pres;
            }

            public void setPres (String pres) {
                this.pres = pres;
            }

            public String getTmp () {
                return tmp;
            }

            public void setTmp (String tmp) {
                this.tmp = tmp;
            }

            public WindBean getWind () {
                return wind;
            }

            public void setWind (WindBean wind) {
                this.wind = wind;
            }

            public static class WindBean {
                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg () {
                    return deg;
                }

                public void setDeg (String deg) {
                    this.deg = deg;
                }

                public String getDir () {
                    return dir;
                }

                public void setDir (String dir) {
                    this.dir = dir;
                }

                public String getSc () {
                    return sc;
                }

                public void setSc (String sc) {
                    this.sc = sc;
                }

                public String getSpd () {
                    return spd;
                }

                public void setSpd (String spd) {
                    this.spd = spd;
                }
            }
        }
    }
}
