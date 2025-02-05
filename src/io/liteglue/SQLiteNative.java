/* !---- DO NOT EDIT: This file autogenerated by com/jogamp/gluegen/JavaEmitter.java on Wed Oct 28 13:07:37 CET 2015 ----! */

package io.liteglue;

//import com.jogamp.gluegen.runtime.*;
//import com.jogamp.common.os.*;
//import com.jogamp.common.nio.*;
//import java.nio.*;

public class SQLiteNative {

  public static final int SQLC_API_VERSION = 1;
  public static final int SQLC_OPEN_READONLY = 0x00001;
  public static final int SQLC_OPEN_READWRITE = 0x00002;
  public static final int SQLC_OPEN_CREATE = 0x00004;
  public static final int SQLC_OPEN_URI = 0x00040;
  public static final int SQLC_OPEN_MEMORY = 0x00080;
  public static final int SQLC_OPEN_NOMUTEX = 0x08000;
  public static final int SQLC_OPEN_FULLMUTEX = 0x10000;
  public static final int SQLC_OPEN_SHAREDCACHE = 0x20000;
  public static final int SQLC_OPEN_PRIVATECACHE = 0x40000;
  public static final int SQLC_RESULT_OK = 0;
  public static final int SQLC_RESULT_ERROR = 1;
  public static final int SQLC_RESULT_INTERNAL = 2;
  public static final int SQLC_RESULT_PERM = 3;
  public static final int SQLC_RESULT_ABORT = 4;
  public static final int SQLC_RESULT_CONSTRAINT = 19;
  public static final int SQLC_RESULT_MISMATCH = 20;
  public static final int SQLC_RESULT_MISUSE = 21;
  public static final int SQLC_RESULT_ROW = 100;
  public static final int SQLC_RESULT_DONE = 101;
  public static final int SQLC_INTEGER = 1;
  public static final int SQLC_FLOAT = 2;
  public static final int SQLC_TEXT = 3;
  public static final int SQLC_BLOB = 4;
  public static final int SQLC_NULL = 5;

  /** Interface to C language function: <br> <code> sqlc_handle_t sqlc_api_db_open(int sqlc_api_version, const char *  filename, int flags); </code>    */
  public static native long sqlc_api_db_open(int sqlc_api_version, String filename, int flags);

  /** Interface to C language function: <br> <code> int sqlc_api_version_check(int sqlc_api_version); </code>    */
  public static native int sqlc_api_version_check(int sqlc_api_version);

  /** Interface to C language function: <br> <code> int sqlc_db_close(sqlc_handle_t db); </code>    */
  public static native int sqlc_db_close(long db);

  /** Interface to C language function: <br> <code> int sqlc_db_errcode(sqlc_handle_t db); </code>    */
  public static native int sqlc_db_errcode(long db);

  /** Interface to C language function: <br> <code> const char *  sqlc_db_errmsg_native(sqlc_handle_t db); </code>    */
  public static native String sqlc_db_errmsg_native(long db);

  /** Interface to C language function: <br> <code> int sqlc_db_key_native_string(sqlc_handle_t db, char *  key_string); </code>    */
  public static native int sqlc_db_key_native_string(long db, String key_string);

  /** Interface to C language function: <br> <code> sqlc_long_t sqlc_db_last_insert_rowid(sqlc_handle_t db); </code>    */
  public static native long sqlc_db_last_insert_rowid(long db);

  /** Interface to C language function: <br> <code> sqlc_handle_t sqlc_db_open(const char *  filename, int flags); </code>    */
  public static native SQLiteResponse sqlc_db_open(String filename, int flags);

  /** Interface to C language function: <br> <code> sqlc_handle_t sqlc_db_prepare_st(sqlc_handle_t db, const char *  sql); </code>    */
  public static native SQLiteResponse sqlc_db_prepare_st(long db, String sql);

  /** Interface to C language function: <br> <code> int sqlc_db_total_changes(sqlc_handle_t db); </code>    */
  public static native int sqlc_db_total_changes(long db);

  /** Interface to C language function: <br> <code> const char *  sqlc_errstr_native(int errcode); </code>    */
  public static native String sqlc_errstr_native(int errcode);

  /** Interface to C language function: <br> <code> int sqlc_st_bind_double(sqlc_handle_t st, int pos, double val); </code>    */
  public static native int sqlc_st_bind_double(long st, int pos, double val);

  /** Interface to C language function: <br> <code> int sqlc_st_bind_int(sqlc_handle_t st, int pos, int val); </code>    */
  public static native int sqlc_st_bind_int(long st, int pos, int val);

  /** Interface to C language function: <br> <code> int sqlc_st_bind_long(sqlc_handle_t st, int pos, sqlc_long_t val); </code>    */
  public static native int sqlc_st_bind_long(long st, int pos, long val);

  /** Interface to C language function: <br> <code> int sqlc_st_bind_null(sqlc_handle_t st, int pos); </code>    */
  public static native int sqlc_st_bind_null(long st, int pos);

  /** Interface to C language function: <br> <code> int sqlc_st_bind_text_native(sqlc_handle_t st, int col, const char *  val); </code>    */
  public static native int sqlc_st_bind_text_native(long st, int col, String val);

  /** Interface to C language function: <br> <code> int sqlc_st_column_count(sqlc_handle_t st); </code>    */
  public static native int sqlc_st_column_count(long st);

  /** Interface to C language function: <br> <code> double sqlc_st_column_double(sqlc_handle_t st, int col); </code>    */
  public static native double sqlc_st_column_double(long st, int col);

  /** Interface to C language function: <br> <code> int sqlc_st_column_int(sqlc_handle_t st, int col); </code>    */
  public static native int sqlc_st_column_int(long st, int col);

  /** Interface to C language function: <br> <code> sqlc_long_t sqlc_st_column_long(sqlc_handle_t st, int col); </code>    */
  public static native long sqlc_st_column_long(long st, int col);

  /** Interface to C language function: <br> <code> const char *  sqlc_st_column_name(sqlc_handle_t st, int col); </code>    */
  public static native String sqlc_st_column_name(long st, int col);

  /** Interface to C language function: <br> <code> const char *  sqlc_st_column_text_native(sqlc_handle_t st, int col); </code>    */
  public static native String sqlc_st_column_text_native(long st, int col);

  /** Interface to C language function: <br> <code> int sqlc_st_column_type(sqlc_handle_t st, int col); </code>    */
  public static native int sqlc_st_column_type(long st, int col);

  /** Interface to C language function: <br> <code> int sqlc_st_finish(sqlc_handle_t st); </code>    */
  public static native int sqlc_st_finish(long st);

  /** Interface to C language function: <br> <code> int sqlc_st_step(sqlc_handle_t st); </code>    */
  public static native int sqlc_st_step(long st);


} // end of class SQLiteNative