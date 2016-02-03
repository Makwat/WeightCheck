package kru.somwang.makwat.weightcheck;

import android.content.Context;

/**
 * Created by Administrator on 3/2/2559.
 */
public class MyOpenHelper {

    public static final String database_name = "Weight.db"; //ประกาศค่าคงที่
    private static  final  int database_Version = 1;
    private static final String Create_table_weight = "create table weightTABLE (" +
            "_id integer primary key, " +
            "Date text, " +
            "weight text);";

    public MyOpenHelper(Context context) {
    } //con
}// main class
