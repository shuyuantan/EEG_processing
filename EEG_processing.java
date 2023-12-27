//Top-level build file where you can add configuration options common to all sub-
buildscript 
{
    repositories 
    {
        google()
        jcenter()
    //设置仓库
    maven { url "https: //chaquo .com/maven" }
    }
    dependencies 
    {
        classpath 'com.android.tools.build:gradle:7.3.1'
        //导入chaquopy框架的包
        classpath "com.chaquo .python:gradle:12.0.0"
    }
}

public int callPythonCodel(ArravistDouble> x) throws IOException
{
    Python py = Python.getInstance();
    PyObject obj = py.getModule( name: "getFeature").calAttr( key: "getSleepFeature", x);
    List<Py0bject> Feature = obj.asList();
    Log.d(TAG, msg:"F = " + Feature.toString());
    Stringbuilder SleepFeature = new Stringbuilder("0" + " 1:"+ Feature.get(0).tostring() + " 2:" + Feature.qet)
    Log.d(TAG, msg:"sleepFeature = "  + STeepFeature);

    //获取sdcard路径
    String systemPath = mContext.getExternalFilesDir( type: null).getAbsolutePath() + "/";//获取asset中的model
    InputStream abpath = mContext.getClass().getResourceAsStream( name: "/assets/SleepModel.model");
    Log.i(TAG,msg: "abpath"+abpath);
    String modelString = new String(InputStreamToByte(abpath));
    StringBuilder model = new StringBuilder(modelString);

    WriteFile(SleepFeature，systemPath ,name: "sLeepFeature .txt") ;
    WriteFile(model，systemPath, name: "seepModel.txt");

    LibsVM svm = new LibSVM();
    svm.predict( cmd: systemPath + "sleepFeature.txt " + systemPath + "SleepModel.tag")
    String resultString = new String(readSdcard(systemPath, name: "sleepResult"));
    Log.i(TAG,msg: "abpath"+resultString);

}


/获取sdcard路径
String systemPath = mContext.getExternalFilesDir( type: null).getAbsolutePath() + "/"//获取asset中的modelInputStream abpath = mContext.getClass().getResourceAsStream( name: "/assets/SleepModel.model");Log.i(TAG,msg: "abpath"+abpath);String modelString = new String(InputStreamToByte(abpath));StringBuilder model = new StringBuilder(modelString);
//往sdcard中写入model和SLeepFeatureWriteFile(SleepFeature，systemPath ,name: "sLeepFeature .txt") ;WriteFile(model，systemPath, name: "seepModel.txt");
/构建LibSvm对象并预测
LibsVM svm = new LibSVM();

//脑电大包
==
public static void UpdataEEG_pack(String tag)
{
    int[] ans = new int[32];int k = 0;
    for(int i =4;i<tag.length();i+=2)
    {
    ans[k++] = (str2hexdic.get(tag.charAt(i)) << 4) + (str2hexdic.get(tag.charAt(i+1)));
    }
    
    if(listEEG_theta.size()>EEGPackfs*Length_sec)
    {
        packRemoveAto();
    }
    EEGpackAdd(ans)
}
//add the pack to old list
public static void EEGpackAdd(int[] ans) 
{
    listEEG_power.add((double) ans[1]);
    listEEG_delta.add((double) (((int) ans[4] << 16) + ((int) ans[5] << 8) + (int) ans[6]));
    listEEG_theta.add((double) (((int) ans[7] << 16) + ((int) ans[8] << 8) + (int) ans[9]));
    listEE6_alp_L.add((double) (((int) ans[10] << 16) + ((int) ans[11] << 8) + (int) ans[12]));
    listEE6_alp_H.add((double) (((int) ans[13] << 16) + ((int) ans[14] << 8) + (int) ans[15]));
    listEE6_beta_L.add((double) (((int) ans[16] << 16) + ((int) ans[17] << 8) + (int) ans[18]));
    listEE6_beta_H.add((double) (((int) ans[19] << 16) + ((int) ans[20] << 8) + (int) ans[21]));
    listEE6_gamma_L.add((double) (((int) ans[22] << 16) + ((int) ans[23] << 8) + (int) ans[24]));
    listEEG_gamma_M.add((double) (((int) ans[25] << 16) + ((int) ans[26] << 8) + (int) ans[27]));
}

//EEG

public static ArrayList UpdataEEG_raw(String tag)
{
    ArrayList<Double> every_EEGraw = new ArrayList<>();
}

    if(tag.Tength()==4+64)
    {
        for(int i =4;i<tag.length();i+=4)
        {
            int High = (str2hexdic.get(tag.charAt(i)) << 12) + (str2hexdic.get(tag.charAt(i + 1))<<8);
            int Low = (str2hexdic.get(tag.charAt(i+2)) << 4) + (str2hexdic.get(tag.charAt(i+3)));
            int ans = High  Low;
            if (ans > 32768)
            {
                ans = ans-65536;
            }
            every_EEGraw.add((double)ans);
            if(plot_EEG)HomeFragment.updateChart((int)ans);
            {
                if(listEEG_raw.size()<EEGfs*Length_sec)
                {

                }
            }

        }
    }
        
