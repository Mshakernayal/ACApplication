package com.example.acapplication.model.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.acapplication.model.entity.DailyDetailsEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DailyDetailsDao_Impl implements DailyDetailsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DailyDetailsEntity> __insertionAdapterOfDailyDetailsEntity;

  private final EntityDeletionOrUpdateAdapter<DailyDetailsEntity> __deletionAdapterOfDailyDetailsEntity;

  private final EntityDeletionOrUpdateAdapter<DailyDetailsEntity> __updateAdapterOfDailyDetailsEntity;

  public DailyDetailsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDailyDetailsEntity = new EntityInsertionAdapter<DailyDetailsEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `dailyDetails` (`image`,`name`,`totalMoney`,`barcodeNo`,`state`,`numberState`,`clientId`,`id`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DailyDetailsEntity value) {
        if (value.getImage() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getImage());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getTotalMoney());
        if (value.getBarcodeNo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBarcodeNo());
        }
        if (value.getState() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getState());
        }
        stmt.bindLong(6, value.getNumberState());
        if (value.getClientId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getClientId());
        }
        if (value.getId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getId());
        }
      }
    };
    this.__deletionAdapterOfDailyDetailsEntity = new EntityDeletionOrUpdateAdapter<DailyDetailsEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `dailyDetails` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DailyDetailsEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfDailyDetailsEntity = new EntityDeletionOrUpdateAdapter<DailyDetailsEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `dailyDetails` SET `image` = ?,`name` = ?,`totalMoney` = ?,`barcodeNo` = ?,`state` = ?,`numberState` = ?,`clientId` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DailyDetailsEntity value) {
        if (value.getImage() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getImage());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getTotalMoney());
        if (value.getBarcodeNo() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBarcodeNo());
        }
        if (value.getState() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getState());
        }
        stmt.bindLong(6, value.getNumberState());
        if (value.getClientId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getClientId());
        }
        if (value.getId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getId());
        }
        if (value.getId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getId());
        }
      }
    };
  }

  @Override
  public Object insert(final DailyDetailsEntity dailyDetailsEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDailyDetailsEntity.insert(dailyDetailsEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final DailyDetailsEntity dailyDetailsEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfDailyDetailsEntity.handle(dailyDetailsEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final DailyDetailsEntity dailyDetailsEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfDailyDetailsEntity.handle(dailyDetailsEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<DailyDetailsEntity>> getAllDailyDetails() {
    final String _sql = "SELECT * From dailyDetails";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"dailyDetails"}, false, new Callable<List<DailyDetailsEntity>>() {
      @Override
      public List<DailyDetailsEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTotalMoney = CursorUtil.getColumnIndexOrThrow(_cursor, "totalMoney");
          final int _cursorIndexOfBarcodeNo = CursorUtil.getColumnIndexOrThrow(_cursor, "barcodeNo");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfNumberState = CursorUtil.getColumnIndexOrThrow(_cursor, "numberState");
          final int _cursorIndexOfClientId = CursorUtil.getColumnIndexOrThrow(_cursor, "clientId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<DailyDetailsEntity> _result = new ArrayList<DailyDetailsEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DailyDetailsEntity _item;
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpTotalMoney;
            _tmpTotalMoney = _cursor.getInt(_cursorIndexOfTotalMoney);
            final String _tmpBarcodeNo;
            if (_cursor.isNull(_cursorIndexOfBarcodeNo)) {
              _tmpBarcodeNo = null;
            } else {
              _tmpBarcodeNo = _cursor.getString(_cursorIndexOfBarcodeNo);
            }
            final String _tmpState;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmpState = null;
            } else {
              _tmpState = _cursor.getString(_cursorIndexOfState);
            }
            final int _tmpNumberState;
            _tmpNumberState = _cursor.getInt(_cursorIndexOfNumberState);
            final Integer _tmpClientId;
            if (_cursor.isNull(_cursorIndexOfClientId)) {
              _tmpClientId = null;
            } else {
              _tmpClientId = _cursor.getInt(_cursorIndexOfClientId);
            }
            _item = new DailyDetailsEntity(_tmpImage,_tmpName,_tmpTotalMoney,_tmpBarcodeNo,_tmpState,_tmpNumberState,_tmpClientId);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getLastDailyDetails(final Continuation<? super Integer> continuation) {
    final String _sql = "SELECT Max(id) From dailyDetails";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<DailyDetailsEntity>> getAllDailyDetailsByClientId(final int clientId) {
    final String _sql = "SELECT * From dailyDetails where clientId =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, clientId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"dailyDetails"}, false, new Callable<List<DailyDetailsEntity>>() {
      @Override
      public List<DailyDetailsEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTotalMoney = CursorUtil.getColumnIndexOrThrow(_cursor, "totalMoney");
          final int _cursorIndexOfBarcodeNo = CursorUtil.getColumnIndexOrThrow(_cursor, "barcodeNo");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfNumberState = CursorUtil.getColumnIndexOrThrow(_cursor, "numberState");
          final int _cursorIndexOfClientId = CursorUtil.getColumnIndexOrThrow(_cursor, "clientId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<DailyDetailsEntity> _result = new ArrayList<DailyDetailsEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DailyDetailsEntity _item;
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpTotalMoney;
            _tmpTotalMoney = _cursor.getInt(_cursorIndexOfTotalMoney);
            final String _tmpBarcodeNo;
            if (_cursor.isNull(_cursorIndexOfBarcodeNo)) {
              _tmpBarcodeNo = null;
            } else {
              _tmpBarcodeNo = _cursor.getString(_cursorIndexOfBarcodeNo);
            }
            final String _tmpState;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmpState = null;
            } else {
              _tmpState = _cursor.getString(_cursorIndexOfState);
            }
            final int _tmpNumberState;
            _tmpNumberState = _cursor.getInt(_cursorIndexOfNumberState);
            final Integer _tmpClientId;
            if (_cursor.isNull(_cursorIndexOfClientId)) {
              _tmpClientId = null;
            } else {
              _tmpClientId = _cursor.getInt(_cursorIndexOfClientId);
            }
            _item = new DailyDetailsEntity(_tmpImage,_tmpName,_tmpTotalMoney,_tmpBarcodeNo,_tmpState,_tmpNumberState,_tmpClientId);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
