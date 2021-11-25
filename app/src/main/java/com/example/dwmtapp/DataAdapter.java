package com.example.dwmtapp;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataAdapter
{

    protected static final String TAG = "DataAdapter";

    //TABLE 이름을 명시해야함
    protected static final String TABLE_NAME = "some_table";

    private final Context mContext;
    private SQLiteDatabase mDb;
    private DataBaseHelper mDbHelper;

    public DataAdapter(Context context)
    {
        this.mContext = context;
        mDbHelper = new DataBaseHelper(mContext);
    }

    public DataAdapter createDatabase() throws SQLException
    {
        try
        {
            mDbHelper.createDataBase();
        }
        catch (IOException mIOException)
        {
            Log.e(TAG, mIOException.toString() + "  UnableToCreateDatabase");
            throw new Error("UnableToCreateDatabase");
        }
        return this;
    }

    public DataAdapter open() throws SQLException
    {
        try
        {
            mDbHelper.openDataBase();
            mDbHelper.close();
            mDb = mDbHelper.getReadableDatabase();
        }
        catch (SQLException mSQLException)
        {
            Log.e(TAG, "open >>"+ mSQLException.toString());
            throw mSQLException;
        }
        return this;
    }

    public void close()
    {
        mDbHelper.close();
    }

    public List getTableData()
    {
        try
        {
            // Table 이름 -> antpool_bitcoin 불러오기
            String sql ="SELECT * FROM " + TABLE_NAME;

            // 모델 넣을 리스트 생성
            List quizList = new ArrayList();

            //모델 선언
            Quiz quiz = null;

            Cursor mCur = mDb.rawQuery(sql, null);
            if (mCur!=null)
            {
                // 칼럼의 마지막까지
                while( mCur.moveToNext() ) {

                    //커스텀 모델 생성
                    quiz = new Quiz();

                    // Record 기술
                    // id, Question, Answer1, Answer2, Answer3, Answer4, Rightans
                    quiz.setId(mCur.getInt(0));
                    quiz.setQuestion(mCur.getString(1));
                    quiz.setAnswer1(mCur.getString(2));
                    quiz.setAnswer2(mCur.getString(3));
                    quiz.setAnswer3(mCur.getString(4));
                    quiz.setAnswer4(mCur.getString(5));
                    quiz.setRightans(mCur.getInt(6));

                    // 리스트에 넣기
                    quizList.add(quiz);
                }

            }
            return quizList;
        }
        catch (SQLException mSQLException)
        {
            Log.e(TAG, "getTestData >>"+ mSQLException.toString());
            throw mSQLException;
        }
    }

    public static List <Quiz> quizList ;

    private void initLoadDB() {

        DataAdapter mDbHelper = new DataAdapter(mContext.getApplicationContext());
        mDbHelper.createDatabase();
        mDbHelper.open();

        // db에 있는 값들을 model을 적용해서 넣는다.
        quizList = mDbHelper.getTableData();

        // db 닫기
        mDbHelper.close();
    }

}